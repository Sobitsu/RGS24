
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesResponseMessage;


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
 *         &lt;element name="GetCountriesResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country}GetCountriesResponseMessage" minOccurs="0"/>
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
    "getCountriesResult"
})
@XmlRootElement(name = "GetCountriesResponse")
public class GetCountriesResponse {

    @XmlElementRef(name = "GetCountriesResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetCountriesResponseMessage> getCountriesResult;

    /**
     * Gets the value of the getCountriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetCountriesResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetCountriesResponseMessage> getGetCountriesResult() {
        return getCountriesResult;
    }

    /**
     * Sets the value of the getCountriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetCountriesResponseMessage }{@code >}
     *     
     */
    public void setGetCountriesResult(JAXBElement<GetCountriesResponseMessage> value) {
        this.getCountriesResult = value;
    }

}
