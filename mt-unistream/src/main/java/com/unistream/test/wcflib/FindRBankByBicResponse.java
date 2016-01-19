
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRBankByBicResponseMessageType;


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
 *         &lt;element name="FindRBankByBicResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank}FindRBankByBicResponseMessage" minOccurs="0"/>
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
    "findRBankByBicResult"
})
@XmlRootElement(name = "FindRBankByBicResponse")
public class FindRBankByBicResponse {

    @XmlElementRef(name = "FindRBankByBicResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<FindRBankByBicResponseMessageType> findRBankByBicResult;

    /**
     * Gets the value of the findRBankByBicResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FindRBankByBicResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<FindRBankByBicResponseMessageType> getFindRBankByBicResult() {
        return findRBankByBicResult;
    }

    /**
     * Sets the value of the findRBankByBicResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FindRBankByBicResponseMessageType }{@code >}
     *     
     */
    public void setFindRBankByBicResult(JAXBElement<FindRBankByBicResponseMessageType> value) {
        this.findRBankByBicResult = value;
    }

}
