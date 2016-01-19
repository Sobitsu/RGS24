
package org.datacontract.schemas._2004._07.wcfservicelib;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFinDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFinDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinDetail" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients}FinDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFinDetail", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients", propOrder = {
    "finDetail"
})
public class ArrayOfFinDetail {

    @XmlElement(name = "FinDetail", nillable = true)
    protected List<FinDetail> finDetail;

    /**
     * Gets the value of the finDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinDetail }
     * 
     * 
     */
    public List<FinDetail> getFinDetail() {
        if (finDetail == null) {
            finDetail = new ArrayList<FinDetail>();
        }
        return this.finDetail;
    }

}
