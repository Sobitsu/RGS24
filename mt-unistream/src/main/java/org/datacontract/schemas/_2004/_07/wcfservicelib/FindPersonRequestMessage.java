
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
 * <p>Java class for FindPersonRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindPersonRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnistreamCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPersonRequestMessage", propOrder = {
    "birthDate",
    "docNumber",
    "docSeries",
    "firstname",
    "lastname",
    "middlename",
    "phone",
    "unistreamCardNumber"/*,
    "FullName",
    "DocTypeID",
    "DocIssueDate",
    "DocExpiryDate",
    "PhoneCountryID",
    "PhoneArea",
    "PhoneNumber"*/
})
public class FindPersonRequestMessage
    extends WsRequest
{

    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElementRef(name = "DocNumber", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docNumber;
    @XmlElementRef(name = "DocSeries", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docSeries;
    @XmlElementRef(name = "Firstname", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstname;
    @XmlElementRef(name = "Lastname", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastname;
    @XmlElementRef(name = "Middlename", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middlename;
    @XmlElementRef(name = "Phone", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "UnistreamCardNumber", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unistreamCardNumber;
    
   /* @XmlElement(name = "DocTypeID")
    protected Integer docTypeID;
    @XmlElement(name = "PhoneCountryID")
    protected Integer phoneCountryID;
    @XmlElement(name = "DocIssueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docIssueDate;
    @XmlElement(name = "DocExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar docExpiryDate;
    @XmlElementRef(name = "PhoneArea", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneArea;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "FullName", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullName;
*/
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
     * Gets the value of the docIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
 /*   public XMLGregorianCalendar getDocIssueDate() {
        return docIssueDate;
    }

    /**
     * Sets the value of the docIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
   /* public void setDocIssueDate(XMLGregorianCalendar value) {
        this.docIssueDate = value;
    }

    /**
     * Gets the value of the DocExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
   /* public XMLGregorianCalendar getDocExpiryDate() {
        return docExpiryDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
   /* public void setDocExpiryDate(XMLGregorianCalendar value) {
        this.docExpiryDate = value;
    }
  
    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocNumber(JAXBElement<String> value) {
        this.docNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the docSeries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocSeries() {
        return docSeries;
    }

    /**
     * Sets the value of the docSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocSeries(JAXBElement<String> value) {
        this.docSeries = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstname(JAXBElement<String> value) {
        this.firstname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastname(JAXBElement<String> value) {
        this.lastname = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddlename(JAXBElement<String> value) {
        this.middlename = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = ((JAXBElement<String> ) value);
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

        /**
     * Gets the value of the phoneArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
/*    public JAXBElement<String> getPhoneArea() {
        return phoneArea;
    }

    /**
     * Sets the value of the phoneArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
  /*  public void setPhoneArea(JAXBElement<String> value) {
        this.phoneArea = ((JAXBElement<String> ) value);
    }

    
    
        /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
 /*   public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
 /*   public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = ((JAXBElement<String> ) value);
    }
    
        /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
 /*   public JAXBElement<String> getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
 /*   public void setFullName(JAXBElement<String> value) {
        this.fullName = ((JAXBElement<String> ) value);
    }
    
;

 /**
     * Gets the value of the docTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
 /*   public Integer getDocTypeID() {
        return docTypeID;
    }

    /**
     * Sets the value of the docTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
  /*  public void setDocTypeID(Integer value) {
        this.docTypeID = value;
    }
 /**
     * Gets the value of the phoneCountryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
 /*   public Integer getPhoneCountryID() {
        return phoneCountryID;
    }

    /**
     * Sets the value of the phoneCountryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
 /*   public void setPhoneCountryID(Integer value) {
        this.phoneCountryID = value;
    }*/

}
