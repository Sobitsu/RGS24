
package org.datacontract.schemas._2004._07.wcfservicelib;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ServiceMode" minOccurs="0"/>
 *         &lt;element name="OptionalServiceGroupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParticipatorID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProposalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}Response" minOccurs="0"/>
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "currencyID",
    "fee",
    "mode",
    "optionalServiceGroupID",
    "participatorID",
    "proposalText",
    "response",
    "serviceID"
})
public class ServiceType {

    @XmlElement(name = "CurrencyID")
    protected Integer currencyID;
    @XmlElement(name = "Fee")
    protected BigDecimal fee;
    @XmlElement(name = "Mode")
    protected ServiceModeType mode;
    @XmlElement(name = "OptionalServiceGroupID")
    protected Integer optionalServiceGroupID;
    @XmlElement(name = "ParticipatorID")
    protected Integer participatorID;
    @XmlElementRef(name = "ProposalText", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proposalText;
    @XmlElement(name = "Response")
    protected ResponseType response;
    @XmlElement(name = "ServiceID")
    protected Integer serviceID;

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
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceModeType }
     *     
     */
    public ServiceModeType getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceModeType }
     *     
     */
    public void setMode(ServiceModeType value) {
        this.mode = value;
    }

    /**
     * Gets the value of the optionalServiceGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOptionalServiceGroupID() {
        return optionalServiceGroupID;
    }

    /**
     * Sets the value of the optionalServiceGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOptionalServiceGroupID(Integer value) {
        this.optionalServiceGroupID = value;
    }

    /**
     * Gets the value of the participatorID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParticipatorID() {
        return participatorID;
    }

    /**
     * Sets the value of the participatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParticipatorID(Integer value) {
        this.participatorID = value;
    }

    /**
     * Gets the value of the proposalText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProposalText() {
        return proposalText;
    }

    /**
     * Sets the value of the proposalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProposalText(JAXBElement<String> value) {
        this.proposalText = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceID(Integer value) {
        this.serviceID = value;
    }

}
