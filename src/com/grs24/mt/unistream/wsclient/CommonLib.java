/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.msg.AddressHolder;
import com.grs24.msg.CredentialsHolder;
import com.grs24.mt.RemittanceException;
import com.grs24.mt.unistream.Constants;
import com.unistream.test.wcflib.IWebService;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfDocument;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfPhone;
import org.datacontract.schemas._2004._07.wcfservicelib.Document;
import org.datacontract.schemas._2004._07.wcfservicelib.Fault;
import org.datacontract.schemas._2004._07.wcfservicelib.PersonAddress;
import org.datacontract.schemas._2004._07.wcfservicelib.Phone;
import org.datacontract.schemas._2004._07.wcfservicelib.PhoneType;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory;
import org.datacontract.schemas._2004._07.wcfservicelib.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Dale
 */
public class CommonLib {
    private final Logger logger = LoggerFactory.getLogger(CommonLib.class);

/**
* Обработка отрицательного ответа от СДП <br>
* Проверяется значение поля Fault в ответе и генерируется exception в котором:<br>
* code - номер ошибки в Unistream <br>
* stan - код ошибки в Unistream <br>
* mtError - расшифровка ошибки в Unistream <br>
* @param response - ответ сервера<br>
* @param logger1 - логгер в который писать отладку<br>
* @param stan - System Trace Audit Number (Stan) of the request.
     * Идентификатор либо запроса, либо перевода. Использование MTCN 
     * (контрльного номера) в качестве такового НЕ РЕКОМЕНДУЕТСЯ ввиду нарушения
     * безопасности в случае логгирования.<br>
* @throws RemittanceException в случае провала выполение
* @see Fault
*/ 
    public void checkFault(WsResponse response, Logger logger1, String stan) throws RemittanceException {
        if(!response.getFault().isNil())
        {
            if (logger1 == null) logger1=logger;
            logger1.error("checkFault: Unistream returned error:", response.getFault().getValue().getMessage().getValue());
            Fault fault = response.getFault().getValue();
            int code = 0;
            //String stan = null;
            String mtError = null;
            if (fault.getCode() != null) 
                {
                    //stan = fault.getCode().value();
                    code = fault.getCode().ordinal();
                    mtError = fault.getCode().value() +":";
                }
            if (!fault.getMessage().isNil()) mtError = mtError + fault.getMessage().getValue();
            throw new RemittanceException("checkFault: Unistream returned error", code, stan, mtError);
        }
    }  

/**
* Формирование авторизационного заголовка запросов
* Используются настройки:
     * @param appKey - APIKEY
     * @param userName - LOGIN
     * @param userPassword - PASSWORD
* @return заголовок
*/ 

    public JAXBElement<AuthenticationHeader> makeAuthHead(String appKey, String userName, String userPassword)
        {
            if (logger.isDebugEnabled()) {
                logger.debug("makeAuthHead: <- start" );
            }
            
            ObjectFactory factory = new ObjectFactory();
            AuthenticationHeader ah = factory.createAuthenticationHeader();
            JAXBElement<AuthenticationHeader> ahh = factory.createWsRequestAuthenticationHeader(ah);
            ah.setAppKey(factory.createAuthenticationHeaderAppKey(appKey));
            ah.setUsername(factory.createAuthenticationHeaderUsername(userName));
            ah.setPassword(factory.createAuthenticationHeaderPassword(userPassword));
            if (logger.isDebugEnabled()) {
                logger.debug("makeAuthHead: -> ahh = " + ahh.toString() );
            }
            return ahh;
        }

/**
* Формирование простого строкового JAXBElement
* @param qname Квалификатор
* @param value Значение 
* @return строкового JAXBElement
* @see QName
*/ 
    
