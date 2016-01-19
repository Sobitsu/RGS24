
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinDetailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Contract"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FinDetailType", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients")
@XmlEnum
public enum FinDetailType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Contract")
    CONTRACT("Contract");
    private final String value;

    FinDetailType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FinDetailType fromValue(String v) {
        for (FinDetailType c: FinDetailType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
