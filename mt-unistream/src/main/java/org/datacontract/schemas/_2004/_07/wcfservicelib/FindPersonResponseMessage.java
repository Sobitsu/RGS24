
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindPersonResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindPersonResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Persons" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfPerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPersonResponseMessage", propOrder = {
    "persons"
})
public class FindPersonResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "Persons", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPerson> persons;

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPerson> getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}
     *     
     */
    public void setPersons(JAXBElement<ArrayOfPerson> value) {
        this.persons = ((JAXBElement<ArrayOfPerson> ) value);
    }

}
