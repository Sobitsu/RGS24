
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsRequest;


/**
 * <p>Java class for AddBankRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBankRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="Bank" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank}Bank" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBankRequestMessage", propOrder = {
    "bank"
})
public class AddBankRequestMessage
    extends WsRequest
{

    @XmlElementRef(name = "Bank", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", type = JAXBElement.class, required = false)
    protected JAXBElement<Bank> bank;

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Bank }{@code >}
     *     
     */
    public JAXBElement<Bank> getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Bank }{@code >}
     *     
     */
    public void setBank(JAXBElement<Bank> value) {
        this.bank = ((JAXBElement<Bank> ) value);
    }

}
