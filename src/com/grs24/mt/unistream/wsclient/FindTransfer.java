/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.dto.FindTransferRequestDto;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.Transfer;

/**
 *
 * @author Dale
 */
public class FindTransfer {
    
    //TODO обсудить со Стасом как сделать потокобезопасным эту часть
    private final static QName _ControlNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "ControlNumber");
    
    private static Transfer cur_transfer;
    
    public static Transfer FindTransfer(FindTransferRequestDto transfer) throws Exception {
        try
                {
                    if (cur_transfer != null) {
                        if (transfer.getControlNumber().equals(cur_transfer.getControlNumber().getValue())) {
                            return cur_transfer;
                        }
                    }
                    FindTransferRequestMessage ftrm = new FindTransferRequestMessage();
                    org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    ftrm.setAuthenticationHeader(ahh);
                    ftrm.setBankID(transfer.getBankID()); 
                    ftrm.setControlNumber(CommonLib.MakeString(_ControlNumber_QNAME, transfer.getControlNumber()));
                    ftrm.setCurrencyID(transfer.getCurrencyID());
                    ftrm.setSum(transfer.getSum());
                    ftrm.setBankID(transfer.getBankID());
//
                    com.unistream.test.wcflib.FindTransfer ftxml = new com.unistream.test.wcflib.FindTransfer();
                    ftxml.setRequestMessage(factory.createFindTransferRequestMessage(ftrm));
                    CommonLib.printXml(ftxml);
//                    
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    FindTransferResponseMessage rm = service.findTransfer(ftrm);
                    CommonLib.CheckFault(rm);
                    Transfer ret_value;
                    ret_value = rm.getTransfer().getValue();
                    cur_transfer = ret_value;
                    return ret_value;
               } catch (Exception ex) {
                    throw new FindTransferException("FindTransfer error: " + ex.getMessage());}
    }
 }
