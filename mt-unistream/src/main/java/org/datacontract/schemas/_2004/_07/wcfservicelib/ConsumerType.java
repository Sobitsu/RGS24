
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Consumer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Consumer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Person" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}Person" minOccurs="0"/>
 *         &lt;element name="RCompany" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}RCompany" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ConsumerRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consumer", propOrder = {
    "person",
    "rCompany",
    "role"
})
public class ConsumerType {

    @XmlElementRef(name = "Person", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonType> person;
    @XmlElementRef(name = "RCompany", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<RCompanyType> rCompany;
    @XmlElement(name = "Role")
    protected ConsumerRoleType role;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     *     
     */
    public JAXBElement<PersonType> getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     *     
     */
    public void setPerson(JAXBElement<PersonType> value) {
        this.person = value;
    }

    /**
     * Gets the value of the rCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RCompanyType }{@code >}
     *     
     */
    public JAXBElement<RCompanyType> getRCompany() {
        return rCompany;
    }

    /**
     * Sets the value of the rCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RCompanyType }{@code >}
     *     
     */
    public void setRCompany(JAXBElement<RCompanyType> value) {
        this.rCompany = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerRoleType }
     *     
     */
    public ConsumerRoleType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerRoleType }
     *     
     */
    public void setRole(ConsumerRoleType value) {
        this.role = value;
    }

}
