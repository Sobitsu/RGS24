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
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.Country;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesResponseMessage;

/**
 *
 * @author Dale
 */
public class GetCountry {

    private static GetCountriesChangesResponseMessage getCountriesChanges( ) throws UnsupportedOperationException, IOException {
        try {
                JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesRequestMessage requestMessage = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesRequestMessage();
                requestMessage.setAuthenticationHeader(ahh);
                requestMessage.setUpdateCount(0L);
                //IWebService service = new WebService().getWS2007HttpBindingIWebService();
                WebServiceSingl ws = WebServiceSingl.getInstance();
                return ws.service.getCountriesChanges(requestMessage);
            }
        catch (IOException|WebServiceException ex)
            {throw new IOException("Ошибка доступа к Unistream",ex);
        }
    }
    
/**
* Получение ID страны по ее коду из справочника
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
* Получение кода страны по ее ID из справочника
* @param cuntryId - ID страны
* @return ISO 4217 символьный код страны
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
