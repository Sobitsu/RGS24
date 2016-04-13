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
import com.grs24.mt.unistream.wsclient.TestLib;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Ignore;

/**
 *
 * @author Dale
 */
public class MtUnistreamAdapterTest {
    
    private final static TestLib tl = new TestLib();
    @BeforeClass
    public static void setUpClass() throws IOException {
        tl.setUpClass();
    }
    public MtUnistreamAdapterTest() {
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
        RemittanceHolder[] result = null;
        String mtcn = "784555934685";
        FundsHolder approxOrgFunds = null;
        FundsHolder approxDstFunds = new FundsHolder();
        BigDecimal bd = new BigDecimal("150");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("USD");
        String orgCountry = "Russia";
        String dstCountry = "Russia";
        result = tl.instance.moneySearch(mtcn, approxDstFunds, approxDstFunds, orgCountry, dstCountry);
        assertNotNull(result[0]);
        assertEquals(result[0].getMtID(),"16015653");

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("-900");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = tl.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 50003);
                }

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("50000");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = tl.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 30002);
                }
        
        mtcn = "";
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("1900");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        try {
                result = tl.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 50001);
                }

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = tl.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 50002);
                }

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("1900");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUR");
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = tl.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 10011);
                }

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("1900");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RU");
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = tl.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 50011);
                }

    }

    /**
     * Test of moneyPay method, of class MtUnistreamAdapter.
     * 19.658 сек
     * 
     * 
     * call adapter with mtID=16016056, 
     * payee=Person( fullName=FullNameType( 
     * individual=Individual( 
     * first=VALENTIN middle=OLEKSANDROVICH last=FEODOSOV) secondary=null) 
     * identification=Credentials( credCountry=RUS 
     * credType=1 serialNumber=012-876-321 credNumber=5011 issuer=Отдел милиции 
     * issuerCode=777-666 issueCity=Москва issueDate=Tue Jan 12 00:00:00 MSK 2016 
     * expiryDate=Thu Mar 01 00:00:00 MSK 2018) birthday=Mon Apr 01 00:00:00 MSD 1991 
     * citizenCountry=TJK residentCountry=RUS phone[0]=+7 (812) 999-88-88 email=user@domain.com 
     * registration=Address( country=RUS state=null city=Moscow zipCode=220068 street1=улица Кривая, дом 15, квартира 1 street2=null)), 
     * docID=null, docDate=null
     */
    
    private PersonHolder setpayee() {
        PersonHolder payee = new PersonHolder();
        payee.setCitizenCountry("RUS");
        payee.setBirthday(DateTimeUtils.parseDate("01.04.1991",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        FullNameTypeHolder fullName_ = new FullNameTypeHolder();
        IndividualHolder individual_ = new IndividualHolder();
        individual_.setFirst("VALENTIN");
        individual_.setLast("FEODOSOV");
        individual_.setMiddle("OLEKSANDROVICH");
        payee.setCitizenCountry("TJK");
        fullName_.setIndividual(individual_);
        payee.setFullName(fullName_);
        CredentialsHolder identification_ = new CredentialsHolder();
        identification_.setCredCountry("RUS");
        identification_.setCredNumber("5011");
        identification_.setIssueCity("Москва");
        identification_.setIssuer("Отдел милиции");
        identification_.setSerialNumber("012-876-321");
        identification_.setCredType("1");
        identification_.setIssuerCode("777-666");
        identification_.setIssueDate(DateTimeUtils.parseDate("12.01.2016",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        identification_.setExpiryDate(DateTimeUtils.parseDate("01.03.2018",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        payee.setIdentification(identification_);
        String[] phone_ = new String[1];
        phone_[0] = "+7 (812) 999-88-88";
        payee.setPhone(phone_);
        AddressHolder registration_ = new AddressHolder();
        registration_.setCountry("RUS");
        registration_.setCity("Moscow");
        registration_.setStreet1("улица Кривая, дом 15, квартира 1");
        registration_.setStreet2("");
        registration_.setZipCode("220068");
        payee.setRegistration(registration_);
        payee.setResidentCountry("RUS");
        return payee;
    }
    
    @Test
    public void testMoneyPay1() throws Exception {
        PersonHolder payee = setpayee();
        String mtID = "16015653";
        String docID = "";
        String docDate = "";
        tl.instance.moneyPay(mtID, "", payee, docID, docDate);
    }

    
    @Test
    public void testMoneyPay() throws Exception {
        String mtcn = "938959708877";
        FundsHolder approxOrgFunds = null;
        FundsHolder approxDstFunds = new FundsHolder();
        BigDecimal bd = new BigDecimal("50000");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        String orgCountry = "Russia";
        String dstCountry = "Russia";
        RemittanceHolder[] result = tl.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
        assertNotNull(result[0]);
        String mtID = result[0].getMtID();
        PersonHolder payee = setpayee();
        String ident = payee.toString();
        System.out.println(ident);
        String docID = "";
        String docDate = "";
        tl.instance.moneyPay(mtID, mtcn, payee, docID, docDate);
    }


    /**
     * Test of moneyHold method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneyHold() throws Exception {
        String mtID = "";
        String mtcn = "";
        PersonHolder payee = null;
        try {
            tl.instance.moneyHold(mtID, mtcn, payee);}
        catch (RemittanceException ex) {
            assertEquals(ex.getCode(), 30001);
        }
    }

    /**
     * Test of moneyUnhold method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneyUnhold() throws Exception {
        String mtID = "";
        String mtcn = "";
        PersonHolder payee = null;
        try {
            tl.instance.moneyUnhold(mtID, mtcn, payee);
            }
        catch (RemittanceException ex) {
            assertEquals(ex.getCode(), 30001);
        }
        }
}
