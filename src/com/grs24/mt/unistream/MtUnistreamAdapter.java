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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * @author Date
 * Класс реализует интерфейс MtAdapter<br>
 * Для интеграции с СДП Unistream<br>
 * В указанной СДП hold и unhold функции не реализуются<br>
 * Для начала работы необходимо инициировать вызвав метод init данного класса и передав ему настройки<br>
 * Метод moneySearch используется для поиска указанного перевода MtUnistreamAdapter.moneySearch <br>
 * @see MtUnistreamAdapter#moneySearch
 * Метод moneyPay используется для выплаты предварительно найденного перевода MtUnistreamAdapter.moneyPay <br>
 * @see MtUnistreamAdapter#moneyPay
 * При выплате перевода необходимо указывать ID перевода найденого предварительно через MtUnistreamAdapter.moneySearch<br>
 * @see MtUnistreamAdapter#moneySearch
 * 
 **/
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
        /** Свойство APIKEY для автризационного заголовка**/
        public static String KEY_USER_AUTHED_APIKEY;// = "1wwteyFGFew624";
        /** Свойство LOGIN для автризационного заголовка**/
	public static String KEY_USER_AUTHED_LOGIN;// = "g2.grstwentyfour.rus";
        /** Свойство PASSWORD для автризационного заголовка**/
	public static String KEY_USER_AUTHED_PASSWORD;// = "7!LrO7i7";
        /** Свойство BANKID для автризационного заголовка**/
        public static Integer KEY_BANK_ID;// = 383589;
        /** Свойство PARTID для автризационного заголовка**/
        public static Integer KEY_PARTICIPATOR_ID;
        /** Свойство таймаут ожидания ответа сервера**/
        public static Integer KEY_SERVER_REQUEST_TUMEOUT;
        /** Свойство таймаут ожидания соединения с сервером**/
        public static Integer KEY_SERVER_CONNECT_TUMEOUT;
        /** Свойство пароль доступа к хранилищу ключей**/
        public static String KEY_KEYSTORE_PASSWORD;
        /** Свойство тип хранилища ключей PRCS12**/
        public static String KEY_KEYSTORE_TYPE;
        /** Свойство пароль доступа к клдючу в хранилищу ключей, по умолчанию равен @see MtUnistreamAdapter#KEY_KEYSTORE_PASSWORD **/
        public static String KEY_KEY_PASSWORD;
        /** Свойство строка в base64 с хранилищем ключей в формате PKCS12**/
        public static String KEY_KEYSTORE_PKCS12_BODY;
        /** Свойство строка в base64 с доверенным хранилищем в формате JKS**/
        public static String KEY_TRUSTSTORE_JKS_BODY;
        /** Свойство пароль доступа к доверенному хранилищу ключей**/
        public static String KEY_TRUSTSTORE_PASSWORD;
        /** Свойство тип доверенного хранилища ключей JKS**/
        public static String KEY_TRUSTSTORE_TYPE;
        
        private static final Logger logger = LoggerFactory.getLogger(MtUnistreamAdapter.class);
        private final String PROPERTY_KEY_SERVER_REQUEST_TUMEOUT = "SERVER.REQUEST_TIMEOUT";
        private final String PROPERTY_KEY_SERVER_CONNECT_TUMEOUT = "SERVER.CONNECT_TIMEOUT";
        private final String PROPERTY_KEY_USER_AUTHED_APIKEY = "APIKEY";
        private final String PROPERTY_KEY_USER_AUTHED_LOGIN = "LOGIN";
        private final String PROPERTY_KEY_USER_AUTHED_PASSWORD = "PASSWORD";
        private final String PROPERTY_KEY_JKS_KEYSTORE_KEY = "KEYSTORE.PKCS12";
        private final String PROPERTY_KEY_JKS_KEYSTORE_PASSWORD = "KEYSTORE.PASSWORD";
        //private final String PROPERTY_KEY_JKS_KEYSTORE_TYPE = "KEYSTORE.TYPE";
        private final String PROPERTY_KEY_JKS_KEY_PASSWORD = "KEY.PASSWORD";
        private final String PROPERTY_KEY_JKS_TRUSTSTORE_KEY = "TRUSTSTORE.JKS";
        private final String PROPERTY_KEY_JKS_TRUSTSTORE_PASSWORD = "TRUSTSTORE.PASSWORD";
        //private final String PROPERTY_KEY_JKS_TRUSTSTORE_TYPE = "TRUSTSTORE.TYPE";
        private final String PROPERTY_KEY_BANK_ID = "BANKID";
        private final String PROPERTY_KEY_PART_ID = "PARTID";
        private final Integer DEFAULT_REQUEST_TIMEOUT = 3000;
        private final Integer DEFAULT_CONNECT_TIMEOUT = 1000;


 /**
* Проверка входных параметров для поиска перевода 
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param approxOrgFunds
* @param approxDstFunds
* @param orgCountry
* @param dstCountry
* @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) 
*/ 

        private void mscheckInparam(String mtcn, FundsHolder approxOrgFunds, FundsHolder approxDstFunds, String orgCountry, String dstCountry) throws RemittanceException
        {
            if (mtcn == null) {
                    logger.error("Не указан номер перевода");
                    throw new RemittanceException("Не указан номер перевода", 50001, "","");
                }
            if (approxDstFunds == null) {
                    logger.error("Не указаны валюта и сумма перевода");
                    throw new RemittanceException("Не указаны валюта и сумма перевода", 50002, "","");
                }
            if (approxDstFunds.getAmount() == null) {
                    logger.error("Не указана сумма перевода"); 
                    throw new RemittanceException("Не указана сумма перевода", 50002, "","");
                }
            if (approxDstFunds.getAmount().floatValue() < 0) {
                    logger.error("Сумма перевода меньше нуля"); 
                    throw new RemittanceException("Cумма перевода меньше нуля", 50003, "","");            
            }
            if (approxDstFunds.getCur() == null)    {
                    logger.error("Не указана валюта перевода"); 
                    throw new RemittanceException("Не валюта перевода", 50002, "","");
                }
            if (approxDstFunds.getCur().length() != 3)    {
                    logger.error("Не верно указан код валюты перевода"); 
                    throw new RemittanceException("Не верно указан код валюты перевода", 50011, "","");
                }
        }

