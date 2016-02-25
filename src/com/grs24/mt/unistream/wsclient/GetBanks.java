/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.RemittanceException;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.Bank;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesResponseMessage;

/**
 *
 * @author Dale
 */
public class GetBanks {

    private static GetBanksChangesResponseMessage getBanksChanges() {
        JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
        org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesRequestMessage requestMessage = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesRequestMessage();
        requestMessage.setAuthenticationHeader(ahh);
        requestMessage.setUpdateCount(0L);
        IWebService service = new WebService().getWS2007HttpBindingIWebService();
        return service.getBanksChanges(requestMessage);
    }
/**
* Выполнение запроса на получение ID точки доступа (пока берется первая попавшаяся для указанного парента
* @param parrentID - ID банка предка
* @return ID первой точки 
     * @throws com.grs24.mt.RemittanceException 
*/ 
    public static Integer getBankId(Integer parrentID) throws RemittanceException {
        GetBanksChangesResponseMessage listBankXml = getBanksChanges();
        CommonLib.CheckFault(listBankXml);
        for (Bank i : listBankXml.getBanks().getValue().getBank())
                {
                    if (i.getParentID().equals(parrentID)) {
                        return i.getID();
                    }
                }
        return null;
    } 
}
