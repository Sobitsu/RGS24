
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OutgoingTransfers"/>
 *     &lt;enumeration value="IncomingTransfers"/>
 *     &lt;enumeration value="PaidTransfers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionFilter")
@XmlEnum
public enum DirectionFilter {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("OutgoingTransfers")
    OUTGOING_TRANSFERS("OutgoingTransfers"),
    @XmlEnumValue("IncomingTransfers")
    INCOMING_TRANSFERS("IncomingTransfers"),
    @XmlEnumValue("PaidTransfers")
    PAID_TRANSFERS("PaidTransfers");
    private final String value;

    DirectionFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionFilter fromValue(String v) {
        for (DirectionFilter c: DirectionFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
