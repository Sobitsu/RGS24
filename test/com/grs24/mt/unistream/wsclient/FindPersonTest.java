/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.msg.CredentialsHolder;
import com.grs24.msg.FullNameTypeHolder;
import com.grs24.msg.IndividualHolder;
import com.grs24.msg.PersonHolder;
import com.grs24.mt.unistream.DateTimeUtils;
import com.grs24.mt.unistream.MtUnistreamAdapter;
import java.io.IOException;
import java.util.Properties;
import javax.xml.namespace.QName;
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
    
    public static String KEY_USER_AUTHED_APIKEY = "1wwteyFGFew624";
    public static String KEY_USER_AUTHED_LOGIN = "g2.grstwentyfour.rus";
    public static String KEY_USER_AUTHED_PASSWORD = "7!LrO7i7";
    public static Integer KEY_BANK_ID = 383589;
    public static Integer KEY_PARTICIPATOR_ID = 383589;
    private static MtUnistreamAdapter instance;
    private final static QName _FirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "FirstName");
    private final static QName _LastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "LastName");
    private final static QName _MiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "MiddleName");
    private final static QName _DocNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocNumber");
    private final static QName _DocSeries_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocSeries");
    private final static QName _Phone_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Phone");
  
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
     * Test of FindPersonJAXb method, of class FindPerson.
     */
    @Test
    public void testFindPersonJAXb() throws Exception {
        System.out.println("FindPersonJAXb");
        FindPersonRequestMessage fprm = new FindPersonRequestMessage();
        PersonHolder payee = new PersonHolder();
        payee.setBirthday(DateTimeUtils.parseDate("23.10.1985",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        FullNameTypeHolder fullName_ = new FullNameTypeHolder();
        IndividualHolder individual_ = new IndividualHolder();
        individual_.setFirst("Роман");
        individual_.setLast("Градинар");
        individual_.setMiddle("Игоревич");
        fullName_.setIndividual(individual_);
        payee.setFullName(fullName_);
        CredentialsHolder identification_ = new CredentialsHolder();
        identification_.setCredNumber("123321");
        identification_.setSerialNumber("1212");
        identification_.setIssueDate(DateTimeUtils.parseDate("30.11.2005",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        payee.setIdentification(identification_);
        String[] phone_ = new String[1];
        phone_[0] = "+79151231212";
        payee.setPhone(phone_);

        fprm.setBirthDate(CommonLib.GetGregorianDate(payee.getBirthday()));
        fprm.setFirstname(CommonLib.MakeString(_FirstName_QNAME, payee.getFullName().getIndividual().getFirst()));
        fprm.setLastname(CommonLib.MakeString(_LastName_QNAME, payee.getFullName().getIndividual().getLast()));
        fprm.setMiddlename(CommonLib.MakeString(_MiddleName_QNAME, payee.getFullName().getIndividual().getMiddle()));
        fprm.setPhone(CommonLib.MakeString(_Phone_QNAME,payee.getPhone()[0]));
        fprm.setDocNumber(CommonLib.MakeString(_DocNumber_QNAME,payee.getIdentification().getCredNumber()));
        fprm.setDocSeries(CommonLib.MakeString(_DocSeries_QNAME,payee.getIdentification().getSerialNumber()));
        fprm.setDocIssueDate(CommonLib.GetGregorianDate(payee.getIdentification().getIssueDate()));
        
        FindPersonResponseMessage result = FindPerson.FindPersonJAXb(fprm);
        assertTrue(result.getFault().isNil());
        assertFalse(result.getPersons().isNil());
        assertNotNull(result.getPersons().getValue());
        assertFalse(result.getPersons().getValue().getPerson().isEmpty());
        assertTrue(result.getPersons().getValue().getPerson().get(0).getBirthDate().isValid());
        assertFalse(result.getPersons().getValue().getPerson().get(0).getDocuments().isNil());
        assertFalse(result.getPersons().getValue().getPerson().get(0).getPhones().isNil());
        assertFalse(result.getPersons().getValue().getPerson().get(0).getFirstName().isNil());
        assertFalse(result.getPersons().getValue().getPerson().get(0).getLastName().isNil());
        assertFalse(result.getPersons().getValue().getPerson().get(0).getMiddleName().isNil());
        assertFalse(result.getPersons().getValue().getPerson().get(0).getLastNameLat().isNil());
        assertEquals(result.getPersons().getValue().getPerson().get(0).getFirstNameLat().getValue(),"Roman");
        System.out.println("FindPersonJAXb Ok");    
    }
    
}
