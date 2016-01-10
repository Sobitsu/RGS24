
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cancellation"/>
 *     &lt;enumeration value="Outbound"/>
 *     &lt;enumeration value="Inbound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionType")
@XmlEnum
public enum TransactionType {

    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),
    @XmlEnumValue("Inbound")
    INBOUND("Inbound");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
