
package org.datacontract.schemas._2004._07.wcfservicelib;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatisticsRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatisticsRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatisticsRow" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}StatisticsRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatisticsRow", propOrder = {
    "statisticsRow"
})
public class ArrayOfStatisticsRow {

    @XmlElement(name = "StatisticsRow", nillable = true)
    protected List<StatisticsRow> statisticsRow;

    /**
     * Gets the value of the statisticsRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statisticsRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatisticsRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticsRow }
     * 
     * 
     */
    public List<StatisticsRow> getStatisticsRow() {
        if (statisticsRow == null) {
            statisticsRow = new ArrayList<StatisticsRow>();
        }
        return this.statisticsRow;
    }

}
