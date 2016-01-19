
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticeByIDResponseMessageType;


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
 *         &lt;element name="GetNoticeByIDResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}GetNoticeByIDResponseMessage" minOccurs="0"/>
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
    "getNoticeByIDResult"
})
@XmlRootElement(name = "GetNoticeByIDResponse")
public class GetNoticeByIDResponse {

    @XmlElementRef(name = "GetNoticeByIDResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetNoticeByIDResponseMessageType> getNoticeByIDResult;

    /**
     * Gets the value of the getNoticeByIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetNoticeByIDResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<GetNoticeByIDResponseMessageType> getGetNoticeByIDResult() {
        return getNoticeByIDResult;
    }

    /**
     * Sets the value of the getNoticeByIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetNoticeByIDResponseMessageType }{@code >}
     *     
     */
    public void setGetNoticeByIDResult(JAXBElement<GetNoticeByIDResponseMessageType> value) {
        this.getNoticeByIDResult = value;
    }

}
