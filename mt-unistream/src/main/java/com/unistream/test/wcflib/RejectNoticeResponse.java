
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.RejectNoticeResponseMessageType;


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
 *         &lt;element name="RejectNoticeResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}RejectNoticeResponseMessage" minOccurs="0"/>
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
    "rejectNoticeResult"
})
@XmlRootElement(name = "RejectNoticeResponse")
public class RejectNoticeResponse {

    @XmlElementRef(name = "RejectNoticeResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<RejectNoticeResponseMessageType> rejectNoticeResult;

    /**
     * Gets the value of the rejectNoticeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RejectNoticeResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<RejectNoticeResponseMessageType> getRejectNoticeResult() {
        return rejectNoticeResult;
    }

    /**
     * Sets the value of the rejectNoticeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RejectNoticeResponseMessageType }{@code >}
     *     
     */
    public void setRejectNoticeResult(JAXBElement<RejectNoticeResponseMessageType> value) {
        this.rejectNoticeResult = value;
    }

}
