
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankFlags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankFlags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaysAddressTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaysAddresslessTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaysTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendsAddressTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendsAddresslessTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SendsTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TestMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankFlags", propOrder = {
    "paysAddressTransfer",
    "paysAddresslessTransfer",
    "paysTransfer",
    "sendsAddressTransfer",
    "sendsAddresslessTransfer",
    "sendsTransfer",
    "testMode"
})
public class BankFlags {

    @XmlElement(name = "PaysAddressTransfer")
    protected Boolean paysAddressTransfer;
    @XmlElement(name = "PaysAddresslessTransfer")
    protected Boolean paysAddresslessTransfer;
    @XmlElement(name = "PaysTransfer")
    protected Boolean paysTransfer;
    @XmlElement(name = "SendsAddressTransfer")
    protected Boolean sendsAddressTransfer;
    @XmlElement(name = "SendsAddresslessTransfer")
    protected Boolean sendsAddresslessTransfer;
    @XmlElement(name = "SendsTransfer")
    protected Boolean sendsTransfer;
    @XmlElement(name = "TestMode")
    protected Boolean testMode;

    /**
     * Gets the value of the paysAddressTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaysAddressTransfer() {
        return paysAddressTransfer;
    }

    /**
     * Sets the value of the paysAddressTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaysAddressTransfer(Boolean value) {
        this.paysAddressTransfer = value;
    }

    /**
     * Gets the value of the paysAddresslessTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaysAddresslessTransfer() {
        return paysAddresslessTransfer;
    }

    /**
     * Sets the value of the paysAddresslessTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaysAddresslessTransfer(Boolean value) {
        this.paysAddresslessTransfer = value;
    }

    /**
     * Gets the value of the paysTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaysTransfer() {
        return paysTransfer;
    }

    /**
     * Sets the value of the paysTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaysTransfer(Boolean value) {
        this.paysTransfer = value;
    }

    /**
     * Gets the value of the sendsAddressTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendsAddressTransfer() {
        return sendsAddressTransfer;
    }

    /**
     * Sets the value of the sendsAddressTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendsAddressTransfer(Boolean value) {
        this.sendsAddressTransfer = value;
    }

    /**
     * Gets the value of the sendsAddresslessTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendsAddresslessTransfer() {
        return sendsAddresslessTransfer;
    }

    /**
     * Sets the value of the sendsAddresslessTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendsAddresslessTransfer(Boolean value) {
        this.sendsAddresslessTransfer = value;
    }

    /**
     * Gets the value of the sendsTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendsTransfer() {
        return sendsTransfer;
    }

    /**
     * Sets the value of the sendsTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendsTransfer(Boolean value) {
        this.sendsTransfer = value;
    }

    /**
     * Gets the value of the testMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestMode() {
        return testMode;
    }

    /**
     * Sets the value of the testMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestMode(Boolean value) {
        this.testMode = value;
    }

}
