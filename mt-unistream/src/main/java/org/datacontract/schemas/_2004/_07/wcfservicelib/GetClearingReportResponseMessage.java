
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetClearingReportResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClearingReportResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Report" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}ClearingReport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClearingReportResponseMessage", propOrder = {
    "report"
})
public class GetClearingReportResponseMessage
    extends WsResponse
{

    @XmlElementRef(name = "Report", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib", type = JAXBElement.class, required = false)
    protected JAXBElement<ClearingReport> report;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClearingReport }{@code >}
     *     
     */
    public JAXBElement<ClearingReport> getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClearingReport }{@code >}
     *     
     */
    public void setReport(JAXBElement<ClearingReport> value) {
        this.report = ((JAXBElement<ClearingReport> ) value);
    }

}
