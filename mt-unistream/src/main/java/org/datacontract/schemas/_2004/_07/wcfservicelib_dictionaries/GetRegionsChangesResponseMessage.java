
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for GetRegionsChangesResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRegionsChangesResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Regions" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region}ArrayOfRegion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRegionsChangesResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", propOrder = {
    "regions"
})
public class GetRegionsChangesResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "Regions", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRegion> regions;

    /**
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRegion> getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}
     *     
     */
    public void setRegions(JAXBElement<ArrayOfRegion> value) {
        this.regions = ((JAXBElement<ArrayOfRegion> ) value);
    }

}
