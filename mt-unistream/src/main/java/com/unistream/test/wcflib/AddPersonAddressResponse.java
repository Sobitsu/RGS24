
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonAddressResponseMessageType;


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
 *         &lt;element name="AddPersonAddressResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}AddPersonAddressResponseMessage" minOccurs="0"/>
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
    "addPersonAddressResult"
})
@XmlRootElement(name = "AddPersonAddressResponse")
public class AddPersonAddressResponse {

    @XmlElementRef(name = "AddPersonAddressResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<AddPersonAddressResponseMessageType> addPersonAddressResult;

    /**
     * Gets the value of the addPersonAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddPersonAddressResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<AddPersonAddressResponseMessageType> getAddPersonAddressResult() {
        return addPersonAddressResult;
    }

    /**
     * Sets the value of the addPersonAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddPersonAddressResponseMessageType }{@code >}
     *     
     */
    public void setAddPersonAddressResult(JAXBElement<AddPersonAddressResponseMessageType> value) {
        this.addPersonAddressResult = value;
    }

}
