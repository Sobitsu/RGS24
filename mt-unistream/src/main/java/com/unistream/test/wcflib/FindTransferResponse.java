
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessageType;


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
 *         &lt;element name="FindTransferResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}FindTransferResponseMessage" minOccurs="0"/>
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
    "findTransferResult"
})
@XmlRootElement(name = "FindTransferResponse")
public class FindTransferResponse {

    @XmlElementRef(name = "FindTransferResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<FindTransferResponseMessageType> findTransferResult;

    /**
     * Gets the value of the findTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FindTransferResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<FindTransferResponseMessageType> getFindTransferResult() {
        return findTransferResult;
    }

    /**
     * Sets the value of the findTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FindTransferResponseMessageType }{@code >}
     *     
     */
    public void setFindTransferResult(JAXBElement<FindTransferResponseMessageType> value) {
        this.findTransferResult = value;
    }

}
