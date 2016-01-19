
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCardState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCardState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardState" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card}CardState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCardState", propOrder = {
    "cardState"
})
public class ArrayOfCardState {

    @XmlElement(name = "CardState", nillable = true)
    protected List<CardState> cardState;

    /**
     * Gets the value of the cardState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardState }
     * 
     * 
     */
    public List<CardState> getCardState() {
        if (cardState == null) {
            cardState = new ArrayList<CardState>();
        }
        return this.cardState;
    }

}
