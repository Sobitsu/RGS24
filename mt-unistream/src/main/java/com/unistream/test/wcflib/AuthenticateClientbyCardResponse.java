
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.AuthenticateClientByCardResponseMessage;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticateClientbyCardResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card}AuthenticateClientByCardResponseMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authenticateClientbyCardResult"
})
@XmlRootElement(name = "AuthenticateClientbyCardResponse")
public class AuthenticateClientbyCardResponse {

    @XmlElementRef(name = "AuthenticateClientbyCardResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticateClientByCardResponseMessage> authenticateClientbyCardResult;

    /**
     * Gets the value of the authenticateClientbyCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthenticateClientByCardResponseMessage }{@code >}
     *     
     */
    public JAXBElement<AuthenticateClientByCardResponseMessage> getAuthenticateClientbyCardResult() {
        return authenticateClientbyCardResult;
    }

    /**
     * Sets the value of the authenticateClientbyCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthenticateClientByCardResponseMessage }{@code >}
     *     
     */
    public void setAuthenticateClientbyCardResult(JAXBElement<AuthenticateClientByCardResponseMessage> value) {
        this.authenticateClientbyCardResult = value;
    }

}
