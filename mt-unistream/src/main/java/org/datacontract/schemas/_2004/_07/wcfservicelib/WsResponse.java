
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRegionResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetRegionsChangesResponseMessage;


/**
 * <p>Java class for WsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fault" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}Fault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsResponse", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils", propOrder = {
    "fault"
})
@XmlSeeAlso({
    GetBankByIDResponseMessage.class,
    AddPersonDocumentResponseMessage.class,
    IdentifyPersonByCardResponseMessage.class,
    GetTransferByIDResponseMessage.class,
    InsertTransfer2ResponseMessage.class,
    GetNoticeByIDResponseMessage.class,
    GetBankInfosChangesResponseMessage.class,
    ReturnTransferResponseMessage.class,
    GetTransfersChangesResponseMessage.class,
    GetDocumentTypeChangesResponseMessage.class,
    RejectNoticeResponseMessage.class,
    SellPrepaidCardResponseMessage.class,
    PrepareNoticeResponseMessage.class,
    ConfirmClearingReportResponseMessage.class,
    GetRegionsChangesResponseMessage.class,
    GetCountriesChangesResponseMessage.class,
    GetCountriesResponseMessage.class,
    GetBanksChangesResponseMessage.class,
    FindPersonResponseMessage.class,
    AddPersonAddressResponseMessage.class,
    InsertNoticeResponseMessage.class,
    GetNoticesListResponseMessage.class,
    GetCurrenciesChangesResponseMessage.class,
    AddPersonPhoneResponseMessage.class,
    GetLastTransferTemplatesResponseMessage.class,
    GetClearingReportResponseMessage.class,
    PrepareTransferResponseMessage.class,
    EstimateMainAmountResponseMessage.class,
    ApproveNoticeResponseMessage.class,
    GetNoticesChangesResponseMessage.class,
    PayoutTransferResponseMessage.class,
    CreatePersonResponseMessage.class,
    FindRegionResponseMessage.class,
    GetTransfersListResponseMessage.class,
    FindTransferResponseMessage.class,
    InsertTransferResponseMessage.class,
    GetTransferBySourceIDResponseMessage.class
})
public class WsResponse {

    @XmlElementRef(name = "Fault", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils", type = JAXBElement.class, required = false)
    protected JAXBElement<Fault> fault;

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Fault }{@code >}
     *     
     */
    public JAXBElement<Fault> getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Fault }{@code >}
     *     
     */
    public void setFault(JAXBElement<Fault> value) {
        this.fault = ((JAXBElement<Fault> ) value);
    }

}
