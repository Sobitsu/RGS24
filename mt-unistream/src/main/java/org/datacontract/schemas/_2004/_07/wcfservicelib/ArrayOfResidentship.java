
package org.datacontract.schemas._2004._07.wcfservicelib;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfResidentship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResidentship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Residentship" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients}Residentship" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResidentship", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Clients", propOrder = {
    "residentship"
})
public class ArrayOfResidentship {

    @XmlElement(name = "Residentship", nillable = true)
    protected List<Residentship> residentship;

    /**
     * Gets the value of the residentship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residentship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResidentship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Residentship }
     * 
     * 
     */
    public List<Residentship> getResidentship() {
        if (residentship == null) {
            residentship = new ArrayList<Residentship>();
        }
        return this.residentship;
    }

}
