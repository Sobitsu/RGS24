/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.msg.AddressHolder;
import com.grs24.msg.CredentialsHolder;
import com.grs24.RemittanceException;
import com.grs24.mt.unistream.BaseDataParser;
import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;
import com.grs24.mt.unistream.MtUnistreamAdapter;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfDocument;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfPhone;
import org.datacontract.schemas._2004._07.wcfservicelib.Document;
import org.datacontract.schemas._2004._07.wcfservicelib.PersonAddress;
import org.datacontract.schemas._2004._07.wcfservicelib.Phone;
import org.datacontract.schemas._2004._07.wcfservicelib.PhoneType;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory;


/**
 *
 * @author Dale
 */
public class CommonLib {

    private final static QName _DocNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocNumber");
    private final static QName _DocSeries_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocSeries");
    private final static QName _PhoneArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneArea");
    private final static QName _PhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneNumber");
    private final static QName _Ext_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Ext");
    private final static QName _Issuer_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Issuer");
    private final static QName _IssuerCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "IssuerCode");
    private final static QName _FinDetailNumberNumber_QNAME= new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Number");
    private final static QName _Bic_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Bic");
    private final static QName _City_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "City");
    private final static QName _CorrespondentAcc_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "CorrespondentAcc");
    private final static QName _Building_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Building");
    private final static QName _PACity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "City");
    private final static QName _Flat_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Flat");
    private final static QName _House_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "House");
    private final static QName _Street_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Street");
    private final static QName _PostalCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PostalCode");

/**
* Обработка отрицательного ответа от СДП 
* @param response - ответ сервера
* @throws RemittanceException в случае провала выполение
*/ 
    public static void CheckFault(WsResponse response) throws RemittanceException {
        if(!response.getFault().isNil())
        {
            MtUnistreamAdapter.logger.log(Level.SEVERE, "Unistream returned error: {0}", response.getFault().getValue().getMessage().getValue());
            throw new RemittanceException("Unistream returned error", BaseDataParser.parseInteger(response.getFault().getValue().getID().getValue()), response.getFault().getValue().getCode().value(),response.getFault().getValue().getMessage().getValue());
        }
    }  

/**
* Формирование авторизационного заголовка запросов  
* @return заголовок
*/ 

    public static JAXBElement<AuthenticationHeader> MakeAuthHead()
        {
            MtUnistreamAdapter.logger.log(Level.INFO,"Create AuthenticationHeader");
            ObjectFactory factory = new ObjectFactory();
            AuthenticationHeader ah = factory.createAuthenticationHeader();
            JAXBElement<AuthenticationHeader> ahh = factory.createWsRequestAuthenticationHeader(ah);
            ah.setAppKey(factory.createAuthenticationHeaderAppKey(MtUnistreamAdapter.KEY_USER_AUTHED_APIKEY));
            ah.setUsername(factory.createAuthenticationHeaderUsername(MtUnistreamAdapter.KEY_USER_AUTHED_LOGIN));
            ah.setPassword(factory.createAuthenticationHeaderPassword(MtUnistreamAdapter.KEY_USER_AUTHED_PASSWORD));
            return ahh;
        }

/**
* Формирование простого строкового JAXBElement
* @param qname 
* @param value
* @return строкового JAXBElement
*/ 
    
    public static JAXBElement<String> MakeString(QName qname, String value)
        {
            return new JAXBElement<String>(qname, String.class, null, value);
        }

