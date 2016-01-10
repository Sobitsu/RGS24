
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersListResponseMessage;


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
 *         &lt;element name="GetTransfersListResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}GetTransfersListResponseMessage" minOccurs="0"/>
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
    "getTransfersListResult"
})
@XmlRootElement(name = "GetTransfersListResponse")
public class GetTransfersListResponse {

    @XmlElementRef(name = "GetTransfersListResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetTransfersListResponseMessage> getTransfersListResult;

    /**
     * Gets the value of the getTransfersListResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetTransfersListResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetTransfersListResponseMessage> getGetTransfersListResult() {
        return getTransfersListResult;
    }

    /**
     * Sets the value of the getTransfersListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetTransfersListResponseMessage }{@code >}
     *     
     */
    public void setGetTransfersListResult(JAXBElement<GetTransfersListResponseMessage> value) {
        this.getTransfersListResult = ((JAXBElement<GetTransfersListResponseMessage> ) value);
    }

}
