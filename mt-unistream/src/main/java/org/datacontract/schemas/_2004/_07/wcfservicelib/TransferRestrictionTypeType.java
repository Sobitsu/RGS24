
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferRestrictionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferRestrictionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="Stop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferRestrictionType")
@XmlEnum
public enum TransferRestrictionTypeType {

    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Stop")
    STOP("Stop");
    private final String value;

    TransferRestrictionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferRestrictionTypeType fromValue(String v) {
        for (TransferRestrictionTypeType c: TransferRestrictionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
