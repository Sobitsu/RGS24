/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream;

import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Enumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author v.rezin
 */
public class KeyTools {

        private static Logger logger = LoggerFactory.getLogger(KeyTools.class);
	/*
	 * Получение секретного ключа из pkcs#12 хранилища (под Windows обычно .pfx файл).
	 * @param filename - имя файла.
	 * @param keyStorePassword - пароль защиты файла.
	 * @return PrivateKey - секретный ключ или null.
	 */
	public static PrivateKey getPrivateKeyPKCS12(String keyBody, String keyStorePassword) throws GeneralSecurityException {
		Key key = null;
		KeyStore ks = null;

		if (keyBody==null) {
			logger.error("getPrivateKeyPKCS12: Empty keyBody - illegal argument.");
			throw new GeneralSecurityException("getPrivateKeyPKCS12: Empty keyBody - illegal argument.");
		}
		if (keyStorePassword==null) {
			logger.error("getPrivateKeyPKCS12: Empty keyStorePassword - illegal argument.");
			throw new GeneralSecurityException("getPrivateKeyPKCS12: Empty keyStorePassword - illegal argument.");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("getPrivateKeyPKCS12: <- keyBody='"+keyBody+"', keyStorePassword="+keyStorePassword.replaceAll(".", "*"));
		}
		
		try {
			ks = KeyStore.getInstance("PKCS12");
                        
			ByteArrayInputStream keyStoreIS = new ByteArrayInputStream(Base64.getDecoder().decode(keyBody));
			ks.load(keyStoreIS, keyStorePassword.toCharArray());
			Enumeration<String> aliases = ks.aliases();
			
			while (aliases.hasMoreElements()) {
				String alias = (String) aliases.nextElement();
				if (ks.isKeyEntry(alias)) {
					key = ks.getKey(alias, keyStorePassword.toCharArray());
					if (key instanceof PrivateKey) {
						if (logger.isDebugEnabled()) 
							logger.debug("getPrivateKeyPKCS12: -> key="+key);
						return (PrivateKey) key;
					}
				}
			}
		} catch (Exception ex) {
			logger.error("getPrivateKeyPKCS12: Can't get private key:", ex);
			throw new GeneralSecurityException("getPrivateKeyPKCS12: Can't get private key:");
		}
		return null;
	}

