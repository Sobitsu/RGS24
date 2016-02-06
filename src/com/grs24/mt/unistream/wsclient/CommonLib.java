/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import javax.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;
import com.grs24.mt.unistream.Constants;
import java.io.StringWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferRequestMessage;

/**
 *
 * @author Dale
 */
public class CommonLib {
        public static void CheckFault(WsResponse response) {

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
                    ah.setAppKey(factory.createAuthenticationHeaderAppKey(Constants.KEY_USER_AUTHED_APIKEY));
                    ah.setUsername(factory.createAuthenticationHeaderUsername(Constants.KEY_USER_AUTHED_LOGIN));
                    ah.setPassword(factory.createAuthenticationHeaderPassword(Constants.KEY_USER_AUTHED_PASSWORD));
                    return ahh;
                }
        
        public static JAXBElement<String> MakeString(QName qname, String value)
                {
                    return new JAXBElement<String>(qname, String.class, null, value);
                }

        public static XMLGregorianCalendar GetGregorianDate(Date date) {
            try {
                GregorianCalendar gregory = new GregorianCalendar();
                gregory.setTime(date);
                XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregory);
                return calendar;
            } catch (Exception ex) {
                    System.out.print(ex.getMessage());
                return null;
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
    
