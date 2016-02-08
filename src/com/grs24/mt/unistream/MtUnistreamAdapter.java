package com.grs24.mt.unistream;

import org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory;
import com.grs24.mt.FullNameTypeHolder;
import com.grs24.mt.FundsHolder;
import com.grs24.mt.IndividualHolder;
import com.grs24.mt.MtAdapter;
import com.grs24.mt.PersonHolder;
import com.grs24.mt.RemittanceException;
import com.grs24.mt.RemittanceHolder;
import com.grs24.mt.unistream.wsclient.CreatePerson;
import com.grs24.mt.unistream.wsclient.FindPerson;
import com.grs24.mt.unistream.wsclient.FindTransfer;
import com.grs24.mt.unistream.wsclient.GetCurrency;
import com.grs24.mt.unistream.wsclient.GetTransferByID;
import com.grs24.mt.unistream.wsclient.PayOutTransfer;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.Amount;
import org.datacontract.schemas._2004._07.wcfservicelib.AmountType;
import org.datacontract.schemas._2004._07.wcfservicelib.Consumer;
import org.datacontract.schemas._2004._07.wcfservicelib.ConsumerRole;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.Transfer;
import org.datacontract.schemas._2004._07.wcfservicelib.TransferStatus;
import org.datacontract.schemas._2004._07.wcfservicelib.Person;

/**
 *
 * @author Ctac
 */
public class MtUnistreamAdapter implements MtAdapter
{       
        public static String KEY_USER_AUTHED_APIKEY;// = "1wwteyFGFew624";
	public static String KEY_USER_AUTHED_LOGIN;// = "g2.grstwentyfour.rus";
	public static String KEY_USER_AUTHED_PASSWORD;// = "7!LrO7i7";
        public static Integer KEY_BANK_ID;// = 383589;

        @Override
	public void init(Properties cfg) throws IOException {
            try{
                    KEY_USER_AUTHED_APIKEY = cfg.getProperty("APIKEY");
                    KEY_USER_AUTHED_LOGIN = cfg.getProperty("LOGIN");
                    KEY_USER_AUTHED_PASSWORD = cfg.getProperty("PASSWORD");
                    KEY_BANK_ID = BaseDataParser.parseInteger(cfg.getProperty("BANKID"));
            } catch (Exception ex) {
                    throw new UnsupportedOperationException("Not supported configuration. Check cfg info");
                }
        }
        private FundsHolder getFundsHolder(List<Amount>  amounts, AmountType type)
        {
            for (Amount i : amounts)
                 {
                     if (i.getType() == type) {
                         FundsHolder retval = new FundsHolder();
                         retval.setAmount(i.getSum());
                         retval.setCur(GetCurrency.getCurrencyCode(i.getCurrencyID()));
                         return retval;
                     }
                 }
            return null;
        }
        private FullNameTypeHolder getConsumer(List<Consumer>  consumers, ConsumerRole role)
        {
            for (Consumer i : consumers)
                 {
                     if (i.getRole() == role) {
                         FullNameTypeHolder retval = new FullNameTypeHolder();
                         IndividualHolder individual = new IndividualHolder();
                         individual.setFirst(i.getPerson().getValue().getFirstName().getValue());
                         individual.setLast(i.getPerson().getValue().getLastName().getValue());
                         individual.setMiddle(i.getPerson().getValue().getMiddleName().getValue());
                         retval.setIndividual(individual);
                         return retval;
                     }
                 }
            return null;
        }

        private void checkTransferStatus(Transfer transfer) throws RemittanceException {
            if (transfer == null) {
                throw new RemittanceException("Перевод выплачен ругим банком", 30002, "","" );
            }
            if (transfer.getStatus() == TransferStatus.CANCELLED) {
                throw new RemittanceException("Перевод отозван", 30003, "","" );
            }
            if (transfer.getStatus() == TransferStatus.REJECTED) {
                throw new RemittanceException("Перевод отменен", 30004, "","" );
            }
            if (transfer.getStatus() == TransferStatus.PAID) {
                //TODO не понятно как сказать что все ОК?
                throw new RemittanceException("Перевод оплачен", 10000, "","" );
            }
        }
    
