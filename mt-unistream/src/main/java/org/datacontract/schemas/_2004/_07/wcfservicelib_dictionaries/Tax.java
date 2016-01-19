
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.TransactionTypeType;
import org.datacontract.schemas._2004._07.wcfservicelib.TransferTypeType;


/**
 * <p>Java class for Tax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountryFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountryTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Currency2ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsTaxAmountIncludedInTransferAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTaxEnabledForAddressTransfers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTaxEnabledForAddresslessTransfers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTaxPercentForTransferAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxBankTrust" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxBankTrust2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxDirection" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}TransactionType" minOccurs="0"/>
 *         &lt;element name="TaxFixSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaxMaxSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaxPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaxSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaxSumBeg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TaxSumEnd" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TransferType" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}TransferType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", propOrder = {
    "bankID",
    "countryFrom",
    "countryTo",
    "currency2ID",
    "currencyID",
    "id",
    "isTaxAmountIncludedInTransferAmount",
    "isTaxEnabledForAddressTransfers",
    "isTaxEnabledForAddresslessTransfers",
    "isTaxPercentForTransferAmount",
    "priority",
    "taxBankTrust",
    "taxBankTrust2",
    "taxDirection",
    "taxFixSum",
    "taxMaxSum",
    "taxPercent",
    "taxSum",
    "taxSumBeg",
    "taxSumEnd",
    "transferType"
})
public class Tax {

    @XmlElement(name = "BankID")
    protected Integer bankID;
    @XmlElement(name = "CountryFrom")
    protected Integer countryFrom;
    @XmlElement(name = "CountryTo")
    protected Integer countryTo;
    @XmlElement(name = "Currency2ID")
    protected Integer currency2ID;
    @XmlElement(name = "CurrencyID")
    protected Integer currencyID;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "IsTaxAmountIncludedInTransferAmount")
    protected Boolean isTaxAmountIncludedInTransferAmount;
    @XmlElement(name = "IsTaxEnabledForAddressTransfers")
    protected Boolean isTaxEnabledForAddressTransfers;
    @XmlElement(name = "IsTaxEnabledForAddresslessTransfers")
    protected Boolean isTaxEnabledForAddresslessTransfers;
    @XmlElement(name = "IsTaxPercentForTransferAmount")
    protected Boolean isTaxPercentForTransferAmount;
    @XmlElement(name = "Priority")
    protected Integer priority;
    @XmlElement(name = "TaxBankTrust")
    protected Integer taxBankTrust;
    @XmlElement(name = "TaxBankTrust2")
    protected Integer taxBankTrust2;
    @XmlElement(name = "TaxDirection")
    protected TransactionTypeType taxDirection;
    @XmlElement(name = "TaxFixSum")
    protected Double taxFixSum;
    @XmlElement(name = "TaxMaxSum")
    protected Double taxMaxSum;
    @XmlElement(name = "TaxPercent")
    protected Double taxPercent;
    @XmlElement(name = "TaxSum")
    protected Double taxSum;
    @XmlElement(name = "TaxSumBeg")
    protected Double taxSumBeg;
    @XmlElement(name = "TaxSumEnd")
    protected Double taxSumEnd;
    @XmlElement(name = "TransferType")
    protected TransferTypeType transferType;

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBankID(Integer value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the countryFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryFrom() {
        return countryFrom;
    }

    /**
     * Sets the value of the countryFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryFrom(Integer value) {
        this.countryFrom = value;
    }

    /**
     * Gets the value of the countryTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryTo() {
        return countryTo;
    }

    /**
     * Sets the value of the countryTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryTo(Integer value) {
        this.countryTo = value;
    }

    /**
     * Gets the value of the currency2ID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrency2ID() {
        return currency2ID;
    }

    /**
     * Sets the value of the currency2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrency2ID(Integer value) {
        this.currency2ID = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isTaxAmountIncludedInTransferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxAmountIncludedInTransferAmount() {
        return isTaxAmountIncludedInTransferAmount;
    }

    /**
     * Sets the value of the isTaxAmountIncludedInTransferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxAmountIncludedInTransferAmount(Boolean value) {
        this.isTaxAmountIncludedInTransferAmount = value;
    }

    /**
     * Gets the value of the isTaxEnabledForAddressTransfers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxEnabledForAddressTransfers() {
        return isTaxEnabledForAddressTransfers;
    }

    /**
     * Sets the value of the isTaxEnabledForAddressTransfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxEnabledForAddressTransfers(Boolean value) {
        this.isTaxEnabledForAddressTransfers = value;
    }

    /**
     * Gets the value of the isTaxEnabledForAddresslessTransfers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxEnabledForAddresslessTransfers() {
        return isTaxEnabledForAddresslessTransfers;
    }

    /**
     * Sets the value of the isTaxEnabledForAddresslessTransfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxEnabledForAddresslessTransfers(Boolean value) {
        this.isTaxEnabledForAddresslessTransfers = value;
    }

    /**
     * Gets the value of the isTaxPercentForTransferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTaxPercentForTransferAmount() {
        return isTaxPercentForTransferAmount;
    }

    /**
     * Sets the value of the isTaxPercentForTransferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTaxPercentForTransferAmount(Boolean value) {
        this.isTaxPercentForTransferAmount = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the taxBankTrust property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxBankTrust() {
        return taxBankTrust;
    }

    /**
     * Sets the value of the taxBankTrust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxBankTrust(Integer value) {
        this.taxBankTrust = value;
    }

    /**
     * Gets the value of the taxBankTrust2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxBankTrust2() {
        return taxBankTrust2;
    }

    /**
     * Sets the value of the taxBankTrust2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxBankTrust2(Integer value) {
        this.taxBankTrust2 = value;
    }

    /**
     * Gets the value of the taxDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeType }
     *     
     */
    public TransactionTypeType getTaxDirection() {
        return taxDirection;
    }

    /**
     * Sets the value of the taxDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeType }
     *     
     */
    public void setTaxDirection(TransactionTypeType value) {
        this.taxDirection = value;
    }

    /**
     * Gets the value of the taxFixSum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxFixSum() {
        return taxFixSum;
    }

    /**
     * Sets the value of the taxFixSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxFixSum(Double value) {
        this.taxFixSum = value;
    }

    /**
     * Gets the value of the taxMaxSum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxMaxSum() {
        return taxMaxSum;
    }

    /**
     * Sets the value of the taxMaxSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxMaxSum(Double value) {
        this.taxMaxSum = value;
    }

    /**
     * Gets the value of the taxPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxPercent() {
        return taxPercent;
    }

    /**
     * Sets the value of the taxPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxPercent(Double value) {
        this.taxPercent = value;
    }

    /**
     * Gets the value of the taxSum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxSum() {
        return taxSum;
    }

    /**
     * Sets the value of the taxSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxSum(Double value) {
        this.taxSum = value;
    }

    /**
     * Gets the value of the taxSumBeg property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxSumBeg() {
        return taxSumBeg;
    }

    /**
     * Sets the value of the taxSumBeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxSumBeg(Double value) {
        this.taxSumBeg = value;
    }

    /**
     * Gets the value of the taxSumEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxSumEnd() {
        return taxSumEnd;
    }

    /**
     * Sets the value of the taxSumEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxSumEnd(Double value) {
        this.taxSumEnd = value;
    }

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link TransferTypeType }
     *     
     */
    public TransferTypeType getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferTypeType }
     *     
     */
    public void setTransferType(TransferTypeType value) {
        this.transferType = value;
    }

}
