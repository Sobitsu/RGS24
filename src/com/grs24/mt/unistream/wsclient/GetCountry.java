/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.RemittanceException;
import com.unistream.test.wcflib.IWebService;
import java.io.IOException;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceException;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.Country;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dale
 */
public class GetCountry {
    private final Logger logger = LoggerFactory.getLogger(GetCountry.class);
    private GetCountriesChangesResponseMessage getCountriesChanges(JAXBElement<AuthenticationHeader> ahh, IWebService service) throws UnsupportedOperationException, IOException {
        try {
                org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesRequestMessage requestMessage = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesRequestMessage();
                requestMessage.setAuthenticationHeader(ahh);
                requestMessage.setUpdateCount(0L);
                return service.getCountriesChanges(requestMessage);
            }
        catch (WebServiceException ex)
            {throw new IOException("getCountriesChanges:Connection Unistream error",ex);
        }
    }
    
/**
* Получение ID страны по ее коду из справочника
* @param code - ISO 4217 символьный код страны
* @param ahh - Подготовленный авторизационный заголовок
* @param service - текущий коннект к ВебСервису
* @return ID страны
* @throws com.grs24.mt.RemittanceException в случае отрицательного разбора сообщения от UniStream
* @throws java.io.IOException  - в случае недоступности UniStream
*/ 
    public Integer getCountriesID(String code,JAXBElement<AuthenticationHeader> ahh, IWebService service)throws IOException, RemittanceException {
        if (logger.isDebugEnabled()) {
            logger.debug("getCountriesID <- сode='"+code
                    + "'");
        }  
        GetCountriesChangesResponseMessage rm = getCountriesChanges(ahh,service);
        CommonLib cl = new CommonLib();
        cl.checkFault(rm,logger,code);
        if (rm.getCountries().isNil()) return null;
        for (Country i : rm.getCountries().getValue().getCountry())
                {
                    if (i.getLatin3().getValue().equals(code) ) {
                        if (logger.isDebugEnabled()) {
                            logger.debug("getCountriesID -> id='"+i.getID().toString()
                                    + "'");
                        }  
                        return i.getID();
                    }
                }
        return null;
     }

/**
* Получение кода страны по ее ID из справочника
* @param cuntryId - ID страны
* @param ahh - Подготовленный авторизационный заголовок
* @param service - текущий коннект к ВебСервису
* @return ISO 4217 символьный код страны
* @throws com.grs24.mt.RemittanceException в случае отрицательного разбора сообщения от UniStream
* @throws java.io.IOException  - в случае недоступности UniStream
* 
*/ 

    public String getCuntryCode(Integer cuntryId,JAXBElement<AuthenticationHeader> ahh, IWebService service) throws IOException, RemittanceException {
        if (logger.isDebugEnabled()) {
            logger.debug("getCuntryCode <- cuntryId='"+cuntryId.toString()
                    + "'");
        }          
        GetCountriesChangesResponseMessage rm = getCountriesChanges(ahh,service);
        CommonLib cl = new CommonLib();
        cl.checkFault(rm,logger,cuntryId.toString());
        if (rm.getCountries().isNil()) return null;
        for (Country i : rm.getCountries().getValue().getCountry())
                {
                    if (i.getID().equals(cuntryId) ) {
                        if (logger.isDebugEnabled()) {
                            logger.debug("getCuntryCode -> code='"+ i.getLatin3().getValue()
                                    + "'");
                        }          
                        return i.getLatin3().getValue();
                    }
                }
        return null;
     }
    
}
