
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTransfer2RequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTransfer2RequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="CardholderSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}Transfer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTransfer2RequestMessage", propOrder = {
    "cardholderSession",
    "transfer"
})
public class InsertTransfer2RequestMessage
    extends WsRequest
{

    @XmlElementRef(name = "CardholderSession", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardholderSession;
    @XmlElementRef(name = "Transfer", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<Transfer> transfer;

    /**
     * Gets the value of the cardholderSession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardholderSession() {
        return cardholderSession;
    }

    /**
     * Sets the value of the cardholderSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardholderSession(JAXBElement<String> value) {
        this.cardholderSession = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     
     */
    public JAXBElement<Transfer> getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     
     */
    public void setTransfer(JAXBElement<Transfer> value) {
        this.transfer = ((JAXBElement<Transfer> ) value);
    }

}
