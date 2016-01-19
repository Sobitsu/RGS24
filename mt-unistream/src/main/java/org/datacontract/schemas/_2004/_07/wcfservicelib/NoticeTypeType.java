
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoticeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoticeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="ChangeReceiver"/>
 *     &lt;enumeration value="ChangeBank"/>
 *     &lt;enumeration value="RejectTransfer"/>
 *     &lt;enumeration value="CancelTransfer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoticeType")
@XmlEnum
public enum NoticeTypeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("ChangeReceiver")
    CHANGE_RECEIVER("ChangeReceiver"),
    @XmlEnumValue("ChangeBank")
    CHANGE_BANK("ChangeBank"),
    @XmlEnumValue("RejectTransfer")
    REJECT_TRANSFER("RejectTransfer"),
    @XmlEnumValue("CancelTransfer")
    CANCEL_TRANSFER("CancelTransfer");
    private final String value;

    NoticeTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoticeTypeType fromValue(String v) {
        for (NoticeTypeType c: NoticeTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
