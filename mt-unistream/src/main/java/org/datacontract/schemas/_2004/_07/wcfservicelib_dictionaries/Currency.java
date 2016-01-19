
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
 * <p>Java class for Currency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Currency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Digital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Latin3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries}ArrayOfLangText" minOccurs="0"/>
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
@XmlType(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", propOrder = {
    "digital",
    "id",
    "latin3",
    "name",
    "status",
    "updateCount"
})
public class Currency {

    @XmlElementRef(name = "Digital", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", type = JAXBElement.class, required = false)
    protected JAXBElement<String> digital;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "Latin3", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latin3;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLangText> name;
    @XmlElement(name = "Status")
    protected ObjectStatus status;
    @XmlElement(name = "UpdateCount")
    protected Long updateCount;

    /**
     * Gets the value of the digital property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDigital() {
        return digital;
    }

    /**
     * Sets the value of the digital property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDigital(JAXBElement<String> value) {
        this.digital = value;
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
     * Gets the value of the latin3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatin3() {
        return latin3;
    }

    /**
     * Sets the value of the latin3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatin3(JAXBElement<String> value) {
        this.latin3 = value;
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
        this.name = value;
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
