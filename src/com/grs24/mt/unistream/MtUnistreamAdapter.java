package com.grs24.mt.unistream;

import com.grs24.mt.RemittanceException;
import com.grs24.mt.RemittanceHolder;
import com.grs24.msg.FundsHolder;
import com.grs24.msg.PersonHolder;
import com.grs24.mt.MtAdapter;
import java.io.IOException;
import java.util.Properties;

import com.grs24.msg.FullNameTypeHolder;
import com.grs24.msg.IndividualHolder;
import java.util.List;
import com.grs24.mt.unistream.wsclient.CommonLib;
import com.grs24.mt.unistream.wsclient.CreatePerson;
import com.grs24.mt.unistream.wsclient.FindPerson;
import com.grs24.mt.unistream.wsclient.FindTransfer;
import com.grs24.mt.unistream.wsclient.GetCurrency;
import com.grs24.mt.unistream.wsclient.GetTransferByID;
import com.grs24.mt.unistream.wsclient.PayOutTransfer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory;
import org.datacontract.schemas._2004._07.wcfservicelib.Amount;
import org.datacontract.schemas._2004._07.wcfservicelib.AmountType;
import org.datacontract.schemas._2004._07.wcfservicelib.Consumer;
import org.datacontract.schemas._2004._07.wcfservicelib.ConsumerRole;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.Participator;
import org.datacontract.schemas._2004._07.wcfservicelib.ParticipatorRole;
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
        private final static QName _FirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "FirstName");
        private final static QName _LastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "LastName");
        private final static QName _MiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "MiddleName");
        private final static QName _DocNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocNumber");
        private final static QName _DocSeries_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocSeries");
        private final static QName _PhoneArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneArea");
        private final static QName _PhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneNumber");
        private final static QName _Phone_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Phone");
        private final static QName _UnistreamCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "UnistreamCardNumber");
        public static String KEY_USER_AUTHED_APIKEY;// = "1wwteyFGFew624";
	public static String KEY_USER_AUTHED_LOGIN;// = "g2.grstwentyfour.rus";
	public static String KEY_USER_AUTHED_PASSWORD;// = "7!LrO7i7";
        public static Integer KEY_BANK_ID;// = 383589;
        public static Integer KEY_PARTICIPATOR_ID;
        public static Logger logger;


 /**
* Проверка входных параметров для поиска перевода 
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param approxOrgFunds
* @param approxDstFunds
* @param orgCountry
* @param dstCountry
* @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) 
* code 50001: Не указан номер перевода
* code 50002: Не указаны валюта и сумма перевода
* code 40003: Проблемы при создании клиента
* code 40004: Проблемы при оплате перевода
*/ 

        private void mscheckInparam(String mtcn, FundsHolder approxOrgFunds, FundsHolder approxDstFunds, String orgCountry, String dstCountry) throws RemittanceException
        {
            if (mtcn == null) {
                    logger.log(Level.SEVERE, "Не указан номер перевода");
                    throw new RemittanceException("Не указан номер перевода", 50001, "","");
                }
            if (approxDstFunds == null) {
                    logger.log(Level.SEVERE, "Не указаны валюта и сумма перевода");
                    throw new RemittanceException("Не указаны валюта и сумма перевода", 50002, "","");
                }
            if (approxDstFunds.getAmount() == null) {
                    logger.log(Level.SEVERE, "Не указана сумма перевода"); 
                    throw new RemittanceException("Не указана сумма перевода", 50002, "","");
                }
            if (approxDstFunds.getCur() == null)    {
                    logger.log(Level.SEVERE, "Не указана валюта перевода"); 
                    throw new RemittanceException("Не валюта перевода", 50002, "","");
                }
        }

