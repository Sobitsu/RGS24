
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoticeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoticeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Approved"/>
 *     &lt;enumeration value="Rejected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoticeStatus")
@XmlEnum
public enum NoticeStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected");
    private final String value;

    NoticeStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoticeStatus fromValue(String v) {
        for (NoticeStatus c: NoticeStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
