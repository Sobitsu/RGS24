
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesResponseMessage;


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
 *         &lt;element name="GetBankInfosChangesResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo}GetBankInfosChangesResponseMessage" minOccurs="0"/>
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
    "getBankInfosChangesResult"
})
@XmlRootElement(name = "GetBankInfosChangesResponse")
public class GetBankInfosChangesResponse {

    @XmlElementRef(name = "GetBankInfosChangesResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetBankInfosChangesResponseMessage> getBankInfosChangesResult;

    /**
     * Gets the value of the getBankInfosChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetBankInfosChangesResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetBankInfosChangesResponseMessage> getGetBankInfosChangesResult() {
        return getBankInfosChangesResult;
    }

    /**
     * Sets the value of the getBankInfosChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetBankInfosChangesResponseMessage }{@code >}
     *     
     */
    public void setGetBankInfosChangesResult(JAXBElement<GetBankInfosChangesResponseMessage> value) {
        this.getBankInfosChangesResult = value;
    }

}
