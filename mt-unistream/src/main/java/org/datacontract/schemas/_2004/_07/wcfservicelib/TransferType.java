
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
 *         &lt;element name="FxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoticeList" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfNoticeListItem" minOccurs="0"/>
 *         &lt;element name="Participators" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfParticipator" minOccurs="0"/>
 *         &lt;element name="PayoutDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiverAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Services" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfService" minOccurs="0"/>
 *         &lt;element name="SourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}TransferStatus" minOccurs="0"/>
 *         &lt;element name="TellerUserAction" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}UserActionInfo" minOccurs="0"/>
 *         &lt;element name="TransitAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fxRate",
    "id",
    "noticeList",
    "participators",
    "payoutDate",
    "promoCode",
    "receiverAccount",
    "returnDate",
    "sentDate",
    "services",
    "sourceID",
    "status",
    "tellerUserAction",
    "transitAccount",
    "type"
})
public class TransferType {

    @XmlElementRef(name = "Amounts", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAmountType> amounts;
    @XmlElement(name = "CancelDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDate;
    @XmlElementRef(name = "CashierUserAction", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<UserActionInfoType> cashierUserAction;
    @XmlElementRef(name = "Comment", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElementRef(name = "Consumers", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConsumerType> consumers;
    @XmlElementRef(name = "ControlNumber", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> controlNumber;
    @XmlElement(name = "FxRate")
    protected Double fxRate;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "NoticeList", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNoticeListItemType> noticeList;
    @XmlElementRef(name = "Participators", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParticipatorType> participators;
    @XmlElement(name = "PayoutDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payoutDate;
    @XmlElementRef(name = "PromoCode", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promoCode;
    @XmlElementRef(name = "ReceiverAccount", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiverAccount;
    @XmlElement(name = "ReturnDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDate;
    @XmlElement(name = "SentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentDate;
    @XmlElementRef(name = "Services", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceType> services;
    @XmlElementRef(name = "SourceID", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceID;
    @XmlElement(name = "Status")
    protected TransferStatusType status;
    @XmlElementRef(name = "TellerUserAction", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<UserActionInfoType> tellerUserAction;
    @XmlElementRef(name = "TransitAccount", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transitAccount;
    @XmlElement(name = "Type")
    protected TransferTypeType type;

    /**
     * Gets the value of the amounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAmountType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAmountType> getAmounts() {
        return amounts;
    }

    /**
     * Sets the value of the amounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAmountType }{@code >}
     *     
     */
    public void setAmounts(JAXBElement<ArrayOfAmountType> value) {
        this.amounts = value;
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
     *     {@link JAXBElement }{@code <}{@link UserActionInfoType }{@code >}
     *     
     */
    public JAXBElement<UserActionInfoType> getCashierUserAction() {
        return cashierUserAction;
    }

    /**
     * Sets the value of the cashierUserAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserActionInfoType }{@code >}
     *     
     */
    public void setCashierUserAction(JAXBElement<UserActionInfoType> value) {
        this.cashierUserAction = value;
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
        this.comment = value;
    }

    /**
     * Gets the value of the consumers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConsumerType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfConsumerType> getConsumers() {
        return consumers;
    }

    /**
     * Sets the value of the consumers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConsumerType }{@code >}
     *     
     */
    public void setConsumers(JAXBElement<ArrayOfConsumerType> value) {
        this.consumers = value;
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
        this.controlNumber = value;
    }

    /**
     * Gets the value of the fxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFxRate() {
        return fxRate;
    }

    /**
     * Sets the value of the fxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFxRate(Double value) {
        this.fxRate = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfNoticeListItemType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNoticeListItemType> getNoticeList() {
        return noticeList;
    }

    /**
     * Sets the value of the noticeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNoticeListItemType }{@code >}
     *     
     */
    public void setNoticeList(JAXBElement<ArrayOfNoticeListItemType> value) {
        this.noticeList = value;
    }

    /**
     * Gets the value of the participators property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParticipatorType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfParticipatorType> getParticipators() {
        return participators;
    }

    /**
     * Sets the value of the participators property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParticipatorType }{@code >}
     *     
     */
    public void setParticipators(JAXBElement<ArrayOfParticipatorType> value) {
        this.participators = value;
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
        this.promoCode = value;
    }

    /**
     * Gets the value of the receiverAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiverAccount() {
        return receiverAccount;
    }

    /**
     * Sets the value of the receiverAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiverAccount(JAXBElement<String> value) {
        this.receiverAccount = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfServiceType> getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServiceType }{@code >}
     *     
     */
    public void setServices(JAXBElement<ArrayOfServiceType> value) {
        this.services = value;
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
        this.sourceID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransferStatusType }
     *     
     */
    public TransferStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferStatusType }
     *     
     */
    public void setStatus(TransferStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the tellerUserAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserActionInfoType }{@code >}
     *     
     */
    public JAXBElement<UserActionInfoType> getTellerUserAction() {
        return tellerUserAction;
    }

    /**
     * Sets the value of the tellerUserAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserActionInfoType }{@code >}
     *     
     */
    public void setTellerUserAction(JAXBElement<UserActionInfoType> value) {
        this.tellerUserAction = value;
    }

    /**
     * Gets the value of the transitAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransitAccount() {
        return transitAccount;
    }

    /**
     * Sets the value of the transitAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransitAccount(JAXBElement<String> value) {
        this.transitAccount = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TransferTypeType }
     *     
     */
    public TransferTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferTypeType }
     *     
     */
    public void setType(TransferTypeType value) {
        this.type = value;
    }

}
