
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddPersonAddressRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddPersonAddressRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="NewPersonAddress" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}PersonAddress" minOccurs="0"/>
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
@XmlType(name = "AddPersonAddressRequestMessage", propOrder = {
    "newPersonAddress",
    "person"
})
public class AddPersonAddressRequestMessage
    extends WsRequest
{

    @XmlElementRef(name = "NewPersonAddress", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonAddress> newPersonAddress;
    @XmlElementRef(name = "Person", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<Person> person;

    /**
     * Gets the value of the newPersonAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonAddress }{@code >}
     *     
     */
    public JAXBElement<PersonAddress> getNewPersonAddress() {
        return newPersonAddress;
    }

    /**
     * Sets the value of the newPersonAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonAddress }{@code >}
     *     
     */
    public void setNewPersonAddress(JAXBElement<PersonAddress> value) {
        this.newPersonAddress = ((JAXBElement<PersonAddress> ) value);
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
