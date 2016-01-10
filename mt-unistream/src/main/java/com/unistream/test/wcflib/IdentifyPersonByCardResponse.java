
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.IdentifyPersonByCardResponseMessage;


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
 *         &lt;element name="IdentifyPersonByCardResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}IdentifyPersonByCardResponseMessage" minOccurs="0"/>
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
    "identifyPersonByCardResult"
})
@XmlRootElement(name = "IdentifyPersonByCardResponse")
public class IdentifyPersonByCardResponse {

    @XmlElementRef(name = "IdentifyPersonByCardResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentifyPersonByCardResponseMessage> identifyPersonByCardResult;

    /**
     * Gets the value of the identifyPersonByCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentifyPersonByCardResponseMessage }{@code >}
     *     
     */
    public JAXBElement<IdentifyPersonByCardResponseMessage> getIdentifyPersonByCardResult() {
        return identifyPersonByCardResult;
    }

    /**
     * Sets the value of the identifyPersonByCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentifyPersonByCardResponseMessage }{@code >}
     *     
     */
    public void setIdentifyPersonByCardResult(JAXBElement<IdentifyPersonByCardResponseMessage> value) {
        this.identifyPersonByCardResult = ((JAXBElement<IdentifyPersonByCardResponseMessage> ) value);
    }

}
