package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.Transfer;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory;

/**
 *
 * @author Dale
 */
public class PayOutTransfer {

    public static PayoutTransferResponseMessage payoutTransfer(Transfer transfer) throws JAXBException {
        ObjectFactory factory = new ObjectFactory();
        PayoutTransferRequestMessage ptrm = factory.createPayoutTransferRequestMessage();
        JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
        JAXBElement<Transfer> tr = factory.createTransfer(transfer);
        ptrm.setAuthenticationHeader(ahh);
        ptrm.setTransfer(tr);
//
        com.unistream.test.wcflib.PayoutTransfer ftxml = new com.unistream.test.wcflib.PayoutTransfer();
        ftxml.setRequestMessage(factory.createPayoutTransferRequestMessage(ptrm));
        CommonLib.printXml(ftxml);
// 
        IWebService service = new WebService().getWS2007HttpBindingIWebService();
        PayoutTransferResponseMessage rm = service.payoutTransfer(ptrm);
        return rm;
    }
}
