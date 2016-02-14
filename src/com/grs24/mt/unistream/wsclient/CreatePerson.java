/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.MtUnistreamAdapter;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.util.logging.Level;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage;

/**
 *
 * @author Dale
 */
public class CreatePerson {

    /**
* Выполнение запроса на создание клиента
* @param persh 
* @XmlType(name = "Person", propOrder = {
    "address",
    "birthDate",
    "birthPlace",
    "documents",
    "finDetails",
    "firstName",
    "firstNameLat",
    "id",
    "lastName",
    "lastNameLat",
    "middleName",
    "middleNameLat",
    "phones",
    "rBank",
    "residentships",
    "unistreamCardNumber"
}
* @return Созданный клиент
* 
* @throws Exception в случае провала выполение
*/ 
    
    public static CreatePersonResponseMessage CreatePersonJAXb(org.datacontract.schemas._2004._07.wcfservicelib.Person persh) throws Exception {
        MtUnistreamAdapter.logger.log(Level.INFO,"Start CreatePersonResponseMessage");
        CreatePersonRequestMessage cprm = new CreatePersonRequestMessage();
        org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
        JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
        JAXBElement<org.datacontract.schemas._2004._07.wcfservicelib.Person> persel = factory.createPerson(persh);
        cprm.setAuthenticationHeader(ahh);
        cprm.setPerson(persel);
        com.unistream.test.wcflib.CreatePerson ftxml = new com.unistream.test.wcflib.CreatePerson();
        ftxml.setRequestMessage(factory.createCreatePersonRequestMessage(cprm));
        CommonLib.printXml(ftxml);
        IWebService service = new WebService().getWS2007HttpBindingIWebService();
        CreatePersonResponseMessage rm = service.createPerson(cprm);
        MtUnistreamAdapter.logger.log(Level.INFO,"Finish CreatePersonResponseMessage");
        return rm;
    }

}

