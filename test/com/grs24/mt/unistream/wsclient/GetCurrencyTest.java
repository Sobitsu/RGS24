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
    
    private final TestLib tl = new TestLib();
    private final GetCurrency gc = new GetCurrency();
    @BeforeClass
    public void setUpClass() throws IOException {
        tl.setUpClass();
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
        String сode = "USD";
        Integer expResult = 2;
        Integer result = gc.getCurrencyID(сode,tl.instance.ahh,tl.instance.service);
        assertEquals(expResult, result);
        сode = "RUB";
        expResult = 1;
        result = gc.getCurrencyID(сode,tl.instance.ahh,tl.instance.service);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrencyCode method, of class GetCurrency.
     */
    @Test
    public void testGetCurrencyCode() throws Exception {
        Integer currencyId = 1;
        String expResult = "RUB";
        String result = gc.getCurrencyCode(currencyId,tl.instance.ahh,tl.instance.service);
        assertEquals(expResult, result);
    }
}
