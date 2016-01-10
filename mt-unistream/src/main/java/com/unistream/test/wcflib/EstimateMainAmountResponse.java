
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.EstimateMainAmountResponseMessage;


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
 *         &lt;element name="EstimateMainAmountResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}EstimateMainAmountResponseMessage" minOccurs="0"/>
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
    "estimateMainAmountResult"
})
@XmlRootElement(name = "EstimateMainAmountResponse")
public class EstimateMainAmountResponse {

    @XmlElementRef(name = "EstimateMainAmountResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<EstimateMainAmountResponseMessage> estimateMainAmountResult;

    /**
     * Gets the value of the estimateMainAmountResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EstimateMainAmountResponseMessage }{@code >}
     *     
     */
    public JAXBElement<EstimateMainAmountResponseMessage> getEstimateMainAmountResult() {
        return estimateMainAmountResult;
    }

    /**
     * Sets the value of the estimateMainAmountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EstimateMainAmountResponseMessage }{@code >}
     *     
     */
    public void setEstimateMainAmountResult(JAXBElement<EstimateMainAmountResponseMessage> value) {
        this.estimateMainAmountResult = ((JAXBElement<EstimateMainAmountResponseMessage> ) value);
    }

}
