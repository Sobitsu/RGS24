
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Paid"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Cancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferStatus")
@XmlEnum
public enum TransferStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    TransferStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferStatus fromValue(String v) {
        for (TransferStatus c: TransferStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
