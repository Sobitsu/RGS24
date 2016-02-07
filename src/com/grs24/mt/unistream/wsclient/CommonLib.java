/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;
import com.grs24.mt.unistream.MtUnistreamAdapter;
import com.grs24.mt.unistream.dto.Person;
import java.io.StringWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfDocument;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfFinDetail;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfPhone;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfResidentship;
import org.datacontract.schemas._2004._07.wcfservicelib.Document;
import org.datacontract.schemas._2004._07.wcfservicelib.FinDetail;
import org.datacontract.schemas._2004._07.wcfservicelib.FinDetailType;
import org.datacontract.schemas._2004._07.wcfservicelib.PersonAddress;
import org.datacontract.schemas._2004._07.wcfservicelib.Phone;
import org.datacontract.schemas._2004._07.wcfservicelib.PhoneType;
import org.datacontract.schemas._2004._07.wcfservicelib.Residentship;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.RBank;


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

    public static void CheckFault(WsResponse response) throws Exception {
        if(!response.getFault().isNil())
        {
            String msg = "code=" + response.getFault().getValue().getCode();
            msg += ", id="  + response.getFault().getValue().getID().getValue();
            msg += ", msg="+ response.getFault().getValue().getMessage().getValue();

            throw new UnsupportedOperationException("Unistream returned error: " + msg);
        }
    }  
    public static JAXBElement<AuthenticationHeader> MakeAuthHead()
        {
            //TODO надо понять как хратить явки пароли
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new  org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            AuthenticationHeader ah = factory.createAuthenticationHeader();
            JAXBElement<AuthenticationHeader> ahh = factory.createWsRequestAuthenticationHeader(ah);
            ah.setAppKey(factory.createAuthenticationHeaderAppKey(MtUnistreamAdapter.KEY_USER_AUTHED_APIKEY));
            ah.setUsername(factory.createAuthenticationHeaderUsername(MtUnistreamAdapter.KEY_USER_AUTHED_LOGIN));
            ah.setPassword(factory.createAuthenticationHeaderPassword(MtUnistreamAdapter.KEY_USER_AUTHED_PASSWORD));
            return ahh;
        }
        
    public static JAXBElement<String> MakeString(QName qname, String value)
        {
            return new JAXBElement<String>(qname, String.class, null, value);
        }
    public static JAXBElement<ArrayOfDocument> getDocuments(Person pers) throws Exception {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            ArrayOfDocument valuearr = factoryp.createArrayOfDocument();
            if (pers.getDocuments() != null &&  pers.getDocuments().length>0) {
                for(int i=1; i<=pers.getDocuments().length; i++) {
                    Document valdoc = factoryp.createDocument();
                    if (pers.getDocuments()[i].getNumber() != null) valdoc.setNumber(CommonLib.MakeString(_DocNumber_QNAME,pers.getDocuments()[i].getNumber()));
                    if (pers.getDocuments()[i].getSeries() != null) valdoc.setSeries(CommonLib.MakeString(_DocSeries_QNAME,pers.getDocuments()[i].getSeries()));
                    if (pers.getDocuments()[i].getIssueDate() != null) valdoc.setIssueDate(CommonLib.GetGregorianDate(pers.getDocuments()[i].getIssueDate()));
                    if (pers.getDocuments()[i].getExpiryDate() != null) valdoc.setExpiryDate(CommonLib.GetGregorianDate(pers.getDocuments()[i].getExpiryDate()));
                    if (pers.getDocuments()[i].getIssuer() != null) valdoc.setIssuer(CommonLib.MakeString(_Issuer_QNAME,pers.getDocuments()[i].getIssuer()));
                    if (pers.getDocuments()[i].getIssuerCode() != null) valdoc.setIssuerCode(CommonLib.MakeString(_IssuerCode_QNAME,pers.getDocuments()[i].getIssuerCode()));
                    valuearr.getDocument().add(valdoc);
                }
            }
            JAXBElement<ArrayOfDocument> result = factoryp.createArrayOfDocument(valuearr);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("getDocuments returned error: " + ex.getMessage());}
    }

    public static JAXBElement<PersonAddress> getAdressElem(Person pers) throws Exception {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            PersonAddress value = factoryp.createPersonAddress();
            if (pers.getAddress().getBuilding() != null ) value.setBuilding(CommonLib.MakeString(_Building_QNAME,pers.getAddress().getBuilding()));
            if (pers.getAddress().getCity() != null ) value.setCity(CommonLib.MakeString(_PACity_QNAME,pers.getAddress().getCity()));
            if (pers.getAddress().getFlat() != null ) value.setFlat(CommonLib.MakeString(_Flat_QNAME,pers.getAddress().getFlat()));
            if (pers.getAddress().getHouse() != null ) value.setHouse(CommonLib.MakeString(_House_QNAME,pers.getAddress().getHouse()));
            if (pers.getAddress().getStreet() != null ) value.setStreet(CommonLib.MakeString(_Street_QNAME,pers.getAddress().getStreet()));
            if (pers.getAddress().getPostalCode() != null ) value.setPostalCode(CommonLib.MakeString(_PostalCode_QNAME,pers.getAddress().getPostalCode()));
            if (pers.getAddress().getCountryID() != null ) value.setCountryID(pers.getAddress().getCountryID());
            if (pers.getAddress().getID() != null ) value.setID(pers.getAddress().getID());
            JAXBElement<PersonAddress> result = factoryp.createPersonAddress(value);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("getAdressElem returned error: " + ex.getMessage());}
    }

    public static JAXBElement<ArrayOfFinDetail> getFinDetail(Person pers) throws Exception {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            ArrayOfFinDetail valuearr = factoryp.createArrayOfFinDetail();
            if (pers.getFinDetails() != null &&  pers.getFinDetails().length>0) {
                for(int i=1; i<=pers.getFinDetails().length; i++) {
                    FinDetail valfd = factoryp.createFinDetail();
                    if (pers.getFinDetails()[i].getNumber() != null) valfd.setNumber(CommonLib.MakeString(_FinDetailNumberNumber_QNAME,pers.getFinDetails()[i].getNumber()));
                    valfd.setType(FinDetailType.CONTRACT);
                    if (pers.getFinDetails()[i].getDate() != null) valfd.setDate(CommonLib.GetGregorianDate(pers.getFinDetails()[i].getDate()));
                    valuearr.getFinDetail().add(valfd);
                }
            }
            JAXBElement<ArrayOfFinDetail> result = factoryp.createArrayOfFinDetail(valuearr);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("getFinDetail returned error: " + ex.getMessage());}
    }

    public static JAXBElement<ArrayOfPhone> getPhones(Person pers) throws Exception {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            ArrayOfPhone valuearr = factoryp.createArrayOfPhone();
            if (pers.getPhones() != null &&  pers.getPhones().length>0) {
                for(int i=1; i<=pers.getPhones().length; i++) {
                    Phone valphone = factoryp.createPhone();
                    if (pers.getPhones()[i].getNumber() != null) valphone.setNumber(CommonLib.MakeString(_PhoneNumber_QNAME,pers.getPhones()[i].getNumber()));
                    valphone.setType(PhoneType.MOBILE);
                    if (pers.getPhones()[i].getAreaCode() != null) valphone.setAreaCode(CommonLib.MakeString(_PhoneArea_QNAME,pers.getPhones()[i].getAreaCode()));
                    if (pers.getPhones()[i].getCountryID() != null) valphone.setCountryID(pers.getPhones()[i].getCountryID());
                    if (pers.getPhones()[i].getExt() != null) valphone.setExt(CommonLib.MakeString(_Ext_QNAME,pers.getPhones()[i].getExt()));
                    valuearr.getPhone().add(valphone);
                }
            }
            JAXBElement<ArrayOfPhone> result = factoryp.createArrayOfPhone(valuearr);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("getPhones returned error: " + ex.getMessage());}
    }

    public static JAXBElement<RBank> getRBank(Person pers) throws Exception {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.ObjectFactory factoryr = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.ObjectFactory();
            RBank value = factoryr.createRBank();
            if (pers.getRBank() != null) {
                if (pers.getRBank().getBic() != null) value.setBic(CommonLib.MakeString(_Bic_QNAME,pers.getRBank().getBic()));
                if (pers.getRBank().getCity() != null) value.setCity(CommonLib.MakeString(_City_QNAME,pers.getRBank().getCity()));
                if (pers.getRBank().getCorrespondentAcc() != null)value.setCorrespondentAcc(CommonLib.MakeString(_CorrespondentAcc_QNAME,pers.getRBank().getCorrespondentAcc()));
            }
            JAXBElement<RBank> result = factoryp.createPersonRBank(value);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("getRBank returned error: " + ex.getMessage());}
    }

    public static JAXBElement<ArrayOfResidentship> getResident(Person pers) throws Exception {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            ArrayOfResidentship valuearr = factoryp.createArrayOfResidentship();
            if (pers.getResidentships() != null &&  pers.getResidentships().length>0) {
                for(int i=1; i<=pers.getResidentships().length; i++) {
                    Residentship valres = factoryp.createResidentship();
                    if (pers.getResidentships()[i].getCountryID() != null) valres.setCountryID(pers.getResidentships()[i].getCountryID());
                    if (pers.getResidentships()[i].isIsResident() != null) valres.setIsResident(pers.getResidentships()[i].isIsResident());
                    valuearr.getResidentship().add(valres);
                }
            }
           JAXBElement<ArrayOfResidentship> result = factoryp.createArrayOfResidentship(valuearr);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("getResident returned error: " + ex.getMessage());}
    }

    public static XMLGregorianCalendar GetGregorianDate(Date date) throws Exception {
        try {
            GregorianCalendar gregory = new GregorianCalendar();
            gregory.setTime(date);
            XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
            return calendar;
        } catch (Exception ex) {
                throw new UnsupportedOperationException("GetGregorianDate returned error: " + ex.getMessage());
        }
    }
     public static void printXml(Object x) throws JAXBException
        {
                JAXBContext context = JAXBContext.newInstance(x.getClass());
                StringWriter writer = new StringWriter();
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal(x,writer);
                String stringXML = writer.toString();
                System.out.println(stringXML);
        }
     }
    
