package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.IOException;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.Transfer;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dale
 */
public class PayOutTransfer {
private static final Logger logger = LoggerFactory.getLogger(PayOutTransfer.class);
    /**
* Выполнение запроса на поиск перевода
* @param transfer - перевод к оплате
*  @return результат обработки 
* @throws IOException в случае провала выполение
*/  
    public static PayoutTransferResponseMessage payoutTransfer(Transfer transfer) throws IOException {
        try {
            logger.debug("Start PayoutTransferResponseMessage");
            ObjectFactory factory = new ObjectFactory();
            PayoutTransferRequestMessage ptrm = factory.createPayoutTransferRequestMessage();
            JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
            JAXBElement<Transfer> tr = factory.createTransfer(transfer);
            ptrm.setAuthenticationHeader(ahh);
            ptrm.setTransfer(tr);
            debug(ptrm);
            IWebService service = new WebService().getWS2007HttpBindingIWebService();
            PayoutTransferResponseMessage rm = service.payoutTransfer(ptrm);
            logger.debug("Finish PayoutTransferResponseMessage");
            return rm;
        }
            catch (Exception ex)
        {throw new IOException("Ошибка доступа к Unistream",ex);}
    }
    private static void debug(PayoutTransferRequestMessage ptrm)
        {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            com.unistream.test.wcflib.PayoutTransfer ftxml = new com.unistream.test.wcflib.PayoutTransfer();
            ftxml.setRequestMessage(factory.createPayoutTransferRequestMessage(ptrm));
            CommonLib.printXml(ftxml);
        }
    }
