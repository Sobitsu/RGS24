/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import java.io.IOException;
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
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        TestLib.setUpClass();
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
        String сode = "USD";
        Integer expResult = 2;
        Integer result = GetCurrency.getCurrencyID(сode);
        assertEquals(expResult, result);
        сode = "RUB";
        expResult = 1;
        result = GetCurrency.getCurrencyID(сode);
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
