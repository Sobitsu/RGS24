
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bank"/>
 *     &lt;enumeration value="Virtual"/>
 *     &lt;enumeration value="Center"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankType")
@XmlEnum
public enum BankType {

    @XmlEnumValue("Bank")
    BANK("Bank"),
    @XmlEnumValue("Virtual")
    VIRTUAL("Virtual"),
    @XmlEnumValue("Center")
    CENTER("Center");
    private final String value;

    BankType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankType fromValue(String v) {
        for (BankType c: BankType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