/**
* Проверка входных параметров для оплаты перевода 
* @param mtID ID перевода
* @param payee получатель
* @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) 
* code 50004: Не указан ID перевода
* code 50005: Не указан получатель перевода
* code 50006: Не указаны ФИО получателя перевода
* code 50007: Не указанна дата рождения получателя перевода
* code 50008: Не указанны  реквизиты удостоверения личности получателя перевода
* code 50009: Не указан телефон получателя перевода
* code 50010: Не указан адресс регистрации получателя перевода
*/ 
        private void mpCheckInParam(String mtID,PersonHolder payee)  throws RemittanceException {
            if (mtID == null) {
                logger.log(Level.SEVERE, "Не указан ID перевода"); 
                throw new RemittanceException("Не указан ID перевода", 50004, "","");
            }
            if (payee == null) {
                logger.log(Level.SEVERE, "Не указан получатель перевода"); 
                throw new RemittanceException("Не указан получатель перевода", 50005, "","");
            }
            if (payee.getFullName() == null) {
                logger.log(Level.SEVERE, "Не указанны ФИО получателя перевода"); 
                throw new RemittanceException("Не указанны ФИО получателя перевода", 50006, "","");
            }
            if (payee.getFullName().getIndividual() == null) {
                logger.log(Level.SEVERE, "Не указанны ФИО получателя перевода"); 
                throw new RemittanceException("Не указанны ФИО получателя перевода", 50006, "","");
            }
            if (payee.getFullName().getIndividual().getFirst() == null) {
                logger.log(Level.SEVERE, "Не указанно имя получателя перевода"); 
                throw new RemittanceException("Не указанно имя получателя перевода", 50006, "","");
            }
            if (payee.getFullName().getIndividual().getLast() == null) {
                logger.log(Level.SEVERE, "Не указанна фамилия получателя перевода"); 
                throw new RemittanceException("Не указанна фамилия получателя перевода", 50006, "","");
            }
            if (payee.getBirthday() == null) {
                logger.log(Level.SEVERE, "Не указанна дата рождения получателя перевода"); 
                throw new RemittanceException("Не указанна дата рождения получателя перевода", 50007, "","");
            }
            if (payee.getIdentification() == null) {
                logger.log(Level.SEVERE, "Не указанны удостоверения личности получателя перевода"); 
                throw new RemittanceException("Не указанны удостоверения личности получателя перевода", 50008, "","");
            }
            if (payee.getIdentification().getCredNumber() == null) {
                logger.log(Level.SEVERE, "Не указан номер удостоверения личности получателя перевода"); 
                throw new RemittanceException("Не указан номер удостоверения личности получателя перевода", 50008, "","");
            }
            if (payee.getPhone() == null) {
                logger.log(Level.SEVERE, "Не указан номер удостоверения личности получателя перевода"); 
                throw new RemittanceException("Не указан телефон получателя перевода", 50009, "","");
            }
            if (payee.getRegistration() == null) {
                logger.log(Level.SEVERE, "Не указан адресс регистрации получателя перевода"); 
                throw new RemittanceException("Не указан адресс регистрации получателя перевода", 50010, "","");
            }
            if (payee.getRegistration().getCountry() == null) {
                logger.log(Level.SEVERE, "Не указана страна регистрации получателя перевода"); 
                throw new RemittanceException("Не указана страна регистрации получателя перевода", 50010, "","");
            }
            if (payee.getRegistration().getCity() == null) {
                logger.log(Level.SEVERE, "Не указан город регистрации получателя перевода"); 
                throw new RemittanceException("Не указан город регистрации получателя перевода", 50010, "","");
            }
        }
        
 /**
* Функция для поиска суммы с типом type в списке сумм текущего перевода
* @param amounts список сумм:
* @XmlType(name = "Amount", propOrder = {
    "currencyID",
    "rate",
    "sum",
    "type"
}).
* @param type - тип суммы:
*    MAIN
*    ACTUAL_PAID
*    ESTIMATED_PAIDOUT
*    ACTUAL_PAIDOUT
*    PRIMARY_PAID_COMISSION

* @throws RemittanceException в случае ошибок при получении списка доступных валют.
* * code 10010: Не найдена валюта с указанным ID. Нарушение целостности данных в Юнистрим
*/

        private FundsHolder getFundsHolder(List<Amount>  amounts, AmountType type) throws RemittanceException
        {
            logger.log(Level.INFO,"getFundsHolder start");
            for (Amount i : amounts)
                 {
                     if (i.getType() == type) {
                         FundsHolder retval = new FundsHolder();
                         retval.setAmount(i.getSum());
                         try {
                             retval.setCur(GetCurrency.getCurrencyCode(i.getCurrencyID()));
                             logger.log(Level.INFO,"getCurrencyCode = " + i.getCurrencyID().toString());
                         } catch (Exception ex) {
                            logger.log(Level.SEVERE, "Error while try to take currency from UNIStream", ex);
                            throw new RemittanceException("Валюты с ID = " + i.getCurrencyID().toString() + " не найдено" , 10010, "","");
                         }
                         logger.log(Level.INFO,"getFundsHolder finish");
                         return retval;
                     }
                 }
            logger.log(Level.INFO,"getFundsHolder finish");
            return null;
        }

