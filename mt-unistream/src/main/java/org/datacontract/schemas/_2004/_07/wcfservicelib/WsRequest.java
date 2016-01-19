
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.AuthenticateClientByCardRequestMesasge;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForUnistreamCardRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForVirtualPrepaidCardRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRBankByBicRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRegionRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCardByNymberRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetClientBonusPointsRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetRegionsChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetTaxesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.IsCardActivatedRequestMessage;


/**
 * <p>Java class for WsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthenticationHeader" type="{http://schemas.datacontract.org/2004/07/WcfServiceLib}AuthenticationHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsRequest", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils", propOrder = {
    "authenticationHeader"
})
@XmlSeeAlso({
    CheckSMSConfirmationRequestMessageType.class,
    GetBankByIDRequestMessageType.class,
    PayoutTransferRequestMessageType.class,
    GetTaxesRequestMessage.class,
    ApproveNoticeRequestMessageType.class,
    GetTransferByIDRequestMessageType.class,
    RejectNoticeRequestMessageType.class,
    EstimateMainAmountRequestMessageType.class,
    CreateSMSConfirmationRequestMessageType.class,
    GetTransfersListRequestMessageType.class,
    FindTransferRequestMessageType.class,
    GetLastTransferTemplatesRequestMessageType.class,
    PrepareNoticeRequestMessageType.class,
    InsertTransferWithCardRequestMessageType.class,
    CheckPersonListedRequestMessageType.class,
    ConfirmClearingReportRequestMessageType.class,
    AddPersonDocumentRequestMessageType.class,
    PersonificateWalletRequesetMessageType.class,
    ReturnTransferRequestMessageType.class,
    FindRBankByBicRequestMessageType.class,
    ActivatePrepaidCardRequestMessageType.class,
    GetRegionsChangesRequestMessage.class,
    GetClientBonusPointsRequestMessage.class,
    GetCountriesChangesRequestMessage.class,
    GetTransfersChangesRequestMessageType.class,
    GetCurrenciesChangesRequestMessage.class,
    IsCardActivatedRequestMessage.class,
    GetTransferBySourceIDRequestMessageType.class,
    CreateRCompanyRequestMessageType.class,
    FindPersonRequestMessageType.class,
    InsertTransferRequestMessageType.class,
    GetBanksChangesRequestMessageType.class,
    AddPersonAddressRequestMessageType.class,
    CreateAndSendNewPinForUnistreamCardRequestMessage.class,
    FindRegionRequestMessage.class,
    GetNoticeByIDRequestMessageType.class,
    GetNoticesListRequestMessageType.class,
    AuthenticateClientByCardRequestMesasge.class,
    PrepareTransferRequestMessageType.class,
    IdentifyPersonByCardRequestMessageType.class,
    GetCountriesRequestMessage.class,
    AddPersonPhoneRequestMessageType.class,
    CreatePrepaidCardRequestMessageType.class,
    InsertTransfer2RequestMessageType.class,
    GetClearingReportRequestMessageType.class,
    GetDocumentTypeChangesRequestMessage.class,
    GetNoticesChangesRequestMessageType.class,
    GetCardByNymberRequestMessage.class,
    GetBankInfosChangesRequestMessage.class,
    CreatePersonRequestMessageType.class,
    CreateAndSendNewPinForVirtualPrepaidCardRequestMessage.class,
    InsertNoticeRequestMessageType.class
})
public class WsRequest {

    @XmlElementRef(name = "AuthenticationHeader", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationHeaderType> authenticationHeader;

    /**
     * Gets the value of the authenticationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationHeaderType }{@code >}
     *     
     */
    public JAXBElement<AuthenticationHeaderType> getAuthenticationHeader() {
        return authenticationHeader;
    }

    /**
     * Sets the value of the authenticationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationHeaderType }{@code >}
     *     
     */
    public void setAuthenticationHeader(JAXBElement<AuthenticationHeaderType> value) {
        this.authenticationHeader = value;
    }

}
