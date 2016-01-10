
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
 * <p>Java class for Notice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consumers" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfConsumer" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Participators" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfParticipator" minOccurs="0"/>
 *         &lt;element name="SentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Services" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfService" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}NoticeStatus" minOccurs="0"/>
 *         &lt;element name="Transfer" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}Transfer" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}NoticeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notice", propOrder = {
    "consumers",
    "id",
    "participators",
    "sentDate",
    "services",
    "status",
    "transfer",
    "type"
})
public class Notice {

    @XmlElementRef(name = "Consumers", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConsumer> consumers;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "Participators", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParticipator> participators;
    @XmlElement(name = "SentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentDate;
    @XmlElementRef(name = "Services", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfService> services;
    @XmlElement(name = "Status")
    protected NoticeStatus status;
    @XmlElementRef(name = "Transfer", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<Transfer> transfer;
    @XmlElement(name = "Type")
    protected NoticeType type;

    /**
     * Gets the value of the consumers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConsumer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfConsumer> getConsumers() {
        return consumers;
    }

    /**
     * Sets the value of the consumers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConsumer }{@code >}
     *     
     */
    public void setConsumers(JAXBElement<ArrayOfConsumer> value) {
        this.consumers = ((JAXBElement<ArrayOfConsumer> ) value);
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
     * Gets the value of the participators property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParticipator }{@code >}
     *     
     */
    public JAXBElement<ArrayOfParticipator> getParticipators() {
        return participators;
    }

    /**
     * Sets the value of the participators property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParticipator }{@code >}
     *     
     */
    public void setParticipators(JAXBElement<ArrayOfParticipator> value) {
        this.participators = ((JAXBElement<ArrayOfParticipator> ) value);
    }

    /**
     * Gets the value of the sentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentDate() {
        return sentDate;
    }

    /**
     * Sets the value of the sentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentDate(XMLGregorianCalendar value) {
        this.sentDate = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfService }{@code >}
     *     
     */
    public JAXBElement<ArrayOfService> getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfService }{@code >}
     *     
     */
    public void setServices(JAXBElement<ArrayOfService> value) {
        this.services = ((JAXBElement<ArrayOfService> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeStatus }
     *     
     */
    public NoticeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeStatus }
     *     
     */
    public void setStatus(NoticeStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     
     */
    public JAXBElement<Transfer> getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Transfer }{@code >}
     *     
     */
    public void setTransfer(JAXBElement<Transfer> value) {
        this.transfer = ((JAXBElement<Transfer> ) value);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeType }
     *     
     */
    public NoticeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeType }
     *     
     */
    public void setType(NoticeType value) {
        this.type = value;
    }

}