/**
* Функция для поиска клиента с ролью role в списке клиентов текущего перевода
* @param consumers список клиентов:
    @XmlType(name = "Consumer", propOrder = {
    "person",
    "rCompany",
    "role"}
* @param role - тип роли:
    SENDER("Sender"),
    SENDERS_REPRESENTATIVE("SendersRepresentative"),
    EXPECTED_RECEIVER("ExpectedReceiver"),
    ACTUAL_RECEIVER("ActualReceiver"),
    RECEIVERS_REPRESENTATIVE("ReceiversRepresentative"),
    RECEIVER_COMPANY("ReceiverCompany");
*   code 10022 Ошибка при получении данных о клиентах по переводу. Проверить полученные данные от Юнистрим
*/


        private FullNameTypeHolder getConsumer(List<Consumer>  consumers, ConsumerRole role) throws RemittanceException
        {
            logger.log(Level.INFO,"getConsumer start");
            for (Consumer i : consumers)
                 {
                     if (i.getRole() == role) {
                         FullNameTypeHolder retval = new FullNameTypeHolder();
                         IndividualHolder individual = new IndividualHolder();
                         if (i.getPerson().isNil()) {
                            throw new RemittanceException("Ошибка при получении данных о клиентах по переводу", 10022, "","" );
                         }
                         if (!i.getPerson().getValue().getFirstName().isNil()){
                         individual.setFirst(i.getPerson().getValue().getFirstName().getValue());}
                         if (!i.getPerson().getValue().getLastName().isNil()) {
                         individual.setLast(i.getPerson().getValue().getLastName().getValue());}
                         if (!i.getPerson().getValue().getMiddleName().isNil()) {
                         individual.setMiddle(i.getPerson().getValue().getMiddleName().getValue());}
                         retval.setIndividual(individual);
                         logger.log(Level.INFO,"getConsumer finish");
                         return retval;
                     }
                 }
            logger.log(Level.INFO,"getConsumer finish");            
            return null;
        }

/**
* Функция для обработки статусов текущего перевода
* @param transfer текущий перевод:
* @throws RemittanceException в случае:
* code 30002: Перевод выплачен другим банком
* code 30003: Перевод отозван
* code 30004: Перевод отменен
* code 30000: Перевод оплачен в текущей сессии
* 
*/
      
        private void checkTransferStatus(Transfer transfer) throws RemittanceException {
            logger.log(Level.INFO,"checkTransferStatus start");            
            if (transfer == null) {
                logger.log(Level.WARNING,"Попытка выплаты уже выданного перевода");            
                throw new RemittanceException("Перевод выплачен другим банком", 30002, "","" );
            }
            if (transfer.getStatus() == TransferStatus.CANCELLED) {
                throw new RemittanceException("Перевод отозван", 30003, "","" );
            }
            if (transfer.getStatus() == TransferStatus.REJECTED) {
                throw new RemittanceException("Перевод отменен", 30004, "","" );
            }
            if (transfer.getStatus() == TransferStatus.PAID) {
                //TODO не понятно как сказать что все ОК?
                throw new RemittanceException("Перевод оплачен", 30000, "","" );
            }
            logger.log(Level.INFO,"checkTransferStatus finish");            
        }

