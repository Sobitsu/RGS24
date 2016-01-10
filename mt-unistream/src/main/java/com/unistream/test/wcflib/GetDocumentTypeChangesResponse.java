
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesResponseMessage;


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
 *         &lt;element name="GetDocumentTypeChangesResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType}GetDocumentTypeChangesResponseMessage" minOccurs="0"/>
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
    "getDocumentTypeChangesResult"
})
@XmlRootElement(name = "GetDocumentTypeChangesResponse")
public class GetDocumentTypeChangesResponse {

    @XmlElementRef(name = "GetDocumentTypeChangesResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetDocumentTypeChangesResponseMessage> getDocumentTypeChangesResult;

    /**
     * Gets the value of the getDocumentTypeChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetDocumentTypeChangesResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetDocumentTypeChangesResponseMessage> getGetDocumentTypeChangesResult() {
        return getDocumentTypeChangesResult;
    }

    /**
     * Sets the value of the getDocumentTypeChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetDocumentTypeChangesResponseMessage }{@code >}
     *     
     */
    public void setGetDocumentTypeChangesResult(JAXBElement<GetDocumentTypeChangesResponseMessage> value) {
        this.getDocumentTypeChangesResult = ((JAXBElement<GetDocumentTypeChangesResponseMessage> ) value);
    }

}
