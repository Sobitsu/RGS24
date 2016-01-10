
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransfersListResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransfersListResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Transfers" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfTransfer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransfersListResponseMessage", propOrder = {
    "transfers"
})
public class GetTransfersListResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "Transfers", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransfer> transfers;

    /**
     * Gets the value of the transfers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransfer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTransfer> getTransfers() {
        return transfers;
    }

    /**
     * Sets the value of the transfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTransfer }{@code >}
     *     
     */
    public void setTransfers(JAXBElement<ArrayOfTransfer> value) {
        this.transfers = ((JAXBElement<ArrayOfTransfer> ) value);
    }

}
