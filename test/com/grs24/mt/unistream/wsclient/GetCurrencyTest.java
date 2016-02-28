/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.MtUnistreamAdapter;
import java.io.IOException;
import java.util.Properties;
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
public class GetCurrencyTest {
    
 public static String KEY_USER_AUTHED_APIKEY = "1wwteyFGFew624";
    public static String KEY_USER_AUTHED_LOGIN = "g2.grstwentyfour.rus";
    public static String KEY_USER_AUTHED_PASSWORD = "7!LrO7i7";
    public static Integer KEY_BANK_ID = 383589;
    public static Integer KEY_PARTICIPATOR_ID = 383589;
    private static MtUnistreamAdapter instance;
  
    @BeforeClass
    public static void setUpClass() throws IOException {
        Properties cfg = new Properties();
        cfg.setProperty("APIKEY", KEY_USER_AUTHED_APIKEY);
        cfg.setProperty("LOGIN", KEY_USER_AUTHED_LOGIN);
        cfg.setProperty("PASSWORD", KEY_USER_AUTHED_PASSWORD);
        cfg.setProperty("BANKID", KEY_BANK_ID.toString());
        cfg.setProperty("PARTID",KEY_PARTICIPATOR_ID.toString());
        instance = new MtUnistreamAdapter();
        instance.init(cfg);    
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
     * Test of getCurrencyID method, of class GetCurrency.
     */
    @Test
    public void testGetCurrencyID() throws Exception {
        System.out.println("getCurrencyID");
        String сode = "RUB";
        Integer expResult = 1;
        Integer result = GetCurrency.getCurrencyID(сode);
        assertEquals(expResult, result);
        System.out.println("getCurrencyID OK");
    }

    /**
     * Test of getCurrencyCode method, of class GetCurrency.
     */
    @Test
    public void testGetCurrencyCode() throws Exception {
        System.out.println("getCurrencyCode");
        Integer currencyId = 1;
        String expResult = "RUB";
        String result = GetCurrency.getCurrencyCode(currencyId);
        assertEquals(expResult, result);
        System.out.println("getCurrencyCode OK");
    }
    
}
