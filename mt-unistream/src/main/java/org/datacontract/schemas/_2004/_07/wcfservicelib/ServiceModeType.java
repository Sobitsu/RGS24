
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="Term"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceMode")
@XmlEnum
public enum ServiceModeType {

    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Term")
    TERM("Term");
    private final String value;

    ServiceModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceModeType fromValue(String v) {
        for (ServiceModeType c: ServiceModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
