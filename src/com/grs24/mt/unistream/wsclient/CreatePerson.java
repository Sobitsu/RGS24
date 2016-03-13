/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
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
private final Logger logger = LoggerFactory.getLogger(CreatePerson.class);
    /**
* Выполнение запроса на создание клиента в базе Unistream
* @param persh Параметр типа Person c заполнеными реквизитами клиента
* @param ahh - Подготовленный авторизационный заголовок
* @param service - текущий коннект к ВебСервису
* @return Созданный клиент
* @throws IOException в случае обрыва связи
* @see Person
*/ 
    
    public CreatePersonResponseMessage createPersonJAXb(Person persh,JAXBElement<AuthenticationHeader> ahh, IWebService service) throws UnsupportedOperationException, IOException {
    try {    
        if (logger.isDebugEnabled()) {
                logger.debug("createPersonJAXb <- persh='"+persh.toString());
        }  
        CreatePersonRequestMessage cprm = new CreatePersonRequestMessage();
        ObjectFactory factory = new ObjectFactory();
        CommonLib cl = new CommonLib();
        JAXBElement<Person> persel = factory.createPerson(persh);
        cprm.setAuthenticationHeader(ahh);
        cprm.setPerson(persel);
        //IWebService service = new WebService().getWS2007HttpBindingIWebService();
        CreatePersonResponseMessage rm = service.createPerson(cprm);
        if (logger.isDebugEnabled()) {
                com.unistream.test.wcflib.CreatePerson ftxml = new com.unistream.test.wcflib.CreatePerson();
                ftxml.setRequestMessage(factory.createCreatePersonRequestMessage(cprm));
                logger.debug("createPersonJAXb -> cprm='" + cl.printXml(ftxml));
                com.unistream.test.wcflib.CreatePersonResponse cpr = new com.unistream.test.wcflib.CreatePersonResponse();
                cpr.setCreatePersonResult(factory.createCreatePersonResponseMessage(rm));
                logger.debug("createPersonJAXb -> rm='" + cl.printXml(cpr));
        }  
        return rm;
    }
    catch (WebServiceException ex)
        {throw new IOException("createPersonJAXb:Connection Unistream error",ex);}
    }
}