
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for GetBankInfosChangesResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBankInfosChangesResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="BankInfos" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo}ArrayOfBankInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBankInfosChangesResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", propOrder = {
    "bankInfos"
})
public class GetBankInfosChangesResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "BankInfos", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBankInfo> bankInfos;

    /**
     * Gets the value of the bankInfos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBankInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBankInfo> getBankInfos() {
        return bankInfos;
    }

    /**
     * Sets the value of the bankInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBankInfo }{@code >}
     *     
     */
    public void setBankInfos(JAXBElement<ArrayOfBankInfo> value) {
        this.bankInfos = value;
    }

}
