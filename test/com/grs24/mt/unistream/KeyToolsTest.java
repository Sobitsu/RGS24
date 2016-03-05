/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Base64;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dale
 */
public class KeyToolsTest {
    private final String KEYSTOREPATH = "xws-security/client.jks";
    private final String KEYSTOREPASS = "1234567890";
    private final String TRUSTSTOREPATH = "xws-security/server.jks";
    private final String TRUSTSTOREPASS = "123456";
    
    private String computeB64(File target) throws IOException {
      FileInputStream stream = (new FileInputStream(target));
      byte[] buffer = new byte[stream.available()];
      stream.read(buffer);
      return Base64.getEncoder().encode(buffer).toString();
    }
    
    public KeyToolsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrivateKeyPKCS12 method, of class KeyTools.
     */
    @Test
    public void testGetPrivateKeyPKCS12() throws Exception {
        System.out.println("getPrivateKeyPKCS12");
        File file = new File(KEYSTOREPATH);
        String keyBody = computeB64(file);
        String keyStorePassword = KEYSTOREPASS;
        PrivateKey expResult = null;
        PrivateKey result = KeyTools.getPrivateKeyPKCS12(keyBody, keyStorePassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrivateKeyPKCS12file method, of class KeyTools.
     */
    @Test
    public void testGetPrivateKeyPKCS12file() throws Exception {
        System.out.println("getPrivateKeyPKCS12file");
        String filename = KEYSTOREPATH;
        String keyStorePassword = KEYSTOREPASS;
        PrivateKey expResult = null;
        PrivateKey result = KeyTools.getPrivateKeyPKCS12file(filename, keyStorePassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCertificatesJKS method, of class KeyTools.
     */
    @Test
    public void testGetCertificatesJKS() throws Exception {
        System.out.println("getCertificatesJKS");
        String keyBody = computeB64(new File(TRUSTSTOREPATH));
        String keyStorePassword = TRUSTSTOREPASS;
        Certificate[] expResult = null;
        Certificate[] result = KeyTools.getCertificatesJKS(keyBody, keyStorePassword);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of getCertificatesPKCS12file method, of class KeyTools.
     */
    @Test
    public void testGetCertificatesPKCS12file() throws Exception {
        System.out.println("getCertificatesPKCS12file");
        String filename = TRUSTSTOREPATH;
        String keyStorePassword = TRUSTSTOREPASS;
        Certificate[] result = KeyTools.getCertificatesPKCS12file(filename, keyStorePassword);
        //System.out.println(result[0].toString());
        assertEquals(result[0].getType(),"X.509");
        assertEquals(result[0].getPublicKey().getAlgorithm(),"RSA");
        assertNotNull(result[0]);
    }
}

