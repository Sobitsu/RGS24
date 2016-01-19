
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for FindRBankByBicResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindRBankByBicResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="RBank" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank}RBank" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindRBankByBicResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", propOrder = {
    "rBank"
})
public class FindRBankByBicResponseMessageType
    extends WsResponse
{

    @XmlElementRef(name = "RBank", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", type = JAXBElement.class, required = false)
    protected JAXBElement<RBankType> rBank;

    /**
     * Gets the value of the rBank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RBankType }{@code >}
     *     
     */
    public JAXBElement<RBankType> getRBank() {
        return rBank;
    }

    /**
     * Sets the value of the rBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RBankType }{@code >}
     *     
     */
    public void setRBank(JAXBElement<RBankType> value) {
        this.rBank = value;
    }

}
