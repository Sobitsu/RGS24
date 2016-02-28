/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.msg.AddressHolder;
import com.grs24.msg.CredentialsHolder;
import java.util.Date;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfDocument;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfPhone;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.PersonAddress;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;
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
    
    public CommonLibTest() {
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
     * Test of CheckFault method, of class CommonLib.
     */
    @Test
    public void testCheckFault() throws Exception {
        System.out.println("CheckFault");
        WsResponse response = null;
        CommonLib.CheckFault(response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MakeAuthHead method, of class CommonLib.
     */
    @Test
    public void testMakeAuthHead() {
        System.out.println("MakeAuthHead");
        JAXBElement<AuthenticationHeader> expResult = null;
        JAXBElement<AuthenticationHeader> result = CommonLib.MakeAuthHead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MakeString method, of class CommonLib.
     */
    @Test
    public void testMakeString() {
        System.out.println("MakeString");
        QName qname = null;
        String value = "";
        JAXBElement<String> expResult = null;
        JAXBElement<String> result = CommonLib.MakeString(qname, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocuments method, of class CommonLib.
     */
    @Test
    public void testGetDocuments() throws Exception {
        System.out.println("getDocuments");
        CredentialsHolder credholder = null;
        JAXBElement<ArrayOfDocument> expResult = null;
        JAXBElement<ArrayOfDocument> result = CommonLib.getDocuments(credholder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdressElem method, of class CommonLib.
     */
    @Test
    public void testGetAdressElem() throws Exception {
        System.out.println("getAdressElem");
        AddressHolder registr = null;
        JAXBElement<PersonAddress> expResult = null;
        JAXBElement<PersonAddress> result = CommonLib.getAdressElem(registr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhones method, of class CommonLib.
     */
    @Test
    public void testGetPhones() throws Exception {
        System.out.println("getPhones");
        String[] phones = null;
        JAXBElement<ArrayOfPhone> expResult = null;
        JAXBElement<ArrayOfPhone> result = CommonLib.getPhones(phones);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetGregorianDate method, of class CommonLib.
     */
    @Test
    public void testGetGregorianDate() throws Exception {
        System.out.println("GetGregorianDate");
        Date date = null;
        XMLGregorianCalendar expResult = null;
        XMLGregorianCalendar result = CommonLib.GetGregorianDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printXml method, of class CommonLib.
     */
    @Test
    public void testPrintXml() {
        System.out.println("printXml");
        Object x = null;
        CommonLib.printXml(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
