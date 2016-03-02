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
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessageType;

/**
 *
 * @author Dale
 */
public class GetTransferByID {
    
       public static GetTransferByIDResponseMessageType GetTransferByID(Integer transferId) {
        try
                {
                    GetTransferByIDRequestMessageType gtrm = new GetTransferByIDRequestMessageType();
                    com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
                    JAXBElement<AuthenticationHeaderType> ahh = CommonLib.MakeAuthHead();
                    gtrm.setAuthenticationHeader(ahh);
                    gtrm.setTransferID(transferId);
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    GetTransferByIDResponseMessageType rm = service.getTransferByID(gtrm);
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getTransfer().getValue().getID().toString());
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
    }
}