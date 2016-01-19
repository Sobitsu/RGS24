
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStateCategoryTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardStateCategoryTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Activity"/>
 *     &lt;enumeration value="Block"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardStateCategoryTypes")
@XmlEnum
public enum CardStateCategoryTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Activity")
    ACTIVITY("Activity"),
    @XmlEnumValue("Block")
    BLOCK("Block");
    private final String value;

    CardStateCategoryTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardStateCategoryTypes fromValue(String v) {
        for (CardStateCategoryTypes c: CardStateCategoryTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
