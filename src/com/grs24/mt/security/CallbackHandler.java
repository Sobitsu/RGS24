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
import javax.security.auth.message.callback.TrustStoreCallback;
/**
 *
 * @author Dale
 */
public class TrustStoreHandler extends CallbackHandler {
    }

public class KeyStoreHandler extends CallbackHandler {
    }
public abstract class CallbackHandler implements javax.security.auth.callback.CallbackHandler {

  @Override
  public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException 
    {
        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof KeyStoreCallback) { 
                KeyStore ks = null;
                KeyStoreCallback kscb = (KeyStoreCallback)callbacks[i];                
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
            if (callbacks[i] instanceof TrustStoreCallback) { 
                KeyStore ks = null;
                TrustStoreCallback tscb = (TrustStoreCallback)callbacks[i];
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
                tscb.setTrustStore(ks);            
            }
            if (callbacks[i] instanceof PrivateKeyCallback) { 
                PrivateKeyCallback pkcb = (PrivateKeyCallback)callbacks[i];
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