/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.Transfer;

/**
 *
 * @author Dale
 */
public class PayoutTransfer {
    
    public static PayoutTransferResponseMessage PayoutTransfer(Transfer transfer) throws Exception {
        try
                {
                    PayoutTransferRequestMessage ptrm = new PayoutTransferRequestMessage();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                    JAXBElement<Transfer> transh = factoryp.createTransfer(transfer);
                    ptrm.setAuthenticationHeader(ahh);
                    ptrm.setTransfer(transh);
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    PayoutTransferResponseMessage rm = service.payoutTransfer(ptrm);
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getTransfer().getValue().getID());
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
    }
 }
