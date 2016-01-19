
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.ConfirmClearingReportResponseMessageType;


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
 *         &lt;element name="ConfirmClearingReportResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ConfirmClearingReportResponseMessage" minOccurs="0"/>
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
    "confirmClearingReportResult"
})
@XmlRootElement(name = "ConfirmClearingReportResponse")
public class ConfirmClearingReportResponse {

    @XmlElementRef(name = "ConfirmClearingReportResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConfirmClearingReportResponseMessageType> confirmClearingReportResult;

    /**
     * Gets the value of the confirmClearingReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConfirmClearingReportResponseMessageType }{@code >}
     *     
     */
    public JAXBElement<ConfirmClearingReportResponseMessageType> getConfirmClearingReportResult() {
        return confirmClearingReportResult;
    }

    /**
     * Sets the value of the confirmClearingReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConfirmClearingReportResponseMessageType }{@code >}
     *     
     */
    public void setConfirmClearingReportResult(JAXBElement<ConfirmClearingReportResponseMessageType> value) {
        this.confirmClearingReportResult = value;
    }

}
