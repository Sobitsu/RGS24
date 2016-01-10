
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}PersonAddress" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Documents" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfDocument" minOccurs="0"/>
 *         &lt;element name="FinDetails" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients}ArrayOfFinDetail" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstNameLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastNameLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleNameLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phones" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients}ArrayOfPhone" minOccurs="0"/>
 *         &lt;element name="Residentships" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients}ArrayOfResidentship" minOccurs="0"/>
 *         &lt;element name="UnistreamCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "address",
    "birthDate",
    "documents",
    "finDetails",
    "firstName",
    "firstNameLat",
    "id",
    "lastName",
    "lastNameLat",
    "middleName",
    "middleNameLat",
    "phones",
    "residentships",
    "unistreamCardNumber"
})
public class Person {

    @XmlElementRef(name = "Address", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonAddress> address;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElementRef(name = "Documents", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocument> documents;
    @XmlElementRef(name = "FinDetails", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFinDetail> finDetails;
    @XmlElementRef(name = "FirstName", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "FirstNameLat", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstNameLat;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "LastName", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "LastNameLat", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastNameLat;
    @XmlElementRef(name = "MiddleName", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleName;
    @XmlElementRef(name = "MiddleNameLat", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleNameLat;
    @XmlElementRef(name = "Phones", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhone> phones;
    @XmlElementRef(name = "Residentships", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResidentship> residentships;
    @XmlElementRef(name = "UnistreamCardNumber", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unistreamCardNumber;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonAddress }{@code >}
     *     
     */
    public JAXBElement<PersonAddress> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonAddress }{@code >}
     *     
     */
    public void setAddress(JAXBElement<PersonAddress> value) {
        this.address = ((JAXBElement<PersonAddress> ) value);
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocument> getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     *     
     */
    public void setDocuments(JAXBElement<ArrayOfDocument> value) {
        this.documents = ((JAXBElement<ArrayOfDocument> ) value);
    }

    /**
     * Gets the value of the finDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFinDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFinDetail> getFinDetails() {
        return finDetails;
    }

    /**
     * Sets the value of the finDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFinDetail }{@code >}
     *     
     */
    public void setFinDetails(JAXBElement<ArrayOfFinDetail> value) {
        this.finDetails = ((JAXBElement<ArrayOfFinDetail> ) value);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the firstNameLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstNameLat() {
        return firstNameLat;
    }

    /**
     * Sets the value of the firstNameLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstNameLat(JAXBElement<String> value) {
        this.firstNameLat = ((JAXBElement<String> ) value);
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
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastNameLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastNameLat() {
        return lastNameLat;
    }

    /**
     * Sets the value of the lastNameLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastNameLat(JAXBElement<String> value) {
        this.lastNameLat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<String> value) {
        this.middleName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the middleNameLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleNameLat() {
        return middleNameLat;
    }

    /**
     * Sets the value of the middleNameLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleNameLat(JAXBElement<String> value) {
        this.middleNameLat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhone }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPhone> getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhone }{@code >}
     *     
     */
    public void setPhones(JAXBElement<ArrayOfPhone> value) {
        this.phones = ((JAXBElement<ArrayOfPhone> ) value);
    }

    /**
     * Gets the value of the residentships property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResidentship }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResidentship> getResidentships() {
        return residentships;
    }

    /**
     * Sets the value of the residentships property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResidentship }{@code >}
     *     
     */
    public void setResidentships(JAXBElement<ArrayOfResidentship> value) {
        this.residentships = ((JAXBElement<ArrayOfResidentship> ) value);
    }

    /**
     * Gets the value of the unistreamCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnistreamCardNumber() {
        return unistreamCardNumber;
    }

    /**
     * Sets the value of the unistreamCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnistreamCardNumber(JAXBElement<String> value) {
        this.unistreamCardNumber = ((JAXBElement<String> ) value);
    }

}
