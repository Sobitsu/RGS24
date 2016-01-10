
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferResponseMessage;


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
 *         &lt;element name="InsertTransferResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}InsertTransferResponseMessage" minOccurs="0"/>
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
    "insertTransferResult"
})
@XmlRootElement(name = "InsertTransferResponse")
public class InsertTransferResponse {

    @XmlElementRef(name = "InsertTransferResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<InsertTransferResponseMessage> insertTransferResult;

    /**
     * Gets the value of the insertTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsertTransferResponseMessage }{@code >}
     *     
     */
    public JAXBElement<InsertTransferResponseMessage> getInsertTransferResult() {
        return insertTransferResult;
    }

    /**
     * Sets the value of the insertTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsertTransferResponseMessage }{@code >}
     *     
     */
    public void setInsertTransferResult(JAXBElement<InsertTransferResponseMessage> value) {
        this.insertTransferResult = ((JAXBElement<InsertTransferResponseMessage> ) value);
    }

}
