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
public class GetCountryTest {
    
    public GetCountryTest() {
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
     * Test of getCountriesID method, of class GetCountry.
     */
    @Test
    public void testGetCountriesID() throws Exception {
        System.out.println("getCountriesID");
        String code = "";
        Integer expResult = null;
        Integer result = GetCountry.getCountriesID(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuntryCode method, of class GetCountry.
     */
    @Test
    public void testGetCuntryCode() throws Exception {
        System.out.println("getCuntryCode");
        Integer cuntryId = null;
        String expResult = "";
        String result = GetCountry.getCuntryCode(cuntryId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
