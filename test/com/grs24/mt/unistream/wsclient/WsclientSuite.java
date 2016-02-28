/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Dale
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.grs24.mt.unistream.wsclient.GetCountryTest.class, com.grs24.mt.unistream.wsclient.GetTransferByIDTest.class, com.grs24.mt.unistream.wsclient.GetCurrencyTest.class, com.grs24.mt.unistream.wsclient.CommonLibTest.class, com.grs24.mt.unistream.wsclient.PayOutTransferTest.class, com.grs24.mt.unistream.wsclient.GetBanksTest.class, com.grs24.mt.unistream.wsclient.CreatePersonTest.class, com.grs24.mt.unistream.wsclient.FindTransferTest.class, com.grs24.mt.unistream.wsclient.FindPersonTest.class})
public class WsclientSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
