
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesListResponseMessageType;


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
 *         &lt;element name="GetNoticesListResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}GetNoticesListResponseMessage" minOccurs="0"/>
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
    "getNoticesListResult"
})
@XmlRootElement(name = "GetNoticesListResponse")
public class GetNoticesListResponse {

    @XmlElementRef(name = "GetNoticesListResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetNoticesListResponseMessageType> getNoticesListResult;

    /**
     * Gets the value of the getNoticesListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetNoticesListResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<GetNoticesListResponseMessageType> getGetNoticesListResult() {
        return getNoticesListResult;
    }

    /**
     * Sets the value of the getNoticesListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetNoticesListResponseMessageType }{@code >}
     *     
     */
    public void setGetNoticesListResult(JAXBElement<GetNoticesListResponseMessageType> value) {
        this.getNoticesListResult = value;
    }

}
