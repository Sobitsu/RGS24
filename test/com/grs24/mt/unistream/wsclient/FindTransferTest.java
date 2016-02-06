/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.Constants;
import com.grs24.mt.unistream.dto.FindTransferRequestDto;
import org.datacontract.schemas._2004._07.wcfservicelib.Transfer;
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
        FindTransferRequestDto transfer = new FindTransferRequestDto("438017213820",555D,GetCurrency.GetCurrencyID("USD"),Constants.KEY_BANK_ID);
        /*transfer.setControlNumber("438017213820");
        transfer.setCurrencyID(GetCurrency.GetCurrencyID("USD"));
        transfer.setSum(555D);
        transfer.setBankID(Constants.KEY_BANK_ID);*/
        Transfer expResult = null;
        Transfer result = FindTransfer.FindTransfer(transfer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