        private FindPersonRequestMessage getpersshot(PersonHolder payee) {
            
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private Person getPerson(PersonHolder payee){
            throw new UnsupportedOperationException("Сделать обработку клиентской инфо");
        }    

        @Override
	public RemittanceHolder[] moneySearch(String mtcn, 
                                                FundsHolder approxOrgFunds, 
                                                FundsHolder approxDstFunds, 
                                                String orgCountry, 
                                                String dstCountry) 
                    throws RemittanceException, IOException {
            Transfer rettransfer;
            Double mtsum = approxDstFunds.getAmount().doubleValue();
            Integer mtval = GetCurrency.getCurrencyID(approxDstFunds.getCur());
            RemittanceHolder retval = new RemittanceHolder();
            rettransfer = FindTransfer.FindTransfer(mtcn,mtsum,mtval,KEY_BANK_ID);
            retval.setDstCountry(dstCountry);
            retval.setOrgCountry(orgCountry);
            retval.setMtID(rettransfer.getID().toString());
            retval.setMtcn(rettransfer.getControlNumber().getValue());
            retval.setDstFunds(getFundsHolder(rettransfer.getAmounts().getValue().getAmount(),AmountType.ESTIMATED_PAIDOUT));
            retval.setOrgFunds(getFundsHolder(rettransfer.getAmounts().getValue().getAmount(),AmountType.MAIN));
            retval.setPayer(getConsumer(rettransfer.getConsumers().getValue().getConsumer(),ConsumerRole.SENDER));
            retval.setPayee(getConsumer(rettransfer.getConsumers().getValue().getConsumer(),ConsumerRole.EXPECTED_RECEIVER));
            RemittanceHolder[] retarr = null;
            retarr[1] = retval;
            return retarr;
	}

        @Override
	public void moneyHold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException {
		throw new RemittanceException("Операция HOLD не поддерживается Unistream", 30001, "","");
	}

        @Override
	public void moneyUnhold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException {
		throw new RemittanceException("Операция UNHOLD не поддерживается Unistream", 30001, "","");
	}

        @Override
	public void moneyPay(String mtID, String mtcn, PersonHolder payee, String docID, String docDate) throws RemittanceException, IOException {
            Transfer transfer = null;
            if (mtID != null) 
            {
                Integer id = BaseDataParser.parseInteger(mtID);
                transfer = GetTransferByID.getTransferByID(id).getTransfer().getValue();
                checkTransferStatus(transfer);
            }
            else
            {
            //по уму надо искать заного но нема информации о сумме и валюте перевода и найти его не удастся. поэтому генерим exception
                throw new RemittanceException("Не достаточно информации для поиска перевода",30010,"","");
            }
            //TODO Сделать обработку клиентской инфы

            Person persh = getPerson(payee);
            ObjectFactory factory = new ObjectFactory();
            List<Consumer> consumers = transfer.getConsumers().getValue().getConsumer();
            FindPersonRequestMessage pershshot = getpersshot(payee);
            List<Person> persons = FindPerson.FindPersonJAXb(pershshot).getPersons().getValue().getPerson();
            Person person = null;
            // TODO проверить а вообще кого нить нашли?
            if (persons.isEmpty()) 
                {
                    person = CreatePerson.CreatePersonJAXb(persh).getPerson().getValue();
                }
            else
                {
                    person = persons.get(1);
                }
            Consumer consumer = new Consumer();
            JAXBElement<Person> xperson = factory.createPerson(person);
            consumer.setPerson(xperson);
            consumer.setRole(ConsumerRole.ACTUAL_RECEIVER);
            consumers.add(consumer);
            PayoutTransferResponseMessage retval = PayOutTransfer.payoutTransfer(transfer);
            transfer= retval.getTransfer().getValue();
            checkTransferStatus(transfer);
        }
}
