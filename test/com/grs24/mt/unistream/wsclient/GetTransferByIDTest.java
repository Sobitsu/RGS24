/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessage;
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
public class GetTransferByIDTest {
    
    public GetTransferByIDTest() {
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
     * Test of GetTransferByID method, of class GetTransferByID.
     */
    @Test
    public void testGetTransferByID() throws Exception {
        System.out.println("GetTransferByID");
        Integer transferId = null;
        GetTransferByIDResponseMessage expResult = null;
        GetTransferByIDResponseMessage result = GetTransferByID.getTransferByID(transferId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
