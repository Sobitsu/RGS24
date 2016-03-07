/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import java.io.IOException;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceException;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.Person;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dale
 */
public class CreatePerson {
private static final Logger logger = LoggerFactory.getLogger(CreatePerson.class);
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
* @throws IOException в случае провала выполение
*/ 
    
    public static CreatePersonResponseMessage CreatePersonJAXb(Person persh) throws UnsupportedOperationException, IOException {
    try {    
        logger.debug("Start CreatePersonResponseMessage");
        CreatePersonRequestMessage cprm = new CreatePersonRequestMessage();
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
        JAXBElement<Person> persel = factory.createPerson(persh);
        cprm.setAuthenticationHeader(ahh);
        cprm.setPerson(persel);
        debug(cprm);
        //IWebService service = new WebService().getWS2007HttpBindingIWebService();
        WebServiceSingl ws = WebServiceSingl.getInstance();
        CreatePersonResponseMessage rm = ws.service.createPerson(cprm);
        logger.debug("Finish CreatePersonResponseMessage");
        return rm;
    }
    catch (IOException|WebServiceException ex)
        {throw new IOException("Ошибка доступа к Unistream",ex);}
    }
   private static void debug(CreatePersonRequestMessage cprm)
        {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            com.unistream.test.wcflib.CreatePerson ftxml = new com.unistream.test.wcflib.CreatePerson();
            ftxml.setRequestMessage(factory.createCreatePersonRequestMessage(cprm));
            CommonLib.printXml(ftxml);
        }
}

