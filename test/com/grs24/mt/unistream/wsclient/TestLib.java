/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.MtUnistreamAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

/**
 *
 * @author Dale
 */
public class TestLib {
    private final String KEY_USER_AUTHED_APIKEY = "1wwteyFGFew624";
    private final String KEY_USER_AUTHED_LOGIN = "g2.grstwentyfour.rus";
    private final String KEY_USER_AUTHED_PASSWORD = "7!LrO7i7";
    private final Integer KEY_BANK_ID = 383589;
    private final Integer KEY_PARTICIPATOR_ID = 383589;
    private final Integer KEY_SERVER_REQUEST_TUMEOUT = 8000;
    private final Integer KEY_SERVER_CONNECT_TUMEOUT = 5000;
    private final String KEY_KEYSTORE_PASSWORD = "123456";
   // private static final String KEY_KEY_PASSWORD = "123456";
    private final String KEY_TRUSTSTORE_PASSWORD = "123456";
    private final String KEYSTOREPATH = "xws-security/prv_key_unistream.pfx";//"xws-security/client.jks";
    private final String TRUSTSTOREPATH = "xws-security/server.jks";
    private final String TESTFILENAME = "testdata/testTransfer.csv";
//    private static final String KEY_TRUSTSTORE_TYPE = "JKS";
//    private static final String KEY_KEYSTORE_TYPE = "JKS";
    
    public MtUnistreamAdapter instance;
    
    private String computeB64(String filename) throws IOException {
        File target = new File(filename);
        FileInputStream stream = (new FileInputStream(target));
        byte[] buffer = new byte[stream.available()];
        stream.read(buffer);
        return Base64.getEncoder().encodeToString(buffer);
    }

    public void setUpClass() throws IOException {
        Properties cfg = new Properties();
        cfg.setProperty("APIKEY", KEY_USER_AUTHED_APIKEY);
        cfg.setProperty("LOGIN", KEY_USER_AUTHED_LOGIN);
        cfg.setProperty("PASSWORD", KEY_USER_AUTHED_PASSWORD);
        cfg.setProperty("BANKID", KEY_BANK_ID.toString());
        cfg.setProperty("PARTID",KEY_PARTICIPATOR_ID.toString());
        cfg.setProperty("SERVER.REQUEST_TIMEOUT", KEY_SERVER_REQUEST_TUMEOUT.toString());
        cfg.setProperty("SERVER.CONNECT_TIMEOUT", KEY_SERVER_CONNECT_TUMEOUT.toString());
        cfg.setProperty("KEYSTORE.PASSWORD", KEY_KEYSTORE_PASSWORD);
       // cfg.setProperty("KEY.PASSWORD", KEY_KEY_PASSWORD);
        cfg.setProperty("TRUSTSTORE.PASSWORD", KEY_TRUSTSTORE_PASSWORD);
        cfg.setProperty("KEYSTORE.PKCS12", computeB64(KEYSTOREPATH));
        cfg.setProperty("TRUSTSTORE.JKS",  computeB64(TRUSTSTOREPATH));
        //cfg.setProperty("KEYSTORE.TYPE", KEY_KEYSTORE_TYPE);
        //cfg.setProperty("TRUSTSTORE.TYPE",  KEY_TRUSTSTORE_TYPE);
        instance = new MtUnistreamAdapter();
        instance.init(cfg);    
    }
    public TestTransferReq getReqSearch() throws FileNotFoundException, IOException {
        TestTransferReq retval = new TestTransferReq();
        BufferedReader myfile = new BufferedReader (new FileReader(TESTFILENAME));
        String line;
        String buf;
        while (!(line = myfile.readLine()).isEmpty()) {
            buf = line.substring(0, line.indexOf(";", 1));
            if (buf.equals("search")) {
                int i1;
                int i2;
                i1 = line.indexOf(";", 1)+1;
                i2 = line.indexOf(";", i1);
                retval.controlNumber = line.substring(i1, i2);
                i1 = line.indexOf(";", i2)+1;
                i2 = line.indexOf(";", i1);
                retval.sum = line.substring(i1, i2);
                i1 = line.indexOf(";", i2)+1;
                retval.currency = line.substring(i1);
                break;
            }
        };
        return retval;
    }

    public TestTransferReq getReqPay() throws IOException {
        TestTransferReq retval = new TestTransferReq();
        BufferedReader myfile = new BufferedReader (new FileReader(TESTFILENAME));
        String line;
        String buf;
        while (!(line = myfile.readLine()).isEmpty()) {
            buf = line.substring(0, line.indexOf(";", 1));
            if (buf.equals("pay")) {
                int i1;
                int i2;
                i1 = line.indexOf(";", 1)+1;
                i2 = line.indexOf(";", i1);
                retval.controlNumber = line.substring(i1, i2);
                i1 = line.indexOf(";", i2)+1;
                i2 = line.indexOf(";", i1);
                retval.sum = line.substring(i1, i2);
                i1 = line.indexOf(";", i2)+1;
                retval.currency = line.substring(i1);
                break;
            }
        }
     return retval;
    }
}
