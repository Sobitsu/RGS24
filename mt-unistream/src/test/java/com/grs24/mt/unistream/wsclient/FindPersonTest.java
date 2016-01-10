/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.DateTimeUtils;
import com.grs24.mt.unistream.dto.Person;
import junit.framework.TestCase;

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
        pers.setFirstName("Резин");
        pers.setLastName("Владимир");
        pers.setMiddleName("Сергеевич");
        pers.setBirthDate(DateTimeUtils.parseDate("07/10/1977", "dd/MM/yyyy"));
        FindPerson.FindPerson(pers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
