/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream;

import com.grs24.mt.AddressHolder;
import com.grs24.mt.CredentialsHolder;
import com.grs24.mt.FullNameTypeHolder;
import com.grs24.mt.FundsHolder;
import com.grs24.mt.IndividualHolder;
import com.grs24.mt.PersonHolder;
import com.grs24.mt.RemittanceHolder;
import java.util.Properties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

/**
 *
 * @author Dale
 */
public class MtUnistreamAdapterTest {
    
    public static String KEY_USER_AUTHED_APIKEY = "1wwteyFGFew624";
    public static String KEY_USER_AUTHED_LOGIN = "g2.grstwentyfour.rus";
    public static String KEY_USER_AUTHED_PASSWORD = "7!LrO7i7";
    public static Integer KEY_BANK_ID = 383589;

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
     * Test of moneySearch method, of class MtUnistreamAdapter.
     */
    
    @Test
    public void testMoneySearch() throws Exception {
        System.out.println("moneySearch");
        Properties cfg = new Properties();
        cfg.setProperty("APIKEY", KEY_USER_AUTHED_APIKEY);
        cfg.setProperty("LOGIN", KEY_USER_AUTHED_LOGIN);
        cfg.setProperty("PASSWORD", KEY_USER_AUTHED_PASSWORD);
        cfg.setProperty("BANKID", KEY_BANK_ID.toString());
        MtUnistreamAdapter instance = new MtUnistreamAdapter();
        instance.init(cfg);
        String mtcn = "828105025765";
        FundsHolder approxOrgFunds = null;
        FundsHolder approxDstFunds = new FundsHolder();
        BigDecimal bd = new BigDecimal("1500");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        String orgCountry = "Russia";
        String dstCountry = "Russia";
        RemittanceHolder[] expResult = new RemittanceHolder[1];
        RemittanceHolder retval = new RemittanceHolder();
        retval.setDstCountry(dstCountry);
        retval.setOrgCountry(orgCountry);
        retval.setMtcn(mtcn);
        retval.setOrgFunds(approxDstFunds);
        retval.setMtID("16015170");
        FullNameTypeHolder payer_ = new FullNameTypeHolder();
        IndividualHolder individual_ = new IndividualHolder();
        individual_.setFirst("Роман");
        individual_.setLast("Градинар");
        individual_.setMiddle("Игоревич");
        payer_.setIndividual(individual_);
        retval.setPayer(payer_);
        payer_ = new FullNameTypeHolder();
        individual_ = new IndividualHolder();
        individual_.setFirst("Павпва");
        individual_.setLast("Авпва");
        individual_.setMiddle("Вппва");
        payer_.setIndividual(individual_);
        retval.setPayee(payer_);
        expResult[0] = retval;
        RemittanceHolder[] result = instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of moneyPay method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneyPay() throws Exception {
        System.out.println("moneyPay");
        Properties cfg = new Properties();
        cfg.setProperty("APIKEY", KEY_USER_AUTHED_APIKEY);
        cfg.setProperty("LOGIN", KEY_USER_AUTHED_LOGIN);
        cfg.setProperty("PASSWORD", KEY_USER_AUTHED_PASSWORD);
        cfg.setProperty("BANKID", KEY_BANK_ID.toString());
        MtUnistreamAdapter instance = new MtUnistreamAdapter();
        instance.init(cfg);
        String mtcn = "828105025765";
        FundsHolder approxOrgFunds = null;
        FundsHolder approxDstFunds = new FundsHolder();
        BigDecimal bd = new BigDecimal("1500");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        String orgCountry = "Russia";
        String dstCountry = "Russia";
        RemittanceHolder[] result = instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
        String mtID = result[0].getMtID();
        PersonHolder payee = new PersonHolder();
        payee.setCitizenCountry("Россия");
        FullNameTypeHolder fullName_ = new FullNameTypeHolder();
        IndividualHolder individual_ = new IndividualHolder();
        individual_.setFirst("Владимир");
        individual_.setLast("Резин");
        individual_.setMiddle("Сергеевич");
        fullName_.setIndividual(individual_);
        payee.setFullName(fullName_);
        CredentialsHolder identification_ = new CredentialsHolder();
        identification_.setCCountry("Россия");
        identification_.setCNumber("656565");
        identification_.setIssueCity("Нск");
        identification_.setIssuer("Нск");
        identification_.setSerialNumber("5404");
        payee.setIdentification(identification_);
        String[] phone_ = new String[1];
        phone_[0] = "+79139222200";
        payee.setPhone(phone_);
        AddressHolder registration_ = new AddressHolder();
        registration_.setCity("Новосибирск");
        registration_.setStreet1("Большивисткая");
        registration_.setStreet2("101");
        registration_.setZipCode("630090");
        payee.setRegistration(registration_);
        payee.setResidentCountry("Россия");
        String docID = "";
        String docDate = "";
        instance.moneyPay(mtID, mtcn, payee, docID, docDate);
    }
    
}
