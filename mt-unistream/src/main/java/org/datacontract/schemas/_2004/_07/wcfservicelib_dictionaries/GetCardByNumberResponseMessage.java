
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for GetCardByNumberResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCardByNumberResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Card" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card}Card" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCardByNumberResponseMessage", propOrder = {
    "card"
})
public class GetCardByNumberResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "Card", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", type = JAXBElement.class, required = false)
    protected JAXBElement<Card> card;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Card }{@code >}
     *     
     */
    public JAXBElement<Card> getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Card }{@code >}
     *     
     */
    public void setCard(JAXBElement<Card> value) {
        this.card = value;
    }

}
