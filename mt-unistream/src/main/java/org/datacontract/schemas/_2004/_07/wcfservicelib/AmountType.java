
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Main"/>
 *     &lt;enumeration value="ActualPaid"/>
 *     &lt;enumeration value="EstimatedPaidout"/>
 *     &lt;enumeration value="ActualPaidout"/>
 *     &lt;enumeration value="PrimaryPaidComission"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountType")
@XmlEnum
public enum AmountType {

    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("ActualPaid")
    ACTUAL_PAID("ActualPaid"),
    @XmlEnumValue("EstimatedPaidout")
    ESTIMATED_PAIDOUT("EstimatedPaidout"),
    @XmlEnumValue("ActualPaidout")
    ACTUAL_PAIDOUT("ActualPaidout"),
    @XmlEnumValue("PrimaryPaidComission")
    PRIMARY_PAID_COMISSION("PrimaryPaidComission");
    private final String value;

    AmountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountType fromValue(String v) {
        for (AmountType c: AmountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
