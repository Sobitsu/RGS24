/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceException;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessage;

/**
 *
 * @author Dale
 */
public class FindTransfer {
    
    private final static QName _ControlNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "ControlNumber");
    private static final Logger logger = LoggerFactory.getLogger(FindTransfer.class);
/**
* Выполнение запроса на поиск перевода
* @param controlNumber - номер перевода
* @param sum - сумма перевода
* @param val - код валюты в СДП
* @param bankId - банк ИД 
* @return Найденный перевод
* @throws IOException в случае провала выполение
*/   
    public static FindTransferResponseMessage findTransfer(String controlNumber, Double sum, Integer val, Integer bankId) throws UnsupportedOperationException, IOException {
    try {
            if (logger.isDebugEnabled()) {
                    logger.debug("findTransfer <- controlNumber='"+controlNumber
                            + "', sum="+sum.toString()
                            + ", val="+val.toString()
                            + ", bankId="+bankId.toString()
                    );
            }  
        FindTransferRequestMessage ftrm = new FindTransferRequestMessage();
        //org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
        JAXBElement<AuthenticationHeader> ahh = CommonLib.makeAuthHead();
        ftrm.setAuthenticationHeader(ahh);
        ftrm.setBankID(bankId); 
        ftrm.setControlNumber(CommonLib.makeString(_ControlNumber_QNAME, controlNumber));
        ftrm.setCurrencyID(val);
        ftrm.setSum(sum);
        if (logger.isDebugEnabled()) debug(ftrm);
        WebServiceSingl ws = WebServiceSingl.getInstance();
        //IWebService service = new WebService().getWS2007HttpBindingIWebService();
        FindTransferResponseMessage rm = ws.service.findTransfer(ftrm);
            if (logger.isDebugEnabled()) {
                    logger.debug("findTransfer -> rm='"+rm.toString()+"'"
                    );
            }  
        return rm;
    }
    catch (IOException|WebServiceException ex)
        {throw new IOException("findTransfer:Connection Unistream error",ex);}
    }
    private static void debug(FindTransferRequestMessage ftrm)
        {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            com.unistream.test.wcflib.FindTransfer ftxml = new com.unistream.test.wcflib.FindTransfer();
            ftxml.setRequestMessage(factory.createFindTransferRequestMessage(ftrm));
            CommonLib.printXml(ftxml);
        }
 }
