/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream;

import com.grs24.msg.AddressHolder;
import com.grs24.msg.CredentialsHolder;
import com.grs24.msg.FullNameTypeHolder;
import com.grs24.msg.FundsHolder;
import com.grs24.msg.IndividualHolder;
import com.grs24.msg.PersonHolder;
import com.grs24.mt.RemittanceException;
import com.grs24.mt.RemittanceHolder;
import java.io.IOException;
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
    public static Integer KEY_PARTICIPATOR_ID = 383589;
    private static MtUnistreamAdapter instance;
    public MtUnistreamAdapterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        Properties cfg = new Properties();
        cfg.setProperty("APIKEY", KEY_USER_AUTHED_APIKEY);
        cfg.setProperty("LOGIN", KEY_USER_AUTHED_LOGIN);
        cfg.setProperty("PASSWORD", KEY_USER_AUTHED_PASSWORD);
        cfg.setProperty("BANKID", KEY_BANK_ID.toString());
        cfg.setProperty("PARTID",KEY_PARTICIPATOR_ID.toString());
        instance = new MtUnistreamAdapter();
        instance.init(cfg);    
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
        String mtcn = "828105025765";
        FundsHolder approxOrgFunds = null;
        FundsHolder approxDstFunds = new FundsHolder();
        BigDecimal bd = new BigDecimal("1500");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        String orgCountry = "Russia";
        String dstCountry = "Russia";
        RemittanceHolder[] result = instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
        assertEquals(result[0].getMtID(),"16015170");
        System.out.println("moneySearch OK");
    }

    /**
     * Test of moneyPay method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneyPay() throws Exception {
        System.out.println("moneyPay");
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
        payee.setCitizenCountry("RUS");
        payee.setBirthday(DateTimeUtils.parseDate("07.10.1977",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        FullNameTypeHolder fullName_ = new FullNameTypeHolder();
        IndividualHolder individual_ = new IndividualHolder();
        individual_.setFirst("Владимир");
        individual_.setLast("Резин");
        individual_.setMiddle("Сергеевич");
        fullName_.setIndividual(individual_);
        payee.setFullName(fullName_);
        CredentialsHolder identification_ = new CredentialsHolder();
        identification_.setCredCountry("RUS");
        identification_.setCredNumber("656565");
        identification_.setIssueCity("Нск");
        identification_.setIssuer("Нск");
        identification_.setSerialNumber("5404");
        identification_.setCredType("35");
        payee.setIdentification(identification_);
        String[] phone_ = new String[1];
        phone_[0] = "+79139222200";
        payee.setPhone(phone_);
        AddressHolder registration_ = new AddressHolder();
        registration_.setCountry("RUS");
        registration_.setCity("Новосибирск");
        registration_.setStreet1("Большивисткая");
        registration_.setStreet2("101");
        registration_.setZipCode("630090");
        payee.setRegistration(registration_);
        payee.setResidentCountry("RUS");
        String docID = "";
        String docDate = "";
        try{
            instance.moneyPay(mtID, mtcn, payee, docID, docDate);
        }
        catch (RemittanceException ex) {
            if (ex.getCode() == 30002)  {System.out.println("moneyHold OK");}
            else
            {fail(" Ошибка оплаты перевода");}
        }
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
        try {
            instance.moneyHold(mtID, mtcn, payee);}
        catch (RemittanceException ex) {
            if (ex.getCode() == 30001)  {System.out.println("moneyHold OK");}
        }
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
        try {
            instance.moneyUnhold(mtID, mtcn, payee);
            }
        catch (RemittanceException ex) {
            if (ex.getCode() == 30001)  {System.out.println("moneyUnhold OK");}
    }

        }
    
}
