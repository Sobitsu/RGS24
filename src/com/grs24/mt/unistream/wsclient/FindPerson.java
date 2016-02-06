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
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;

/**
 *
 * @author Dale
 */
public class FindPerson {

    private final static QName _FirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "FirstName");
    private final static QName _LastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "LastName");
    private final static QName _MiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "MiddleName");
    private final static QName _DocNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocNumber");
    private final static QName _DocSeries_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocSeries");
    private final static QName _PhoneArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneArea");
    private final static QName _PhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneNumber");
    private final static QName _UnistreamCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "UnistreamCardNumber");

public static FindPersonResponseMessage FindPerson(Person pers) throws Exception {
        try
                {
                    FindPersonRequestMessage fprm = new FindPersonRequestMessage();
                    org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory factory = new org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    fprm.setAuthenticationHeader(ahh);
                    if (pers.getBirthDate() != null) fprm.setBirthDate(CommonLib.GetGregorianDate(pers.getBirthDate()));
                    if (pers.getFirstName() != null) fprm.setFirstname(CommonLib.MakeString(_FirstName_QNAME, pers.getFirstName()));
                    if (pers.getLastName() != null) fprm.setLastname(CommonLib.MakeString(_LastName_QNAME, pers.getLastName()));
                    if (pers.getMiddleName() != null) fprm.setMiddlename(CommonLib.MakeString(_MiddleName_QNAME, pers.getMiddleName()));
                    if (pers.getDocuments() != null &&  pers.getDocuments().length>0) {
                        if (pers.getDocuments()[1].getNumber() != null) fprm.setDocNumber(CommonLib.MakeString(_DocNumber_QNAME,pers.getDocuments()[1].getNumber()));
                        if (pers.getDocuments()[1].getSeries() != null) fprm.setDocSeries(CommonLib.MakeString(_DocSeries_QNAME,pers.getDocuments()[1].getSeries()));
                        if (pers.getDocuments()[1].getIssueDate() != null) fprm.setDocIssueDate(CommonLib.GetGregorianDate(pers.getDocuments()[1].getIssueDate()));
                        if (pers.getDocuments()[1].getExpiryDate() != null) fprm.setDocExpiryDate(CommonLib.GetGregorianDate(pers.getDocuments()[1].getExpiryDate()));
                    }
                    if (pers.getPhones() != null && pers.getPhones().length>0) {
                        if (pers.getPhones()[1].getAreaCode() != null) fprm.setPhoneArea(CommonLib.MakeString(_PhoneArea_QNAME,pers.getPhones()[1].getAreaCode()));
                        if (pers.getPhones()[1].getNumber() != null) fprm.setPhoneNumber(CommonLib.MakeString(_PhoneNumber_QNAME,pers.getPhones()[1].getNumber()));
                        if (pers.getPhones()[1].getCountryID() != null) fprm.setPhoneCountryID(pers.getPhones()[1].getCountryID());
                    }
                    if (pers.getUnistreamCardNumber()!= null && !pers.getUnistreamCardNumber().isEmpty()){
                        if (pers.getUnistreamCardNumber() != null) fprm.setUnistreamCardNumber(CommonLib.MakeString(_UnistreamCardNumber_QNAME,pers.getUnistreamCardNumber()));
                    }
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    FindPersonResponseMessage rm = service.findPerson(fprm);
                    
//
                    com.unistream.test.wcflib.FindPerson ftxml = new com.unistream.test.wcflib.FindPerson();
                    ftxml.setRequestMessage(factory.createFindPersonRequestMessage(fprm));
                    CommonLib.printXml(ftxml);
// 
                   
                    CommonLib.CheckFault(rm);
                    return rm;
               } catch (Exception ex) {
                    throw new Exception("FindPerson returned error: " + ex.getMessage());}
    }
}
