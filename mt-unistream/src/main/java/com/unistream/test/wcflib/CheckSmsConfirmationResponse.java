
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.CheckSMSConfirmationResponseMessageType;


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
 *         &lt;element name="CheckSmsConfirmationResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}CheckSMSConfirmationResponseMessage" minOccurs="0"/>
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
    "checkSmsConfirmationResult"
})
@XmlRootElement(name = "CheckSmsConfirmationResponse")
public class CheckSmsConfirmationResponse {

    @XmlElementRef(name = "CheckSmsConfirmationResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<CheckSMSConfirmationResponseMessageType> checkSmsConfirmationResult;

    /**
     * Gets the value of the checkSmsConfirmationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CheckSMSConfirmationResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<CheckSMSConfirmationResponseMessageType> getCheckSmsConfirmationResult() {
        return checkSmsConfirmationResult;
    }

    /**
     * Sets the value of the checkSmsConfirmationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CheckSMSConfirmationResponseMessageType }{@code >}
     *     
     */
    public void setCheckSmsConfirmationResult(JAXBElement<CheckSMSConfirmationResponseMessageType> value) {
        this.checkSmsConfirmationResult = value;
    }

}
