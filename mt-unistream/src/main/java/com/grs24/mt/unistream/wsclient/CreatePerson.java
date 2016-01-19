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
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeaderType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessageType;

/**
 *
 * @author Dale
 */
public class CreatePerson {

    public static CreatePersonResponseMessageType CreatePerson(Person pers) {
        try
                {
                    CreatePersonRequestMessageType cprm = new CreatePersonRequestMessageType();
                    com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
                    JAXBElement<AuthenticationHeaderType> ahh = CommonLib.MakeAuthHead();
                    //TODO Добавить сериализацию pers
                    JAXBElement<org.datacontract.schemas._2004._07.wcfservicelib.PersonType> persh = null;
                    cprm.setAuthenticationHeader(ahh);
                    cprm.setPerson(persh);
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    CreatePersonResponseMessageType rm = service.createPerson(cprm);
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getPerson().getValue().getID());
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
    }

}
