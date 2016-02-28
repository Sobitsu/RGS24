/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.IOException;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.LangText;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.DocumentType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesResponseMessage;

/**
 *
 * @author Dale
 */
public class GetDocumentType {

    private static GetDocumentTypeChangesResponseMessage getDocumentTypeChanges() throws IOException {
        try {
                JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesRequestMessage requestMessage = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesRequestMessage();
                requestMessage.setAuthenticationHeader(ahh);
                requestMessage.setUpdateCount(0L);
                IWebService service = new WebService().getWS2007HttpBindingIWebService();
                return service.getDocumentTypeChanges(requestMessage);
            }
        catch (Exception ex) 
            {
                throw new IOException("Ошибка доступа к Unistream",ex); 
            }
    }
   
    /**
* Выполнение запроса на получение ID типа документа
* @param code
* @return ID тпа документа
* 
* @throws Exception в случае провала выполение
*/ 
    public static Integer getDocumentsID(String code)throws Exception {
        GetDocumentTypeChangesResponseMessage rm = getDocumentTypeChanges();
        CommonLib.CheckFault(rm);
        debug(rm);
        if (rm.getDocumentTypes().isNil()) return null;
        for (DocumentType i : rm.getDocumentTypes().getValue().getDocumentType())
                {
                    if (i.getStatus().equals("ACTUAL")) {
                        
                        if (!i.getName().getValue().getLangText().isEmpty()) {
                            for (LangText j : i.getName().getValue().getLangText())
                            {
                                if (!j.getText().isNil() && j.getText().getValue().equals(code)) return i.getID();
                            }
                        }
                    }
                }
        return null;
     }
     private static void debug(GetDocumentTypeChangesResponseMessage fprm)
        {
            CommonLib.printXml(fprm);
        }   
}
