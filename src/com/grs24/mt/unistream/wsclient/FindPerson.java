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
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dale
 */
public class FindPerson {
 private static final Logger logger = LoggerFactory.getLogger(FindPerson.class);
    /**
* Выполнение запроса на поиск клиента
* @param fprm Подготовленный транспортный объект
* @return Найденный клиент
* @throws IOException в случае провала выполение
* @see FindPersonRequestMessage
* @see FindPersonResponseMessage
*/ 
    public static FindPersonResponseMessage findPersonJAXb(FindPersonRequestMessage fprm) throws UnsupportedOperationException,IOException {
        try {
            if (logger.isDebugEnabled()) {
                    logger.debug("findPersonJAXb <- fprm='"+fprm.toString());
            }  
            //org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
            fprm.setAuthenticationHeader(ahh);
            //IWebService service = new WebService().getWS2007HttpBindingIWebService();
            WebServiceSingl ws = WebServiceSingl.getInstance();
            FindPersonResponseMessage rm = ws.service.findPerson(fprm);
            if (logger.isDebugEnabled()) debug(fprm);
            if (logger.isDebugEnabled()) {
                    logger.debug("findPersonJAXb -> rm='"+rm.toString());
            }  
            return rm;
        }
        catch (IOException|WebServiceException ex) 
            {
                throw new IOException("findPersonJAXb:Connection Unistream error",ex); 
            }
    }
    private static void debug(FindPersonRequestMessage fprm)
        {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            com.unistream.test.wcflib.FindPerson ftxml = new com.unistream.test.wcflib.FindPerson();
            ftxml.setRequestMessage(factory.createFindPersonRequestMessage(fprm));
            CommonLib.printXml(ftxml);
        }
}

