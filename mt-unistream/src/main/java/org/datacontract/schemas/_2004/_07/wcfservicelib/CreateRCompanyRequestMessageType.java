
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRCompanyRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRCompanyRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="RCompany" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}RCompany" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRCompanyRequestMessage", propOrder = {
    "rCompany"
})
public class CreateRCompanyRequestMessageType
    extends WsRequest
{

    @XmlElementRef(name = "RCompany", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<RCompanyType> rCompany;

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

}
