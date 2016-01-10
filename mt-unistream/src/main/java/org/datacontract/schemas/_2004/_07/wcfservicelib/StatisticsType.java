
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatisticsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatisticsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SentTransfers"/>
 *     &lt;enumeration value="PaidTtransfers"/>
 *     &lt;enumeration value="ReturnedTransfers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatisticsType")
@XmlEnum
public enum StatisticsType {

    @XmlEnumValue("SentTransfers")
    SENT_TRANSFERS("SentTransfers"),
    @XmlEnumValue("PaidTtransfers")
    PAID_TTRANSFERS("PaidTtransfers"),
    @XmlEnumValue("ReturnedTransfers")
    RETURNED_TRANSFERS("ReturnedTransfers");
    private final String value;

    StatisticsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatisticsType fromValue(String v) {
        for (StatisticsType c: StatisticsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
