/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.RemittanceException;
import com.sun.xml.ws.client.BindingProviderProperties;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.IOException;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.Country;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesResponseMessage;

/**
 *
 * @author Dale
 */
public class GetCountry {

    private static GetCountriesChangesResponseMessage getCountriesChanges( ) throws IOException {
        try {
                JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesRequestMessage requestMessage = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesRequestMessage();
                requestMessage.setAuthenticationHeader(ahh);
                requestMessage.setUpdateCount(0L);
                IWebService service = new WebService().getWS2007HttpBindingIWebService();
                return service.getCountriesChanges(requestMessage);
            }
        catch (Exception ex) 
            {
                throw new IOException("Ошибка доступа к Unistream",ex); 
            }
    }
    
/**
* Выполнение запроса на получение ID страны
* @param code - ISO 4217 символьный код страны
* @return ID страны
* @throws java.io.IOException
* @throws com.grs24.mt.RemittanceException
*/ 
    public static Integer getCountriesID(String code)throws IOException, RemittanceException {
        GetCountriesChangesResponseMessage rm = getCountriesChanges();
        CommonLib.CheckFault(rm);
        if (rm.getCountries().isNil()) return null;
        for (Country i : rm.getCountries().getValue().getCountry())
                {
                    if (i.getLatin3().getValue().equals(code) ) {
                        return i.getID();
                    }
                }
        return null;
     }

/**
* Выполнение запроса на получение кода валюты
* @param cuntryId - ID валюты
* @return ISO 4217 символьный код валюты
* @throws java.io.IOException
* @throws com.grs24.mt.RemittanceException
* 
*/ 

    public static String getCuntryCode(Integer cuntryId) throws IOException, RemittanceException {
        GetCountriesChangesResponseMessage rm = getCountriesChanges();
        CommonLib.CheckFault(rm);
        if (rm.getCountries().isNil()) return null;
        for (Country i : rm.getCountries().getValue().getCountry())
                {
                    if (i.getID().equals(cuntryId) ) {
                        return i.getLatin3().getValue();
                    }
                }
        return null;
     }
    
}
