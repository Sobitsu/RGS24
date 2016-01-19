
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Direction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Direction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Outgoing"/>
 *     &lt;enumeration value="Incoming"/>
 *     &lt;enumeration value="InternalCashOperations"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Direction", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank")
@XmlEnum
public enum DirectionType {

    @XmlEnumValue("Outgoing")
    OUTGOING("Outgoing"),
    @XmlEnumValue("Incoming")
    INCOMING("Incoming"),
    @XmlEnumValue("InternalCashOperations")
    INTERNAL_CASH_OPERATIONS("InternalCashOperations");
    private final String value;

    DirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionType fromValue(String v) {
        for (DirectionType c: DirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
