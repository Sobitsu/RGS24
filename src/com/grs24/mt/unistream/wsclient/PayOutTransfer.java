package com.grs24.mt.unistream.wsclient;

import com.unistream.test.wcflib.IWebService;
import java.io.IOException;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceException;
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
private final Logger logger = LoggerFactory.getLogger(PayOutTransfer.class);
/**
* Выполнение запроса на поиск перевода
* @param transfer - подготовленный перевод к оплате
* @param ahh - Подготовленный авторизационный заголовок
* @param service - текущий коннект к ВебСервису
* @return результат обработки 
* @throws IOException в случае провала выполение
* @see Transfer
* @see PayoutTransferResponseMessage
*/  
    public PayoutTransferResponseMessage payoutTransfer(Transfer transfer,JAXBElement<AuthenticationHeader> ahh, IWebService service) throws UnsupportedOperationException, IOException {
        try {
            if (logger.isDebugEnabled()) {
                    logger.debug("payoutTransfer <- transfer='"+transfer.toString()
                            + "'");
            }              
            ObjectFactory factory = new ObjectFactory();
            PayoutTransferRequestMessage ptrm = factory.createPayoutTransferRequestMessage();
            JAXBElement<Transfer> tr = factory.createTransfer(transfer);
            ptrm.setAuthenticationHeader(ahh);
            ptrm.setTransfer(tr);
            PayoutTransferResponseMessage rm = service.payoutTransfer(ptrm);
            if (logger.isDebugEnabled()) {
                com.unistream.test.wcflib.PayoutTransfer ftxml = new com.unistream.test.wcflib.PayoutTransfer();
                ftxml.setRequestMessage(factory.createPayoutTransferRequestMessage(ptrm));
                CommonLib cl = new CommonLib();
                logger.debug("payoutTransfer -> ptrm='"+cl.printXml(ftxml)
                            + "'");
                com.unistream.test.wcflib.PayoutTransferResponse ftrxml = new com.unistream.test.wcflib.PayoutTransferResponse();
                ftrxml.setPayoutTransferResult(factory.createPayoutTransferResponseMessage(rm));
                logger.debug("payoutTransfer -> rm='"+cl.printXml(ftxml)
                            + "'");
            }              
            return rm;
        }
    catch (WebServiceException ex)
        {
                throw new IOException("payoutTransfer:Connection Unistream error",ex);
        }
    }
    }
