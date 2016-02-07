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
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.Currency;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesResponseMessage;

/**
 *
 * @author Dale
 */
public class GetCurrency {
    public static Integer getCurrencyID(String CurrencyCode) throws Exception {
        try { 
                JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                IWebService service = new WebService().getWS2007HttpBindingIWebService();
                GetCurrenciesChangesRequestMessage gcrm = new GetCurrenciesChangesRequestMessage();
                gcrm.setAuthenticationHeader(ahh);
                gcrm.setUpdateCount(1L);
                GetCurrenciesChangesResponseMessage rm = service.getCurrenciesChanges(gcrm);
                for (Currency i : rm.getCurrencies().getValue().getCurrency())
                        {
                            if (i.getDigital().getValue().equals(CurrencyCode) ) {
                                return i.getID();
                            }
                        }
                return null;
            } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
     }
    public static String getCurrencyCode(Integer currencyId) throws Exception {
        try { 
                JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                IWebService service = new WebService().getWS2007HttpBindingIWebService();
                GetCurrenciesChangesRequestMessage gcrm = new GetCurrenciesChangesRequestMessage();
                gcrm.setAuthenticationHeader(ahh);
                gcrm.setUpdateCount(1L);
                GetCurrenciesChangesResponseMessage rm = service.getCurrenciesChanges(gcrm);
                for (Currency i : rm.getCurrencies().getValue().getCurrency())
                        {
                            if (i.getID().equals(currencyId) ) {
                                return i.getDigital().getValue();
                            }
                        }
                return null;
            } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
     }

}