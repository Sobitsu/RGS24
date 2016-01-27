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

    public static CreatePersonResponseMessage CreatePerson(Person pers) throws Exception {
        try
                {
                    CreatePersonRequestMessage cprm = new CreatePersonRequestMessage();
                    org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                    com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    org.datacontract.schemas._2004._07.wcfservicelib.Person persh = new org.datacontract.schemas._2004._07.wcfservicelib.Person();
                    persh.setAddress(getAdressElem(pers));
                    persh.setDocuments(getDocuments(pers));
                    persh.setFinDetails(getFinDetail(pers));
                    persh.setPhones(getPhones(pers));
                    persh.setRBank(getRBank(pers));
                    persh.setResidentships(getResident(pers));
                    persh.setBirthDate(CommonLib.GetGregorianDate(pers.getBirthDate()));
                    persh.setBirthPlace(factory.createString(pers.getBirthPlace()));
                    persh.setFirstName(factory.createString(pers.getFirstName()));
                    persh.setLastName(factory.createString(pers.getLastName()));
                    persh.setMiddleName(factory.createString(pers.getMiddleName()));
                    persh.setFirstNameLat(factory.createString(pers.getFirstNameLat()));
                    persh.setLastNameLat(factory.createString(pers.getLastNameLat()));
                    persh.setMiddleNameLat(factory.createString(pers.getMiddleNameLat()));
                    persh.setUnistreamCardNumber(factory.createString(pers.getUnistreamCardNumber()));
                    JAXBElement<org.datacontract.schemas._2004._07.wcfservicelib.Person> persel = factoryp.createPerson(persh);
                    cprm.setAuthenticationHeader(ahh);
                    cprm.setPerson(persel);
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
            com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
            PersonAddress value = factoryp.createPersonAddress();
            value.setBuilding(factory.createString(pers.getAddress().getBuilding()));
            value.setCity(factory.createString(pers.getAddress().getCity()));
            value.setFlat(factory.createString(pers.getAddress().getFlat()));
            value.setHouse(factory.createString(pers.getAddress().getHouse()));
            value.setStreet(factory.createString(pers.getAddress().getStreet()));
            value.setPostalCode(factory.createString(pers.getAddress().getPostalCode()));
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
            com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
            ArrayOfDocument valuearr = factoryp.createArrayOfDocument();
            if (pers.getDocuments() != null &&  pers.getDocuments().length>0) {
                for(int i=1; i<=pers.getDocuments().length; i++) {
                    Document valdoc = factoryp.createDocument();
                    valdoc.setNumber(factory.createString(pers.getDocuments()[i].getNumber()));
                    valdoc.setSeries(factory.createString(pers.getDocuments()[i].getSeries()));
                    valdoc.setIssueDate(CommonLib.GetGregorianDate(pers.getDocuments()[i].getIssueDate()));
                    valdoc.setExpiryDate(CommonLib.GetGregorianDate(pers.getDocuments()[i].getExpiryDate()));
                    valdoc.setIssuer(factory.createString(pers.getDocuments()[i].getIssuer()));
                    valdoc.setIssuerCode(factory.createString(pers.getDocuments()[i].getIssuerCode()));
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
            com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
            ArrayOfFinDetail valuearr = factoryp.createArrayOfFinDetail();
            if (pers.getFinDetails() != null &&  pers.getFinDetails().length>0) {
                for(int i=1; i<=pers.getFinDetails().length; i++) {
                    FinDetail valfd = factoryp.createFinDetail();
                    valfd.setNumber(factory.createString(pers.getFinDetails()[i].getNumber()));
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
            com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
            ArrayOfPhone valuearr = factoryp.createArrayOfPhone();
            if (pers.getPhones() != null &&  pers.getPhones().length>0) {
                for(int i=1; i<=pers.getPhones().length; i++) {
                    Phone valphone = factoryp.createPhone();
                    valphone.setNumber(factory.createString(pers.getPhones()[i].getNumber()));
                    valphone.setType(PhoneType.MOBILE);
                    valphone.setAreaCode(factory.createString(pers.getPhones()[i].getAreaCode()));
                    valphone.setCountryID(pers.getPhones()[i].getCountryID());
                    valphone.setExt(factory.createString(pers.getPhones()[i].getExt()));
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
            com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
            RBank value = factoryr.createRBank();
            if (pers.getRBank() != null) {
                value.setBic(factory.createString(pers.getRBank().getBic()));
                value.setCity(factory.createString(pers.getRBank().getCity()));
                value.setCorrespondentAcc(factory.createString(pers.getRBank().getCorrespondentAcc()));
                value.setName(factory.createString(pers.getRBank().getName()));
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
