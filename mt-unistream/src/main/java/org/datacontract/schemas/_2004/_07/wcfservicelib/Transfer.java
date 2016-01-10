
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
 * <p>Java class for Transfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amounts" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfAmount" minOccurs="0"/>
 *         &lt;element name="CancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CashierUserAction" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}UserActionInfo" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Consumers" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfConsumer" minOccurs="0"/>
 *         &lt;element name="ControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoticeList" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfNoticeListItem" minOccurs="0"/>
 *         &lt;element name="Participators" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfParticipator" minOccurs="0"/>
 *         &lt;element name="PayoutDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Services" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfService" minOccurs="0"/>
 *         &lt;element name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}TransferStatus" minOccurs="0"/>
 *         &lt;element name="TellerUserAction" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}UserActionInfo" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}TransferType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer", propOrder = {
    "amounts",
    "cancelDate",
    "cashierUserAction",
    "comment",
    "consumers",
    "controlNumber",
    "id",
    "noticeList",
    "participators",
    "payoutDate",
    "promoCode",
    "returnDate",
    "sentDate",
    "services",
    "sourceID",
    "status",
    "tellerUserAction",
    "type"
})
public class Transfer {

    @XmlElementRef(name = "Amounts", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAmount> amounts;
    @XmlElement(name = "CancelDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDate;
    @XmlElementRef(name = "CashierUserAction", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<UserActionInfo> cashierUserAction;
    @XmlElementRef(name = "Comment", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "Consumers", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConsumer> consumers;
    @XmlElementRef(name = "ControlNumber", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> controlNumber;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "NoticeList", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNoticeListItem> noticeList;
    @XmlElementRef(name = "Participators", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParticipator> participators;
    @XmlElement(name = "PayoutDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payoutDate;
    @XmlElementRef(name = "PromoCode", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promoCode;
    @XmlElement(name = "ReturnDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDate;
    @XmlElement(name = "SentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentDate;
    @XmlElementRef(name = "Services", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfService> services;
    @XmlElementRef(name = "SourceID", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceID;
    @XmlElement(name = "Status")
    protected TransferStatus status;
    @XmlElementRef(name = "TellerUserAction", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<UserActionInfo> tellerUserAction;
    @XmlElement(name = "Type")
    protected TransferType type;

    /**
     * Gets the value of the amounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAmount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAmount> getAmounts() {
        return amounts;
    }

    /**
     * Sets the value of the amounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAmount }{@code >}
     *     
     */
    public void setAmounts(JAXBElement<ArrayOfAmount> value) {
        this.amounts = ((JAXBElement<ArrayOfAmount> ) value);
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDate(XMLGregorianCalendar value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the cashierUserAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserActionInfo }{@code >}
     *     
     */
    public JAXBElement<UserActionInfo> getCashierUserAction() {
        return cashierUserAction;
    }

    /**
     * Sets the value of the cashierUserAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserActionInfo }{@code >}
     *     
     */
    public void setCashierUserAction(JAXBElement<UserActionInfo> value) {
        this.cashierUserAction = ((JAXBElement<UserActionInfo> ) value);
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = ((JAXBElement<String> ) value);
    }

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
     * Gets the value of the controlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getControlNumber() {
        return controlNumber;
    }

    /**
     * Sets the value of the controlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setControlNumber(JAXBElement<String> value) {
        this.controlNumber = ((JAXBElement<String> ) value);
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
     * Gets the value of the noticeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNoticeListItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNoticeListItem> getNoticeList() {
        return noticeList;
    }

    /**
     * Sets the value of the noticeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNoticeListItem }{@code >}
     *     
     */
    public void setNoticeList(JAXBElement<ArrayOfNoticeListItem> value) {
        this.noticeList = ((JAXBElement<ArrayOfNoticeListItem> ) value);
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
     * Gets the value of the payoutDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayoutDate() {
        return payoutDate;
    }

    /**
     * Sets the value of the payoutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayoutDate(XMLGregorianCalendar value) {
        this.payoutDate = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromoCode(JAXBElement<String> value) {
        this.promoCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
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
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceID(JAXBElement<String> value) {
        this.sourceID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransferStatus }
     *     
     */
    public TransferStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferStatus }
     *     
     */
    public void setStatus(TransferStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the tellerUserAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserActionInfo }{@code >}
     *     
     */
    public JAXBElement<UserActionInfo> getTellerUserAction() {
        return tellerUserAction;
    }

    /**
     * Sets the value of the tellerUserAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserActionInfo }{@code >}
     *     
     */
    public void setTellerUserAction(JAXBElement<UserActionInfo> value) {
        this.tellerUserAction = ((JAXBElement<UserActionInfo> ) value);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TransferType }
     *     
     */
    public TransferType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferType }
     *     
     */
    public void setType(TransferType value) {
        this.type = value;
    }

}
