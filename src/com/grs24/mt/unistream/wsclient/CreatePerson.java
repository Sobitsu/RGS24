/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.dto.Person;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfDocument;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfFinDetail;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfPhone;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfResidentship;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage;
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
public class CreatePerson {

    private final static QName _FirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "FirstName");
    private final static QName _LastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "LastName");
    private final static QName _MiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "MiddleName");
    private final static QName _DocNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocNumber");
    private final static QName _DocSeries_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocSeries");
    private final static QName _PhoneArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneArea");
    private final static QName _PhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneNumber");
    private final static QName _UnistreamCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "UnistreamCardNumber");
    private final static QName _Ext_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Ext");
    private final static QName _Issuer_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Issuer");
    private final static QName _IssuerCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "IssuerCode");
    private final static QName _FinDetailNumberNumber_QNAME= new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Number");
    private final static QName _Bic_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Bic");
    private final static QName _City_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "City");
    private final static QName _CorrespondentAcc_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "CorrespondentAcc");
    private final static QName _BirthPlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "BirthPlace");
    private final static QName _FirstNameLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "FirstNameLat");
    private final static QName _LastNameLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "LastNameLat");
    private final static QName _MiddleNameLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "MiddleNameLat");
    private final static QName _Building_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Building");
    private final static QName _PACity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "City");
    private final static QName _Flat_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Flat");
    private final static QName _House_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "House");
    private final static QName _Street_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Street");
    private final static QName _PostalCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PostalCode");
    public static CreatePersonResponseMessage CreatePerson(Person pers) throws Exception {
        try
                {
                    CreatePersonRequestMessage cprm = new CreatePersonRequestMessage();
                    org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    org.datacontract.schemas._2004._07.wcfservicelib.Person persh = new org.datacontract.schemas._2004._07.wcfservicelib.Person();
                    persh.setAddress(getAdressElem(pers));
                    persh.setDocuments(getDocuments(pers));
                    persh.setFinDetails(getFinDetail(pers));
                    persh.setPhones(getPhones(pers));
                    persh.setRBank(getRBank(pers));
                    persh.setResidentships(getResident(pers));
                    persh.setBirthDate(CommonLib.GetGregorianDate(pers.getBirthDate()));
                    persh.setBirthPlace(CommonLib.MakeString(_BirthPlace_QNAME,pers.getBirthPlace()));
                    persh.setFirstName(CommonLib.MakeString(_FirstName_QNAME,pers.getFirstName()));
                    persh.setLastName(CommonLib.MakeString(_LastName_QNAME,pers.getLastName()));
                    persh.setMiddleName(CommonLib.MakeString(_MiddleName_QNAME,pers.getMiddleName()));
                    persh.setFirstNameLat(CommonLib.MakeString(_FirstNameLat_QNAME,pers.getFirstNameLat()));
                    persh.setLastNameLat(CommonLib.MakeString(_LastNameLat_QNAME,pers.getLastNameLat()));
                    persh.setMiddleNameLat(CommonLib.MakeString(_MiddleNameLat_QNAME,pers.getMiddleNameLat()));
                    persh.setUnistreamCardNumber(CommonLib.MakeString(_UnistreamCardNumber_QNAME,pers.getUnistreamCardNumber()));
                    JAXBElement<org.datacontract.schemas._2004._07.wcfservicelib.Person> persel = factoryp.createPerson(persh);
                    cprm.setAuthenticationHeader(ahh);
                    cprm.setPerson(persel);
//
                    com.unistream.test.wcflib.CreatePerson ftxml = new com.unistream.test.wcflib.CreatePerson();
                    ftxml.setRequestMessage(factoryp.createCreatePersonRequestMessage(cprm));
                    CommonLib.printXml(ftxml);
// 
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    CreatePersonResponseMessage rm = service.createPerson(cprm);
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getPerson().getValue().getID());
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Serialization returned error: " + ex.getMessage());}
    }

    private static JAXBElement<PersonAddress> getAdressElem(Person pers) throws Exception {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            PersonAddress value = factoryp.createPersonAddress();
            value.setBuilding(CommonLib.MakeString(_Building_QNAME,pers.getAddress().getBuilding()));
            value.setCity(CommonLib.MakeString(_PACity_QNAME,pers.getAddress().getCity()));
            value.setFlat(CommonLib.MakeString(_Flat_QNAME,pers.getAddress().getFlat()));
            value.setHouse(CommonLib.MakeString(_House_QNAME,pers.getAddress().getHouse()));
            value.setStreet(CommonLib.MakeString(_Street_QNAME,pers.getAddress().getStreet()));
            value.setPostalCode(CommonLib.MakeString(_PostalCode_QNAME,pers.getAddress().getPostalCode()));
            value.setCountryID(pers.getAddress().getCountryID());
            value.setID(pers.getAddress().getID());
            JAXBElement<PersonAddress> result = factoryp.createPersonAddress(value);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Serialization returned error: " + ex.getMessage());}
    }

    private static JAXBElement<ArrayOfDocument> getDocuments(Person pers) {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            ArrayOfDocument valuearr = factoryp.createArrayOfDocument();
            if (pers.getDocuments() != null &&  pers.getDocuments().length>0) {
                for(int i=1; i<=pers.getDocuments().length; i++) {
                    Document valdoc = factoryp.createDocument();
                    valdoc.setNumber(CommonLib.MakeString(_DocNumber_QNAME,pers.getDocuments()[i].getNumber()));
                    valdoc.setSeries(CommonLib.MakeString(_DocSeries_QNAME,pers.getDocuments()[i].getSeries()));
                    valdoc.setIssueDate(CommonLib.GetGregorianDate(pers.getDocuments()[i].getIssueDate()));
                    valdoc.setExpiryDate(CommonLib.GetGregorianDate(pers.getDocuments()[i].getExpiryDate()));
                    valdoc.setIssuer(CommonLib.MakeString(_Issuer_QNAME,pers.getDocuments()[i].getIssuer()));
                    valdoc.setIssuerCode(CommonLib.MakeString(_IssuerCode_QNAME,pers.getDocuments()[i].getIssuerCode()));
                    valuearr.getDocument().add(valdoc);
                }
            }
            JAXBElement<ArrayOfDocument> result = factoryp.createArrayOfDocument(valuearr);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Serialization returned error: " + ex.getMessage());}
    }

    private static JAXBElement<ArrayOfFinDetail> getFinDetail(Person pers) {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            ArrayOfFinDetail valuearr = factoryp.createArrayOfFinDetail();
            if (pers.getFinDetails() != null &&  pers.getFinDetails().length>0) {
                for(int i=1; i<=pers.getFinDetails().length; i++) {
                    FinDetail valfd = factoryp.createFinDetail();
                    valfd.setNumber(CommonLib.MakeString(_FinDetailNumberNumber_QNAME,pers.getFinDetails()[i].getNumber()));
                    valfd.setType(FinDetailType.CONTRACT);
                    valfd.setDate(CommonLib.GetGregorianDate(pers.getFinDetails()[i].getDate()));
                    valuearr.getFinDetail().add(valfd);
                }
            }
            JAXBElement<ArrayOfFinDetail> result = factoryp.createArrayOfFinDetail(valuearr);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Serialization returned error: " + ex.getMessage());}
    }

    private static JAXBElement<ArrayOfPhone> getPhones(Person pers) {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            ArrayOfPhone valuearr = factoryp.createArrayOfPhone();
            if (pers.getPhones() != null &&  pers.getPhones().length>0) {
                for(int i=1; i<=pers.getPhones().length; i++) {
                    Phone valphone = factoryp.createPhone();
                    valphone.setNumber(CommonLib.MakeString(_PhoneNumber_QNAME,pers.getPhones()[i].getNumber()));
                    valphone.setType(PhoneType.MOBILE);
                    valphone.setAreaCode(CommonLib.MakeString(_PhoneArea_QNAME,pers.getPhones()[i].getAreaCode()));
                    valphone.setCountryID(pers.getPhones()[i].getCountryID());
                    valphone.setExt(CommonLib.MakeString(_Ext_QNAME,pers.getPhones()[i].getExt()));
                    valuearr.getPhone().add(valphone);
                }
            }
            JAXBElement<ArrayOfPhone> result = factoryp.createArrayOfPhone(valuearr);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Serialization returned error: " + ex.getMessage());}
    }

    private static JAXBElement<RBank> getRBank(Person pers) {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.ObjectFactory factoryr = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.ObjectFactory();
            RBank value = factoryr.createRBank();
            if (pers.getRBank() != null) {
                value.setBic(CommonLib.MakeString(_Bic_QNAME,pers.getRBank().getBic()));
                value.setCity(CommonLib.MakeString(_City_QNAME,pers.getRBank().getCity()));
                value.setCorrespondentAcc(CommonLib.MakeString(_CorrespondentAcc_QNAME,pers.getRBank().getCorrespondentAcc()));
            }
            JAXBElement<RBank> result = factoryp.createPersonRBank(value);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Serialization returned error: " + ex.getMessage());}
    }

    private static JAXBElement<ArrayOfResidentship> getResident(Person pers) {
        try {
            org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
            ArrayOfResidentship valuearr = factoryp.createArrayOfResidentship();
            if (pers.getResidentships() != null &&  pers.getResidentships().length>0) {
                for(int i=1; i<=pers.getResidentships().length; i++) {
                    Residentship valres = factoryp.createResidentship();
                    valres.setCountryID(pers.getResidentships()[i].getCountryID());
                    valres.setIsResident(pers.getResidentships()[i].isIsResident());
                    valuearr.getResidentship().add(valres);
                }
            }
           JAXBElement<ArrayOfResidentship> result = factoryp.createArrayOfResidentship(valuearr);
            return result;
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Serialization returned error: " + ex.getMessage());}
    }
}
