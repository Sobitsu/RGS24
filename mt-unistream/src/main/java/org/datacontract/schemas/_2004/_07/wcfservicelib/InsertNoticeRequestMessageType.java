
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsertNoticeRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsertNoticeRequestMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsRequest">
 *       &lt;sequence>
 *         &lt;element name="Notice" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}Notice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertNoticeRequestMessage", propOrder = {
    "notice"
})
public class InsertNoticeRequestMessageType
    extends WsRequest
{

    @XmlElementRef(name = "Notice", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<NoticeType> notice;

    /**
     * Gets the value of the notice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoticeType }{@code >}
     *     
     */
    public JAXBElement<NoticeType> getNotice() {
        return notice;
    }

    /**
     * Sets the value of the notice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoticeType }{@code >}
     *     
     */
    public void setNotice(JAXBElement<NoticeType> value) {
        this.notice = value;
    }

}
