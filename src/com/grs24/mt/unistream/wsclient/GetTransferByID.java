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
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dale
 */
public class GetTransferByID {
private final Logger logger = LoggerFactory.getLogger(GetTransferByID.class);
/**
* Выполнение запроса на получение перевода по ID
* @param transferId - ID перевода в СДП
* @param ahh - Подготовленный авторизационный заголовок
* @param service - текущий коннект к ВебСервису
* @return Найденный перевод
* 
* @throws IOException в случае провала выполение
*/   
    
    public GetTransferByIDResponseMessage getTransferByID(Integer transferId,JAXBElement<AuthenticationHeader> ahh, IWebService service) throws UnsupportedOperationException, IOException {
        try {
            if (logger.isDebugEnabled()) {
                    logger.debug("getTransferByID <- transferId='"+transferId.toString()
                            + "'");
            }  
            GetTransferByIDRequestMessage gtrm = new GetTransferByIDRequestMessage();
            gtrm.setAuthenticationHeader(ahh);
            gtrm.setTransferID(transferId);
            //IWebService service = new WebService().getWS2007HttpBindingIWebService();
            GetTransferByIDResponseMessage rm = service.getTransferByID(gtrm);
            if (logger.isDebugEnabled()) {
                org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                com.unistream.test.wcflib.GetTransferByID gtbixml = new com.unistream.test.wcflib.GetTransferByID();
                gtbixml.setRequestMessage(factory.createGetTransferByIDRequestMessage(gtrm));
                CommonLib cl = new CommonLib();
                logger.debug("getTransferByID -> gtrm='"+cl.printXml(gtbixml)+"'");
                com.unistream.test.wcflib.GetTransferByIDResponse ftrxml = new com.unistream.test.wcflib.GetTransferByIDResponse();
                ftrxml.setGetTransferByIDResult(factory.createGetTransferByIDResponseMessage(rm));
                logger.debug("getTransferByID -> rm='"+cl.printXml(ftrxml)+"'");
            }  
            return rm;
        }
    catch (WebServiceException ex)
        {throw new IOException("getTransferByID:Connection Unistream error",ex);}
    }
}
