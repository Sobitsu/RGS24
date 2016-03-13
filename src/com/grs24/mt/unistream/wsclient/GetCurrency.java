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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dale
 */
public class GetCurrency {
        private static final Logger logger = LoggerFactory.getLogger(GetCurrency.class);
/**
* Получение ID валюты из справочника
* @param сode - ISO 4217 символьный код валюты
* @return ID валюты
* @throws com.grs24.mt.RemittanceException в случае отрицательного разбора сообщения от UniStream
* @throws java.io.IOException  - в случае недоступности UniStream
*/ 
    public static Integer getCurrencyID(String сode) throws IOException, RemittanceException {
        if (logger.isDebugEnabled()) {
            logger.debug("getCurrencyID <- сode='"+сode
                    + "'");
        }  
        GetCurrenciesChangesResponseMessage rm = getCurrenciesChanges();
        CommonLib.checkFault(rm,logger,сode);
        for (Currency i : rm.getCurrencies().getValue().getCurrency())
                {
                    if (i.getLatin3().getValue().equals(сode) ) {
                        if (logger.isDebugEnabled()) {
                            logger.debug("getCurrencyID -> i.ID='"+i.getID().toString()
                                    + "'");
                        }  
                        return i.getID();
                    }
                }
        return null;
     }

/**
* Получение кода валюты по ее ID из справочника
* Выполнение запроса на получение кода валюты
* @param currencyId - ID валюты
* @return ISO 4217 символьный код валюты
* @throws com.grs24.mt.RemittanceException в случае отрицательного разбора сообщения от UniStream
* @throws java.io.IOException  - в случае недоступности UniStream
*/
    public static String getCurrencyCode(Integer currencyId) throws IOException, RemittanceException {
        if (logger.isDebugEnabled()) {
            logger.debug("getCurrencyCode <- currencyId='"+currencyId.toString()
                    + "'");
        }  
        GetCurrenciesChangesResponseMessage rm = getCurrenciesChanges();
        CommonLib.checkFault(rm,logger,currencyId.toString());
        for (Currency i : rm.getCurrencies().getValue().getCurrency())
                {
                    if (i.getID().equals(currencyId) ) {
                        if (logger.isDebugEnabled()) {
                            logger.debug("getCurrencyCode -> currencyCode='"+i.getLatin3().getValue()
                                    + "'");
                        }  
                        return i.getLatin3().getValue();
                    }
                }
        return null;
     }

    private static GetCurrenciesChangesResponseMessage getCurrenciesChanges() throws UnsupportedOperationException, IOException {
        try {
                JAXBElement<AuthenticationHeader> ahh = CommonLib.makeAuthHead();
                org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage requestMessage = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage();
                requestMessage.setAuthenticationHeader(ahh);
                requestMessage.setUpdateCount(1L);
                //IWebService service = new WebService().getWS2007HttpBindingIWebService();
                WebServiceSingl ws = WebServiceSingl.getInstance();
                return ws.service.getCurrenciesChanges(requestMessage);
        }
        catch (IOException|WebServiceException ex) 
            {
                throw new IOException("getCurrenciesChanges:Connection Unistream error",ex); 
            }
    }

}