
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetTaxesResponseMessage;


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
 *         &lt;element name="GetTaxesResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax}GetTaxesResponseMessage" minOccurs="0"/>
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
    "getTaxesResult"
})
@XmlRootElement(name = "GetTaxesResponse")
public class GetTaxesResponse {

    @XmlElementRef(name = "GetTaxesResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetTaxesResponseMessage> getTaxesResult;

    /**
     * Gets the value of the getTaxesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetTaxesResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetTaxesResponseMessage> getGetTaxesResult() {
        return getTaxesResult;
    }

    /**
     * Sets the value of the getTaxesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetTaxesResponseMessage }{@code >}
     *     
     */
    public void setGetTaxesResult(JAXBElement<GetTaxesResponseMessage> value) {
        this.getTaxesResult = value;
    }

}