/**
* Проверка входных параметров для оплаты перевода 
* @param mtID ID перевода
* @param payee получатель
* @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) 
*/ 
        private void mpCheckInParam(String mtID,PersonHolder payee)  throws RemittanceException {
            if (mtID == null) {
                logger.error( "Не указан ID перевода"); 
                throw new RemittanceException("Не указан ID перевода", 50004, "","");
            }
            if (payee == null) {
                logger.error("Не указан получатель перевода"); 
                throw new RemittanceException("Не указан получатель перевода", 50005, "","");
            }
            if (payee.getFullName() == null) {
                logger.error("Не указанны ФИО получателя перевода"); 
                throw new RemittanceException("Не указанны ФИО получателя перевода", 50006, "","");
            }
            if (payee.getFullName().getIndividual() == null) {
                logger.error("Не указанны ФИО получателя перевода"); 
                throw new RemittanceException("Не указанны ФИО получателя перевода", 50006, "","");
            }
            if (payee.getFullName().getIndividual().getFirst() == null) {
                logger.error("Не указанно имя получателя перевода"); 
                throw new RemittanceException("Не указанно имя получателя перевода", 50006, "","");
            }
            if (payee.getFullName().getIndividual().getLast() == null) {
                logger.error("Не указанна фамилия получателя перевода"); 
                throw new RemittanceException("Не указанна фамилия получателя перевода", 50006, "","");
            }
            if (payee.getBirthday() == null) {
                logger.error("Не указанна дата рождения получателя перевода"); 
                throw new RemittanceException("Не указанна дата рождения получателя перевода", 50007, "","");
            }
            if (payee.getIdentification() == null) {
                logger.error("Не указанны удостоверения личности получателя перевода"); 
                throw new RemittanceException("Не указанны удостоверения личности получателя перевода", 50008, "","");
            }
            if (payee.getIdentification().getCredNumber() == null) {
                logger.error("Не указан номер удостоверения личности получателя перевода"); 
                throw new RemittanceException("Не указан номер удостоверения личности получателя перевода", 50008, "","");
            }
            if (payee.getPhone() == null) {
                logger.error("Не указан номер удостоверения личности получателя перевода"); 
                throw new RemittanceException("Не указан телефон получателя перевода", 50009, "","");
            }
            if (payee.getRegistration() == null) {
                logger.error("Не указан адресс регистрации получателя перевода"); 
                throw new RemittanceException("Не указан адресс регистрации получателя перевода", 50010, "","");
            }
            if (payee.getRegistration().getCountry() == null) {
                logger.error("Не указана страна регистрации получателя перевода"); 
                throw new RemittanceException("Не указана страна регистрации получателя перевода", 50010, "","");
            }
            if (payee.getRegistration().getCity() == null) {
                logger.error("Не указан город регистрации получателя перевода"); 
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
*/

        private FundsHolder getFundsHolder(List<Amount>  amounts, AmountType type) throws RemittanceException
        {
            logger.debug("getFundsHolder start");
            for (Amount i : amounts)
                 {
                     if (i.getType() == type) {
                         FundsHolder retval = new FundsHolder();
                         retval.setAmount(i.getSum());
                         try {
                             retval.setCur(GetCurrency.getCurrencyCode(i.getCurrencyID()));
                             logger.debug("getCurrencyCode = " + i.getCurrencyID().toString());
                         } catch (Exception ex) {
                            logger.error("Error while try to take currency from UNIStream", ex);
                            throw new RemittanceException("Валюты с ID = " + i.getCurrencyID().toString() + " не найдено" , 10010, "","");
                         }
                         logger.debug("getFundsHolder finish");
                         return retval;
                     }
                 }
            logger.debug("getFundsHolder finish");
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
*/


        private FullNameTypeHolder getConsumer(List<Consumer>  consumers, ConsumerRole role) throws RemittanceException
        {
            logger.debug("getConsumer start");
            for (Consumer i : consumers)
                 {
                     if (i.getRole() == role) {
                         FullNameTypeHolder retval = new FullNameTypeHolder();
                         IndividualHolder individual = new IndividualHolder();
                         if (i.getPerson().isNil()) {
                            throw new RemittanceException("Ошибка при получении данных о клиентах по переводу", 10022, "","" );
                         }
                         Person pers = i.getPerson().getValue();
                         String firstName;
                         String lastName;
                         String middleName;
                         
                         if (!pers.getFirstNameLat().isNil()) firstName = pers.getFirstNameLat().getValue();
                         else  firstName = pers.getFirstName().getValue();

                         if (!pers.getLastNameLat().isNil()) lastName = pers.getLastNameLat().getValue();
                         else  lastName = pers.getLastName().getValue();
                         
                         if (!pers.getMiddleNameLat().isNil()) middleName = pers.getMiddleNameLat().getValue();
                         else  middleName = pers.getMiddleName().getValue();

                         
                         individual.setFirst(firstName);
                         individual.setLast(lastName);
                         individual.setMiddle(middleName);
                      
                         retval.setIndividual(individual);
                         logger.debug("getConsumer finish");
                         return retval;
                     }
                 }
            logger.debug("getConsumer finish");            
            return null;
        }

/**
* Функция для обработки статусов текущего перевода
* @param transfer текущий перевод:
* @throws RemittanceException в случае:
*  
*/
      
        private void checkTransferStatus(Transfer transfer) throws RemittanceException {
            logger.debug("checkTransferStatus start");            
            if (transfer == null) {
                logger.warn("Попытка выплаты уже выданного перевода");
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
            logger.debug("checkTransferStatus finish");            
        }

/**
* Функция для подготовки данных для запроса на поиск клиента
* @param PersonHolder payee получатель перевода:
* @throws RemittanceException в случае:
* 
*/
        private FindPersonRequestMessage getpersshot(PersonHolder payee) throws RemittanceException {
            logger.debug("getpersshot start");            
            FindPersonRequestMessage fprm = new FindPersonRequestMessage();
            if (payee.getBirthday() != null) try {
                fprm.setBirthDate(CommonLib.GetGregorianDate(payee.getBirthday()));
            } catch (Exception ex) {
                logger.error("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getBirthday()), ex);
                throw new RemittanceException("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getBirthday()), 20001, "","");                
            }
            logger.debug("getpersshot parse FIO");            
            if (payee.getFullName().getIndividual().getFirst() != null) fprm.setFirstname(CommonLib.MakeString(_FirstName_QNAME, payee.getFullName().getIndividual().getFirst()));
            if (payee.getFullName().getIndividual().getLast() != null) fprm.setLastname(CommonLib.MakeString(_LastName_QNAME, payee.getFullName().getIndividual().getLast()));
            if (payee.getFullName().getIndividual().getMiddle() != null) fprm.setMiddlename(CommonLib.MakeString(_MiddleName_QNAME, payee.getFullName().getIndividual().getMiddle()));
            if (payee.getPhone()[0] != null) fprm.setPhone(CommonLib.MakeString(_Phone_QNAME,payee.getPhone()[0]));
            if (payee.getIdentification() != null) {
                logger.debug("getpersshot parse Identification");            
                if (payee.getIdentification().getCredNumber() != null) fprm.setDocNumber(CommonLib.MakeString(_DocNumber_QNAME,payee.getIdentification().getCredNumber()));
                if (payee.getIdentification().getSerialNumber() != null) fprm.setDocSeries(CommonLib.MakeString(_DocSeries_QNAME,payee.getIdentification().getSerialNumber()));
                if (payee.getIdentification().getIssueDate() != null) try {
                    fprm.setDocIssueDate(CommonLib.GetGregorianDate(payee.getIdentification().getIssueDate()));
                } catch (Exception ex) {
                    logger.error("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getIdentification().getIssueDate()), ex);
                    throw new RemittanceException("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getIdentification().getIssueDate()), 20001, "","");                
                }
                if (payee.getIdentification().getExpiryDate() != null) try {
                    fprm.setDocExpiryDate(CommonLib.GetGregorianDate(payee.getIdentification().getExpiryDate()));
                } catch (Exception ex) {
                    logger.error("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getIdentification().getExpiryDate()), ex);
                    throw new RemittanceException("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getIdentification().getExpiryDate()), 20001, "","");                
                }
            }
            logger.debug("getpersshot finish");
            return fprm;
        }

/**
* Функция для подготовки данных для запроса на создание клиента
* @param PersonHolder payee получатель перевода:
* @throws RemittanceException в случае:
* 
*/
        
        private Person getPerson(PersonHolder payee) throws RemittanceException{
            logger.debug("getPerson start");            
            Person person =  new Person();
               if (payee.getRegistration() != null ) try {
                   person.setAddress(CommonLib.getAdressElem(payee.getRegistration()));
            } catch (Exception ex) {
                logger.error("Ошибка обработки адреса:" +payee.getRegistration().toString(), ex);
                throw new RemittanceException("Ошибка обработки адреса:" +payee.getRegistration().toString() , 20002, "","");                
            }
               if (payee.getIdentification() != null) try {
                   person.setDocuments(CommonLib.getDocuments(payee.getIdentification()));
            } catch (Exception ex) {
                logger.error("Ошибка обработки удостоверения личности:" +payee.getIdentification().toString(), ex);
                throw new RemittanceException("Ошибка обработки удостоверения личности:" +payee.getIdentification().toString() , 20003, "","");                
            }
               if (payee.getPhone() != null && payee.getPhone().length > 0) try {
                   person.setPhones(CommonLib.getPhones(payee.getPhone()));
            } catch (Exception ex) {
                logger.error("Ошибка обработки телефона:" +payee.getPhone().toString() , ex);
                throw new RemittanceException("Ошибка обработки телефона:" +payee.getPhone().toString() , 20004, "","");                
            }
               if (payee.getBirthday() != null) try {
                   person.setBirthDate(CommonLib.GetGregorianDate(payee.getBirthday()));
            } catch (Exception ex) {
                logger.error("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getBirthday()), ex);
                throw new RemittanceException("Ошибка преобразования даты:" + DateTimeUtils.formatDate(payee.getBirthday()), 20001, "","");                
            }
               if (payee.getFullName().getIndividual().getFirst() != null) person.setFirstName(CommonLib.MakeString(_FirstName_QNAME, payee.getFullName().getIndividual().getFirst()));
               if (payee.getFullName().getIndividual().getLast() != null) person.setLastName(CommonLib.MakeString(_LastName_QNAME, payee.getFullName().getIndividual().getLast()));
               if (payee.getFullName().getIndividual().getMiddle() != null) person.setMiddleName(CommonLib.MakeString(_MiddleName_QNAME, payee.getFullName().getIndividual().getMiddle()));
            logger.debug("getPerson finish");    
            return person;
        }    

/**
* На вход подается набор параметров для установки соединения, таких как URL точки доступа,
* логин и пароль, идентификатор приложения или системы, идентификатор сертификата и ключ доступа 
* к хранилищу и т.д. Список необходимых параметров, которые должны быть установлены, 
* предоставляется разработчиком при передаче исходного кода реализации.
* @param init набор параметров для инициализации, такие как dbUser, dbPassword, etc.
* <p>Ожидаемые параметры:</p>
* APIKEY - идентификатор приложения. Выдается UNIStream при регистрации участника<br>
* LOGIN - Идентификатор пользователя. Выдается UNIStream при регистрации участника<br>
* PASSWORD  - Пароль пользователя. Выдается UNIStream при регистрации участника<br>
* BANKID  - Код банка в системе. Выдается UNIStream при регистрации участника<br>
* PARTID - Код точки выдачи. Выдается UNIStream при регистрации участника<br>
* SERVER.REQUEST_TIMEOUT - Таймаут ожидания ответа на запрос от сервера в милисекундах<br>
* SERVER.CONNECT_TIMEOUT - Таймаут ожидания установки соединения с сервером в милисекундах<br>
* KEYSTORE.PKCS12 - base64 строка представляющая байты хранилища секретного ключа и сертификатов в pkcs#12 формате<br>
* KEYSTORE.PASSWORD - пароль к хранилищу<br>
* KEY.PASSWORD - пароль приватного ключа, в случае если не задан берет значение из  KEYSTORE.PASSWORD<br>
* TRUSTSTORE.JKS - base64 строка представляющая байты хранилища доверенных сертификатов в JKS формате<br>
* TRUSTSTORE.PASSWORD - пароль хранилища доверенных сертификатов<br>
* @throws IOException в случае проблем инициализации (например, ошибка соединения 
* с СУБД.)
* 
*/
        @Override
        public void init(Properties init) throws IOException {
            try{
                    logger.debug( "init start"); 
                    String val;
                    KEY_USER_AUTHED_APIKEY = init.getProperty(PROPERTY_KEY_USER_AUTHED_APIKEY, String.valueOf(PROPERTY_KEY_USER_AUTHED_APIKEY));
                    KEY_USER_AUTHED_LOGIN = init.getProperty(PROPERTY_KEY_USER_AUTHED_LOGIN, String.valueOf(PROPERTY_KEY_USER_AUTHED_LOGIN));
                    KEY_USER_AUTHED_PASSWORD = init.getProperty(PROPERTY_KEY_USER_AUTHED_PASSWORD,String.valueOf(PROPERTY_KEY_USER_AUTHED_PASSWORD));

                    val = init.getProperty(PROPERTY_KEY_JKS_KEYSTORE_KEY, String.valueOf(PROPERTY_KEY_JKS_KEYSTORE_KEY));
                    KEY_KEYSTORE_PKCS12_BODY = val;
                    KEY_KEYSTORE_PASSWORD = init.getProperty(PROPERTY_KEY_JKS_KEYSTORE_PASSWORD, String.valueOf(PROPERTY_KEY_JKS_KEYSTORE_PASSWORD));
                    if (init.containsKey(PROPERTY_KEY_JKS_KEY_PASSWORD)) KEY_KEY_PASSWORD = init.getProperty(PROPERTY_KEY_JKS_KEY_PASSWORD, String.valueOf(PROPERTY_KEY_JKS_KEY_PASSWORD));
                    else KEY_KEY_PASSWORD = KEY_KEYSTORE_PASSWORD;
                    //KEY_KEYSTORE_TYPE = init.getProperty(PROPERTY_KEY_JKS_KEYSTORE_TYPE, String.valueOf(PROPERTY_KEY_JKS_KEYSTORE_TYPE));
                    //if (KEY_KEYSTORE_TYPE.isEmpty()) 
                    KEY_KEYSTORE_TYPE = "PKCS12";
                    
                    val = init.getProperty(PROPERTY_KEY_JKS_TRUSTSTORE_KEY, String.valueOf(PROPERTY_KEY_JKS_TRUSTSTORE_KEY));
                    KEY_TRUSTSTORE_JKS_BODY = val;
                    KEY_TRUSTSTORE_PASSWORD = init.getProperty(PROPERTY_KEY_JKS_TRUSTSTORE_PASSWORD, String.valueOf(PROPERTY_KEY_JKS_TRUSTSTORE_PASSWORD));
                    //KEY_TRUSTSTORE_TYPE = init.getProperty(PROPERTY_KEY_JKS_TRUSTSTORE_TYPE, String.valueOf(PROPERTY_KEY_JKS_TRUSTSTORE_TYPE));
                    //if (KEY_TRUSTSTORE_TYPE.isEmpty()) 
                    KEY_TRUSTSTORE_TYPE = "JKS";
                    
                    val = init.getProperty(PROPERTY_KEY_BANK_ID, String.valueOf(PROPERTY_KEY_BANK_ID));
                    
                    try{
                            KEY_BANK_ID = Integer.parseInt(val);
                        }
                    catch(NumberFormatException e)
                        {
                            throw new UnsupportedOperationException("Not correct value of BANKID");
                        }
                    val = init.getProperty(PROPERTY_KEY_PART_ID, String.valueOf(PROPERTY_KEY_PART_ID));
                    try{
                            KEY_PARTICIPATOR_ID = Integer.parseInt(val);
                        }
                    catch(NumberFormatException e)
                        {
                            KEY_PARTICIPATOR_ID = KEY_BANK_ID;
                        }
                    val = init.getProperty(PROPERTY_KEY_SERVER_REQUEST_TUMEOUT, String.valueOf(PROPERTY_KEY_SERVER_REQUEST_TUMEOUT));
                    try{
                            KEY_SERVER_REQUEST_TUMEOUT = Integer.parseInt(val);
                        }
                    catch(NumberFormatException e)
                        {
                            KEY_SERVER_REQUEST_TUMEOUT = DEFAULT_REQUEST_TIMEOUT;
                        }

                    val = init.getProperty(PROPERTY_KEY_SERVER_CONNECT_TUMEOUT, String.valueOf(PROPERTY_KEY_SERVER_CONNECT_TUMEOUT));
                    try{
                            KEY_SERVER_CONNECT_TUMEOUT = Integer.parseInt(val);
                        }
                    catch(NumberFormatException e)
                        {
                            KEY_SERVER_CONNECT_TUMEOUT = DEFAULT_CONNECT_TIMEOUT;
                        }

                                logger.debug( "init compleate"); 
                } catch (UnsupportedOperationException ex) {
                    logger.error("Error while try to take properties", ex);
                    throw new UnsupportedOperationException("Not supported configuration. Check cfg info");
            }
        }

/**
* Поиск денежного перевода, доступного для выдачи. 
* Если перевод по КНП найден, но не может быть выдан (например, не тот статус), должно 
* выдаваться исключение прикладного типа для передачи информации клиенту.
*
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param approxOrgFunds - 
* @param approxDstFunds
* @param orgCountry
* @param dstCountry
* @return RemittanceHolder[] найденные денежные переводы. Иногда СДП могут возвращать де-факто
* один и тот же перевод в разных вариантах валют к выплате. 
* @throws java.io.IOException в случае ошибки соедиения или обращения к файловой системе
* @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) <br>
* <p> Ошибки при валидаци входных параметров</p>
* code 10010: В справочнике валют не найдена валюта с указанным ID. Нарушение целостности данных в Юнистрим<br>
* code 10011: В справочнике валют не найдена валюта с указанным кодом <br>
* code 10022: Ошибка при получении данных о клиентах по переводу. Нарушение целостности данных в Юнистрим<br>
* code 30002: Перевод выплачен другим банком<br>
* code 30003: Перевод отозван<br>
* code 30004: Перевод отменен<br>
* code 50001: Не указан номер перевода<br>
* code 50002: Не указаны валюта и сумма перевода<br>
* code 50003: Cумма перевода меньше нуля<br>
* code 50011: Не верно указан код валюты перевода<br>

*/
        @Override
        public RemittanceHolder[] moneySearch(String mtcn, FundsHolder approxOrgFunds, FundsHolder approxDstFunds, String orgCountry, String dstCountry) throws RemittanceException, IOException {
            logger.debug("moneySearch start");  
            mscheckInparam(mtcn,approxOrgFunds,approxDstFunds,orgCountry,dstCountry);
            Transfer rettransfer;
            Double mtsum = approxDstFunds.getAmount().doubleValue();
            Integer mtval;
            mtval = GetCurrency.getCurrencyID(approxDstFunds.getCur());
            if (mtval==null) {
                logger.error("Ошибка при определении валюты перевода");
                throw new RemittanceException("Не найдена валюта с кодом = " + approxDstFunds.getCur(), 10011,"","");
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
                logger.debug("moneySearch finish");  
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
            //retval.setOrgCountry(getCountry(rettransfer, ParticipatorRole.SENDER_POS));
            //retval.setDstCountry(getCountry(rettransfer, ParticipatorRole.EXPECTED_RECEIVER_POS));
            expResult[0] = retval;
            logger.debug("moneySearch finish");  
            return expResult;
        }

/**
* Блокирование денежного перевода, доступного для выдачи. 
* В СДП UNIStream функция не поддерживается
* @param mtID
* @param mtcn Money Transfer Control Number, Контрольный Номер Перевода (КНП)
* @param payee
* @throws java.io.IOException
* @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса)<br>
* code 30001 Операция HOLD не поддерживается Unistream<br>
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
* @throws java.io.IOException
* @throws com.grs24.mt.RemittanceException в случае провала поиска (например, неверный формат запроса) <br>
* code 30001 Операция UNHOLD не поддерживается Unistream<br>
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
* @throws java.io.IOException
* @throws RemittanceException если возникли проблемы выдачи перевода в СДП.
* <p> Нарушение целостности данных ответов от UniStream, необходимо проверить валидность автогенерированных пакетов</p>
* code 10023: Нарушение целостности Unistream Не заполнено поле consumer в полученном переводе<br>
* code 10024: Нарушение целостности Unistream Не заполнено поле persons в инфомации о клиенте<br>
* code 10025: Нарушение целостности Unistream Не заполнено поле Participators в инфомации о переводе<br>
* code 10026: Нарушение целостности Unistream при поиске перевода по ID<br>
* code 40002: Нарушение целостности Unistream. Проблемы при поиске клиента<br>
* code 40003: Нарушение целостности Unistream. Проблемы при создании клиента<br>
* code 40004: Нарушение целостности Unistream. Проблемы при оплате перевода<br>
* <p> Ошибки при генерации XML обектов обмена, необходимо проверить валидность автогенерированных пакетов </p>
* code 20001: Ошибка приведения даты к Грегориансокму календарю<br>
* code 20002: Ошибка при обработки адреса клиента<br>
* code 20003: Ошибка при обработки удостоверения личности<br>
* code 20004: Ошибка при обработки номера телефона<br>
* <p> Контроль состояния перевода</p>
* code 30000: Перевод оплачен в текущей сессии<br>
* code 30002: Перевод выплачен другим банком<br>
* code 30003: Перевод отозван<br>
* code 30004: Перевод отменен<br>
* <p> Ошибки при валидаци входных параметров</p>
* code 50004: Не указан ID перевода<br>
* code 50005: Не указан получатель перевода<br>
* code 50006: Не указаны ФИО получателя перевода<br>
* code 50007: Не указанна дата рождения получателя перевода<br>
* code 50008: Не указанны реквизиты удостоверения личности получателя перевода<br>
* code 50009: Не указан телефон получателя перевода<br>
* code 50010: Не указан адресс регистрации получателя перевода<br>
*/ 
        @Override
        public void moneyPay(String mtID, String mtcn, PersonHolder payee, String docID, String docDate) throws RemittanceException, IOException {
            logger.debug("moneyPay start");  
            mpCheckInParam(mtID, payee);
            Transfer transfer = null;
            Integer id = BaseDataParser.parseInteger(mtID);
            GetTransferByIDResponseMessage gtrm;
            logger.debug("Получение перевода по ID");
            gtrm = GetTransferByID.getTransferByID(id);
            CommonLib.CheckFault(gtrm);
            if (!gtrm.getTransfer().isNil()) {
                transfer = gtrm.getTransfer().getValue();
                checkTransferStatus(transfer);
                }
            else
                {
                    logger.error("Ошибка при поиске перевода");
                    throw new RemittanceException("Ошибка при поиске перевода", 10026, "","");
                }

            Person persh = getPerson(payee);
            ObjectFactory factory = new ObjectFactory();
            if (transfer.getConsumers().isNil()){
                logger.error("Не заполнено поле consumer в полученном переводе");
                throw new RemittanceException("Ошибка при получении информации о переводе от Юнистрим",10023,"","");            
            }
            List<Consumer> consumers = transfer.getConsumers().getValue().getConsumer();
            FindPersonRequestMessage pershshot = getpersshot(payee);
            FindPersonResponseMessage fprm;
            logger.debug("Поиск получателя перевода");
            fprm = FindPerson.FindPersonJAXb(pershshot);
            CommonLib.CheckFault(fprm);
            if (fprm.getPersons().isNil()) {
                logger.error("Не заполнено поле persons в инфомации о клиенте");
                throw new RemittanceException("Ошибка при получении информации о переводе от Юнистрим", 10024, "","");
            }
            List<Person> persons = fprm.getPersons().getValue().getPerson();
            Person person = null;
            if (persons.isEmpty()) 
                {
                    CreatePersonResponseMessage cprm;
                    logger.debug("Создание клиента");
                    cprm = CreatePerson.CreatePersonJAXb(persh);
                    CommonLib.CheckFault(cprm);                    
                    if (cprm.getPerson().isNil()) {
                        logger.error("Ошибка при создании клиента");
                        throw new RemittanceException("Ошибка при создании клиента", 40003, "","");                    
                    }
                    person = cprm.getPerson().getValue();
                }
            else
                {
                    person = persons.get(0);
                }
            Consumer consumer = factory.createConsumer();
            JAXBElement<Person> xperson = factory.createPerson(person);
            consumer.setPerson(xperson);
            consumer.setRole(ConsumerRole.ACTUAL_RECEIVER);
            consumers.add(consumer);
            Participator part = factory.createParticipator();
            part.setID(KEY_PARTICIPATOR_ID);
            part.setRole(ParticipatorRole.ACTUAL_RECEIVER_POS);
            if (transfer.getParticipators().isNil()){
                logger.error("Не заполнено поле Participators в инфомации о переводе");
                throw new RemittanceException("Ошибка при получении информации о переводе от Юнистрим", 10025, "","");
            }
            transfer.getParticipators().getValue().getParticipator().add(part);
            PayoutTransferResponseMessage retval;
            logger.debug("Оплата перевода");
            retval = PayOutTransfer.payoutTransfer(transfer);
            CommonLib.CheckFault(retval);
            if (retval.getTransfer().isNil())
            {
                logger.error("Ошибка при оплате перевода");
                throw new RemittanceException("Ошибка при оплате перевода", 40004, "",""); 
            }
            transfer= retval.getTransfer().getValue();
            logger.debug("moneyPay finish");
            checkTransferStatus(transfer);
        }
}
