
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for GetCountriesChangesResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCountriesChangesResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Countries" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country}ArrayOfCountry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCountriesChangesResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", propOrder = {
    "countries"
})
public class GetCountriesChangesResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "Countries", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCountry> countries;

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCountry> getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}
     *     
     */
    public void setCountries(JAXBElement<ArrayOfCountry> value) {
        this.countries = value;
    }

}
