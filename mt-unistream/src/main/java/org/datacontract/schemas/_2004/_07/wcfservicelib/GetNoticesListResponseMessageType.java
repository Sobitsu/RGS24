
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNoticesListResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNoticesListResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Notices" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ArrayOfNotice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNoticesListResponseMessage", propOrder = {
    "notices"
})
public class GetNoticesListResponseMessageType
    extends WsResponse
{

    @XmlElementRef(name = "Notices", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNoticeType> notices;

    /**
     * Gets the value of the notices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNoticeType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNoticeType> getNotices() {
        return notices;
    }

    /**
     * Sets the value of the notices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNoticeType }{@code >}
     *     
     */
    public void setNotices(JAXBElement<ArrayOfNoticeType> value) {
        this.notices = value;
    }

}
