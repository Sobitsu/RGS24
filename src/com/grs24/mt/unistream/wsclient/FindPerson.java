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
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dale
 */
public class FindPerson {
 private final Logger logger = LoggerFactory.getLogger(FindPerson.class);
/**
* Выполнение запроса на поиск клиента
* @param fprm Подготовленный транспортный объект
* @param ahh - Подготовленный авторизационный заголовок
* @param service - текущий коннект к ВебСервису
* @return Найденный клиент
* @throws IOException в случае провала выполение
* @see FindPersonRequestMessage
* @see FindPersonResponseMessage
*/ 
    public FindPersonResponseMessage findPersonJAXb(FindPersonRequestMessage fprm,JAXBElement<AuthenticationHeader> ahh, IWebService service) throws UnsupportedOperationException,IOException {
        try {
            if (logger.isDebugEnabled()) {
                    logger.debug("findPersonJAXb <- fprm='"+fprm.toString());
            }  
            CommonLib cl = new CommonLib();
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            fprm.setAuthenticationHeader(ahh);
            FindPersonResponseMessage rm = service.findPerson(fprm);
            if (logger.isDebugEnabled()) {
                com.unistream.test.wcflib.FindPerson ftxml = new com.unistream.test.wcflib.FindPerson();
                ftxml.setRequestMessage(factory.createFindPersonRequestMessage(fprm));
                logger.debug("findPersonJAXb -> fprm='"+cl.printXml(ftxml)+"'");
                com.unistream.test.wcflib.FindPersonResponse fprxml = new com.unistream.test.wcflib.FindPersonResponse();
                fprxml.setFindPersonResult(factory.createFindPersonResponseMessage(rm));
                logger.debug("findPersonJAXb -> rm='"+cl.printXml(fprxml)+"'");
            }  
            return rm;
        }
        catch (WebServiceException ex) 
            {
                throw new IOException("findPersonJAXb:Connection Unistream error",ex); 
            }
    }
}

