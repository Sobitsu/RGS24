
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Remittance"/>
 *     &lt;enumeration value="Credit"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="PayOrder"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferType")
@XmlEnum
public enum TransferTypeType {

    @XmlEnumValue("Remittance")
    REMITTANCE("Remittance"),
    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("PayOrder")
    PAY_ORDER("PayOrder");
    private final String value;

    TransferTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferTypeType fromValue(String v) {
        for (TransferTypeType c: TransferTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
