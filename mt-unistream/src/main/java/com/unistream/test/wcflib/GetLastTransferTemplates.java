
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetLastTransferTemplatesRequestMessage;


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
 *         &lt;element name="requestMsg" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}GetLastTransferTemplatesRequestMessage" minOccurs="0"/>
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
    "requestMsg"
})
@XmlRootElement(name = "GetLastTransferTemplates")
public class GetLastTransferTemplates {

    @XmlElementRef(name = "requestMsg", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetLastTransferTemplatesRequestMessage> requestMsg;

    /**
     * Gets the value of the requestMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetLastTransferTemplatesRequestMessage }{@code >}
     *     
     */
    public JAXBElement<GetLastTransferTemplatesRequestMessage> getRequestMsg() {
        return requestMsg;
    }

    /**
     * Sets the value of the requestMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetLastTransferTemplatesRequestMessage }{@code >}
     *     
     */
    public void setRequestMsg(JAXBElement<GetLastTransferTemplatesRequestMessage> value) {
        this.requestMsg = ((JAXBElement<GetLastTransferTemplatesRequestMessage> ) value);
    }

}
