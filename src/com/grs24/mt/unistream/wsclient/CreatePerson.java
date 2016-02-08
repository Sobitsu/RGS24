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
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage;

/**
 *
 * @author Dale
 */
public class CreatePerson {
    private final static QName _FirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "FirstName");
    private final static QName _LastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "LastName");
    private final static QName _MiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "MiddleName");
    private final static QName _UnistreamCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "UnistreamCardNumber");
    private final static QName _BirthPlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "BirthPlace");
    private final static QName _FirstNameLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "FirstNameLat");
    private final static QName _LastNameLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "LastNameLat");
    private final static QName _MiddleNameLat_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "MiddleNameLat");

    public static CreatePersonResponseMessage CreatePerson(Person pers) throws Exception {
        try
                {
                    CreatePersonRequestMessage cprm = new CreatePersonRequestMessage();
                    org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factoryp = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    org.datacontract.schemas._2004._07.wcfservicelib.Person persh = new org.datacontract.schemas._2004._07.wcfservicelib.Person();
                    if (pers.getAddress() != null ) {
                        persh.setAddress(CommonLib.getAdressElem(pers));
                    }
                    if (pers.getDocuments() != null && pers.getDocuments().length>0) {
                        persh.setDocuments(CommonLib.getDocuments(pers));
                    }
                    if (pers.getFinDetails() != null && pers.getFinDetails().length>0) {
                        persh.setFinDetails(CommonLib.getFinDetail(pers));
                    }
                    if (pers.getPhones() != null && pers.getPhones().length>0) {
                        persh.setPhones(CommonLib.getPhones(pers));
                    }
                    if (pers.getRBank() != null ) {
                        persh.setRBank(CommonLib.getRBank(pers));
                    }
                    if (pers.getResidentships() != null && pers.getResidentships().length>0) {
                        persh.setResidentships(CommonLib.getResident(pers));
                    }
                    if (pers.getBirthDate() != null ) {
                        persh.setBirthDate(CommonLib.GetGregorianDate(pers.getBirthDate()));
                    }
                    if (pers.getBirthPlace() != null ) {
                        persh.setBirthPlace(CommonLib.MakeString(_BirthPlace_QNAME,pers.getBirthPlace()));
                    }
                    if (pers.getFirstName() != null ) {
                        persh.setFirstName(CommonLib.MakeString(_FirstName_QNAME,pers.getFirstName()));
                    }
                    if (pers.getLastName() != null ) {
                        persh.setLastName(CommonLib.MakeString(_LastName_QNAME,pers.getLastName()));
                    }
                    if (pers.getMiddleName() != null ) {
                        persh.setMiddleName(CommonLib.MakeString(_MiddleName_QNAME,pers.getMiddleName()));
                    }
                    if (pers.getFirstNameLat() != null ) {
                        persh.setFirstNameLat(CommonLib.MakeString(_FirstNameLat_QNAME,pers.getFirstNameLat()));
                    }
                    if (pers.getLastNameLat() != null ) {
                        persh.setLastNameLat(CommonLib.MakeString(_LastNameLat_QNAME,pers.getLastNameLat()));
                    }
                    if (pers.getMiddleNameLat() != null ) {
                        persh.setMiddleNameLat(CommonLib.MakeString(_MiddleNameLat_QNAME,pers.getMiddleNameLat()));
                    }
                    if (pers.getUnistreamCardNumber() != null ) {
                        persh.setUnistreamCardNumber(CommonLib.MakeString(_UnistreamCardNumber_QNAME,pers.getUnistreamCardNumber()));
                    }
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
                    throw new Exception("CreatePerson returned error: " + ex.getMessage());}
    }
    public static CreatePersonResponseMessage CreatePersonJAXb(org.datacontract.schemas._2004._07.wcfservicelib.Person persh) throws Exception {
        try
                {
                    CreatePersonRequestMessage cprm = new CreatePersonRequestMessage();
                    org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    JAXBElement<org.datacontract.schemas._2004._07.wcfservicelib.Person> persel = factory.createPerson(persh);
                    cprm.setAuthenticationHeader(ahh);
                    cprm.setPerson(persel);
//
                    com.unistream.test.wcflib.CreatePerson ftxml = new com.unistream.test.wcflib.CreatePerson();
                    ftxml.setRequestMessage(factory.createCreatePersonRequestMessage(cprm));
                    CommonLib.printXml(ftxml);
// 
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    CreatePersonResponseMessage rm = service.createPerson(cprm);
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getPerson().getValue().getID());
                    return rm;
               } catch (Exception ex) {
                    throw new Exception("CreatePerson returned error: " + ex.getMessage());}
    }

}

