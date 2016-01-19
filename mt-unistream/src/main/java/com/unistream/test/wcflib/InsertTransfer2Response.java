
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransfer2ResponseMessageType;


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
 *         &lt;element name="InsertTransfer2Result" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}InsertTransfer2ResponseMessage" minOccurs="0"/>
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
    "insertTransfer2Result"
})
@XmlRootElement(name = "InsertTransfer2Response")
public class InsertTransfer2Response {

    @XmlElementRef(name = "InsertTransfer2Result", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<InsertTransfer2ResponseMessageType> insertTransfer2Result;

    /**
     * Gets the value of the insertTransfer2Result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsertTransfer2ResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<InsertTransfer2ResponseMessageType> getInsertTransfer2Result() {
        return insertTransfer2Result;
    }

    /**
     * Sets the value of the insertTransfer2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsertTransfer2ResponseMessageType }{@code >}
     *     
     */
    public void setInsertTransfer2Result(JAXBElement<InsertTransfer2ResponseMessageType> value) {
        this.insertTransfer2Result = value;
    }

}
