/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import java.io.IOException;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dale
 */
public class GetTransferByID {
private static final Logger logger = LoggerFactory.getLogger(GetTransferByID.class);
/**
* Выполнение запроса на поиск перевода по ID
* @param transferId - ID перевода в СДП
* @return Найденный перевод
* 
* @throws IOException в случае провала выполение
*/   
    
    public static GetTransferByIDResponseMessage getTransferByID(Integer transferId) throws UnsupportedOperationException, IOException {
        try {
            logger.debug("Start GetTransferByIDResponseMessage");
            GetTransferByIDRequestMessage gtrm = new GetTransferByIDRequestMessage();
            JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
            gtrm.setAuthenticationHeader(ahh);
            gtrm.setTransferID(transferId);
            //IWebService service = new WebService().getWS2007HttpBindingIWebService();
            WebServiceSingl ws = WebServiceSingl.getInstance();
            GetTransferByIDResponseMessage rm = ws.service.getTransferByID(gtrm);
            logger.debug("Finish GetTransferByIDResponseMessage");        
            return rm;
        }
        catch (IOException ex)
            {
                 throw new IOException("Ошибка доступа к Unistream",ex); 
            }
    }
}
