
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card}CardStateCategoryTypes" minOccurs="0"/>
 *         &lt;element name="State" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card}CardStatesTypes" minOccurs="0"/>
 *         &lt;element name="StateDate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StateTime" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardState", propOrder = {
    "category",
    "state",
    "stateDate",
    "stateTime"
})
public class CardState {

    @XmlElement(name = "Category")
    protected CardStateCategoryTypes category;
    @XmlElement(name = "State")
    protected CardStatesTypes state;
    @XmlElement(name = "StateDate")
    protected Integer stateDate;
    @XmlElement(name = "StateTime")
    protected Double stateTime;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CardStateCategoryTypes }
     *     
     */
    public CardStateCategoryTypes getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStateCategoryTypes }
     *     
     */
    public void setCategory(CardStateCategoryTypes value) {
        this.category = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatesTypes }
     *     
     */
    public CardStatesTypes getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatesTypes }
     *     
     */
    public void setState(CardStatesTypes value) {
        this.state = value;
    }

    /**
     * Gets the value of the stateDate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStateDate() {
        return stateDate;
    }

    /**
     * Sets the value of the stateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStateDate(Integer value) {
        this.stateDate = value;
    }

    /**
     * Gets the value of the stateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStateTime() {
        return stateTime;
    }

    /**
     * Sets the value of the stateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStateTime(Double value) {
        this.stateTime = value;
    }

}
