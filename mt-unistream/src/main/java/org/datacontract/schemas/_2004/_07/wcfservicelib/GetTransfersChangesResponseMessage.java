
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransfersChangesResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransfersChangesResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Transfers" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfTransfer" minOccurs="0"/>
 *         &lt;element name="UpdateCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransfersChangesResponseMessage", propOrder = {
    "transfers",
    "updateCount"
})
public class GetTransfersChangesResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "Transfers", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTransfer> transfers;
    @XmlElement(name = "UpdateCount")
    protected Long updateCount;

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

    /**
     * Gets the value of the updateCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdateCount() {
        return updateCount;
    }

    /**
     * Sets the value of the updateCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdateCount(Long value) {
        this.updateCount = value;
    }

}
