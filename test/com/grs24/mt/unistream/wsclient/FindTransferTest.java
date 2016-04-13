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
    
    private final static TestLib tl = new TestLib();
    @BeforeClass
    public static void setUpClass() throws IOException {
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
     * Test of FindTransfer method, of class FindTransfer.
     */
    @Test
    public void testFindTransfer() throws Exception {
        String controlNumber = "784555934685";
        Double sum = 150D;
        GetCurrency gcur = new GetCurrency();
        Integer val = gcur.getCurrencyID("USD",tl.instance.ahh,tl.instance.service);
        Integer bankId = tl.instance.KEY_PARTICIPATOR_ID;//.get_bankID();
        FindTransfer ft = new FindTransfer();
        FindTransferResponseMessage result = ft.findTransfer(controlNumber, sum, val, bankId,tl.instance.ahh,tl.instance.service);
        assertTrue(result.getFault().isNil());
        assertFalse(result.getTransfer().isNil());
        assertNotNull(result.getTransfer().getValue());
        assertFalse(result.getTransfer().getValue().getAmounts().isNil());
        assertEquals(result.getTransfer().getValue().getID().longValue(),16015653L);
    }
}
