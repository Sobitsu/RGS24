/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.MtUnistreamAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

/**
 *
 * @author Dale
 */
public class TestLib {
    private static final String KEY_USER_AUTHED_APIKEY = "1wwteyFGFew624";
    private static final String KEY_USER_AUTHED_LOGIN = "g2.grstwentyfour.rus";
    private static final String KEY_USER_AUTHED_PASSWORD = "7!LrO7i7";
    private static final Integer KEY_BANK_ID = 383589;
    private static final Integer KEY_PARTICIPATOR_ID = 383589;
    private static final Integer KEY_SERVER_REQUEST_TUMEOUT = 3000;
    private static final Integer KEY_SERVER_CONNECT_TUMEOUT = 1000;
    private static final String KEY_KEYSTORE_PASSWORD = "123456";
    private static final String KEY_KEY_PASSWORD = "1234567890";
    private static final String KEY_TRUSTSTORE_PASSWORD = "123456";
    private static final String KEYSTOREPATH = "xws-security/client.jks";
    private static final String TRUSTSTOREPATH = "xws-security/server.jks";
    private static final String KEY_TRUSTSTORE_TYPE = "JKS";
    private static final String KEY_KEYSTORE_TYPE = "JKS";
    
    public static MtUnistreamAdapter instance;
    
    private static String computeB64(String filename) throws IOException {
        File target = new File(filename);
        FileInputStream stream = (new FileInputStream(target));
        byte[] buffer = new byte[stream.available()];
        stream.read(buffer);
        return Base64.getEncoder().encodeToString(buffer);
    }

    public static void setUpClass() throws IOException {
        Properties cfg = new Properties();
        cfg.setProperty("APIKEY", KEY_USER_AUTHED_APIKEY);
        cfg.setProperty("LOGIN", KEY_USER_AUTHED_LOGIN);
        cfg.setProperty("PASSWORD", KEY_USER_AUTHED_PASSWORD);
        cfg.setProperty("BANKID", KEY_BANK_ID.toString());
        cfg.setProperty("PARTID",KEY_PARTICIPATOR_ID.toString());
        cfg.setProperty("SERVER.REQUEST_TIMEOUT", KEY_SERVER_REQUEST_TUMEOUT.toString());
        cfg.setProperty("SERVER.CONNECT_TIMEOUT", KEY_SERVER_CONNECT_TUMEOUT.toString());
        cfg.setProperty("KEYSTORE.PASSWORD", KEY_KEYSTORE_PASSWORD);
        cfg.setProperty("KEY.PASSWORD", KEY_KEY_PASSWORD);
        cfg.setProperty("TRUSTSTORE.PASSWORD", KEY_TRUSTSTORE_PASSWORD);
        cfg.setProperty("KEYSTORE.PKCS12", computeB64(KEYSTOREPATH));
        cfg.setProperty("TRUSTSTORE.JKS",  computeB64(TRUSTSTOREPATH));
        cfg.setProperty("KEYSTORE.TYPE", KEY_KEYSTORE_TYPE);
        cfg.setProperty("TRUSTSTORE.TYPE",  KEY_TRUSTSTORE_TYPE);
        instance = new MtUnistreamAdapter();
        instance.init(cfg);    
    }
}
