
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.ActivatePrepaidCardRequestMessageType;


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
 *         &lt;element name="requestMessage" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ActivatePrepaidCardRequestMessage" minOccurs="0"/>
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
    "requestMessage"
})
@XmlRootElement(name = "ActivatePrepaidCard")
public class ActivatePrepaidCard {

    @XmlElementRef(name = "requestMessage", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<ActivatePrepaidCardRequestMessageType> requestMessage;

    /**
     * Gets the value of the requestMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivatePrepaidCardRequestMessageType }{@code >}
     *     
     */
    public JAXBElement<ActivatePrepaidCardRequestMessageType> getRequestMessage() {
        return requestMessage;
    }

    /**
     * Sets the value of the requestMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivatePrepaidCardRequestMessageType }{@code >}
     *     
     */
    public void setRequestMessage(JAXBElement<ActivatePrepaidCardRequestMessageType> value) {
        this.requestMessage = value;
    }

}
