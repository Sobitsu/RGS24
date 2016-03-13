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
* Выполнение запроса на получение перевода по ID
* @param transferId - ID перевода в СДП
* @return Найденный перевод
* 
* @throws IOException в случае провала выполение
*/   
    
    public static GetTransferByIDResponseMessage getTransferByID(Integer transferId) throws UnsupportedOperationException, IOException {
        try {
            if (logger.isDebugEnabled()) {
                    logger.debug("getTransferByID <- transferId='"+transferId.toString()
                            + "'");
            }  
            GetTransferByIDRequestMessage gtrm = new GetTransferByIDRequestMessage();
            JAXBElement<AuthenticationHeader> ahh = CommonLib.makeAuthHead();
            gtrm.setAuthenticationHeader(ahh);
            gtrm.setTransferID(transferId);
            //IWebService service = new WebService().getWS2007HttpBindingIWebService();
            WebServiceSingl ws = WebServiceSingl.getInstance();
            GetTransferByIDResponseMessage rm = ws.service.getTransferByID(gtrm);
            if (logger.isDebugEnabled()) {
                org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                com.unistream.test.wcflib.GetTransferByID gtbixml = new com.unistream.test.wcflib.GetTransferByID();
                gtbixml.setRequestMessage(factory.createGetTransferByIDRequestMessage(gtrm));
                logger.debug("getTransferByID -> gtrm='"+CommonLib.printXml(gtbixml)+"'");
                com.unistream.test.wcflib.GetTransferByIDResponse ftrxml = new com.unistream.test.wcflib.GetTransferByIDResponse();
                ftrxml.setGetTransferByIDResult(factory.createGetTransferByIDResponseMessage(rm));
                logger.debug("getTransferByID -> rm='"+CommonLib.printXml(ftrxml)+"'");
            }  
            return rm;
        }
    catch (IOException|WebServiceException ex)
        {throw new IOException("getTransferByID:Connection Unistream error",ex);}
    }
}
