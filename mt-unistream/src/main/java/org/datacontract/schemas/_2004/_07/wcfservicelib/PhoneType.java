
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhoneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Office"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhoneType", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients")
@XmlEnum
public enum PhoneType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Office")
    OFFICE("Office");
    private final String value;

    PhoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneType fromValue(String v) {
        for (PhoneType c: PhoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