	/*
	 * Получение сертификата (точнее цепочки сертификатов) из хранилища в pkcs#12 формате.
	 * (под Windows это обычно .pfx файл).
	 * Чаще всего сертификаты в .pfx файл не включаются.
	 * 
	 * @param filename - имя файла.
	 * @param keyStorePassword - пароль защиты файла.
	 * @return Certificate[] - массив сертификатов. Только первый элемент [0], если он вообще есть,  
	 * соответсвует секретному ключу, остальные - промежуточные сертификаты до центра сертификации.
	 */
	public static Certificate[] getCertificatesPKCS12(String keyBody, String keyStorePassword) throws GeneralSecurityException {
		KeyStore ks = null;
		Certificate[] certs = null;
		
		if (keyBody==null) {
			logger.error("getCertificatesPKCS12: Empty keyBody - illegal argument.");
			throw new GeneralSecurityException("getCertificatesPKCS12: Empty keyBody - illegal argument.");
		}
		if (keyStorePassword==null) {
			logger.error("getCertificatesPKCS12: Empty keyStorePassword - illegal argument.");
			throw new GeneralSecurityException("getCertificatesPKCS12: Empty keyStorePassword - illegal argument.");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("getCertificatesPKCS12: <- keyBody='"+keyBody+"', keyStorePassword="+keyStorePassword.replaceAll(".", "*"));
		}
		
		try {
			ks = KeyStore.getInstance("PKCS12");
			
			ByteArrayInputStream keyStoreIS = new ByteArrayInputStream(Base64.getDecoder().decode(keyBody));;
			ks.load(keyStoreIS, keyStorePassword.toCharArray());
			Enumeration<String> aliases = ks.aliases();
			
			while (aliases.hasMoreElements()) {
				String alias = (String) aliases.nextElement();
				if (ks.isCertificateEntry(alias)) {
					certs = new Certificate[1]; 
					certs[0] = ks.getCertificate(alias);
					return certs;
				}
				certs = ks.getCertificateChain(alias);
				if (certs != null && certs.length > 0 ) {
					if (logger.isTraceEnabled()) {
						for (int i=0; i < certs.length; i++)
							logger.trace("getCertificatesPKCS12: cert["+i+"]="+certs[i]);
					}
					if (logger.isDebugEnabled()) 
						logger.debug("getCertificatesPKCS12: -> cert="+certs);
					return certs;
				}
			}
		} catch (Exception ex) {
			logger.error("getCertificatesPKCS12: Can't get certificate from keystore:", ex);
			throw new GeneralSecurityException("getCertificatesPKCS12: Can't get certificate from keystore:"+ex);
		}
		if (logger.isDebugEnabled()) 
			logger.debug("getCertificatesPKCS12: -> cert="+null);
		return null;
	}
	/*
	 * Получение сертификата (точнее цепочки сертификатов) из хранилища в JKS формате.
	 * 
	 * @param keyBody - строка с сертификатом.
	 * @param keyStorePassword - пароль защиты файла.
	 * @return Certificate[] - массив сертификатов. Только первый элемент [0], если он вообще есть,  
	 * соответсвует секретному ключу, остальные - промежуточные сертификаты до центра сертификации.
	 */
	public static Certificate[] getCertificatesJKS(String keyBody, String keyStorePassword) throws GeneralSecurityException {
		KeyStore ks = null;
		Certificate[] certs = null;
		
		if (keyBody==null) {
			logger.error("getCertificatesPKCS12: Empty keyBody - illegal argument.");
			throw new GeneralSecurityException("getCertificatesPKCS12: Empty keyBody - illegal argument.");
		}
		if (keyStorePassword==null) {
			logger.error("getCertificatesPKCS12: Empty keyStorePassword - illegal argument.");
			throw new GeneralSecurityException("getCertificatesPKCS12: Empty keyStorePassword - illegal argument.");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("getCertificatesPKCS12: <- keyBody='"+keyBody+"', keyStorePassword="+keyStorePassword.replaceAll(".", "*"));
		}
		
		try {
			ks = KeyStore.getInstance("JKS");
			
			ByteArrayInputStream keyStoreIS = new ByteArrayInputStream(Base64.getDecoder().decode(keyBody));;
			ks.load(keyStoreIS, keyStorePassword.toCharArray());
			Enumeration<String> aliases = ks.aliases();
			
			while (aliases.hasMoreElements()) {
				String alias = (String) aliases.nextElement();
				if (ks.isCertificateEntry(alias)) {
					certs = new Certificate[1]; 
					certs[0] = ks.getCertificate(alias);
					return certs;
				}
				certs = ks.getCertificateChain(alias);
				if (certs != null && certs.length > 0 ) {
					if (logger.isTraceEnabled()) {
						for (int i=0; i < certs.length; i++)
							logger.trace("getCertificatesPKCS12: cert["+i+"]="+certs[i]);
					}
					if (logger.isDebugEnabled()) 
						logger.debug("getCertificatesPKCS12: -> cert="+certs);
					return certs;
				}
			}
		} catch (Exception ex) {
			logger.error("getCertificatesPKCS12: Can't get certificate from keystore:", ex);
			throw new GeneralSecurityException("getCertificatesPKCS12: Can't get certificate from keystore:"+ex);
		}
		if (logger.isDebugEnabled()) 
			logger.debug("getCertificatesPKCS12: -> cert="+null);
		return null;
	}
        
        
        
