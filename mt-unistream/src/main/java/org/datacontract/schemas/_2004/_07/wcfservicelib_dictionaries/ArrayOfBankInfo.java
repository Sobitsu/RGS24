
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBankInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBankInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankInfo" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo}BankInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBankInfo", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", propOrder = {
    "bankInfo"
})
public class ArrayOfBankInfo {

    @XmlElement(name = "BankInfo", nillable = true)
    protected List<BankInfo> bankInfo;

    /**
     * Gets the value of the bankInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankInfo }
     * 
     * 
     */
    public List<BankInfo> getBankInfo() {
        if (bankInfo == null) {
            bankInfo = new ArrayList<BankInfo>();
        }
        return this.bankInfo;
    }

}
