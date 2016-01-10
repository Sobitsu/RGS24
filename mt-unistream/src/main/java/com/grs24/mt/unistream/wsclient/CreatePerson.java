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
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage;

/**
 *
 * @author Dale
 */
public class CreatePerson {

    public static CreatePersonResponseMessage CreatePerson(Person pers) {
        try
                {
                    CreatePersonRequestMessage cprm = new CreatePersonRequestMessage();
                    com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    //TODO Добавить сериализацию pers
                    JAXBElement<org.datacontract.schemas._2004._07.wcfservicelib.Person> persh = null;
                    cprm.setAuthenticationHeader(ahh);
                    cprm.setPerson(persh);
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    CreatePersonResponseMessage rm = service.createPerson(cprm);
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getPerson().getValue().getID());
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
    }

}
