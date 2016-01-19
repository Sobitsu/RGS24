
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckPersonListedResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPersonListedResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="CheckResult" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ListedPerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPersonListedResponseMessage", propOrder = {
    "checkResult"
})
public class CheckPersonListedResponseMessageType
    extends WsResponse
{

    @XmlElementRef(name = "CheckResult", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ListedPersonType> checkResult;

    /**
     * Gets the value of the checkResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListedPersonType }{@code >}
     *     
     */
    public JAXBElement<ListedPersonType> getCheckResult() {
        return checkResult;
    }

    /**
     * Sets the value of the checkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListedPersonType }{@code >}
     *     
     */
    public void setCheckResult(JAXBElement<ListedPersonType> value) {
        this.checkResult = value;
    }

}
