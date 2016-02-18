package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.MtUnistreamAdapter;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.util.logging.Level;
import javax.xml.bind.JAXBElement;
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
/**
* Выполнение запроса на поиск перевода
* @param transfer - перевод к оплате
*  @return результат обработки 
* @throws Exception в случае провала выполение
*/  
    public static PayoutTransferResponseMessage payoutTransfer(Transfer transfer) throws Exception {
        MtUnistreamAdapter.logger.log(Level.INFO,"Start PayoutTransferResponseMessage");
        ObjectFactory factory = new ObjectFactory();
        PayoutTransferRequestMessage ptrm = factory.createPayoutTransferRequestMessage();
        JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
        JAXBElement<Transfer> tr = factory.createTransfer(transfer);
        ptrm.setAuthenticationHeader(ahh);
        ptrm.setTransfer(tr);
        com.unistream.test.wcflib.PayoutTransfer ftxml = new com.unistream.test.wcflib.PayoutTransfer();
        ftxml.setRequestMessage(factory.createPayoutTransferRequestMessage(ptrm));
        CommonLib.printXml(ftxml);
        IWebService service = new WebService().getWS2007HttpBindingIWebService();
        PayoutTransferResponseMessage rm = service.payoutTransfer(ptrm);
        MtUnistreamAdapter.logger.log(Level.INFO,"Finish PayoutTransferResponseMessage");
        return rm;
    }
}
