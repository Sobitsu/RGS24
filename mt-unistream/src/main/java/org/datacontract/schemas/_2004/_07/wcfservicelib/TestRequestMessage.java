
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="Parameter1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestRequestMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils", propOrder = {
    "parameter1"
})
public class TestRequestMessage
    extends WsRequest
{

    @XmlElementRef(name = "Parameter1", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parameter1;

    /**
     * Gets the value of the parameter1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameter1() {
        return parameter1;
    }

    /**
     * Sets the value of the parameter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameter1(JAXBElement<String> value) {
        this.parameter1 = ((JAXBElement<String> ) value);
    }

}
