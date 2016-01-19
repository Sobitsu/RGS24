
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.ActivatePrepaidCardResponseMessageType;


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
 *         &lt;element name="ActivatePrepaidCardResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ActivatePrepaidCardResponseMessage" minOccurs="0"/>
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
    "activatePrepaidCardResult"
})
@XmlRootElement(name = "ActivatePrepaidCardResponse")
public class ActivatePrepaidCardResponse {

    @XmlElementRef(name = "ActivatePrepaidCardResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<ActivatePrepaidCardResponseMessageType> activatePrepaidCardResult;

    /**
     * Gets the value of the activatePrepaidCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivatePrepaidCardResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<ActivatePrepaidCardResponseMessageType> getActivatePrepaidCardResult() {
        return activatePrepaidCardResult;
    }

    /**
     * Sets the value of the activatePrepaidCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivatePrepaidCardResponseMessageType }{@code >}
     *     
     */
    public void setActivatePrepaidCardResult(JAXBElement<ActivatePrepaidCardResponseMessageType> value) {
        this.activatePrepaidCardResult = value;
    }

}
