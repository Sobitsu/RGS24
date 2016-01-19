
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VirtualCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualCard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card}Card">
 *       &lt;sequence>
 *         &lt;element name="ContainsPin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nominal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCard", propOrder = {
    "containsPin",
    "currencyID",
    "nominal"
})
public class VirtualCard
    extends Card
{

    @XmlElement(name = "ContainsPin")
    protected Boolean containsPin;
    @XmlElement(name = "CurrencyID")
    protected Integer currencyID;
    @XmlElement(name = "Nominal")
    protected Double nominal;

    /**
     * Gets the value of the containsPin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsPin() {
        return containsPin;
    }

    /**
     * Sets the value of the containsPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsPin(Boolean value) {
        this.containsPin = value;
    }

    /**
     * Gets the value of the currencyID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrencyID() {
        return currencyID;
    }

    /**
     * Sets the value of the currencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrencyID(Integer value) {
        this.currencyID = value;
    }

    /**
     * Gets the value of the nominal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNominal() {
        return nominal;
    }

    /**
     * Sets the value of the nominal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNominal(Double value) {
        this.nominal = value;
    }

}
