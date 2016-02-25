/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.IOException;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.Currency;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesResponseMessage;

/**
 *
 * @author Dale
 */
public class GetCurrency {
/**
* Выполнение запроса на получение ID валюты
* @param сode - ISO 4217 символьный код валюты
* @return ID валюты
* 
* @throws Exception в случае провала выполение
*/ 
    public static Integer getCurrencyID(String сode) throws Exception {
        GetCurrenciesChangesResponseMessage rm = getCurrenciesChanges();
        CommonLib.CheckFault(rm);
        for (Currency i : rm.getCurrencies().getValue().getCurrency())
                {
                    if (i.getLatin3().getValue().equals(сode) ) {
                        return i.getID();
                    }
                }
        return null;
     }
/**
* Выполнение запроса на получение кода валюты
* @param currencyId - ID валюты
* @return ISO 4217 символьный код валюты
* 
* @throws Exception в случае провала выполение
*/ 

    public static String getCurrencyCode(Integer currencyId) throws Exception {
        GetCurrenciesChangesResponseMessage rm = getCurrenciesChanges();
        CommonLib.CheckFault(rm);
        for (Currency i : rm.getCurrencies().getValue().getCurrency())
                {
                    if (i.getID().equals(currencyId) ) {
                        return i.getLatin3().getValue();
                    }
                }
        return null;
     }

    private static GetCurrenciesChangesResponseMessage getCurrenciesChanges() throws IOException {
        try {
                JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage requestMessage = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage();
                requestMessage.setAuthenticationHeader(ahh);
                requestMessage.setUpdateCount(1L);
                IWebService service = new WebService().getWS2007HttpBindingIWebService();
                return service.getCurrenciesChanges(requestMessage);
        }
        catch (Exception ex) 
            {
                throw new IOException("Ошибка доступа к Unistream",ex); 
            }
    }

}