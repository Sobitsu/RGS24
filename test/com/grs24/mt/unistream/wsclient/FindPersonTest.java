/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.MtUnistreamAdapter;
import static com.grs24.mt.unistream.MtUnistreamAdapterTest.KEY_BANK_ID;
import static com.grs24.mt.unistream.MtUnistreamAdapterTest.KEY_USER_AUTHED_APIKEY;
import static com.grs24.mt.unistream.MtUnistreamAdapterTest.KEY_USER_AUTHED_LOGIN;
import static com.grs24.mt.unistream.MtUnistreamAdapterTest.KEY_USER_AUTHED_PASSWORD;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;
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
public class FindPersonTest {
    private static String KEY_USER_AUTHED_APIKEY = "1wwteyFGFew624";
    private static String KEY_USER_AUTHED_LOGIN = "g2.grstwentyfour.rus";
    private static String KEY_USER_AUTHED_PASSWORD = "7!LrO7i7";
    private static Integer KEY_BANK_ID = 383589;
    private static MtUnistreamAdapter instance; 
    public FindPersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Properties cfg = new Properties();
        cfg.setProperty("APIKEY", KEY_USER_AUTHED_APIKEY);
        cfg.setProperty("LOGIN", KEY_USER_AUTHED_LOGIN);
        cfg.setProperty("PASSWORD", KEY_USER_AUTHED_PASSWORD);
        cfg.setProperty("BANKID", KEY_BANK_ID.toString());
        instance = new MtUnistreamAdapter();
        try {    
            instance.init(cfg);
        } catch (IOException ex) {
            Logger.getLogger(FindPersonTest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
     * Test of FindPersonJAXb method, of class FindPerson.
     */
    @Test
    public void testFindPersonJAXb() throws Exception {
        System.out.println("FindPersonJAXb");
        FindPersonRequestMessage fprm = null;
        FindPersonResponseMessage expResult = null;
        FindPersonResponseMessage result = FindPerson.FindPersonJAXb(fprm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
