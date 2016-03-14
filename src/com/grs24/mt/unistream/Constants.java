package com.grs24.mt.unistream;

import javax.xml.namespace.QName;

/**
 *
 * @author Dale
 */
public interface Constants 
{

        public final QName _FirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "FirstName");
        public final QName _LastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "LastName");
        public final QName _MiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "MiddleName");
        public final QName _DocNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocNumber");
        public final QName _DocSeries_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "DocSeries");
        public final QName _PhoneArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneArea");
        public final QName _PhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PhoneNumber");
        public final QName _Phone_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Phone");
        public final QName _UnistreamCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "UnistreamCardNumber");
        public final QName _DocNumber1_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Number");
        public final QName _DocSeries1_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Series");
        public final QName _Ext_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Ext");
        public final QName _Issuer_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Issuer");
        public final QName _IssuerCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "IssuerCode");
        public final QName _FinDetailNumberNumber_QNAME= new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Number");
        public final QName _Bic_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Bic");
        public final QName _City_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "City");
        public final QName _CorrespondentAcc_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "CorrespondentAcc");
        public final QName _Building_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Building");
        public final QName _PACity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "City");
        public final QName _Flat_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Flat");
        public final QName _House_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "House");
        public final QName _Street_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Street");
        public final QName _PostalCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "PostalCode");
        public final QName _PersonAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "Address");
        public final QName _ControlNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib", "ControlNumber");
        public final String PROPERTY_KEY_SERVER_REQUEST_TUMEOUT = "SERVER.REQUEST_TIMEOUT";
        public final String PROPERTY_KEY_SERVER_CONNECT_TUMEOUT = "SERVER.CONNECT_TIMEOUT";
        public final String PROPERTY_KEY_USER_AUTHED_APIKEY = "APIKEY";
        public final String PROPERTY_KEY_USER_AUTHED_LOGIN = "LOGIN";
        public final String PROPERTY_KEY_USER_AUTHED_PASSWORD = "PASSWORD";
        public final String PROPERTY_KEY_JKS_KEYSTORE_KEY = "KEYSTORE.PKCS12";
        public final String PROPERTY_KEY_JKS_KEYSTORE_PASSWORD = "KEYSTORE.PASSWORD";
        public final String PROPERTY_KEY_JKS_KEY_PASSWORD = "KEY.PASSWORD";
        public final String PROPERTY_KEY_JKS_TRUSTSTORE_KEY = "TRUSTSTORE.JKS";
        public final String PROPERTY_KEY_JKS_TRUSTSTORE_PASSWORD = "TRUSTSTORE.PASSWORD";
        public final String PROPERTY_KEY_JKS_KEYSTORE_TYPE = "KEYSTORE.TYPE";
        public final String PROPERTY_KEY_JKS_TRUSTSTORE_TYPE = "TRUSTSTORE.TYPE";

        public final String PROPERTY_KEY_BANK_ID = "BANKID";
        public final String PROPERTY_KEY_PART_ID = "PARTID";
        public final Integer DEFAULT_REQUEST_TIMEOUT = 3000;
        public final Integer DEFAULT_CONNECT_TIMEOUT = 1000;
        public final String CODE_PASSPORT_RF = "35";
}
