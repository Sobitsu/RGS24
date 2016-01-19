
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for GetTaxesResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTaxesResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Taxes" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax}ArrayOfTax" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTaxesResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", propOrder = {
    "taxes"
})
public class GetTaxesResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "Taxes", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTax> taxes;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTax }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTax> getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTax }{@code >}
     *     
     */
    public void setTaxes(JAXBElement<ArrayOfTax> value) {
        this.taxes = value;
    }

}
