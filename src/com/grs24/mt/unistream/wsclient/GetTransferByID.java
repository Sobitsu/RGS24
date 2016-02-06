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
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessage;

/**
 *
 * @author Dale
 */
public class GetTransferByID {
    
       public static GetTransferByIDResponseMessage GetTransferByID(Integer transferId) throws Exception {
        try
                {
                    GetTransferByIDRequestMessage gtrm = new GetTransferByIDRequestMessage();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    gtrm.setAuthenticationHeader(ahh);
                    gtrm.setTransferID(transferId);
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    GetTransferByIDResponseMessage rm = service.getTransferByID(gtrm);
                    CommonLib.CheckFault(rm);
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
    }
}
