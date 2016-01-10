
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.SellPrepaidCardResponseMessage;


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
 *         &lt;element name="SellPrepaidCardResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}SellPrepaidCardResponseMessage" minOccurs="0"/>
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
    "sellPrepaidCardResult"
})
@XmlRootElement(name = "SellPrepaidCardResponse")
public class SellPrepaidCardResponse {

    @XmlElementRef(name = "SellPrepaidCardResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<SellPrepaidCardResponseMessage> sellPrepaidCardResult;

    /**
     * Gets the value of the sellPrepaidCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SellPrepaidCardResponseMessage }{@code >}
     *     
     */
    public JAXBElement<SellPrepaidCardResponseMessage> getSellPrepaidCardResult() {
        return sellPrepaidCardResult;
    }

    /**
     * Sets the value of the sellPrepaidCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SellPrepaidCardResponseMessage }{@code >}
     *     
     */
    public void setSellPrepaidCardResult(JAXBElement<SellPrepaidCardResponseMessage> value) {
        this.sellPrepaidCardResult = ((JAXBElement<SellPrepaidCardResponseMessage> ) value);
    }

}
