
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPersonPhoneRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPersonPhoneRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="NewPersonPhone" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients}Phone" minOccurs="0"/>
 *         &lt;element name="Person" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}Person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddPersonPhoneRequestMessage", propOrder = {
    "newPersonPhone",
    "person"
})
public class AddPersonPhoneRequestMessage
    extends WsRequest
{

    @XmlElementRef(name = "NewPersonPhone", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<Phone> newPersonPhone;
    @XmlElementRef(name = "Person", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<Person> person;

    /**
     * Gets the value of the newPersonPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Phone }{@code >}
     *     
     */
    public JAXBElement<Phone> getNewPersonPhone() {
        return newPersonPhone;
    }

    /**
     * Sets the value of the newPersonPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Phone }{@code >}
     *     
     */
    public void setNewPersonPhone(JAXBElement<Phone> value) {
        this.newPersonPhone = ((JAXBElement<Phone> ) value);
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     
     */
    public JAXBElement<Person> getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Person }{@code >}
     *     
     */
    public void setPerson(JAXBElement<Person> value) {
        this.person = ((JAXBElement<Person> ) value);
    }

}
