/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.RemittanceException;
import java.io.IOException;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceException;
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
* @throws IOException в случае провала выполение
     * @throws com.grs24.mt.RemittanceException
*/ 
    public static Integer getCurrencyID(String сode) throws IOException, RemittanceException {
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
* @throws IOException в случае провала выполение
*/ 

    /**
     * Выполнение запроса на получение кода валюты
     * @param currencyId - ID валюты
     * @return ISO 4217 символьный код валюты
     * @throws IOException в случае провала выполение
     * @throws com.grs24.mt.RemittanceException
     */
    public static String getCurrencyCode(Integer currencyId) throws IOException, RemittanceException {
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

    private static GetCurrenciesChangesResponseMessage getCurrenciesChanges() throws UnsupportedOperationException, IOException {
        try {
                JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage requestMessage = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage();
                requestMessage.setAuthenticationHeader(ahh);
                requestMessage.setUpdateCount(1L);
                //IWebService service = new WebService().getWS2007HttpBindingIWebService();
                WebServiceSingl ws = WebServiceSingl.getInstance();
                return ws.service.getCurrenciesChanges(requestMessage);
        }
        catch (IOException|WebServiceException ex) 
            {
                throw new IOException("Ошибка доступа к Unistream",ex); 
            }
    }

}