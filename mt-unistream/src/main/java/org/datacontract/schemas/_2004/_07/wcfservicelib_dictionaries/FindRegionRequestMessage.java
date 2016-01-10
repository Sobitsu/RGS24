
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsRequest;


/**
 * <p>Java class for FindRegionRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindRegionRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="LangID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindRegionRequestMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", propOrder = {
    "langID",
    "mask"
})
public class FindRegionRequestMessage
    extends WsRequest
{

    @XmlElement(name = "LangID")
    protected Integer langID;
    @XmlElementRef(name = "Mask", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mask;

    /**
     * Gets the value of the langID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLangID() {
        return langID;
    }

    /**
     * Sets the value of the langID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLangID(Integer value) {
        this.langID = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMask(JAXBElement<String> value) {
        this.mask = ((JAXBElement<String> ) value);
    }

}
