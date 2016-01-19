
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidCardStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepaidCardStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Activated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrepaidCardStatus")
@XmlEnum
public enum PrepaidCardStatusType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Activated")
    ACTIVATED("Activated");
    private final String value;

    PrepaidCardStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepaidCardStatusType fromValue(String v) {
        for (PrepaidCardStatusType c: PrepaidCardStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
