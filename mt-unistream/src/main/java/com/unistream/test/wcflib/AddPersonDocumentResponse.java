
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonDocumentResponseMessage;


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
 *         &lt;element name="AddPersonDocumentResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}AddPersonDocumentResponseMessage" minOccurs="0"/>
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
    "addPersonDocumentResult"
})
@XmlRootElement(name = "AddPersonDocumentResponse")
public class AddPersonDocumentResponse {

    @XmlElementRef(name = "AddPersonDocumentResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<AddPersonDocumentResponseMessage> addPersonDocumentResult;

    /**
     * Gets the value of the addPersonDocumentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddPersonDocumentResponseMessage }{@code >}
     *     
     */
    public JAXBElement<AddPersonDocumentResponseMessage> getAddPersonDocumentResult() {
        return addPersonDocumentResult;
    }

    /**
     * Sets the value of the addPersonDocumentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddPersonDocumentResponseMessage }{@code >}
     *     
     */
    public void setAddPersonDocumentResult(JAXBElement<AddPersonDocumentResponseMessage> value) {
        this.addPersonDocumentResult = ((JAXBElement<AddPersonDocumentResponseMessage> ) value);
    }

}
