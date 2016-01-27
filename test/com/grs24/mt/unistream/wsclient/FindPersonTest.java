/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.DateTimeUtils;
import com.grs24.mt.unistream.dto.Person;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Dale
 */
public class FindPersonTest {
    
    public FindPersonTest() {
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
     * Test of FindPerson method, of class FindPerson.
     */
    @Test
    public void testFindPerson() throws Exception {
System.out.println("FindPerson");
        Person pers = new Person();
        pers.setFirstName("Владимир");
        pers.setBirthDate(DateTimeUtils.parseDate("07/10/1977"));
        pers.setLastName("Резин");
        pers.setMiddleName("Сергеевич");
        FindPersonResponseMessage expResult = null;
        FindPersonResponseMessage result = FindPerson.FindPerson(pers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
