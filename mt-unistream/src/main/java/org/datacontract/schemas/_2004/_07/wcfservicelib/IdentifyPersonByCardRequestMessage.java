
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentifyPersonByCardRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifyPersonByCardRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="CardCredentials" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}CardCredentials" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifyPersonByCardRequestMessage", propOrder = {
    "cardCredentials"
})
public class IdentifyPersonByCardRequestMessage
    extends WsRequest
{

    @XmlElementRef(name = "CardCredentials", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<CardCredentials> cardCredentials;

    /**
     * Gets the value of the cardCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardCredentials }{@code >}
     *     
     */
    public JAXBElement<CardCredentials> getCardCredentials() {
        return cardCredentials;
    }

    /**
     * Sets the value of the cardCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardCredentials }{@code >}
     *     
     */
    public void setCardCredentials(JAXBElement<CardCredentials> value) {
        this.cardCredentials = ((JAXBElement<CardCredentials> ) value);
    }

}
