/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.dto.FindTransferRequestDto;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessage;

/**
 *
 * @author Dale
 */
public class FindTransfer {
    
    
    public static FindTransferResponseMessage FindTransfer(FindTransferRequestDto transfer) {
        try
                {
                    FindTransferRequestMessage ftrm = new FindTransferRequestMessage();
                    com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    ftrm.setAuthenticationHeader(ahh);
                    ftrm.setBankID(transfer.getBankID()); 
                    ftrm.setControlNumber(factory.createString(transfer.getControlNumber()));
                    ftrm.setCurrencyID(transfer.getCurrencyID());
                    ftrm.setSum(transfer.getSum());
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    FindTransferResponseMessage rm = service.findTransfer(ftrm);
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getTransfer().getValue().getID().toString());
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
    }
 }
