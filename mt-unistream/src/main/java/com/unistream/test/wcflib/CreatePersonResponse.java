
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessageType;


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
 *         &lt;element name="CreatePersonResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}CreatePersonResponseMessage" minOccurs="0"/>
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
    "createPersonResult"
})
@XmlRootElement(name = "CreatePersonResponse")
public class CreatePersonResponse {

    @XmlElementRef(name = "CreatePersonResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<CreatePersonResponseMessageType> createPersonResult;

    /**
     * Gets the value of the createPersonResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreatePersonResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<CreatePersonResponseMessageType> getCreatePersonResult() {
        return createPersonResult;
    }

    /**
     * Sets the value of the createPersonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreatePersonResponseMessageType }{@code >}
     *     
     */
    public void setCreatePersonResult(JAXBElement<CreatePersonResponseMessageType> value) {
        this.createPersonResult = value;
    }

}
