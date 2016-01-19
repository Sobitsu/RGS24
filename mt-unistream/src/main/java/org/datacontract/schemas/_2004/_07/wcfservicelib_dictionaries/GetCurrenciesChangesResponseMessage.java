
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for GetCurrenciesChangesResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCurrenciesChangesResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Currencies" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency}ArrayOfCurrency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrenciesChangesResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", propOrder = {
    "currencies"
})
public class GetCurrenciesChangesResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "Currencies", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCurrency> currencies;

    /**
     * Gets the value of the currencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCurrency }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCurrency> getCurrencies() {
        return currencies;
    }

    /**
     * Sets the value of the currencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCurrency }{@code >}
     *     
     */
    public void setCurrencies(JAXBElement<ArrayOfCurrency> value) {
        this.currencies = value;
    }

}
