/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import java.io.IOException;
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
     * Test of FindTransfer method, of class FindTransfer.
     */
    @Test
    public void testFindTransfer() throws Exception {
        System.out.println("FindTransfer");
        String controlNumber = "743818837598";
        Double sum = 50000D;
        Integer val = GetCurrency.getCurrencyID("RUB");
        Integer bankId = TestLib.instance.KEY_BANK_ID;
        FindTransferResponseMessage result = FindTransfer.findTransfer(controlNumber, sum, val, bankId);
        assertTrue(result.getFault().isNil());
        assertFalse(result.getTransfer().isNil());
        assertNotNull(result.getTransfer().getValue());
        assertFalse(result.getTransfer().getValue().getAmounts().isNil());
        assertEquals(result.getTransfer().getValue().getID().longValue(),16016603L);
        System.out.println("FindTransfer OK");
    }
}
