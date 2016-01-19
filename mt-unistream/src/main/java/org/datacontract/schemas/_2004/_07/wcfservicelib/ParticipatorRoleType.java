
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipatorRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipatorRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SenderPOS"/>
 *     &lt;enumeration value="ExpectedReceiverPOS"/>
 *     &lt;enumeration value="ActualReceiverPOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipatorRole")
@XmlEnum
public enum ParticipatorRoleType {

    @XmlEnumValue("SenderPOS")
    SENDER_POS("SenderPOS"),
    @XmlEnumValue("ExpectedReceiverPOS")
    EXPECTED_RECEIVER_POS("ExpectedReceiverPOS"),
    @XmlEnumValue("ActualReceiverPOS")
    ACTUAL_RECEIVER_POS("ActualReceiverPOS");
    private final String value;

    ParticipatorRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParticipatorRoleType fromValue(String v) {
        for (ParticipatorRoleType c: ParticipatorRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
