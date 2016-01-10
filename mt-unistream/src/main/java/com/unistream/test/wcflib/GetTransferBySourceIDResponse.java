
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferBySourceIDResponseMessage;


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
 *         &lt;element name="GetTransferBySourceIDResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}GetTransferBySourceIDResponseMessage" minOccurs="0"/>
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
    "getTransferBySourceIDResult"
})
@XmlRootElement(name = "GetTransferBySourceIDResponse")
public class GetTransferBySourceIDResponse {

    @XmlElementRef(name = "GetTransferBySourceIDResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<GetTransferBySourceIDResponseMessage> getTransferBySourceIDResult;

    /**
     * Gets the value of the getTransferBySourceIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GetTransferBySourceIDResponseMessage }{@code >}
     *     
     */
    public JAXBElement<GetTransferBySourceIDResponseMessage> getGetTransferBySourceIDResult() {
        return getTransferBySourceIDResult;
    }

    /**
     * Sets the value of the getTransferBySourceIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GetTransferBySourceIDResponseMessage }{@code >}
     *     
     */
    public void setGetTransferBySourceIDResult(JAXBElement<GetTransferBySourceIDResponseMessage> value) {
        this.getTransferBySourceIDResult = ((JAXBElement<GetTransferBySourceIDResponseMessage> ) value);
    }

}