/**
* Функция для подготовки данных для запроса на поиск клиента
* @param PersonHolder payee получатель перевода:
* @throws RemittanceException в случае:
* code 20001: Ошибка преобразования даты
* 
*/
        private FindPersonRequestMessage getpersshot(PersonHolder payee) throws RemittanceException {
            logger.log(Level.INFO,"getpersshot start");            
            FindPersonRequestMessage fprm = new FindPersonRequestMessage();
            if (payee.getBirthday() != null) try {
                fprm.setBirthDate(CommonLib.GetGregorianDate(payee.getBirthday()));
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getBirthday()), ex);
                throw new RemittanceException("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getBirthday()), 20001, "","");                
            }
            logger.log(Level.INFO,"getpersshot parse FIO");            
            if (payee.getFullName().getIndividual().getFirst() != null) fprm.setFirstname(CommonLib.MakeString(_FirstName_QNAME, payee.getFullName().getIndividual().getFirst()));
            if (payee.getFullName().getIndividual().getLast() != null) fprm.setLastname(CommonLib.MakeString(_LastName_QNAME, payee.getFullName().getIndividual().getLast()));
            if (payee.getFullName().getIndividual().getMiddle() != null) fprm.setMiddlename(CommonLib.MakeString(_MiddleName_QNAME, payee.getFullName().getIndividual().getMiddle()));
            if (payee.getPhone()[0] != null) fprm.setPhone(CommonLib.MakeString(_Phone_QNAME,payee.getPhone()[0]));
            if (payee.getIdentification() != null) {
                logger.log(Level.INFO,"getpersshot parse Identification");            
                if (payee.getIdentification().getCredNumber() != null) fprm.setDocNumber(CommonLib.MakeString(_DocNumber_QNAME,payee.getIdentification().getCredNumber()));
                if (payee.getIdentification().getSerialNumber() != null) fprm.setDocSeries(CommonLib.MakeString(_DocSeries_QNAME,payee.getIdentification().getSerialNumber()));
                if (payee.getIdentification().getIssueDate() != null) try {
                    fprm.setDocIssueDate(CommonLib.GetGregorianDate(payee.getIdentification().getIssueDate()));
                } catch (Exception ex) {
                    logger.log(Level.SEVERE, "Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getIdentification().getIssueDate()), ex);
                    throw new RemittanceException("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getIdentification().getIssueDate()), 20001, "","");                
                }
                if (payee.getIdentification().getExpiryDate() != null) try {
                    fprm.setDocExpiryDate(CommonLib.GetGregorianDate(payee.getIdentification().getExpiryDate()));
                } catch (Exception ex) {
                    logger.log(Level.SEVERE, "Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getIdentification().getExpiryDate()), ex);
                    throw new RemittanceException("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getIdentification().getExpiryDate()), 20001, "","");                
                }
            }
            logger.log(Level.INFO,"getpersshot finish");
            return fprm;
        }

/**
* Функция для подготовки данных для запроса на создание клиента
* @param PersonHolder payee получатель перевода:
* @throws RemittanceException в случае:
* code 20001: Ошибка преобразования даты
* code 20002: Ошибка обработки адреса
* code 20003: Ошибка обработки удостоверения личности
* code 20004: Ошибка обработки номера телефона
* 
*/
        
        private Person getPerson(PersonHolder payee) throws RemittanceException{
            logger.log(Level.INFO,"getPerson start");            
            Person person =  new Person();
               if (payee.getRegistration() != null ) try {
                   person.setAddress(CommonLib.getAdressElem(payee.getRegistration()));
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "Ошибка обработки адреса:" +payee.getRegistration().toString(), ex);
                throw new RemittanceException("Ошибка обработки адреса:" +payee.getRegistration().toString() , 20002, "","");                
            }
               if (payee.getIdentification() != null) try {
                   person.setDocuments(CommonLib.getDocuments(payee.getIdentification()));
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "Ошибка обработки удостоверения личности:" +payee.getIdentification().toString(), ex);
                throw new RemittanceException("Ошибка обработки удостоверения личности:" +payee.getIdentification().toString() , 20003, "","");                
            }
               if (payee.getPhone() != null && payee.getPhone().length > 0) try {
                   person.setPhones(CommonLib.getPhones(payee.getPhone()));
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "Ошибка обработки телефона:" +payee.getPhone().toString() , ex);
                throw new RemittanceException("Ошибка обработки телефона:" +payee.getPhone().toString() , 20004, "","");                
            }
               if (payee.getBirthday() != null) try {
                   person.setBirthDate(CommonLib.GetGregorianDate(payee.getBirthday()));
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getBirthday()), ex);
                throw new RemittanceException("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getBirthday()), 20001, "","");                
            }
               if (payee.getFullName().getIndividual().getFirst() != null) person.setFirstName(CommonLib.MakeString(_FirstName_QNAME, payee.getFullName().getIndividual().getFirst()));
               if (payee.getFullName().getIndividual().getLast() != null) person.setLastName(CommonLib.MakeString(_LastName_QNAME, payee.getFullName().getIndividual().getLast()));
               if (payee.getFullName().getIndividual().getMiddle() != null) person.setMiddleName(CommonLib.MakeString(_MiddleName_QNAME, payee.getFullName().getIndividual().getMiddle()));
            logger.log(Level.INFO,"getPerson finish");    
            return person;
        }    