        /*
	 * Получение секретного ключа из pkcs#12 хранилища (под Windows обычно .pfx файл).
	 * @param filename - имя файла.
	 * @param keyStorePassword - пароль защиты файла.
	 * @return PrivateKey - секретный ключ или null.
	 */
	public static PrivateKey getPrivateKeyPKCS12file(String filename, String keyStorePassword) throws GeneralSecurityException {
		Key key = null;
		KeyStore ks = null;

		if (filename==null) {
			logger.error("getPrivateKeyPKCS12: Empty filename - illegal argument.");
			throw new GeneralSecurityException("getPrivateKeyPKCS12: Empty filename - illegal argument.");
		}
		if (keyStorePassword==null) {
			logger.error("getPrivateKeyPKCS12: Empty keyStorePassword - illegal argument.");
			throw new GeneralSecurityException("getPrivateKeyPKCS12: Empty keyStorePassword - illegal argument.");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("getPrivateKeyPKCS12: <- filename='"+filename+"', keyStorePassword="+keyStorePassword.replaceAll(".", "*"));
		}
		
		try {
			ks = KeyStore.getInstance("JKS");
			
			InputStream keyStoreIS = new FileInputStream(filename);
			ks.load(keyStoreIS, keyStorePassword.toCharArray());
			Enumeration<String> aliases = ks.aliases();
			
			while (aliases.hasMoreElements()) {
				String alias = (String) aliases.nextElement();
				if (ks.isKeyEntry(alias)) {
					key = ks.getKey(alias, keyStorePassword.toCharArray());
					if (key instanceof PrivateKey) {
						if (logger.isDebugEnabled()) 
							logger.debug("getPrivateKeyPKCS12: -> key="+key);
						return (PrivateKey) key;
					}
				}
			}
		} catch (Exception ex) {
			logger.error("getPrivateKeyPKCS12: Can't get private key:", ex);
			throw new GeneralSecurityException("getPrivateKeyPKCS12: Can't get private key:");
		}
		return null;
	}

	/*
	 * Получение сертификата (точнее цепочки сертификатов) из хранилища в pkcs#12 формате.
	 * (под Windows это обычно .pfx файл).
	 * Чаще всего сертификаты в .pfx файл не включаются.
	 * 
	 * @param filename - имя файла.
	 * @param keyStorePassword - пароль защиты файла.
	 * @return Certificate[] - массив сертификатов. Только первый элемент [0], если он вообще есть,  
	 * соответсвует секретному ключу, остальные - промежуточные сертификаты до центра сертификации.
	 */
	public static Certificate[] getCertificatesPKCS12file(String filename, String keyStorePassword) throws GeneralSecurityException {
		KeyStore ks = null;
		Certificate[] certs = null;
		
		if (filename==null) {
			logger.error("getCertificatesPKCS12: Empty filename - illegal argument.");
			throw new GeneralSecurityException("getCertificatesPKCS12: Empty filename - illegal argument.");
		}
		if (keyStorePassword==null) {
			logger.error("getCertificatesPKCS12: Empty keyStorePassword - illegal argument.");
			throw new GeneralSecurityException("getCertificatesPKCS12: Empty keyStorePassword - illegal argument.");
		}
		if (logger.isDebugEnabled()) {
			logger.debug("getCertificatesPKCS12: <- filename='"+filename+"', keyStorePassword="+keyStorePassword.replaceAll(".", "*"));
		}
		
		try {
			ks = KeyStore.getInstance("JKS");
			
			InputStream keyStoreIS = new FileInputStream(filename);
			ks.load(keyStoreIS, keyStorePassword.toCharArray());
			Enumeration<String> aliases = ks.aliases();
			
			while (aliases.hasMoreElements()) {
				String alias = (String) aliases.nextElement();
				if (ks.isCertificateEntry(alias)) {
					certs = new Certificate[1]; 
					certs[0] = ks.getCertificate(alias);
					return certs;
				}
				certs = ks.getCertificateChain(alias);
				if (certs != null && certs.length > 0 ) {
					if (logger.isTraceEnabled()) {
						for (int i=0; i < certs.length; i++)
							logger.trace("getCertificatesPKCS12: cert["+i+"]="+certs[i]);
					}
					if (logger.isDebugEnabled()) 
						logger.debug("getCertificatesPKCS12: -> cert="+certs);
					return certs;
				}
			}
		} catch (Exception ex) {
			logger.error("getCertificatesPKCS12: Can't get certificate from keystore:", ex);
			throw new GeneralSecurityException("getCertificatesPKCS12: Can't get certificate from keystore:"+ex);
		}
		if (logger.isDebugEnabled()) 
			logger.debug("getCertificatesPKCS12: -> cert="+null);
		return null;
	}

}