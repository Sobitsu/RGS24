/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.dto.Person;
import com.grs24.mt.unistream.DateTimeUtils;
import junit.framework.TestCase;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessageType;

/**
 *
 * @author Dale
 */
public class FindPersonTest extends TestCase {
    
    public FindPersonTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of FindPerson method, of class FindPerson.
     */
    public void testFindPerson() {
        System.out.println("FindPerson");
        Person pers = new Person();
        pers.setFirstName("Владимир");
        pers.setBirthDate(DateTimeUtils.parseDate("07/10/1977"));
        pers.setLastName("Резин");
        pers.setMiddleName("Сергеевич");
        FindPersonResponseMessageType expResult = null;
        FindPersonResponseMessageType result = FindPerson.FindPerson(pers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
