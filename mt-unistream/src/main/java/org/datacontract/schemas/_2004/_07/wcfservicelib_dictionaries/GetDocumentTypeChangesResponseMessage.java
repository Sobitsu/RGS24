
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib.WsResponse;


/**
 * <p>Java class for GetDocumentTypeChangesResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDocumentTypeChangesResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="DocumentTypes" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType}ArrayOfDocumentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDocumentTypeChangesResponseMessage", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", propOrder = {
    "documentTypes"
})
public class GetDocumentTypeChangesResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "DocumentTypes", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentType> documentTypes;

    /**
     * Gets the value of the documentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentType> getDocumentTypes() {
        return documentTypes;
    }

    /**
     * Sets the value of the documentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     *     
     */
    public void setDocumentTypes(JAXBElement<ArrayOfDocumentType> value) {
        this.documentTypes = value;
    }

}
