
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumerRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConsumerRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sender"/>
 *     &lt;enumeration value="SendersRepresentative"/>
 *     &lt;enumeration value="ExpectedReceiver"/>
 *     &lt;enumeration value="ActualReceiver"/>
 *     &lt;enumeration value="ReceiversRepresentative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConsumerRole")
@XmlEnum
public enum ConsumerRole {

    @XmlEnumValue("Sender")
    SENDER("Sender"),
    @XmlEnumValue("SendersRepresentative")
    SENDERS_REPRESENTATIVE("SendersRepresentative"),
    @XmlEnumValue("ExpectedReceiver")
    EXPECTED_RECEIVER("ExpectedReceiver"),
    @XmlEnumValue("ActualReceiver")
    ACTUAL_RECEIVER("ActualReceiver"),
    @XmlEnumValue("ReceiversRepresentative")
    RECEIVERS_REPRESENTATIVE("ReceiversRepresentative");
    private final String value;

    ConsumerRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConsumerRole fromValue(String v) {
        for (ConsumerRole c: ConsumerRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
