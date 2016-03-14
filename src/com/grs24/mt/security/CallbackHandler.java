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
import java.util.Map;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.slf4j.LoggerFactory;
/**
 *
 * @author Dale
 */
public abstract class CallbackHandler implements javax.security.auth.callback.CallbackHandler {
  private final org.slf4j.Logger logger = LoggerFactory.getLogger(CallbackHandler.class);

/**
* Метод обработки CallBack от системы безопасности на подмену ключей и хранилищ с ключами<br>
* Настройка вызова производится в файле META-INF/wsit-client.xml и META-INF/service.svc.wsdl_wsdl0.xml<br>
* @param callbacks - Обрабатываемый запрос

*<p> Обрабатываются два типа CallBack:</p>
* <p>KeyStoreCallBack </p>
* KeyStore получаются из параметров:<br>
* MtUnistreamAdapter.KEY_KEYSTORE_PKCS12_BODY <br>
* MtUnistreamAdapter.KEY_TRUSTSTORE_JKS_BODY <br>
* Разделение происходит на основании источника вызова:<br>
* KeyStoreHandler или TrustStoreHandler<br>
* Пароли к KeyStore получаются из параметров: <br>
* MtUnistreamAdapter.KEY_KEYSTORE_PASSWORD <br>
* MtUnistreamAdapter.KEY_TRUSTSTORE_PASSWORD <br>

* <p>PrivateKeyCallback</p>
* Из полученного на входе PrivateKeyCallback 
* получаем KeyStore и из него получаем PrivateKey 
* @throws java.io.IOException
* @throws javax.security.auth.callback.UnsupportedCallbackException
* @see Callback
* @see KeyStoreCallBack
* @see MtUnistreamAdapter#KEY_KEYSTORE_PKCS12_BODY
* @see MtUnistreamAdapter#KEY_TRUSTSTORE_JKS_BODY
* @see KeyStoreHandler
* @see TrustStoreHandler
* @see MtUnistreamAdapter#KEY_KEYSTORE_PASSWORD
* @see MtUnistreamAdapter#KEY_TRUSTSTORE_PASSWORD
* @see PrivateKeyCallback
* @see PrivateKeyCallback 
* @PrivateKey
*/ 
  @Override
  public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException 
    {
        if (logger.isDebugEnabled()) {
            logger.debug("CallbackHandler.handle: <- callbacks ='"+callbacks.toString());
	}
        for (Callback callback : callbacks) {
            if (logger.isDebugEnabled()) {
                logger.debug("CallbackHandler.handle: <- callback ='"+callback.toString());
                }
            if (callback instanceof KeyStoreCallback) {
                KeyStore ks = null;
                ByteArrayInputStream keyStoreIS;
                String keystorepassword = null;
                String keystorebody = null;
                KeyStoreCallback kscb = (KeyStoreCallback) callback;
                Map runtimeproperty = kscb.getRuntimeProperties();
                
                String keystoretype = null;
                if (this instanceof KeyStoreHandler) {
                          keystoretype = MtUnistreamAdapter.get_keystoreType();
                          keystorebody = MtUnistreamAdapter.get_keystoreBody();
                          keystorepassword = MtUnistreamAdapter.get_keystorePassword();
                      }
                if (this instanceof TrustStoreHandler) {
                          keystoretype = MtUnistreamAdapter.get_truststoreType();
                          keystorebody = MtUnistreamAdapter.get_truststoreBody();
                          keystorepassword = MtUnistreamAdapter.get_truststorePassword();
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
                      logger.error("CallbackHandler.handle: NoSuchAlgorithmException: Ошибка определения алгоритма KeyStore из настройки. KeyStoreType= '" + keystoretype +"'" + " keystorebody '" + keystorebody+"'",ex);
                      throw new UnsupportedCallbackException(kscb);
                  } 
                catch (CertificateException ex) {
                      logger.error("CallbackHandler.handle: CertificateException: Ошибка проверки сертификата KeyStore из настройки. KeyStoreType= '" + keystoretype+"'" + " keystorebody= '" + keystorebody+"'" + " keystoreзфыыцщкв= '" + keystorepassword.replaceAll(".", "*") +"'",ex);
                      throw new UnsupportedCallbackException(kscb);
                  } 
                finally {
                        keyStoreIS.close();
                    }
                kscb.setKeystore(ks);
                if (logger.isDebugEnabled()) {
                    logger.debug("CallbackHandler.handle: -> KeyStore ='"+kscb.getKeystore()+ "'");
                }
            }
            if (callback instanceof PrivateKeyCallback) {
                PrivateKeyCallback pkcb = (PrivateKeyCallback) callback;
                KeyStore ks = pkcb.getKeystore();
                Key key;
                String keypassword = MtUnistreamAdapter.get_keyPassword();
                Enumeration<String> aliases;
                try {
                    aliases = ks.aliases();
                } catch (KeyStoreException ex) {
                    logger.error("CallbackHandler.handle: Ошибка приполучении Алиаса. KeyStore = '" + ks+"'",ex);
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
                        logger.error("CallbackHandler.handle: Ошибка приполучении PrivateKey из хранилища. KeyStore = '" + ks+"'" + " ' Aliase = '"+ alias +"'",ex);
                        throw new UnsupportedCallbackException(pkcb);
                    } catch (NoSuchAlgorithmException ex) {
                        logger.error("CallbackHandler.handle: NoSuchAlgorithmException: Ошибка приполучении PrivateKey из хранилища. KeyStore = '" + ks+"'" + " ' Aliase = '"+ alias +"'",ex);
                        throw new UnsupportedCallbackException(pkcb);
                    } catch (UnrecoverableKeyException ex) {
                        logger.error("CallbackHandler.handle: UnrecoverableKeyException: Ошибка приполучении PrivateKey из хранилища. KeyStore = '" + ks+"'" + " ' Aliase = '"+ alias +"'"+ " ' Password Key = '"+ keypassword.replaceAll(".", "*") +"'", ex);
                        throw new UnsupportedCallbackException(pkcb);
                    }
                }
            }
        }
    }
}