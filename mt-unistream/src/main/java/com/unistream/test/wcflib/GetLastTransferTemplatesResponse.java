
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetLastTransferTemplatesResponseMessage;


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
 *         &lt;element name="GetLastTransferTemplatesResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}GetLastTransferTemplatesResponseMessage" minOccurs="0"/>
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
    "getLastTransferTemplatesResult"
})
@XmlRootElement(name = "GetLastTransferTemplatesResponse")
public class GetLastTransferTemplatesResponse {

    @XmlElementRef(name = "GetLastTransferTemplatesResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLastTransferTemplatesResponseMessage> getLastTransferTemplatesResult;

    /**
     * Gets the value of the getLastTransferTemplatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetLastTransferTemplatesResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetLastTransferTemplatesResponseMessage> getGetLastTransferTemplatesResult() {
        return getLastTransferTemplatesResult;
    }

    /**
     * Sets the value of the getLastTransferTemplatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetLastTransferTemplatesResponseMessage }{@code >}
     *     
     */
    public void setGetLastTransferTemplatesResult(JAXBElement<GetLastTransferTemplatesResponseMessage> value) {
        this.getLastTransferTemplatesResult = ((JAXBElement<GetLastTransferTemplatesResponseMessage> ) value);
    }

}
