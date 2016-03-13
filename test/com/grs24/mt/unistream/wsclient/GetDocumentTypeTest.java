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
import org.junit.Ignore;

/**
 *
 * @author Dale
 */
public class GetDocumentTypeTest {
 
    private final TestLib tl = new TestLib();
    private final GetDocumentType gdt = new GetDocumentType();
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
     * Test of getDocumentsID method, of class GetDocumentType.
     */
    @Test
    public void testGetDocumentsID() throws Exception {
        System.out.println("getDocumentsID");
        String code = "35";
        Integer expResult = 35;
        Integer result = gdt.getDocumentsID(code);
        assertEquals(expResult, result);
        System.out.println("getDocumentsID OK");
    }
}
