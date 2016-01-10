
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonPhoneResponseMessage;


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
 *         &lt;element name="AddPersonPhoneResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}AddPersonPhoneResponseMessage" minOccurs="0"/>
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
    "addPersonPhoneResult"
})
@XmlRootElement(name = "AddPersonPhoneResponse")
public class AddPersonPhoneResponse {

    @XmlElementRef(name = "AddPersonPhoneResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<AddPersonPhoneResponseMessage> addPersonPhoneResult;

    /**
     * Gets the value of the addPersonPhoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddPersonPhoneResponseMessage }{@code >}
     *     
     */
    public JAXBElement<AddPersonPhoneResponseMessage> getAddPersonPhoneResult() {
        return addPersonPhoneResult;
    }

    /**
     * Sets the value of the addPersonPhoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddPersonPhoneResponseMessage }{@code >}
     *     
     */
    public void setAddPersonPhoneResult(JAXBElement<AddPersonPhoneResponseMessage> value) {
        this.addPersonPhoneResult = ((JAXBElement<AddPersonPhoneResponseMessage> ) value);
    }

}
