
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.AuthenticateClientByCardResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForUnistreamCardResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForVirtualPrepaidCardResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRBankByBicResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRegionResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCardByNumberResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetClientBonusPointsResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetRegionsChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetTaxesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.IsCardActivatedResponseMessage;


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
    InsertTransferWithCardResponseMessageType.class,
    GetTransferBySourceIDResponseMessageType.class,
    AddPersonDocumentResponseMessageType.class,
    FindRBankByBicResponseMessageType.class,
    IsCardActivatedResponseMessage.class,
    IdentifyPersonByCardResponseMessageType.class,
    GetNoticesListResponseMessageType.class,
    GetTaxesResponseMessage.class,
    ConfirmClearingReportResponseMessageType.class,
    RejectNoticeResponseMessageType.class,
    FindTransferResponseMessageType.class,
    CheckSMSConfirmationResponseMessageType.class,
    FindRegionResponseMessage.class,
    GetTransfersChangesResponseMessageType.class,
    CreateSMSConfrmationResponseMessageType.class,
    GetNoticeByIDResponseMessageType.class,
    GetNoticesChangesResponseMessageType.class,
    GetCountriesChangesResponseMessage.class,
    GetCardByNumberResponseMessage.class,
    GetCountriesResponseMessage.class,
    FindPersonResponseMessageType.class,
    CreatePrepaidCardResponseMessageType.class,
    PrepareNoticeResponseMessageType.class,
    GetCurrenciesChangesResponseMessage.class,
    CreateAndSendNewPinForVirtualPrepaidCardResponseMessage.class,
    AddPersonPhoneResponseMessageType.class,
    InsertNoticeResponseMessageType.class,
    CheckPersonListedResponseMessageType.class,
    GetTransferByIDResponseMessageType.class,
    ApproveNoticeResponseMessageType.class,
    CreatePersonResponseMessageType.class,
    ReturnTransferResponseMessageType.class,
    GetTransfersListResponseMessageType.class,
    GetClearingReportResponseMessageType.class,
    PayoutTransferResponseMessageType.class,
    CreateAndSendNewPinForUnistreamCardResponseMessage.class,
    AddPersonAddressResponseMessageType.class,
    GetBankInfosChangesResponseMessage.class,
    ActivatePrepaidCardResponseMessageType.class,
    GetClientBonusPointsResponseMessage.class,
    PrepareTransferResponseMessageType.class,
    GetRegionsChangesResponseMessage.class,
    GetLastTransferTemplatesResponseMessageType.class,
    EstimateMainAmountResponseMessageType.class,
    InsertTransferResponseMessageType.class,
    GetBanksChangesResponseMessageType.class,
    CreateRCompanyResponseMessageType.class,
    InsertTransfer2ResponseMessageType.class,
    GetDocumentTypeChangesResponseMessage.class,
    GetBankByIDResponseMessageType.class,
    PersonificateWalletResponseMessageType.class,
    AuthenticateClientByCardResponseMessage.class
})
public class WsResponse {

    @XmlElementRef(name = "Fault", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils", type = JAXBElement.class, required = false)
    protected JAXBElement<FaultType> fault;

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     *     
     */
    public JAXBElement<FaultType> getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FaultType }{@code >}
     *     
     */
    public void setFault(JAXBElement<FaultType> value) {
        this.fault = value;
    }

}
