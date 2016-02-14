/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.MtUnistreamAdapter;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.util.logging.Level;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessage;

/**
 *
 * @author Dale
 */
public class GetTransferByID {

/**
* Выполнение запроса на поиск перевода по ID
* @param transferId - ID перевода в СДП
* @return Найденный перевод
* 
* @throws Exception в случае провала выполение
*/   
    
    public static GetTransferByIDResponseMessage getTransferByID(Integer transferId) throws Exception {
        MtUnistreamAdapter.logger.log(Level.INFO,"Start GetTransferByIDResponseMessage");
        GetTransferByIDRequestMessage gtrm = new GetTransferByIDRequestMessage();
        JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
        gtrm.setAuthenticationHeader(ahh);
        gtrm.setTransferID(transferId);
        IWebService service = new WebService().getWS2007HttpBindingIWebService();
        GetTransferByIDResponseMessage rm = service.getTransferByID(gtrm);
        MtUnistreamAdapter.logger.log(Level.INFO,"Finish GetTransferByIDResponseMessage");        
        return rm;
    }
}
