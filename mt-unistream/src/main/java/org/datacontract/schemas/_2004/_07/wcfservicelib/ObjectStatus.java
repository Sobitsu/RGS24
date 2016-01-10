
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectStatus", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries")
@XmlEnum
public enum ObjectStatus {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    ObjectStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectStatus fromValue(String v) {
        for (ObjectStatus c: ObjectStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
