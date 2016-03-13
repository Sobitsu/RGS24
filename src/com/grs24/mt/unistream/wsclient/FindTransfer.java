/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.Constants;
import com.unistream.test.wcflib.IWebService;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceException;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessage;

/**
 *
 * @author Dale
 */
public class FindTransfer {
    

    private final Logger logger = LoggerFactory.getLogger(FindTransfer.class);
/**
* Выполнение запроса на поиск перевода
* @param controlNumber - номер перевода
* @param sum - сумма перевода
* @param val - код валюты в СДП
* @param bankId - банк ИД 
* @param ahh - Подготовленный авторизационный заголовок
* @param service - текущий коннект к ВебСервису
* @return Найденный перевод
* @throws IOException в случае провала выполение
*/   
    public FindTransferResponseMessage findTransfer(String controlNumber, Double sum, Integer val, Integer bankId,JAXBElement<AuthenticationHeader> ahh, IWebService service) throws UnsupportedOperationException, IOException {
    try {
            if (logger.isDebugEnabled()) {
                    logger.debug("findTransfer <- controlNumber='"+controlNumber
                            + "', sum="+sum.toString()
                            + ", val="+val.toString()
                            + ", bankId="+bankId.toString()
                    );
            }  
        FindTransferRequestMessage ftrm = new FindTransferRequestMessage();
        org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
        ftrm.setAuthenticationHeader(ahh);
        ftrm.setBankID(bankId); 
        CommonLib cl = new CommonLib();
        ftrm.setControlNumber(cl.makeString(Constants._ControlNumber_QNAME, controlNumber));
        ftrm.setCurrencyID(val);
        ftrm.setSum(sum);
        FindTransferResponseMessage rm = service.findTransfer(ftrm);
        if (logger.isDebugEnabled()) {
                com.unistream.test.wcflib.FindTransfer ftxml = new com.unistream.test.wcflib.FindTransfer();
                ftxml.setRequestMessage(factory.createFindTransferRequestMessage(ftrm));
                logger.debug("findTransfer -> ftrm='"+cl.printXml(ftxml)+"'");
                com.unistream.test.wcflib.FindTransferResponse ftrxml = new com.unistream.test.wcflib.FindTransferResponse();
                ftrxml.setFindTransferResult(factory.createFindTransferResponseMessage(rm));
                logger.debug("findTransfer -> rm='"+cl.printXml(ftrxml)+"'"
                );
        }  
        return rm;
    }
    catch (WebServiceException ex)
        {throw new IOException("findTransfer:Connection Unistream error",ex);}
    }
 }
