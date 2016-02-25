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
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessage;

/**
 *
 * @author Dale
 */
public class FindTransfer {
    
    private final static QName _ControlNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "ControlNumber");
/**
* Выполнение запроса на поиск перевода
* @param controlNumber - номер перевода
* @param sum - сумма перевода
* @param val - код валюты в СДП
* @param bankId - банк ИД 
* @return Найденный перевод
* 
* @throws IOException в случае провала выполение
*/   
    public static FindTransferResponseMessage FindTransfer(String controlNumber, Double sum, Integer val, Integer bankId) throws IOException {
    try {
        MtUnistreamAdapter.logger.log(Level.INFO,"Start FindTransferResponseMessage");
        FindTransferRequestMessage ftrm = new FindTransferRequestMessage();
        org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
        JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
        ftrm.setAuthenticationHeader(ahh);
        ftrm.setBankID(bankId); 
        ftrm.setControlNumber(CommonLib.MakeString(_ControlNumber_QNAME, controlNumber));
        ftrm.setCurrencyID(val);
        ftrm.setSum(sum);
        debug(ftrm);
        IWebService service = new WebService().getWS2007HttpBindingIWebService();
        FindTransferResponseMessage rm = service.findTransfer(ftrm);
        MtUnistreamAdapter.logger.log(Level.INFO,"Finish FindTransferResponseMessage");        
        return rm;
    }
    catch (Exception ex)
        {throw new IOException("Ошибка доступа к Unistream",ex);}
    }
    private static void debug(FindTransferRequestMessage ftrm)
        {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            com.unistream.test.wcflib.FindTransfer ftxml = new com.unistream.test.wcflib.FindTransfer();
            ftxml.setRequestMessage(factory.createFindTransferRequestMessage(ftrm));
            CommonLib.printXml(ftxml);
        }
 }
