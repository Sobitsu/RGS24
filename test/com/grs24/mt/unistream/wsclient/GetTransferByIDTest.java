/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import java.io.IOException;
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
     * Test of getTransferByID method, of class GetTransferByID.
     */
    @Test
    public void testGetTransferByID() throws Exception {
        Integer transferId = 16015170;
        
        GetTransferByID gtbi = new GetTransferByID();
        GetTransferByIDResponseMessage result = gtbi.getTransferByID(transferId, tl.instance.ahh,tl.instance.service);
        assertTrue(result.getFault().isNil());
        assertFalse(result.getTransfer().isNil());
        assertNotNull(result.getTransfer().getValue());
        assertFalse(result.getTransfer().getValue().getAmounts().isNil());
        assertEquals(result.getTransfer().getValue().getControlNumber().getValue(),"828105025765");
    }
}
