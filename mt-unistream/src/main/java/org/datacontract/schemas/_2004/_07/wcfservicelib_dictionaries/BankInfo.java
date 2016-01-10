
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectStatus;


/**
 * <p>Java class for BankInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CallCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliverCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliverTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Document" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Holidays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LangID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Limits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Requirements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries}ObjectStatus" minOccurs="0"/>
 *         &lt;element name="UpdateCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankInfo", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", propOrder = {
    "accountDeposit",
    "bankID",
    "callCenter",
    "cancelTime",
    "cash",
    "deliverCurrency",
    "deliverTime",
    "document",
    "holidays",
    "homeDelivery",
    "id",
    "information",
    "langID",
    "limits",
    "requirements",
    "sendCurrency",
    "status",
    "updateCount"
})
public class BankInfo {

    @XmlElementRef(name = "AccountDeposit", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountDeposit;
    @XmlElement(name = "BankID")
    protected Integer bankID;
    @XmlElementRef(name = "CallCenter", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callCenter;
    @XmlElementRef(name = "CancelTime", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cancelTime;
    @XmlElementRef(name = "Cash", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cash;
    @XmlElementRef(name = "DeliverCurrency", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliverCurrency;
    @XmlElementRef(name = "DeliverTime", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliverTime;
    @XmlElementRef(name = "Document", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> document;
    @XmlElementRef(name = "Holidays", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> holidays;
    @XmlElementRef(name = "HomeDelivery", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homeDelivery;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "Information", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> information;
    @XmlElement(name = "LangID")
    protected Integer langID;
    @XmlElementRef(name = "Limits", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limits;
    @XmlElementRef(name = "Requirements", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requirements;
    @XmlElementRef(name = "SendCurrency", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendCurrency;
    @XmlElement(name = "Status")
    protected ObjectStatus status;
    @XmlElement(name = "UpdateCount")
    protected Long updateCount;

    /**
     * Gets the value of the accountDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountDeposit() {
        return accountDeposit;
    }

    /**
     * Sets the value of the accountDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountDeposit(JAXBElement<String> value) {
        this.accountDeposit = ((JAXBElement<String> ) value);
    }

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
     * Gets the value of the callCenter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallCenter() {
        return callCenter;
    }

    /**
     * Sets the value of the callCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallCenter(JAXBElement<String> value) {
        this.callCenter = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cancelTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancelTime() {
        return cancelTime;
    }

    /**
     * Sets the value of the cancelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancelTime(JAXBElement<String> value) {
        this.cancelTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCash(JAXBElement<String> value) {
        this.cash = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the deliverCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliverCurrency() {
        return deliverCurrency;
    }

    /**
     * Sets the value of the deliverCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliverCurrency(JAXBElement<String> value) {
        this.deliverCurrency = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the deliverTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliverTime() {
        return deliverTime;
    }

    /**
     * Sets the value of the deliverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliverTime(JAXBElement<String> value) {
        this.deliverTime = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocument(JAXBElement<String> value) {
        this.document = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the holidays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHolidays() {
        return holidays;
    }

    /**
     * Sets the value of the holidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHolidays(JAXBElement<String> value) {
        this.holidays = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the homeDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomeDelivery() {
        return homeDelivery;
    }

    /**
     * Sets the value of the homeDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomeDelivery(JAXBElement<String> value) {
        this.homeDelivery = ((JAXBElement<String> ) value);
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
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInformation(JAXBElement<String> value) {
        this.information = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the langID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLangID() {
        return langID;
    }

    /**
     * Sets the value of the langID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLangID(Integer value) {
        this.langID = value;
    }

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimits(JAXBElement<String> value) {
        this.limits = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequirements(JAXBElement<String> value) {
        this.requirements = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sendCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendCurrency() {
        return sendCurrency;
    }

    /**
     * Sets the value of the sendCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendCurrency(JAXBElement<String> value) {
        this.sendCurrency = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectStatus }
     *     
     */
    public ObjectStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStatus }
     *     
     */
    public void setStatus(ObjectStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the updateCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdateCount() {
        return updateCount;
    }

    /**
     * Sets the value of the updateCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdateCount(Long value) {
        this.updateCount = value;
    }

}
