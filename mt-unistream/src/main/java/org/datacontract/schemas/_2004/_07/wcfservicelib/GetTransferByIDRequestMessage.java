
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransferByIDRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransferByIDRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="TransferID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransferByIDRequestMessage", propOrder = {
    "transferID"
})
public class GetTransferByIDRequestMessage
    extends WsRequest
{

    @XmlElement(name = "TransferID")
    protected Integer transferID;

    /**
     * Gets the value of the transferID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransferID() {
        return transferID;
    }

    /**
     * Sets the value of the transferID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransferID(Integer value) {
        this.transferID = value;
    }

}
