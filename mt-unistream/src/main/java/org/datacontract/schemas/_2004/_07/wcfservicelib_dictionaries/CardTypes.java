
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="UnistreamPlusClassic"/>
 *     &lt;enumeration value="VirtualCardWithoutNominal"/>
 *     &lt;enumeration value="VirtualCardWithNominal"/>
 *     &lt;enumeration value="ScratchCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardTypes")
@XmlEnum
public enum CardTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("UnistreamPlusClassic")
    UNISTREAM_PLUS_CLASSIC("UnistreamPlusClassic"),
    @XmlEnumValue("VirtualCardWithoutNominal")
    VIRTUAL_CARD_WITHOUT_NOMINAL("VirtualCardWithoutNominal"),
    @XmlEnumValue("VirtualCardWithNominal")
    VIRTUAL_CARD_WITH_NOMINAL("VirtualCardWithNominal"),
    @XmlEnumValue("ScratchCard")
    SCRATCH_CARD("ScratchCard");
    private final String value;

    CardTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardTypes fromValue(String v) {
        for (CardTypes c: CardTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
