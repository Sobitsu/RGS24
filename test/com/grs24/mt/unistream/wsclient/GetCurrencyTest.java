/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

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
    
    public GetCurrencyTest() {
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
     * Test of getCurrencyID method, of class GetCurrency.
     */
    @Test
    public void testGetCurrencyID() throws Exception {
        System.out.println("getCurrencyID");
        String CurrencyCode = "";
        Integer expResult = null;
        Integer result = GetCurrency.getCurrencyID(CurrencyCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrencyCode method, of class GetCurrency.
     */
    @Test
    public void testGetCurrencyCode() throws Exception {
        System.out.println("getCurrencyCode");
        Integer currencyId = null;
        String expResult = "";
        String result = GetCurrency.getCurrencyCode(currencyId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
