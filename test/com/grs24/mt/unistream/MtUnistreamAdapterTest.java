/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream;

import com.grs24.mt.FundsHolder;
import com.grs24.mt.PersonHolder;
import com.grs24.mt.RemittanceHolder;
import java.util.Properties;
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
public class MtUnistreamAdapterTest {
    
    public MtUnistreamAdapterTest() {
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
     * Test of init method, of class MtUnistreamAdapter.
     */
    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        Properties cfg = null;
        MtUnistreamAdapter instance = new MtUnistreamAdapter();
        instance.init(cfg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moneySearch method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneySearch() throws Exception {
        System.out.println("moneySearch");
        String mtcn = "";
        FundsHolder approxOrgFunds = null;
        FundsHolder approxDstFunds = null;
        String orgCountry = "";
        String dstCountry = "";
        MtUnistreamAdapter instance = new MtUnistreamAdapter();
        RemittanceHolder[] expResult = null;
        RemittanceHolder[] result = instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moneyHold method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneyHold() throws Exception {
        System.out.println("moneyHold");
        String mtID = "";
        String mtcn = "";
        PersonHolder payee = null;
        MtUnistreamAdapter instance = new MtUnistreamAdapter();
        instance.moneyHold(mtID, mtcn, payee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moneyUnhold method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneyUnhold() throws Exception {
        System.out.println("moneyUnhold");
        String mtID = "";
        String mtcn = "";
        PersonHolder payee = null;
        MtUnistreamAdapter instance = new MtUnistreamAdapter();
        instance.moneyUnhold(mtID, mtcn, payee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moneyPay method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneyPay() throws Exception {
        System.out.println("moneyPay");
        String mtID = "";
        String mtcn = "";
        PersonHolder payee = null;
        String docID = "";
        String docDate = "";
        MtUnistreamAdapter instance = new MtUnistreamAdapter();
        instance.moneyPay(mtID, mtcn, payee, docID, docDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
