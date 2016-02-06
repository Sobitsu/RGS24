/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.dto.Person;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage;
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
public class CreatePersonTest {
    
    public CreatePersonTest() {
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
     * Test of CreatePerson method, of class CreatePerson.
     */
    @Test
    public void testCreatePerson() throws Exception {
        System.out.println("CreatePerson");
        Person pers = null;
        CreatePersonResponseMessage expResult = null;
        CreatePersonResponseMessage result = CreatePerson.CreatePerson(pers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
