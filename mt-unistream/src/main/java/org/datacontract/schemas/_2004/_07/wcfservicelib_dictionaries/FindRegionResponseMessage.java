
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for FindRegionResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindRegionResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="FoundRegions" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region}ArrayOfRegion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindRegionResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", propOrder = {
    "foundRegions"
})
public class FindRegionResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "FoundRegions", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRegion> foundRegions;

    /**
     * Gets the value of the foundRegions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRegion> getFoundRegions() {
        return foundRegions;
    }

    /**
     * Sets the value of the foundRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}
     *     
     */
    public void setFoundRegions(JAXBElement<ArrayOfRegion> value) {
        this.foundRegions = value;
    }

}
