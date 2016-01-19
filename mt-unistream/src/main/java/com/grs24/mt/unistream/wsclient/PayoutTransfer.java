/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeaderType;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessageType;
import com.grs24.mt.unistream.dto.TransferDto;

/**
 *
 * @author Dale
 */
public class PayoutTransfer {
    
    public static PayoutTransferResponseMessageType PayoutTransfer(TransferDto transfer) {
        try
                {
                    PayoutTransferRequestMessageType ptrm = new PayoutTransferRequestMessageType();
                    JAXBElement<AuthenticationHeaderType> ahh = CommonLib.MakeAuthHead();
                    //TODO Добавить сериализацию transfers
                    JAXBElement<org.datacontract.schemas._2004._07.wcfservicelib.TransferType> transh = null;
                    ptrm.setAuthenticationHeader(ahh);
                    ptrm.setTransfer(transh);
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    PayoutTransferResponseMessageType rm = service.payoutTransfer(ptrm);
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getTransfer().getValue().getID());
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
    }
    
 }
