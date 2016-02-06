/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.Constants;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDResponseMessage;

/**
 *
 * @author Dale
 */
public class GetBankID {
     public static Integer GetBankID() throws Exception {
        try { 
                Integer result;
                com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
                JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                GetBankByIDRequestMessage gbrm = new GetBankByIDRequestMessage();
                gbrm.setAuthenticationHeader(ahh);
                gbrm.setID(Constants.KEY_BANK_ID);
                IWebService service = new WebService().getWS2007HttpBindingIWebService();
                GetBankByIDResponseMessage rm = service.getBankByID(gbrm);
                result = rm.getBank().getValue().getID();
                return result;
            } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
     }
}
