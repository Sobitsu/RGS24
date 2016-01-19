
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.ReturnTransferResponseMessageType;


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
 *         &lt;element name="ReturnTransferResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ReturnTransferResponseMessage" minOccurs="0"/>
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
    "returnTransferResult"
})
@XmlRootElement(name = "ReturnTransferResponse")
public class ReturnTransferResponse {

    @XmlElementRef(name = "ReturnTransferResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReturnTransferResponseMessageType> returnTransferResult;

    /**
     * Gets the value of the returnTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReturnTransferResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<ReturnTransferResponseMessageType> getReturnTransferResult() {
        return returnTransferResult;
    }

    /**
     * Sets the value of the returnTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReturnTransferResponseMessageType }{@code >}
     *     
     */
    public void setReturnTransferResult(JAXBElement<ReturnTransferResponseMessageType> value) {
        this.returnTransferResult = value;
    }

}
