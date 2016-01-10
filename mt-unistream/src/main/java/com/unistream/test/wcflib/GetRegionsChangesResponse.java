
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetRegionsChangesResponseMessage;


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
 *         &lt;element name="GetRegionsChangesResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region}GetRegionsChangesResponseMessage" minOccurs="0"/>
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
    "getRegionsChangesResult"
})
@XmlRootElement(name = "GetRegionsChangesResponse")
public class GetRegionsChangesResponse {

    @XmlElementRef(name = "GetRegionsChangesResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetRegionsChangesResponseMessage> getRegionsChangesResult;

    /**
     * Gets the value of the getRegionsChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetRegionsChangesResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetRegionsChangesResponseMessage> getGetRegionsChangesResult() {
        return getRegionsChangesResult;
    }

    /**
     * Sets the value of the getRegionsChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetRegionsChangesResponseMessage }{@code >}
     *     
     */
    public void setGetRegionsChangesResult(JAXBElement<GetRegionsChangesResponseMessage> value) {
        this.getRegionsChangesResult = ((JAXBElement<GetRegionsChangesResponseMessage> ) value);
    }

}