    public JAXBElement<String> makeString(QName qname, String value)
        {
            return new JAXBElement<String>(qname, String.class, null, value);
        }

/**
* Формирование JAXBElement массива удостоверений личности<br>
* Заполняется транспортный объект для хранения реквизитов удостоверений личности приводя их к ныжным типам<br>
* @param credholder Данные удостоверения личности клиента
* @return массив JAXBElement 
* @throws Exception в случае провала выполение
* @see ArrayOfDocument
* @see CredentialsHolder
*/ 
    public JAXBElement<ArrayOfDocument> getDocuments(CredentialsHolder credholder) throws Exception {
        QName _ArrayOfDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Documents");
        if (logger.isDebugEnabled()) {
            logger.debug("getDocuments: <- credholder = '"+ credholder.toString() +"'" );
        }
        ObjectFactory factory = new ObjectFactory();
        ArrayOfDocument valuearr = factory.createArrayOfDocument();
        if (credholder != null) {
            Document valdoc = factory.createDocument();
            if (credholder.getCredNumber() != null) valdoc.setNumber(makeString(Constants._DocNumber1_QNAME,credholder.getCredNumber()));
            if (credholder.getSerialNumber() != null) valdoc.setSeries(makeString(Constants._DocSeries1_QNAME,credholder.getSerialNumber()));
            if (credholder.getIssueDate() != null) valdoc.setIssueDate(GetGregorianDate(credholder.getIssueDate()));
            if (credholder.getExpiryDate() != null) valdoc.setExpiryDate(GetGregorianDate(credholder.getExpiryDate()));
            if (credholder.getIssuer() != null) valdoc.setIssuer(makeString(Constants._Issuer_QNAME,credholder.getIssuer()));
            if (credholder.getIssuerCode() != null) valdoc.setIssuerCode(makeString(Constants._IssuerCode_QNAME,credholder.getIssuerCode()));
            GetDocumentType gdt = new GetDocumentType();
            if (credholder.getCredType() != null) valdoc.setTypeID(gdt.getDocumentsID(credholder.getCredType()));
            valuearr.getDocument().add(valdoc);
        }
        JAXBElement<ArrayOfDocument> result = new JAXBElement<ArrayOfDocument>(_ArrayOfDocument_QNAME, ArrayOfDocument.class, null, valuearr);
        if (logger.isDebugEnabled()) {
            logger.debug("getDocuments: -> result = '"+ result.toString() +"'" );
        }
        return result;
    }
/**
* Формирование JAXBElement массива адресов<br>
* Заполняется транспортный объект для хранения адресов приводя их к ныжным типам<br>
* @param registr Информация об адресе клиента
* @param ahh - Подготовленный авторизационный заголовок
* @param service - текущий коннект к ВебСервису
* @return массива JAXBElement
* @throws Exception в случае провала выполение
* @see PersonAddress
* @see AddressHolder
*/ 
    public JAXBElement<PersonAddress> getAdressElem(AddressHolder registr,JAXBElement<AuthenticationHeader> ahh, IWebService service) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("getAdressElem: <- registr = '"+ registr.toString() +"'" );
        }
        String streetval = null;
        ObjectFactory factoryp = new ObjectFactory();
        PersonAddress value = factoryp.createPersonAddress();
        if (registr.getCity() != null) value.setCity(makeString(Constants._PACity_QNAME,registr.getCity()));
        if (registr.getStreet1() != null) streetval = registr.getStreet1();
        if (registr.getStreet2() != null) streetval = streetval + " " + registr.getStreet1();
        if (streetval != null) {
            value.setStreet(makeString(Constants._Street_QNAME,streetval));
            value.setHouse(makeString(Constants._House_QNAME,"0"));
        }
        if (registr.getZipCode() != null) value.setPostalCode(makeString(Constants._PostalCode_QNAME,registr.getZipCode()));
        GetCountry gc = new GetCountry();
        if (registr.getCountry() != null) value.setCountryID(gc.getCountriesID(registr.getCountry(),ahh,service));
        JAXBElement<PersonAddress> result = new JAXBElement<PersonAddress>(Constants._PersonAddress_QNAME, PersonAddress.class, Person.class, value);
        if (logger.isDebugEnabled()) {
            logger.debug("getAdressElem: -> result = '"+ result.toString() +"'" );
        }
        return result;
    }

/**
* Формирование JAXBElement массива номеров телефона
* Заполняется транспортный объект для хранения телефонных номеров приводя их к ныжным типам<br>
* @param phones Телефон клиента
* @return массива JAXBElement
* @throws Exception в случае провала выполение
* @see ArrayOfPhone
*/ 
    
    public JAXBElement<ArrayOfPhone> getPhones(String[] phones) throws Exception {
        QName _ArrayOfPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients", "Phones");
        if (logger.isDebugEnabled()) {
            logger.debug("getPhones: <- phones = '"+ phones +"'" );
        }
        ObjectFactory factoryp = new ObjectFactory();
        ArrayOfPhone valuearr = factoryp.createArrayOfPhone();
        if (phones != null &&  phones.length>0) {
            for(int i=0; i<phones.length; i++) {
                Phone valphone = factoryp.createPhone();
                if (phones[i] != null) valphone.setNumber(makeString(Constants._PhoneNumber_QNAME,phones[i]));
                valphone.setType(PhoneType.MOBILE);
                valuearr.getPhone().add(valphone);
            }
        }
        JAXBElement<ArrayOfPhone> result = new JAXBElement<ArrayOfPhone>(_ArrayOfPhone_QNAME, ArrayOfPhone.class, null, valuearr);
        if (logger.isDebugEnabled()) {
            logger.debug("getPhones: -> result = '"+ result.toString() +"'" );
        }      
        return result;
    }

/**
* Преобразование Даты в XMLGregorianCalendar
* Заполняется транспортный объект для хранения данных типа Date приводя их к ныжным типам<br>
* @param date - Дата в Java формате
* @return XMLGregorianCalendar
* @throws Exception в случае провала выполение
* @see XMLGregorianCalendar
*/ 
    
    
    public XMLGregorianCalendar GetGregorianDate(Date date) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("GetGregorianDate: <- date = '"+ date.toString() +"'" );
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        GregorianCalendar gregory = new GregorianCalendar();
        gregory.setTime(calendar.getTime());
        XMLGregorianCalendar gcalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
        gcalendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
        if (logger.isDebugEnabled()) {
            logger.debug("GetGregorianDate: -> gcalendar = '"+ gcalendar.toString() +"'" );
        }
        return gcalendar;
    }

/**
* Логгирование XML запросов к серверу
* Ключевой момент если у класса нет аннотации @XmlRootElement вызывает JAXBException поэтому использовать надо очень осторожно. 
* Возможно придется править автогенерированные классы
* @param x - JAXB запрос
* @return строка с xml документов по входящему запросу
*/ 
    
    public String printXml(Object x)
        {
                JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(x.getClass());
        } catch (JAXBException ex) {
            logger.error( "printXml: Error creating xml", ex);
        }
                StringWriter writer = new StringWriter();
                Marshaller marshaller = null;
        try {
            marshaller = context.createMarshaller();
        } catch (JAXBException ex) {
            logger.error( "printXml: Error creating xml", ex);
        }
        try {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        } catch (PropertyException ex) {
            logger.error( "printXml: Error creating xml", ex);
        }
        try {
            marshaller.marshal(x,writer);
        } catch (JAXBException ex) {
            logger.error( "printXml: Error creating xml", ex);
        }
            return writer.toString();
        }
     }