/**
* На вход подается набор параметров для установки соединения, таких как URL точки доступа,
* логин и пароль, идентификатор приложения или системы, идентификатор сертификата и ключ доступа 
* к хранилищу и т.д. Список необходимых параметров, которые должны быть установлены, 
* предоставляется разработчиком при передаче исходного кода реализации.
* @param init набор параметров для инициализации, такие как dbUser, dbPassword, etc.
* Ожидаемые параметры:
* APIKEY - идентификатор приложения. Выдается UNIStream при регистрации участника
* LOGIN - Идентификатор пользователя. Выдается UNIStream при регистрации участника
* PASSWORD  - Пароль пользователя. Выдается UNIStream при регистрации участника
* BANKID  - Код банка в системе. Выдается UNIStream при регистрации участника
* PARTID - Код точки выдачи. Выдается UNIStream при регистрации участника
* @throws IOException в случае проблем инициализации (например, ошибка соединения 
* с СУБД.
* 
*/
        @Override
        public void init(Properties init) throws IOException {
            try{
                    logger = Logger.getLogger(MtUnistreamAdapter.class.getName());
                    logger.setLevel(Level.ALL);
                    logger.log(Level.INFO, "init start"); 
                    KEY_USER_AUTHED_APIKEY = init.getProperty("APIKEY");
                    KEY_USER_AUTHED_LOGIN = init.getProperty("LOGIN");
                    KEY_USER_AUTHED_PASSWORD = init.getProperty("PASSWORD");
                    KEY_BANK_ID = BaseDataParser.parseInteger(init.getProperty("BANKID"));
                    KEY_PARTICIPATOR_ID = BaseDataParser.parseInteger(init.getProperty("PARTID"));
                    logger.log(Level.INFO, "init compleate"); 
            } catch (Exception ex) {
                    logger.log(Level.SEVERE, "Error while try to take properties", ex);
                    throw new UnsupportedOperationException("Not supported configuration. Check cfg info");
                }
        }

