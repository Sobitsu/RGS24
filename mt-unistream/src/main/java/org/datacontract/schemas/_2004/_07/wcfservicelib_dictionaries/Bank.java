
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfLangText;
import org.datacontract.schemas._2004._07.wcfservicelib.BankAddress;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectStatus;
import org.datacontract.schemas._2004._07.wcfservicelib.Phone;


/**
 * <p>Java class for Bank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}BankAddress" minOccurs="0"/>
 *         &lt;element name="AllowedCurrencies" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank}ArrayOfAllowedCurrency" minOccurs="0"/>
 *         &lt;element name="Flags" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank}BankFlags" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries}ArrayOfLangText" minOccurs="0"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients}Phone" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries}ObjectStatus" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank}BankType" minOccurs="0"/>
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
@XmlType(name = "Bank", propOrder = {
    "address",
    "allowedCurrencies",
    "flags",
    "id",
    "name",
    "parentID",
    "phone",
    "status",
    "type",
    "updateCount"
})
public class Bank {

    @XmlElementRef(name = "Address", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", type = JAXBElement.class, required = false)
    protected JAXBElement<BankAddress> address;
    @XmlElementRef(name = "AllowedCurrencies", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAllowedCurrency> allowedCurrencies;
    @XmlElementRef(name = "Flags", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", type = JAXBElement.class, required = false)
    protected JAXBElement<BankFlags> flags;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLangText> name;
    @XmlElement(name = "ParentID")
    protected Integer parentID;
    @XmlElementRef(name = "Phone", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", type = JAXBElement.class, required = false)
    protected JAXBElement<Phone> phone;
    @XmlElement(name = "Status")
    protected ObjectStatus status;
    @XmlElement(name = "Type")
    protected BankType type;
    @XmlElement(name = "UpdateCount")
    protected Long updateCount;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankAddress }{@code >}
     *     
     */
    public JAXBElement<BankAddress> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankAddress }{@code >}
     *     
     */
    public void setAddress(JAXBElement<BankAddress> value) {
        this.address = ((JAXBElement<BankAddress> ) value);
    }

    /**
     * Gets the value of the allowedCurrencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAllowedCurrency }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAllowedCurrency> getAllowedCurrencies() {
        return allowedCurrencies;
    }

    /**
     * Sets the value of the allowedCurrencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAllowedCurrency }{@code >}
     *     
     */
    public void setAllowedCurrencies(JAXBElement<ArrayOfAllowedCurrency> value) {
        this.allowedCurrencies = ((JAXBElement<ArrayOfAllowedCurrency> ) value);
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankFlags }{@code >}
     *     
     */
    public JAXBElement<BankFlags> getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankFlags }{@code >}
     *     
     */
    public void setFlags(JAXBElement<BankFlags> value) {
        this.flags = ((JAXBElement<BankFlags> ) value);
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLangText }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLangText> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLangText }{@code >}
     *     
     */
    public void setName(JAXBElement<ArrayOfLangText> value) {
        this.name = ((JAXBElement<ArrayOfLangText> ) value);
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentID(Integer value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Phone }{@code >}
     *     
     */
    public JAXBElement<Phone> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Phone }{@code >}
     *     
     */
    public void setPhone(JAXBElement<Phone> value) {
        this.phone = ((JAXBElement<Phone> ) value);
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BankType }
     *     
     */
    public BankType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankType }
     *     
     */
    public void setType(BankType value) {
        this.type = value;
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
