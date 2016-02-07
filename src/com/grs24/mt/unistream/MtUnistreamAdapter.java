package com.grs24.mt.unistream;

import com.grs24.mt.FullNameTypeHolder;
import com.grs24.mt.FundsHolder;
import com.grs24.mt.IndividualHolder;
import com.grs24.mt.MtAdapter;
import com.grs24.mt.PersonHolder;
import com.grs24.mt.RemittanceException;
import com.grs24.mt.RemittanceHolder;
import com.grs24.mt.unistream.dto.FindTransferRequestDto;
import com.grs24.mt.unistream.dto.Person;
import com.grs24.mt.unistream.wsclient.CreatePerson;
import com.grs24.mt.unistream.wsclient.FindPerson;
import com.grs24.mt.unistream.wsclient.FindTransfer;
import com.grs24.mt.unistream.wsclient.GetCurrency;
import com.grs24.mt.unistream.wsclient.GetTransferByID;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.Amount;
import org.datacontract.schemas._2004._07.wcfservicelib.AmountType;
import org.datacontract.schemas._2004._07.wcfservicelib.Consumer;
import org.datacontract.schemas._2004._07.wcfservicelib.ConsumerRole;
import org.datacontract.schemas._2004._07.wcfservicelib.Transfer;
import org.datacontract.schemas._2004._07.wcfservicelib.TransferStatus;

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
            try {
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
            } catch (Exception ex) {
		throw new UnsupportedOperationException("Ошибка при получении суммы перевода"); 
            }
        }
        private FullNameTypeHolder getConsumer(List<Consumer>  consumers, ConsumerRole role)
        {
            try {
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
            } catch (Exception ex) {
		throw new UnsupportedOperationException("Ошибка при получении клиента по переводу"); 
            }
        }

        @Override
	public RemittanceHolder[] moneySearch(String mtcn, 
                                                FundsHolder approxOrgFunds, 
                                                FundsHolder approxDstFunds, 
                                                String orgCountry, 
                                                String dstCountry) 
                    throws RemittanceException, IOException {
            try {
                FindTransferRequestDto transfer  = new FindTransferRequestDto();
                Transfer rettransfer;
                RemittanceHolder retval = new RemittanceHolder();
                transfer.setBankID(KEY_BANK_ID);
                transfer.setControlNumber(mtcn);
                transfer.setSum(approxDstFunds.getAmount().doubleValue());
                transfer.setCurrencyID(GetCurrency.getCurrencyID(approxDstFunds.getCur()));
                rettransfer = FindTransfer.FindTransfer(transfer);
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
                } catch (Exception ex) {
                    //TODO сделать нормальную обработку ошибок в том числе проверку на состояние готовности к выдаче
		throw new UnsupportedOperationException("Not supported yet."); }//To change body of generated methods, choose Tools | Templates.
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
            try 
            {
                Transfer transfer = GetTransferByID.getTransferByID(BaseDataParser.parseInteger(mtID)).getTransfer().getValue();
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
                    return;
                }
                //TODO Сделать обработку клиентской инфы
                Person pers = getPerson(payee);
                org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                List<Consumer> consumers = transfer.getConsumers().getValue().getConsumer();
                List<org.datacontract.schemas._2004._07.wcfservicelib.Person> persons = null;
                try {
                     persons = FindPerson.FindPerson(pers).getPersons().getValue().getPerson();
                } catch (Exception ex)
                        {
                            person = ????
                        }
                // TODO проверить а вообще кого нить нашли?
                if (persons.size() == 0) 
                    {
                        persons.add(CreatePerson.CreatePerson(pers).getPerson().getValue());
                    }
                for (org.datacontract.schemas._2004._07.wcfservicelib.Person person: persons)
                    {
                        Consumer consumer = new Consumer();
                        JAXBElement<org.datacontract.schemas._2004._07.wcfservicelib.Person> xperson = factoryp.createPerson(person);
                        consumer.setPerson(xperson);
                        consumer.setRole(ConsumerRole.ACTUAL_RECEIVER);
                        consumers.add(consumer);
                    }
            } catch (Exception ex) {
                    //TODO сделать нормальную обработку ошибок в том числе проверку на состояние готовности к выдаче
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
    }

    private Person getPerson(PersonHolder payee) throws Exception{
        //try
        //{
           // Person retval = new Person();
                throw new UnsupportedOperationException("Сделать обработку клиентской инфо");
          /*  return  retval;
        }
        catch (Exception ex) {
            throw new UnsupportedOperationException("Not supported yet.");
        }*/
    }    
}