/**
* Поиск денежного перевода, доступного для выдачи. 
* Если перевод по КНП найден, но не может быть выдан (например, не тот статус), должно 
* выдаваться исключение прикладного типа для передачи информации клиенту.
*
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param approxOrgFunds
* @param approxDstFunds
* @param orgCountry
* @param dstCountry
* @return RemittanceHolder[] найденные денежные переводы. Иногда СДП могут возвращать де-факто
* один и тот же перевод в разных вариантах валют к выплате. 
	 * @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) 
	 * @throws java.io.IOException
         * code 10011 Не найдена валюта с указанным кодом
         * code 40001 Ошибка при поиске перевода
*/
        @Override
        public RemittanceHolder[] moneySearch(String mtcn, FundsHolder approxOrgFunds, FundsHolder approxDstFunds, String orgCountry, String dstCountry) throws RemittanceException, IOException {
            logger.log(Level.INFO,"moneySearch start");  
            mscheckInparam(mtcn,approxOrgFunds,approxDstFunds,orgCountry,dstCountry);
            Transfer rettransfer;
            Double mtsum = approxDstFunds.getAmount().doubleValue();
            Integer mtval;
            try {
                mtval = GetCurrency.getCurrencyID(approxDstFunds.getCur());
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "Валюты с кодом = " + approxDstFunds.getCur() + "не найдено", ex);
                throw new RemittanceException("Валюты с кодом = " + approxDstFunds.getCur() + "не найдено" , 10011, "","");
            }
            RemittanceHolder retval = new RemittanceHolder();
            RemittanceHolder[] expResult = new RemittanceHolder[1];
            FindTransferResponseMessage rm;
            rm = FindTransfer.FindTransfer(mtcn,mtsum,mtval,KEY_BANK_ID);
            CommonLib.CheckFault(rm);
            if (!rm.getTransfer().isNil())
            {rettransfer = rm.getTransfer().getValue();
                    checkTransferStatus(rettransfer);}
            else
            {
                logger.log(Level.INFO,"moneySearch finish");  
                return expResult;
            }
            retval.setDstCountry(dstCountry);
            retval.setOrgCountry(orgCountry);
            retval.setMtID(rettransfer.getID().toString());
            retval.setMtcn(rettransfer.getControlNumber().getValue());
            retval.setDstFunds(getFundsHolder(rettransfer.getAmounts().getValue().getAmount(),AmountType.ESTIMATED_PAIDOUT));
            retval.setOrgFunds(getFundsHolder(rettransfer.getAmounts().getValue().getAmount(),AmountType.MAIN));
            retval.setPayer(getConsumer(rettransfer.getConsumers().getValue().getConsumer(),ConsumerRole.SENDER));
            retval.setPayee(getConsumer(rettransfer.getConsumers().getValue().getConsumer(),ConsumerRole.EXPECTED_RECEIVER));
            expResult[0] = retval;
            logger.log(Level.INFO,"moneySearch finish");  
            return expResult;
        }

/**
* Блокирование денежного перевода, доступного для выдачи. 
* В СДП UNIStream функция не поддерживается
* @param mtID
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param payee

* @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) 
* @throws java.io.IOException
* code 30001 Операция HOLD не поддерживается Unistream
*/
        @Override
        public void moneyHold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException {
		throw new RemittanceException("Операция HOLD не поддерживается Unistream", 30001, "","");
        }
/**
* Разблокирование денежного перевода, доступного для выдачи. 
* В СДП UNIStream функция не поддерживается
* @param mtID
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param payee

* @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) 
* @throws java.io.IOException
* code 30001 Операция UNHOLD не поддерживается Unistream
*/
        @Override
        public void moneyUnhold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException {
            throw new RemittanceException("Операция UNHOLD не поддерживается Unistream", 30001, "","");
        }
