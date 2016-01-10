
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessage;


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
 *         &lt;element name="PayoutTransferResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}PayoutTransferResponseMessage" minOccurs="0"/>
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
    "payoutTransferResult"
})
@XmlRootElement(name = "PayoutTransferResponse")
public class PayoutTransferResponse {

    @XmlElementRef(name = "PayoutTransferResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<PayoutTransferResponseMessage> payoutTransferResult;

    /**
     * Gets the value of the payoutTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PayoutTransferResponseMessage }{@code >}
     *     
     */
    public JAXBElement<PayoutTransferResponseMessage> getPayoutTransferResult() {
        return payoutTransferResult;
    }

    /**
     * Sets the value of the payoutTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PayoutTransferResponseMessage }{@code >}
     *     
     */
    public void setPayoutTransferResult(JAXBElement<PayoutTransferResponseMessage> value) {
        this.payoutTransferResult = ((JAXBElement<PayoutTransferResponseMessage> ) value);
    }

}
