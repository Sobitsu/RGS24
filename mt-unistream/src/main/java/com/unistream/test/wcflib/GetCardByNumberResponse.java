
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCardByNumberResponseMessage;


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
 *         &lt;element name="GetCardByNumberResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card}GetCardByNumberResponseMessage" minOccurs="0"/>
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
    "getCardByNumberResult"
})
@XmlRootElement(name = "GetCardByNumberResponse")
public class GetCardByNumberResponse {

    @XmlElementRef(name = "GetCardByNumberResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetCardByNumberResponseMessage> getCardByNumberResult;

    /**
     * Gets the value of the getCardByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetCardByNumberResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetCardByNumberResponseMessage> getGetCardByNumberResult() {
        return getCardByNumberResult;
    }

    /**
     * Sets the value of the getCardByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetCardByNumberResponseMessage }{@code >}
     *     
     */
    public void setGetCardByNumberResult(JAXBElement<GetCardByNumberResponseMessage> value) {
        this.getCardByNumberResult = value;
    }

}
