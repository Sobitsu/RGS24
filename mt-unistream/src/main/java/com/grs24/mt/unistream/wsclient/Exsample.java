package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory;
import org.datacontract.schemas._2004._07.wcfservicelib.Transfer;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDResponseMessage;


/**
 *
 * @author d.novikov
 */
public class Exsample {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

        try
        {
            IWebService service = new WebService().getWS2007HttpBindingIWebService();
            GetBankByIDRequestMessage gbrm = new GetBankByIDRequestMessage();

            ObjectFactory factory = new  ObjectFactory(); // org.datacontract.schemas._2004._07.wcfservicelib

            InsertTransferRequestMessage itrm = new InsertTransferRequestMessage();
            Transfer t = new Transfer();


            AuthenticationHeader ah = factory.createAuthenticationHeader();
            JAXBElement<AuthenticationHeader> ahh = factory.createWsRequestAuthenticationHeader(ah);
            ah.setAppKey(factory.createAuthenticationHeaderAppKey("1wwteyFGFew624"));
            ah.setUsername(factory.createAuthenticationHeaderUsername("ChangeIt"));
            ah.setPassword(factory.createAuthenticationHeaderPassword("ChangeIt"));
            gbrm.setAuthenticationHeader(ahh);
            gbrm.setID(29);

            GetBankByIDResponseMessage rm = service.getBankByID(gbrm);
            CheckFault(rm);
            
            System.out.println(rm.getBank().getValue().getName().getValue().getLangText().get(0).getText().getValue());


        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }
    private static JAXBElement<String> JStr(String value) {
        return new JAXBElement<String>(new QName("" , ""), String.class, value);
    }

    private static void CheckFault(WsResponse response) {

        if(!response.getFault().isNil())
        {
            String msg = "code=" + response.getFault().getValue().getCode();
            msg += ", id="  + response.getFault().getValue().getID().getValue();
            msg += ", msg="+ response.getFault().getValue().getMessage().getValue();

            throw new UnsupportedOperationException("Unistream returned error: " + msg);
        }
    }

    private static void test() {

    }

}
