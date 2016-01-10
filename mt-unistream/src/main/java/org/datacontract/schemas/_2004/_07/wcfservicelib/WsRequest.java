
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRegionRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetRegionsChangesRequestMessage;


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
    SellPrepaidCardRequestMessage.class,
    ConfirmClearingReportRequestMessage.class,
    GetDocumentTypeChangesRequestMessage.class,
    FindRegionRequestMessage.class,
    GetBankByIDRequestMessage.class,
    IdentifyPersonByCardRequestMessage.class,
    GetClearingReportRequestMessage.class,
    GetLastTransferTemplatesRequestMessage.class,
    EstimateMainAmountRequestMessage.class,
    AddPersonPhoneRequestMessage.class,
    ReturnTransferRequestMessage.class,
    InsertNoticeRequestMessage.class,
    GetTransferBySourceIDRequestMessage.class,
    GetCountriesChangesRequestMessage.class,
    GetCurrenciesChangesRequestMessage.class,
    PrepareNoticeRequestMessage.class,
    GetNoticesChangesRequestMessage.class,
    InsertTransfer2RequestMessage.class,
    PayoutTransferRequestMessage.class,
    InsertTransferRequestMessage.class,
    GetNoticesListRequestMessage.class,
    AddPersonDocumentRequestMessage.class,
    GetRegionsChangesRequestMessage.class,
    PrepareTransferRequestMessage.class,
    RejectNoticeRequestMessage.class,
    GetBankInfosChangesRequestMessage.class,
    GetBanksChangesRequestMessage.class,
    CreatePersonRequestMessage.class,
    GetTransferByIDRequestMessage.class,
    GetTransfersListRequestMessage.class,
    GetTransfersChangesRequestMessage.class,
    FindPersonRequestMessage.class,
    GetNoticeByIDRequestMessage.class,
    FindTransferRequestMessage.class,
    ApproveNoticeRequestMessage.class,
    GetCountriesRequestMessage.class,
    AddPersonAddressRequestMessage.class
})
public class WsRequest {

    @XmlElementRef(name = "AuthenticationHeader", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Utils", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationHeader> authenticationHeader;

    /**
     * Gets the value of the authenticationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}
     *     
     */
    public JAXBElement<AuthenticationHeader> getAuthenticationHeader() {
        return authenticationHeader;
    }

    /**
     * Sets the value of the authenticationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}
     *     
     */
    public void setAuthenticationHeader(JAXBElement<AuthenticationHeader> value) {
        this.authenticationHeader = ((JAXBElement<AuthenticationHeader> ) value);
    }

}
