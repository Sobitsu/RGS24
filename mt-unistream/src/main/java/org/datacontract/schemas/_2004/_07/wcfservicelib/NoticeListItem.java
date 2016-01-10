
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoticeListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoticeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoticeStatus" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}NoticeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeListItem", propOrder = {
    "noticeID",
    "noticeStatus"
})
public class NoticeListItem {

    @XmlElement(name = "NoticeID")
    protected Integer noticeID;
    @XmlElement(name = "NoticeStatus")
    protected NoticeStatus noticeStatus;

    /**
     * Gets the value of the noticeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoticeID() {
        return noticeID;
    }

    /**
     * Sets the value of the noticeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoticeID(Integer value) {
        this.noticeID = value;
    }

    /**
     * Gets the value of the noticeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeStatus }
     *     
     */
    public NoticeStatus getNoticeStatus() {
        return noticeStatus;
    }

    /**
     * Sets the value of the noticeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeStatus }
     *     
     */
    public void setNoticeStatus(NoticeStatus value) {
        this.noticeStatus = value;
    }

}
