/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.dto.Person;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;

/**
 *
 * @author Dale
 */
public class FindPerson {
          
public static FindPersonResponseMessage FindPerson(Person pers) {
        try
                {

                    FindPersonRequestMessage fprm = new FindPersonRequestMessage();
                    com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    fprm.setAuthenticationHeader(ahh);
                    fprm.setBirthDate(CommonLib.GetGregorianDate(pers.getBirthDate()));
                    fprm.setFirstname(factory.createString(pers.getFirstName()));
                    fprm.setLastname(factory.createString(pers.getLastName()));
                    fprm.setMiddlename(factory.createString(pers.getMiddleName()));
//TODO сделать обработку телефонов                 
                    //   fprm.setPhone(CommonLib.GetStringElement(pers.getPhones()));
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    FindPersonResponseMessage rm = service.findPerson(fprm);
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getPersons().getValue().getPerson().get(0).getID().toString());
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
    }
}
