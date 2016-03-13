/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.msg.AddressHolder;
import com.grs24.msg.CredentialsHolder;
import com.grs24.mt.unistream.DateTimeUtils;
import java.io.IOException;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfDocument;
import org.datacontract.schemas._2004._07.wcfservicelib.PersonAddress;
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
public class CommonLibTest {

    private final static TestLib tl = new TestLib();
    @BeforeClass
    public static void setUpClass() throws IOException {
        tl.setUpClass();
    }

    public CommonLibTest() {
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
     * Test of getDocuments method, of class CommonLib.
     */
    @Test
    public void testGetDocuments() throws Exception {
        System.out.println("getDocuments");
        CredentialsHolder credholder = new CredentialsHolder();
        credholder.setCredCountry("RUS");
        credholder.setCredNumber("123456");
        credholder.setExpiryDate(DateTimeUtils.parseDate("07.10.1977",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        credholder.setIssueCity("Тьмутараканьск");
        credholder.setIssueDate(DateTimeUtils.parseDate("07.10.1977",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        credholder.setIssuer("Ра рас");
        credholder.setSerialNumber("адын");
        CommonLib cl = new CommonLib();
        JAXBElement<ArrayOfDocument> result = cl.getDocuments(credholder);
        assertFalse(result.isNil());
        assertNotNull(result.getValue());
        assertEquals(result.getValue().getDocument().size(),1L);
        assertEquals(result.getValue().getDocument().get(0).getNumber().getValue(),"123456");
        assertEquals(result.getValue().getDocument().get(0).getExpiryDate().toGregorianCalendar().getTime(),DateTimeUtils.parseDate("07.10.1977",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        System.out.println("getDocuments OK");        
    }

    /**
     * Test of getAdressElem method, of class CommonLib.
     */
    @Test
    public void testGetAdressElem() throws Exception {
        System.out.println("getAdressElem");
        AddressHolder registr = new AddressHolder();
        registr.setCity("Нск");
        registr.setCountry("RUS");
        registr.setZipCode("630000");
        registr.setStreet1("<kf ,kf ,kf");
        registr.setStreet2("blu blu blu");
        CommonLib cl = new CommonLib();
        JAXBElement<PersonAddress> result = cl.getAdressElem(registr,tl.instance.ahh,tl.instance.service);
        assertFalse(result.isNil());
        assertNotNull(result.getValue());
        assertEquals(result.getValue().getCountryID().intValue(),18);
        assertEquals(result.getValue().getCity().getValue(),"Нск");
        System.out.println("getAdressElem OK");
    }

}