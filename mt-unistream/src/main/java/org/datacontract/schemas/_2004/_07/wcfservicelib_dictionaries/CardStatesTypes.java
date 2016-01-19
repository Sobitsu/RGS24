
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardStatesTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardStatesTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Activated"/>
 *     &lt;enumeration value="Used"/>
 *     &lt;enumeration value="Suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardStatesTypes")
@XmlEnum
public enum CardStatesTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Activated")
    ACTIVATED("Activated"),
    @XmlEnumValue("Used")
    USED("Used"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended");
    private final String value;

    CardStatesTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardStatesTypes fromValue(String v) {
        for (CardStatesTypes c: CardStatesTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
