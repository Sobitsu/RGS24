
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.PrepareNoticeResponseMessageType;


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
 *         &lt;element name="PrepareNoticeResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}PrepareNoticeResponseMessage" minOccurs="0"/>
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
    "prepareNoticeResult"
})
@XmlRootElement(name = "PrepareNoticeResponse")
public class PrepareNoticeResponse {

    @XmlElementRef(name = "PrepareNoticeResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<PrepareNoticeResponseMessageType> prepareNoticeResult;

    /**
     * Gets the value of the prepareNoticeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrepareNoticeResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<PrepareNoticeResponseMessageType> getPrepareNoticeResult() {
        return prepareNoticeResult;
    }

    /**
     * Sets the value of the prepareNoticeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrepareNoticeResponseMessageType }{@code >}
     *     
     */
    public void setPrepareNoticeResult(JAXBElement<PrepareNoticeResponseMessageType> value) {
        this.prepareNoticeResult = value;
    }

}
