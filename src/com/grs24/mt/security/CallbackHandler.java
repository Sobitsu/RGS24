/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.security;

import com.grs24.mt.unistream.MtUnistreamAdapter;
import javax.security.auth.callback.Callback;
import com.sun.xml.wss.impl.callback.KeyStoreCallback;
import com.sun.xml.wss.impl.callback.PrivateKeyCallback;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Base64;
import java.util.Enumeration;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.slf4j.LoggerFactory;
/**
 *
 * @author Dale
 */
public abstract class CallbackHandler implements javax.security.auth.callback.CallbackHandler {
  private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CallbackHandler.class);

/**
* Метод обработки CallBack от системы безопасности на подмену ключей и хранилищь с ключами<br>
* Настройка вызова производится в файле META-INF/wsit-client.xml и META-INF/service.svc.wsdl_wsdl0.xml<br>
* @param callbacks - Обрабатываемый запрос
* Обрабатываются два типа CallBack:<br>
* KeyStoreCallBack<br>
* KeyStore получаются из параметров:<br>
* MtUnistreamAdapter.KEY_KEYSTORE_PKCS12_BODY @see MtUnistreamAdapter#KEY_KEYSTORE_PKCS12_BODY<br>
* MtUnistreamAdapter.KEY_TRUSTSTORE_JKS_BODY @see MtUnistreamAdapter#KEY_TRUSTSTORE_JKS_BODY<br>
* Разделение происходит на основании источника вызова:<br>
* KeyStoreHandler или TrustStoreHandler<br>
* Пароли к KeyStore получаются из параметров: <br>
* MtUnistreamAdapter.KEY_KEYSTORE_PASSWORD @see MtUnistreamAdapter#KEY_KEYSTORE_PASSWORD
* MtUnistreamAdapter.KEY_TRUSTSTORE_PASSWORD @see MtUnistreamAdapter#KEY_TRUSTSTORE_PASSWORD
* PrivateKeyCallback<br>
* Из полученного на входе PrivateKeyCallback @see PrivateKeyCallback получаем KeyStore и из него получаем PrivateKey @PrivateKey
* @throws java.io.IOException
* @throws javax.security.auth.callback.UnsupportedCallbackException
* @see Callback
* @see KeyStoreCallBack
* @see PrivateKeyCallback
* @see KeyStoreHandler
* @see TrustStoreHandler
* 
*/ 
  @Override
  public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException 
    {
        if (logger.isDebugEnabled()) {
            logger.debug("CallbackHandler.handle: <- callbacks ='"+callbacks.toString());
	}
        for (Callback callback : callbacks) {
            if (logger.isDebugEnabled()) {
                logger.debug("CallbackHandler.handle: <- callback ='"+callback.toString() +"'");
                }
            if (callback instanceof KeyStoreCallback) {
                KeyStore ks = null;
                ByteArrayInputStream keyStoreIS;
                String keystorepassword = null;
                String keystorebody = null;
                KeyStoreCallback kscb = (KeyStoreCallback) callback;
                String keystoretype = null;
                if (this instanceof KeyStoreHandler) {
                          keystoretype = MtUnistreamAdapter.KEY_KEYSTORE_TYPE;
                          keystorebody = MtUnistreamAdapter.KEY_KEYSTORE_PKCS12_BODY;
                          keystorepassword = MtUnistreamAdapter.KEY_KEYSTORE_PASSWORD;
                      }
                if (this instanceof TrustStoreHandler) {
                          keystoretype = MtUnistreamAdapter.KEY_TRUSTSTORE_TYPE;
                          keystorebody = MtUnistreamAdapter.KEY_TRUSTSTORE_JKS_BODY;
                          keystorepassword = MtUnistreamAdapter.KEY_TRUSTSTORE_PASSWORD;
                      }
                try {
                    ks = KeyStore.getInstance(keystoretype);
                } 
                catch (KeyStoreException ex) {
                      logger.error("CallbackHandler.handle: Ошибка приполучении KeyStore. KeyStoreType = '" + keystoretype+"'");
                      throw new UnsupportedCallbackException(kscb);
                }
                keyStoreIS = new ByteArrayInputStream(Base64.getDecoder().decode(keystorebody));
                try {
                    ks.load(keyStoreIS, keystorepassword.toCharArray());
                }
                catch (NoSuchAlgorithmException ex) {
                      logger.error("CallbackHandler.handle -> NoSuchAlgorithmException: Ошибка определения алгоритма KeyStore из настройки. KeyStoreType= '" + keystoretype +"'" + " keystorebody '" + keystorebody+"'");
                      throw new UnsupportedCallbackException(kscb);
                  } 
                catch (CertificateException ex) {
                      logger.error("CallbackHandler.handle -> CertificateException: Ошибка проверки сертификата KeyStore из настройки. KeyStoreType= '" + keystoretype+"'" + " keystorebody= '" + keystorebody+"'" + " keystoreзфыыцщкв= '" + keystorepassword.replaceAll(".", "*") +"'");
                      throw new UnsupportedCallbackException(kscb);
                  } 
                finally {
                        keyStoreIS.close();
                    }
                kscb.setKeystore(ks);
                if (logger.isDebugEnabled()) {
                    logger.debug("CallbackHandler.handle: <- KeyStore ='"+kscb.getKeystore()+ "'");
                }
            }
            if (callback instanceof PrivateKeyCallback) {
                PrivateKeyCallback pkcb = (PrivateKeyCallback) callback;
                KeyStore ks = pkcb.getKeystore();
                Key key;
                String keypassword = MtUnistreamAdapter.KEY_KEY_PASSWORD;
                Enumeration<String> aliases;
                try {
                    aliases = ks.aliases();
                } catch (KeyStoreException ex) {
                    logger.error("CallbackHandler.handle: Ошибка приполучении Алиаса. KeyStore = '" + ks+"'");
                    throw new UnsupportedCallbackException(pkcb);
                }
                while (aliases.hasMoreElements()) {
                    String alias = (String) aliases.nextElement();
                    try {
                        if (ks.isKeyEntry(alias)) {
                            key = ks.getKey(alias, keypassword.toCharArray());
                            if (key instanceof PrivateKey) {
                                if (logger.isDebugEnabled())
                                    logger.debug("CallbackHandler.handle: -> key="+key);
                                pkcb.setKey((PrivateKey) key);
                            }
                        }
                    } catch (KeyStoreException ex) {
                        logger.error("CallbackHandler.handle: Ошибка приполучении PrivateKey из хранилища. KeyStore = '" + ks+"'" + " ' Aliase = '"+ alias +"'");
                        throw new UnsupportedCallbackException(pkcb);
                    } catch (NoSuchAlgorithmException ex) {
                        logger.error("CallbackHandler.handle -> NoSuchAlgorithmException: Ошибка приполучении PrivateKey из хранилища. KeyStore = '" + ks+"'" + " ' Aliase = '"+ alias +"'");
                        throw new UnsupportedCallbackException(pkcb);
                    } catch (UnrecoverableKeyException ex) {
                        logger.error("CallbackHandler.handle -> UnrecoverableKeyException: Ошибка приполучении PrivateKey из хранилища. KeyStore = '" + ks+"'" + " ' Aliase = '"+ alias +"'"+ " ' Password Key = '"+ keypassword.replaceAll(".", "*") +"'" );
                        throw new UnsupportedCallbackException(pkcb);
                    }
                }
            }
        }
    }
}