/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.dto.Person;
import com.unistream.test.wcflib.IWebService;
import com.unistream.test.wcflib.WebService;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;

/**
 *
 * @author Dale
 */
public class FindPerson {

public static FindPersonResponseMessage FindPerson(Person pers) throws Exception {
        try
                {
                    FindPersonRequestMessage fprm = new FindPersonRequestMessage();
                    com.microsoft.schemas._2003._10.serialization.ObjectFactory factory = new com.microsoft.schemas._2003._10.serialization.ObjectFactory();
                    JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                    fprm.setAuthenticationHeader(ahh);
                    fprm.setBirthDate(CommonLib.GetGregorianDate(pers.getBirthDate()));
                    fprm.setFirstname(factory.createString(pers.getFirstName()));
                    fprm.setLastname(factory.createString(pers.getLastName()));
                    fprm.setMiddlename(factory.createString(pers.getMiddleName()));
                    if (pers.getDocuments() != null &&  pers.getDocuments().length>0) {
                        fprm.setDocNumber(factory.createString(pers.getDocuments()[1].getNumber()));
                        fprm.setDocSeries(factory.createString(pers.getDocuments()[1].getSeries()));
                        fprm.setDocIssueDate(CommonLib.GetGregorianDate(pers.getDocuments()[1].getIssueDate()));
                        fprm.setDocExpiryDate(CommonLib.GetGregorianDate(pers.getDocuments()[1].getExpiryDate()));
                    }
                    if (pers.getPhones() != null && pers.getPhones().length>0) {
                        fprm.setPhoneArea(factory.createString(pers.getPhones()[1].getAreaCode()));
                        fprm.setPhoneNumber(factory.createString(pers.getPhones()[1].getNumber()));
                        fprm.setPhoneCountryID(pers.getPhones()[1].getCountryID());
                    }
                    if (pers.getUnistreamCardNumber()!= null && !pers.getUnistreamCardNumber().isEmpty()){
                        fprm.setUnistreamCardNumber(factory.createString(pers.getUnistreamCardNumber()));
                    }
                    IWebService service = new WebService().getWS2007HttpBindingIWebService();
                    FindPersonResponseMessage rm = service.findPerson(fprm);
                    
                    //delete
			   JAXBContext context = JAXBContext.newInstance(FindPersonRequestMessage.class);
			   StringWriter writer = new StringWriter();
                           Marshaller marshaller = context.createMarshaller();
			   marshaller.marshal(fprm,writer);
                           String stringXML = writer.toString();
                           System.out.println(stringXML);
                    //delete
                    
                    CommonLib.CheckFault(rm);
                    System.out.println(rm.getPersons().getValue().getPerson().get(0).getID().toString());
                    return rm;
               } catch (Exception ex) {
                    throw new UnsupportedOperationException("Unistream returned error: " + ex.getMessage());}
    }
}