/**
* Выплата денежного перевода в СДП, включая внесение всей необходимой информации по получателю. 
* Если не удается выплатить перевод должно выдаваться исключение прикладного типа. 
* последовательность работы метода:
* Получается перевод от СДП по ID
* Проверяется его статус. Если Статус перевода подходит для оплаты, то:
* Происходит поиск получателя, если не найден то создается новый клиент, если найдет или создан, 
* то клиент прописывсается в переводе как получатель и происходит оплата перевода.
* Допускается повторный вызов метода для указанного ID при разрыве связи или иных проблемах 
* @param mtID идентификатор денежного перевода в СДП. Для СДП UNIStream поле обязательно, 
* и должно соответствовать ID возвращаемого результата метода moneySearch
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП) не обрабатывается
* @param payee полная информация о получателе денежного перевода - поле обязательно
* @param docID идентификатор документа-проводки выдачи перевода в банке-получателе - не обрабатывается
* @param docDate дата документа-проводки - не обрабатывается
* @throws RemittanceException если возникли проблемы выдачи перевода в СДП.
* @throws java.io.IOException
* code 40001: Перевода с указанным ID не найдено
* code 40002: Проблемы при поиске клиента
* code 40003: Проблемы при создании клиента
* code 40004: Проблемы при оплате перевода
* code 10026: Нарушение целостности Unistream при поиске перевода по ID
* code 10023: Нарушение целостности Unistream Не заполнено поле consumer в полученном переводе
* code 10024: Нарушение целостности Unistream Не заполнено поле persons в инфомации о клиенте
* code 10025: Нарушение целостности Unistream Не заполнено поле Participators в инфомации о переводе
*/ 
        @Override
        public void moneyPay(String mtID, String mtcn, PersonHolder payee, String docID, String docDate) throws RemittanceException, IOException {
            logger.log(Level.INFO,"moneyPay start");  
            mpCheckInParam(mtID, payee);
            Transfer transfer = null;
            if (mtID != null) 
                {
                    Integer id = BaseDataParser.parseInteger(mtID);
                    GetTransferByIDResponseMessage gtrm;
                    logger.log(Level.INFO,"Получение перевода по ID");
                    gtrm = GetTransferByID.getTransferByID(id);
                    CommonLib.CheckFault(gtrm);
                    if (!gtrm.getTransfer().isNil()) {
                        transfer = gtrm.getTransfer().getValue();
                        checkTransferStatus(transfer);
                        }
                    else
                        {
                            logger.log(Level.SEVERE, "Ошибка при поиске перевода");
                            throw new RemittanceException("Ошибка при поиске перевода", 10026, "","");
                        }
                }
            else
            {
            //по уму надо искать заного но нема информации о сумме и валюте перевода и найти его не удастся. поэтому генерим exception
                logger.log(Level.SEVERE, "Не указан ID перевода");
                throw new RemittanceException("Не достаточно информации для поиска перевода",40001,"","");
            }
            Person persh = getPerson(payee);
            ObjectFactory factory = new ObjectFactory();
            if (transfer.getConsumers().isNil()){
                logger.log(Level.SEVERE, "Не заполнено поле consumer в полученном переводе");
                throw new RemittanceException("Ошибка при получении информации о переводе от Юнистрим",10023,"","");            
            }
            List<Consumer> consumers = transfer.getConsumers().getValue().getConsumer();
            FindPersonRequestMessage pershshot = getpersshot(payee);
            FindPersonResponseMessage fprm;
            logger.log(Level.INFO,"Поиск получателя перевода");
            fprm = FindPerson.FindPersonJAXb(pershshot);
            CommonLib.CheckFault(fprm);
            if (fprm.getPersons().isNil()) {
                logger.log(Level.SEVERE, "Не заполнено поле persons в инфомации о клиенте");
                throw new RemittanceException("Ошибка при получении информации о переводе от Юнистрим", 10024, "","");
            }
            List<Person> persons = fprm.getPersons().getValue().getPerson();
            Person person = null;
            if (persons.isEmpty()) 
                {
                    CreatePersonResponseMessage cprm;
                    logger.log(Level.INFO,"Создание клиента");
                    cprm = CreatePerson.CreatePersonJAXb(persh);
                    CommonLib.CheckFault(fprm);                    
                    if (cprm.getPerson().isNil()) {
                        logger.log(Level.SEVERE, "Ошибка при создании клиента");
                        throw new RemittanceException("Ошибка при создании клиента", 40003, "","");                    
                    }
                    person = cprm.getPerson().getValue();
                }
            else
                {
                    person = persons.get(1);
                }
            Consumer consumer = factory.createConsumer();
            JAXBElement<Person> xperson = factory.createPerson(person);
            consumer.setPerson(xperson);
            consumer.setRole(ConsumerRole.ACTUAL_RECEIVER);
            consumers.add(consumer);
  //TODO Проверить данные о пункте выдачи
            Participator part = factory.createParticipator();
            part.setID(KEY_PARTICIPATOR_ID);
            part.setRole(ParticipatorRole.ACTUAL_RECEIVER_POS);
            if (transfer.getParticipators().isNil()){
                logger.log(Level.SEVERE, "Не заполнено поле Participators в инфомации о переводе");
                throw new RemittanceException("Ошибка при получении информации о переводе от Юнистрим", 10025, "","");
            }
            transfer.getParticipators().getValue().getParticipator().add(part);
            PayoutTransferResponseMessage retval;
            logger.log(Level.INFO,"Оплата перевода");
            retval = PayOutTransfer.payoutTransfer(transfer);
            CommonLib.printXml(retval);
            CommonLib.CheckFault(fprm);
            if (retval.getTransfer().isNil())
            {
                logger.log(Level.SEVERE, "Ошибка при оплате перевода");
                throw new RemittanceException("Ошибка при оплате перевода", 40004, "",""); 
            }
            transfer= retval.getTransfer().getValue();
            logger.log(Level.INFO,"moneyPay finish");
            checkTransferStatus(transfer);
        }
}
