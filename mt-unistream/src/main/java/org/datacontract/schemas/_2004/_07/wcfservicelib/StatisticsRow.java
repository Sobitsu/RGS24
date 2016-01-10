
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticsRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatisticsRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalMainAmounts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalOtherComissions" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalSelfComissions" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsRow", propOrder = {
    "count",
    "currencyID",
    "totalMainAmounts",
    "totalOtherComissions",
    "totalSelfComissions"
})
public class StatisticsRow {

    @XmlElement(name = "Count")
    protected Integer count;
    @XmlElement(name = "CurrencyID")
    protected Integer currencyID;
    @XmlElement(name = "TotalMainAmounts")
    protected Double totalMainAmounts;
    @XmlElement(name = "TotalOtherComissions")
    protected Double totalOtherComissions;
    @XmlElement(name = "TotalSelfComissions")
    protected Double totalSelfComissions;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
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
     * Gets the value of the totalMainAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalMainAmounts() {
        return totalMainAmounts;
    }

    /**
     * Sets the value of the totalMainAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalMainAmounts(Double value) {
        this.totalMainAmounts = value;
    }

    /**
     * Gets the value of the totalOtherComissions property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalOtherComissions() {
        return totalOtherComissions;
    }

    /**
     * Sets the value of the totalOtherComissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalOtherComissions(Double value) {
        this.totalOtherComissions = value;
    }

    /**
     * Gets the value of the totalSelfComissions property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSelfComissions() {
        return totalSelfComissions;
    }

    /**
     * Sets the value of the totalSelfComissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSelfComissions(Double value) {
        this.totalSelfComissions = value;
    }

}
