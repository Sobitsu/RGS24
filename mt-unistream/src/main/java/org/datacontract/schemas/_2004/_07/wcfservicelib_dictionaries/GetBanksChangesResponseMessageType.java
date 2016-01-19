
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for GetBanksChangesResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBanksChangesResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Banks" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank}ArrayOfBank" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBanksChangesResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", propOrder = {
    "banks"
})
public class GetBanksChangesResponseMessageType
    extends WsResponse
{

    @XmlElementRef(name = "Banks", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBankType> banks;

    /**
     * Gets the value of the banks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBankType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBankType> getBanks() {
        return banks;
    }

    /**
     * Sets the value of the banks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBankType }{@code >}
     *     
     */
    public void setBanks(JAXBElement<ArrayOfBankType> value) {
        this.banks = value;
    }

}
