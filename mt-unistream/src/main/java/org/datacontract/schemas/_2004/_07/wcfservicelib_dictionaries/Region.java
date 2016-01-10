
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfLangText;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectStatus;


/**
 * <p>Java class for Region complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Region">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries}ArrayOfLangText" minOccurs="0"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries}ObjectStatus" minOccurs="0"/>
 *         &lt;element name="UpdateCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="VirtualBankId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", propOrder = {
    "countryID",
    "id",
    "name",
    "parentID",
    "status",
    "updateCount",
    "virtualBankId"
})
public class Region {

    @XmlElement(name = "CountryID")
    protected Integer countryID;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLangText> name;
    @XmlElement(name = "ParentID")
    protected Integer parentID;
    @XmlElement(name = "Status")
    protected ObjectStatus status;
    @XmlElement(name = "UpdateCount")
    protected Long updateCount;
    @XmlElement(name = "VirtualBankId")
    protected Integer virtualBankId;

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryID(Integer value) {
        this.countryID = value;
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

    /**
     * Gets the value of the virtualBankId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVirtualBankId() {
        return virtualBankId;
    }

    /**
     * Sets the value of the virtualBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVirtualBankId(Integer value) {
        this.virtualBankId = value;
    }

}
