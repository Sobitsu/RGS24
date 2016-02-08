/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
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
    
    public static FindTransferResponseMessage FindTransfer(String controlNumber, Double sum, Integer val, Integer bankId) throws Exception {
        FindTransferRequestMessage ftrm = new FindTransferRequestMessage();
        org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
        JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
        ftrm.setAuthenticationHeader(ahh);
        ftrm.setBankID(bankId); 
        ftrm.setControlNumber(CommonLib.MakeString(_ControlNumber_QNAME, controlNumber));
        ftrm.setCurrencyID(val);
        ftrm.setSum(sum);
//
        com.unistream.test.wcflib.FindTransfer ftxml = new com.unistream.test.wcflib.FindTransfer();
        ftxml.setRequestMessage(factory.createFindTransferRequestMessage(ftrm));
        CommonLib.printXml(ftxml);
//                    
        IWebService service = new WebService().getWS2007HttpBindingIWebService();
        FindTransferResponseMessage rm = service.findTransfer(ftrm);
        return rm;
    }
 }
