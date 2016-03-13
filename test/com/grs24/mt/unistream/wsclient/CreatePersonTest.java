/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.msg.AddressHolder;
import com.grs24.msg.CredentialsHolder;
import com.grs24.msg.FullNameTypeHolder;
import com.grs24.msg.IndividualHolder;
import com.grs24.msg.PersonHolder;
import com.grs24.mt.RemittanceException;
import com.grs24.mt.unistream.DateTimeUtils;
import java.io.IOException;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dale
 */
public class CreatePersonTest {

    private final static QName _FirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "FirstName");
    private final static QName _LastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "LastName");
    private final static QName _MiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "MiddleName");

    
    @BeforeClass
    public static void setUpClass() throws IOException {
        TestLib.setUpClass();
    }
     private static final Logger logger = LoggerFactory.getLogger(CreatePersonTest.class);

    public CreatePersonTest() {
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
     * Test of CreatePersonJAXb method, of class CreatePerson.
     */
    @Test
    public void testCreatePersonJAXb() throws Exception {
        System.out.println("CreatePersonJAXb");
        Person person = new Person();
        PersonHolder payee = new PersonHolder();
        payee.setCitizenCountry("RUS");
        payee.setBirthday(DateTimeUtils.parseDate("07.10.1987",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        FullNameTypeHolder fullName_ = new FullNameTypeHolder();
        IndividualHolder individual_ = new IndividualHolder();
        individual_.setFirst("Володимир");
        individual_.setLast("Петров");
        individual_.setMiddle("Сергеевич");
        fullName_.setIndividual(individual_);
        payee.setFullName(fullName_);
        CredentialsHolder identification_ = new CredentialsHolder();
        identification_.setCredCountry("RUS");
        identification_.setCredNumber("656565");
        identification_.setIssueCity("Нск");
        identification_.setIssuer("Нск");
        identification_.setSerialNumber("5404");
        payee.setIdentification(identification_);
        String[] phone_ = new String[1];
        phone_[0] = "+7 (913) 922-22-00";
        payee.setPhone(phone_);
        AddressHolder registration_ = new AddressHolder();
        registration_.setCountry("RUS");
        registration_.setCity("Новосибирск");
        registration_.setStreet1("Большивисткая");
        registration_.setStreet2("0");
        registration_.setZipCode("630090");
        payee.setRegistration(registration_);
        payee.setResidentCountry("RUS");

        person.setAddress(CommonLib.getAdressElem(payee.getRegistration()));
        person.setDocuments(CommonLib.getDocuments(payee.getIdentification()));
        person.setPhones(CommonLib.getPhones(payee.getPhone()));
        person.setBirthDate(CommonLib.GetGregorianDate(payee.getBirthday()));
        person.setFirstName(CommonLib.makeString(_FirstName_QNAME, payee.getFullName().getIndividual().getFirst()));
        person.setLastName(CommonLib.makeString(_LastName_QNAME, payee.getFullName().getIndividual().getLast()));
        person.setMiddleName(CommonLib.makeString(_MiddleName_QNAME, payee.getFullName().getIndividual().getMiddle()));
        
        CreatePersonResponseMessage result = CreatePerson.createPersonJAXb(person);
        CommonLib.checkFault(result,logger,"");
        assertTrue(result.getFault().isNil());
        assertFalse(result.getPerson().isNil());
        assertNotNull(result.getPerson().getValue());
        assertFalse(result.getPerson().getValue().getAddress().isNil());
        assertTrue(result.getPerson().getValue().getBirthDate().isValid());
        assertFalse(result.getPerson().getValue().getDocuments().isNil());
        assertFalse(result.getPerson().getValue().getPhones().isNil());
        assertFalse(result.getPerson().getValue().getFirstName().isNil());
        assertFalse(result.getPerson().getValue().getLastName().isNil());
        assertFalse(result.getPerson().getValue().getMiddleName().isNil());
        assertFalse(result.getPerson().getValue().getLastNameLat().isNil());
        assertEquals(result.getPerson().getValue().getFirstNameLat().getValue(),"Volodimir");
        System.out.println("CreatePersonJAXb OK");    
    }
    
    /**
     * Test of CreatePersonJAXb method, of class CreatePerson.
     */
    @Test
    public void testCreatePersonJAXb1() throws Exception {
        System.out.println("CreatePersonJAXb");
        Person person = new Person();
        PersonHolder payee = new PersonHolder();
        payee.setCitizenCountry("RUS");
        payee.setBirthday(DateTimeUtils.parseDate("01.04.1991",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        FullNameTypeHolder fullName_ = new FullNameTypeHolder();
        IndividualHolder individual_ = new IndividualHolder();
        individual_.setFirst("VALENTIN");
        individual_.setLast("FEODOSOV");
        individual_.setMiddle("OLEKSANDROVICH");
        fullName_.setIndividual(individual_);
        payee.setFullName(fullName_);
        CredentialsHolder identification_ = new CredentialsHolder();
        identification_.setCredNumber("5011");
        identification_.setIssuerCode("777-666");
        identification_.setSerialNumber("012-876-321");
        identification_.setCredType("1");
        identification_.setIssuer("issuer name");
        identification_.setExpiryDate(DateTimeUtils.parseDate("01.03.2016",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        identification_.setIssueDate(DateTimeUtils.parseDate("12.04.2016",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        payee.setIdentification(identification_);
        String[] phone_ = new String[1];
        phone_[0] = "+7 (812) 999-88-88";
        payee.setPhone(phone_);
        AddressHolder registration_ = new AddressHolder();
        registration_.setCountry("RUS");
        registration_.setCity("Moscow");
        registration_.setStreet1("moya_ulitsa");
        registration_.setZipCode("220068");
        payee.setRegistration(registration_);
        person.setAddress(CommonLib.getAdressElem(payee.getRegistration()));
        person.setDocuments(CommonLib.getDocuments(payee.getIdentification()));
        person.setPhones(CommonLib.getPhones(payee.getPhone()));
        person.setBirthDate(CommonLib.GetGregorianDate(payee.getBirthday()));
        person.setFirstName(CommonLib.makeString(_FirstName_QNAME, payee.getFullName().getIndividual().getFirst()));
        person.setLastName(CommonLib.makeString(_LastName_QNAME, payee.getFullName().getIndividual().getLast()));
        person.setMiddleName(CommonLib.makeString(_MiddleName_QNAME, payee.getFullName().getIndividual().getMiddle()));
        CreatePersonResponseMessage result = CreatePerson.createPersonJAXb(person);
        try {
                CommonLib.checkFault(result,logger,"10");
            }
        catch (RemittanceException ex) {
            assertNotNull(ex.getCode());
            assertNotNull(ex.getMtError());
            assertNotNull(ex.getStane());
            assertEquals(ex.getCode(),39);
            assertEquals(ex.getStane(),"10");
            assertEquals(ex.getMtError(),"FieldDataNotValid:Incorrect issuance date of the document");
        }
        System.out.println("CreatePersonJAXb OK");    
    }
    
}
