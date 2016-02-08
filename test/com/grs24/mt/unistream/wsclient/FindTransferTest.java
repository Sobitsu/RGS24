/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessage;
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
public class FindTransferTest {
    
    public FindTransferTest() {
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
     * Test of FindTransfer method, of class FindTransfer.
     */
    @Test
    public void testFindTransfer() throws Exception {
        System.out.println("FindTransfer");
        String controlNumber = "";
        Double sum = null;
        Integer val = null;
        Integer bankId = null;
        FindTransferResponseMessage expResult = null;
        FindTransferResponseMessage result = FindTransfer.FindTransfer(controlNumber, sum, val, bankId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