/**
* Формирование JAXBElement массива удостоверений личности
* @param credholder 
* @return массива JAXBElement
* @throws Exception в случае провала выполение
*/ 
    public static JAXBElement<ArrayOfDocument> getDocuments(CredentialsHolder credholder) throws Exception {
        MtUnistreamAdapter.logger.log(Level.INFO,"Create JAXBElement<ArrayOfDocument>");
        ObjectFactory factory = new ObjectFactory();
        ArrayOfDocument valuearr = factory.createArrayOfDocument();
        if (credholder != null) {
            Document valdoc = factory.createDocument();
            if (credholder.getCredNumber() != null) valdoc.setNumber(CommonLib.MakeString(_DocNumber_QNAME,credholder.getCredNumber()));
            if (credholder.getSerialNumber() != null) valdoc.setSeries(CommonLib.MakeString(_DocSeries_QNAME,credholder.getSerialNumber()));
            if (credholder.getIssueDate() != null) valdoc.setIssueDate(CommonLib.GetGregorianDate(credholder.getIssueDate()));
            if (credholder.getExpiryDate() != null) valdoc.setExpiryDate(CommonLib.GetGregorianDate(credholder.getExpiryDate()));
            if (credholder.getIssuer() != null) valdoc.setIssuer(CommonLib.MakeString(_Issuer_QNAME,credholder.getIssuer()));
            if (credholder.getIssuerCode() != null) valdoc.setIssuerCode(CommonLib.MakeString(_IssuerCode_QNAME,credholder.getIssuerCode()));
            valuearr.getDocument().add(valdoc);
        }
        JAXBElement<ArrayOfDocument> result = factory.createArrayOfDocument(valuearr);
        return result;
    }
/**
* Формирование JAXBElement массива адресов
* @param registr 
* @return массива JAXBElement
* @throws Exception в случае провала выполение
*/ 
    public static JAXBElement<PersonAddress> getAdressElem(AddressHolder registr) throws Exception {
        MtUnistreamAdapter.logger.log(Level.INFO,"Create JAXBElement<PersonAddress>");
        ObjectFactory factoryp = new ObjectFactory();
        PersonAddress value = factoryp.createPersonAddress();
        if (registr.getCity() != null ) value.setCity(CommonLib.MakeString(_PACity_QNAME,registr.getCity()));
        if (registr.getStreet2() != null ) value.setHouse(CommonLib.MakeString(_House_QNAME,registr.getStreet2()));
        if (registr.getStreet1() != null ) value.setStreet(CommonLib.MakeString(_Street_QNAME,registr.getStreet1()));
        if (registr.getZipCode() != null ) value.setPostalCode(CommonLib.MakeString(_PostalCode_QNAME,registr.getZipCode()));
        JAXBElement<PersonAddress> result = factoryp.createPersonAddress(value);
        return result;
    }

/**
* Формирование JAXBElement массива номеров телефона
* @param phones
* @return массива JAXBElement
* @throws Exception в случае провала выполение
*/ 
    
    public static JAXBElement<ArrayOfPhone> getPhones(String[] phones) throws Exception {
        MtUnistreamAdapter.logger.log(Level.INFO,"Create JAXBElement<ArrayOfPhone>");
        ObjectFactory factoryp = new ObjectFactory();
        ArrayOfPhone valuearr = factoryp.createArrayOfPhone();
        if (phones != null &&  phones.length>0) {
            for(int i=0; i<phones.length; i++) {
                Phone valphone = factoryp.createPhone();
                if (phones[i] != null) valphone.setNumber(CommonLib.MakeString(_PhoneNumber_QNAME,phones[i]));
                valphone.setType(PhoneType.MOBILE);
                valuearr.getPhone().add(valphone);
            }
        }
        JAXBElement<ArrayOfPhone> result = factoryp.createArrayOfPhone(valuearr);
        return result;
    }

/**
* Преобразование Даты в XMLGregorianCalendar
* @param date
* @return XMLGregorianCalendar
* @throws Exception в случае провала выполение
*/ 
    
    
    public static XMLGregorianCalendar GetGregorianDate(Date date) throws Exception {
        MtUnistreamAdapter.logger.log(Level.INFO,"Create XMLGregorianCalendar");
    //    TimeZone zone = TimeZone.getTimeZone("Etc/GMT");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
      //  calendar.setTimeZone(zone);
        calendar.clear(Calendar.ZONE_OFFSET);
        GregorianCalendar gregory = new GregorianCalendar();
        gregory.setTime(calendar.getTime());
        XMLGregorianCalendar gcalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
        return gcalendar;
    }

/**
* Логгирование XML запросов к серверу
* @param x
* @throws JAXBException в случае провала выполение
*/ 
    
    public static void printXml(Object x) throws JAXBException
        {
                JAXBContext context = JAXBContext.newInstance(x.getClass());
                StringWriter writer = new StringWriter();
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal(x,writer);
                String stringXML = writer.toString();
                MtUnistreamAdapter.logger.log(Level.INFO,"XMLResult:");
                MtUnistreamAdapter.logger.log(Level.INFO,stringXML);
        }
     }