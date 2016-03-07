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
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.slf4j.LoggerFactory;
/**
 *
 * @author Dale
 */
public abstract class CallbackHandler implements javax.security.auth.callback.CallbackHandler {
  private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CallbackHandler.class);
  
  @Override
  public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException 
    {
        if (logger.isDebugEnabled()) {
            logger.debug("CallbackHandler.handle: <- callbacks ='"+callbacks.toString());
	}
        for (Callback callback : callbacks) {
          if (callback instanceof KeyStoreCallback && this instanceof KeyStoreHandler) {
              KeyStore ks = null;
              KeyStoreCallback kscb = (KeyStoreCallback) callback;
              try {
                  ks = KeyStore.getInstance("JKS");
              } catch (KeyStoreException ex) {
                  Logger.getLogger(CallbackHandler.class.getName()).log(Level.SEVERE, null, ex);
              }
              ByteArrayInputStream keyStoreIS = new ByteArrayInputStream(Base64.getDecoder().decode(MtUnistreamAdapter.KEY_KEYSTORE_PKCS12_BODY));
              try {
                  ks.load(keyStoreIS, MtUnistreamAdapter.KEY_KEYSTORE_PASSWORD.toCharArray());
              }
              catch (NoSuchAlgorithmException ex) {
                  Logger.getLogger(CallbackHandler.class.getName()).log(Level.SEVERE, null, ex);
              } catch (CertificateException ex) {
                  Logger.getLogger(CallbackHandler.class.getName()).log(Level.SEVERE, null, ex);
              }                finally {
                  keyStoreIS.close();
              }
              kscb.setKeystore(ks);
          }
          if (callback instanceof KeyStoreCallback && this instanceof TrustStoreHandler) {
              KeyStore ks = null;
               KeyStoreCallback kscb = (KeyStoreCallback) callback;
              try {
                  ks = KeyStore.getInstance("JKS");
              } catch (KeyStoreException ex) {
                  Logger.getLogger(CallbackHandler.class.getName()).log(Level.SEVERE, null, ex);
              }
              ByteArrayInputStream keyStoreIS = new ByteArrayInputStream(Base64.getDecoder().decode(MtUnistreamAdapter.KEY_TRUSTSTORE_JKS_BODY));
              try {
                  ks.load(keyStoreIS, MtUnistreamAdapter.KEY_TRUSTSTORE_PASSWORD.toCharArray());
              }
              catch (NoSuchAlgorithmException ex) {
                  Logger.getLogger(CallbackHandler.class.getName()).log(Level.SEVERE, null, ex);
              } catch (CertificateException ex) {
                  Logger.getLogger(CallbackHandler.class.getName()).log(Level.SEVERE, null, ex);
              }                finally {
                  keyStoreIS.close();
              }
              kscb.setKeystore(ks);
          }
          if (callback instanceof PrivateKeyCallback) {
              PrivateKeyCallback pkcb = (PrivateKeyCallback) callback;
              pkcb.setAlias("6583c384-94e1-4b26-ad40-f88dc77b14e0");
              try {
                  pkcb.setKey((PrivateKey) pkcb.getKeystore().getKey("6583c384-94e1-4b26-ad40-f88dc77b14e0", MtUnistreamAdapter.KEY_KEY_PASSWORD.toCharArray()));
              } catch (KeyStoreException ex) {
                  Logger.getLogger(CallbackHandler.class.getName()).log(Level.SEVERE, null, ex);
              } catch (NoSuchAlgorithmException ex) {
                  Logger.getLogger(CallbackHandler.class.getName()).log(Level.SEVERE, null, ex);
              } catch (UnrecoverableKeyException ex) {
                  Logger.getLogger(CallbackHandler.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
      }
        }
    }