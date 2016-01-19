
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertTransferResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertTransferResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
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
@XmlType(name = "InsertTransferResponseMessage", propOrder = {
    "transfer"
})
public class InsertTransferResponseMessageType
    extends WsResponse
{

    @XmlElementRef(name = "Transfer", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferType> transfer;

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferType }{@code >}
     *     
     */
    public JAXBElement<TransferType> getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferType }{@code >}
     *     
     */
    public void setTransfer(JAXBElement<TransferType> value) {
        this.transfer = value;
    }

}
