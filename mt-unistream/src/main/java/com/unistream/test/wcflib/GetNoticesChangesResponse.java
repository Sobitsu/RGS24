
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesChangesResponseMessage;


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
 *         &lt;element name="GetNoticesChangesResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}GetNoticesChangesResponseMessage" minOccurs="0"/>
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
    "getNoticesChangesResult"
})
@XmlRootElement(name = "GetNoticesChangesResponse")
public class GetNoticesChangesResponse {

    @XmlElementRef(name = "GetNoticesChangesResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetNoticesChangesResponseMessage> getNoticesChangesResult;

    /**
     * Gets the value of the getNoticesChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetNoticesChangesResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetNoticesChangesResponseMessage> getGetNoticesChangesResult() {
        return getNoticesChangesResult;
    }

    /**
     * Sets the value of the getNoticesChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetNoticesChangesResponseMessage }{@code >}
     *     
     */
    public void setGetNoticesChangesResult(JAXBElement<GetNoticesChangesResponseMessage> value) {
        this.getNoticesChangesResult = ((JAXBElement<GetNoticesChangesResponseMessage> ) value);
    }

}
