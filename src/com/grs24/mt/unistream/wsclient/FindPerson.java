/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.MtUnistreamAdapter;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.IOException;
import java.util.logging.Level;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;

/**
 *
 * @author Dale
 */
public class FindPerson {
    /**
* Выполнение запроса на создание клиента
* @param fprm 
    @XmlType(name = "FindPersonRequestMessage", propOrder = {
    "birthDate",
    "docExpiryDate",
    "docIssueDate",
    "docNumber",
    "docSeries",
    "docTypeID",
    "firstname",
    "fullName",
    "lastname",
    "middlename",
    "phone",
    "phoneArea",
    "phoneCountryID",
    "phoneNumber",
    "unistreamCardNumber"
}
* @return Найденный клиент
* 
* @throws IOException в случае провала выполение
*/ 
    public static FindPersonResponseMessage FindPersonJAXb(FindPersonRequestMessage fprm) throws IOException {
        try {
            MtUnistreamAdapter.logger.log(Level.INFO,"Start FindPersonResponseMessage");
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
            fprm.setAuthenticationHeader(ahh);
            IWebService service = new WebService().getWS2007HttpBindingIWebService();
            FindPersonResponseMessage rm = service.findPerson(fprm);
            debug(fprm);
            MtUnistreamAdapter.logger.log(Level.INFO,"Finish FindPersonResponseMessage");
            return rm;
        }
        catch (Exception ex) 
            {
                throw new IOException("Ошибка доступа к Unistream",ex); 
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

