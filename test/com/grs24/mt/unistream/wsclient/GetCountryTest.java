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
public class GetCountryTest {
    
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
     * Test of getCountriesID method, of class GetCountry.
     */
    @Test
    public void testGetCountriesID() throws Exception {
        System.out.println("getCountriesID");
        String code = "RUS";
        Integer expResult = 18;
        Integer result = GetCountry.getCountriesID(code);
        assertEquals(expResult, result);
        System.out.println("getCountriesID OK");
    }

    /**
     * Test of getCuntryCode method, of class GetCountry.
     */
    @Test
    public void testGetCuntryCode() throws Exception {
        System.out.println("getCuntryCode");
        Integer cuntryId = 18;
        String expResult = "RUS";
        String result = GetCountry.getCuntryCode(cuntryId);
        assertEquals(expResult, result);
        System.out.println("getCuntryCode OK");
    }
}
