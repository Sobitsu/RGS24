
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForVirtualPrepaidCardResponseMessage;


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
 *         &lt;element name="CreateAndSendNewPinForPrepaidCardResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card}CreateAndSendNewPinForVirtualPrepaidCardResponseMessage" minOccurs="0"/>
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
    "createAndSendNewPinForPrepaidCardResult"
})
@XmlRootElement(name = "CreateAndSendNewPinForPrepaidCardResponse")
public class CreateAndSendNewPinForPrepaidCardResponse {

    @XmlElementRef(name = "CreateAndSendNewPinForPrepaidCardResult", namespace = "http://test.unistream.com/wcflib/", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardResponseMessage> createAndSendNewPinForPrepaidCardResult;

    /**
     * Gets the value of the createAndSendNewPinForPrepaidCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForVirtualPrepaidCardResponseMessage }{@code >}
     *     
     */
    public JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardResponseMessage> getCreateAndSendNewPinForPrepaidCardResult() {
        return createAndSendNewPinForPrepaidCardResult;
    }

    /**
     * Sets the value of the createAndSendNewPinForPrepaidCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForVirtualPrepaidCardResponseMessage }{@code >}
     *     
     */
    public void setCreateAndSendNewPinForPrepaidCardResult(JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardResponseMessage> value) {
        this.createAndSendNewPinForPrepaidCardResult = value;
    }

}