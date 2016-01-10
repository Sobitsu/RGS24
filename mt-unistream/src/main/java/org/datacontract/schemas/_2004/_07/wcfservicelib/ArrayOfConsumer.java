
package org.datacontract.schemas._2004._07.wcfservicelib;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConsumer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConsumer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consumer" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}Consumer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConsumer", propOrder = {
    "consumer"
})
public class ArrayOfConsumer {

    @XmlElement(name = "Consumer", nillable = true)
    protected List<Consumer> consumer;

    /**
     * Gets the value of the consumer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Consumer }
     * 
     * 
     */
    public List<Consumer> getConsumer() {
        if (consumer == null) {
            consumer = new ArrayList<Consumer>();
        }
        return this.consumer;
    }

}
