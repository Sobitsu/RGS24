
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersChangesResponseMessageType;


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
 *         &lt;element name="GetTransfersChangesResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}GetTransfersChangesResponseMessage" minOccurs="0"/>
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
    "getTransfersChangesResult"
})
@XmlRootElement(name = "GetTransfersChangesResponse")
public class GetTransfersChangesResponse {

    @XmlElementRef(name = "GetTransfersChangesResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetTransfersChangesResponseMessageType> getTransfersChangesResult;

    /**
     * Gets the value of the getTransfersChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetTransfersChangesResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<GetTransfersChangesResponseMessageType> getGetTransfersChangesResult() {
        return getTransfersChangesResult;
    }

    /**
     * Sets the value of the getTransfersChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetTransfersChangesResponseMessageType }{@code >}
     *     
     */
    public void setGetTransfersChangesResult(JAXBElement<GetTransfersChangesResponseMessageType> value) {
        this.getTransfersChangesResult = value;
    }

}
