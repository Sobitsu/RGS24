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

        person.setAddress(CommonLib.getAdressElem(payee.getRegistration()));
        person.setDocuments(CommonLib.getDocuments(payee.getIdentification()));
        person.setPhones(CommonLib.getPhones(payee.getPhone()));
        person.setBirthDate(CommonLib.GetGregorianDate(payee.getBirthday()));
        person.setFirstName(CommonLib.MakeString(_FirstName_QNAME, payee.getFullName().getIndividual().getFirst()));
        person.setLastName(CommonLib.MakeString(_LastName_QNAME, payee.getFullName().getIndividual().getLast()));
        person.setMiddleName(CommonLib.MakeString(_MiddleName_QNAME, payee.getFullName().getIndividual().getMiddle()));
        
        CreatePersonResponseMessage result = CreatePerson.CreatePersonJAXb(person);

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
        assertEquals(result.getPerson().getValue().getFirstNameLat().getValue(),"Vladimir");
        System.out.println("CreatePersonJAXb OK");    
    }
}
