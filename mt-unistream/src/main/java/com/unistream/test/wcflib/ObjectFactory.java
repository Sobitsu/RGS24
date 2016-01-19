
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.ActivatePrepaidCardRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.ActivatePrepaidCardResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonAddressRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonAddressResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonDocumentRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonDocumentResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonPhoneRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonPhoneResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.ApproveNoticeRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.ApproveNoticeResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CheckPersonListedRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CheckPersonListedResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CheckSMSConfirmationRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CheckSMSConfirmationResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.ConfirmClearingReportRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.ConfirmClearingReportResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePrepaidCardRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePrepaidCardResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreateRCompanyRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreateRCompanyResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreateSMSConfirmationRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.CreateSMSConfrmationResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.EstimateMainAmountRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.EstimateMainAmountResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetClearingReportRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetClearingReportResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetLastTransferTemplatesRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetLastTransferTemplatesResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticeByIDRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticeByIDResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesChangesRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesChangesResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesListRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesListResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferBySourceIDRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferBySourceIDResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersChangesRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersChangesResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersListRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersListResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.IdentifyPersonByCardRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.IdentifyPersonByCardResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertNoticeRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertNoticeResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransfer2RequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransfer2ResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferWithCardRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferWithCardResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.PersonificateWalletRequesetMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.PersonificateWalletResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.PrepareNoticeRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.PrepareNoticeResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.PrepareTransferRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.PrepareTransferResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.RejectNoticeRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.RejectNoticeResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.ReturnTransferRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib.ReturnTransferResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.AuthenticateClientByCardRequestMesasge;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.AuthenticateClientByCardResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForUnistreamCardRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForUnistreamCardResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForVirtualPrepaidCardRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForVirtualPrepaidCardResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRBankByBicRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRBankByBicResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRegionRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRegionResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesRequestMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesResponseMessageType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCardByNumberResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCardByNymberRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetClientBonusPointsRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetClientBonusPointsResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetRegionsChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetRegionsChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetTaxesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetTaxesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.IsCardActivatedRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.IsCardActivatedResponseMessage;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unistream.test.wcflib package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreatePersonResponseCreatePersonResult_QNAME = new QName("http://test.unistream.com/wcflib/", "CreatePersonResult");
    private final static QName _PersonificateWalletResponsePersonificateWalletResult_QNAME = new QName("http://test.unistream.com/wcflib/", "PersonificateWalletResult");
    private final static QName _GetRegionsChangesRequestMessage_QNAME = new QName("http://test.unistream.com/wcflib/", "requestMessage");
    private final static QName _IdentifyPersonByCardResponseIdentifyPersonByCardResult_QNAME = new QName("http://test.unistream.com/wcflib/", "IdentifyPersonByCardResult");
    private final static QName _GetCardByNumberResponseGetCardByNumberResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetCardByNumberResult");
    private final static QName _GetClientBonusPointsResponseGetClientBonusPointsResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetClientBonusPointsResult");
    private final static QName _FindPersonResponseFindPersonResult_QNAME = new QName("http://test.unistream.com/wcflib/", "FindPersonResult");
    private final static QName _GetNoticeByIDResponseGetNoticeByIDResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetNoticeByIDResult");
    private final static QName _GetNoticesListResponseGetNoticesListResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetNoticesListResult");
    private final static QName _FindTransferResponseFindTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "FindTransferResult");
    private final static QName _GetTransfersChangesResponseGetTransfersChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetTransfersChangesResult");
    private final static QName _AuthenticateClientbyCardRequestMesasge_QNAME = new QName("http://test.unistream.com/wcflib/", "requestMesasge");
    private final static QName _GetTaxesResponseGetTaxesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetTaxesResult");
    private final static QName _AddPersonPhoneResponseAddPersonPhoneResult_QNAME = new QName("http://test.unistream.com/wcflib/", "AddPersonPhoneResult");
    private final static QName _FindRBankByBicResponseFindRBankByBicResult_QNAME = new QName("http://test.unistream.com/wcflib/", "FindRBankByBicResult");
    private final static QName _CheckPersonListedResponseCheckPersonListedResult_QNAME = new QName("http://test.unistream.com/wcflib/", "CheckPersonListedResult");
    private final static QName _PrepareTransferResponsePrepareTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "PrepareTransferResult");
    private final static QName _ActivatePrepaidCardResponseActivatePrepaidCardResult_QNAME = new QName("http://test.unistream.com/wcflib/", "ActivatePrepaidCardResult");
    private final static QName _CreatePrepaidCardResponseCreatePrepaidCardResult_QNAME = new QName("http://test.unistream.com/wcflib/", "CreatePrepaidCardResult");
    private final static QName _GetTransferByIDResponseGetTransferByIDResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetTransferByIDResult");
    private final static QName _GetLastTransferTemplatesRequestMsg_QNAME = new QName("http://test.unistream.com/wcflib/", "requestMsg");
    private final static QName _GetRegionsChangesResponseGetRegionsChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetRegionsChangesResult");
    private final static QName _EstimateMainAmountResponseEstimateMainAmountResult_QNAME = new QName("http://test.unistream.com/wcflib/", "EstimateMainAmountResult");
    private final static QName _RejectNoticeResponseRejectNoticeResult_QNAME = new QName("http://test.unistream.com/wcflib/", "RejectNoticeResult");
    private final static QName _GetBankByIDResponseGetBankByIDResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetBankByIDResult");
    private final static QName _GetLastTransferTemplatesResponseGetLastTransferTemplatesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetLastTransferTemplatesResult");
    private final static QName _GetTransferBySourceIDResponseGetTransferBySourceIDResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetTransferBySourceIDResult");
    private final static QName _PayoutTransferResponsePayoutTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "PayoutTransferResult");
    private final static QName _GetCountriesChangesResponseGetCountriesChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetCountriesChangesResult");
    private final static QName _InsertTransfer2ResponseInsertTransfer2Result_QNAME = new QName("http://test.unistream.com/wcflib/", "InsertTransfer2Result");
    private final static QName _GetBanksChangesResponseGetBanksChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetBanksChangesResult");
    private final static QName _CreateAndSendNewPinForUnistreamCardResponseCreateAndSendNewPinForUnistreamCardResult_QNAME = new QName("http://test.unistream.com/wcflib/", "CreateAndSendNewPinForUnistreamCardResult");
    private final static QName _FindRegionResponseFindRegionResult_QNAME = new QName("http://test.unistream.com/wcflib/", "FindRegionResult");
    private final static QName _GetNoticesChangesResponseGetNoticesChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetNoticesChangesResult");
    private final static QName _InsertNoticeResponseInsertNoticeResult_QNAME = new QName("http://test.unistream.com/wcflib/", "InsertNoticeResult");
    private final static QName _GetTransfersListResponseGetTransfersListResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetTransfersListResult");
    private final static QName _CreateAndSendNewPinForPrepaidCardResponseCreateAndSendNewPinForPrepaidCardResult_QNAME = new QName("http://test.unistream.com/wcflib/", "CreateAndSendNewPinForPrepaidCardResult");
    private final static QName _ReturnTransferResponseReturnTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "ReturnTransferResult");
    private final static QName _CreateRCompanyResponseCreateRCompanyResult_QNAME = new QName("http://test.unistream.com/wcflib/", "CreateRCompanyResult");
    private final static QName _CheckSmsConfirmationResponseCheckSmsConfirmationResult_QNAME = new QName("http://test.unistream.com/wcflib/", "CheckSmsConfirmationResult");
    private final static QName _AddPersonDocumentResponseAddPersonDocumentResult_QNAME = new QName("http://test.unistream.com/wcflib/", "AddPersonDocumentResult");
    private final static QName _GetCurrenciesChangesResponseGetCurrenciesChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetCurrenciesChangesResult");
    private final static QName _InsertTransferResponseInsertTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "InsertTransferResult");
    private final static QName _ConfirmClearingReportResponseConfirmClearingReportResult_QNAME = new QName("http://test.unistream.com/wcflib/", "ConfirmClearingReportResult");
    private final static QName _GetClearingReportResponseGetClearingReportResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetClearingReportResult");
    private final static QName _ApproveNoticeResponseApproveNoticeResult_QNAME = new QName("http://test.unistream.com/wcflib/", "ApproveNoticeResult");
    private final static QName _GetCountriesResponseGetCountriesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetCountriesResult");
    private final static QName _InsertTransferWithCardResponseInsertTransferWithCardResult_QNAME = new QName("http://test.unistream.com/wcflib/", "InsertTransferWithCardResult");
    private final static QName _AddPersonAddressResponseAddPersonAddressResult_QNAME = new QName("http://test.unistream.com/wcflib/", "AddPersonAddressResult");
    private final static QName _GetDocumentTypeChangesResponseGetDocumentTypeChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetDocumentTypeChangesResult");
    private final static QName _IsCardActivatedResponseIsCardActivatedResult_QNAME = new QName("http://test.unistream.com/wcflib/", "IsCardActivatedResult");
    private final static QName _CreateSmsConfrmationResponseCreateSmsConfrmationResult_QNAME = new QName("http://test.unistream.com/wcflib/", "CreateSmsConfrmationResult");
    private final static QName _AuthenticateClientbyCardResponseAuthenticateClientbyCardResult_QNAME = new QName("http://test.unistream.com/wcflib/", "AuthenticateClientbyCardResult");
    private final static QName _PrepareNoticeResponsePrepareNoticeResult_QNAME = new QName("http://test.unistream.com/wcflib/", "PrepareNoticeResult");
    private final static QName _GetBankInfosChangesResponseGetBankInfosChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetBankInfosChangesResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unistream.test.wcflib
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckSmsConfirmation }
     * 
     */
    public CheckSmsConfirmation createCheckSmsConfirmation() {
        return new CheckSmsConfirmation();
    }

    /**
     * Create an instance of {@link GetBankByID }
     * 
     */
    public GetBankByID createGetBankByID() {
        return new GetBankByID();
    }

    /**
     * Create an instance of {@link PayoutTransfer }
     * 
     */
    public PayoutTransfer createPayoutTransfer() {
        return new PayoutTransfer();
    }

    /**
     * Create an instance of {@link GetTaxes }
     * 
     */
    public GetTaxes createGetTaxes() {
        return new GetTaxes();
    }

    /**
     * Create an instance of {@link InsertTransferWithCardResponse }
     * 
     */
    public InsertTransferWithCardResponse createInsertTransferWithCardResponse() {
        return new InsertTransferWithCardResponse();
    }

    /**
     * Create an instance of {@link GetTransferBySourceIDResponse }
     * 
     */
    public GetTransferBySourceIDResponse createGetTransferBySourceIDResponse() {
        return new GetTransferBySourceIDResponse();
    }

    /**
     * Create an instance of {@link AddPersonDocumentResponse }
     * 
     */
    public AddPersonDocumentResponse createAddPersonDocumentResponse() {
        return new AddPersonDocumentResponse();
    }

    /**
     * Create an instance of {@link FindRBankByBicResponse }
     * 
     */
    public FindRBankByBicResponse createFindRBankByBicResponse() {
        return new FindRBankByBicResponse();
    }

    /**
     * Create an instance of {@link ApproveNotice }
     * 
     */
    public ApproveNotice createApproveNotice() {
        return new ApproveNotice();
    }

    /**
     * Create an instance of {@link IsCardActivatedResponse }
     * 
     */
    public IsCardActivatedResponse createIsCardActivatedResponse() {
        return new IsCardActivatedResponse();
    }

    /**
     * Create an instance of {@link IdentifyPersonByCardResponse }
     * 
     */
    public IdentifyPersonByCardResponse createIdentifyPersonByCardResponse() {
        return new IdentifyPersonByCardResponse();
    }

    /**
     * Create an instance of {@link GetTransferByID }
     * 
     */
    public GetTransferByID createGetTransferByID() {
        return new GetTransferByID();
    }

    /**
     * Create an instance of {@link RejectNotice }
     * 
     */
    public RejectNotice createRejectNotice() {
        return new RejectNotice();
    }

    /**
     * Create an instance of {@link GetNoticesListResponse }
     * 
     */
    public GetNoticesListResponse createGetNoticesListResponse() {
        return new GetNoticesListResponse();
    }

    /**
     * Create an instance of {@link EstimateMainAmount }
     * 
     */
    public EstimateMainAmount createEstimateMainAmount() {
        return new EstimateMainAmount();
    }

    /**
     * Create an instance of {@link GetTaxesResponse }
     * 
     */
    public GetTaxesResponse createGetTaxesResponse() {
        return new GetTaxesResponse();
    }

    /**
     * Create an instance of {@link CreateSmsConfrmation }
     * 
     */
    public CreateSmsConfrmation createCreateSmsConfrmation() {
        return new CreateSmsConfrmation();
    }

    /**
     * Create an instance of {@link ConfirmClearingReportResponse }
     * 
     */
    public ConfirmClearingReportResponse createConfirmClearingReportResponse() {
        return new ConfirmClearingReportResponse();
    }

    /**
     * Create an instance of {@link RejectNoticeResponse }
     * 
     */
    public RejectNoticeResponse createRejectNoticeResponse() {
        return new RejectNoticeResponse();
    }

    /**
     * Create an instance of {@link GetTransfersList }
     * 
     */
    public GetTransfersList createGetTransfersList() {
        return new GetTransfersList();
    }

    /**
     * Create an instance of {@link FindTransfer }
     * 
     */
    public FindTransfer createFindTransfer() {
        return new FindTransfer();
    }

    /**
     * Create an instance of {@link GetLastTransferTemplates }
     * 
     */
    public GetLastTransferTemplates createGetLastTransferTemplates() {
        return new GetLastTransferTemplates();
    }

    /**
     * Create an instance of {@link FindTransferResponse }
     * 
     */
    public FindTransferResponse createFindTransferResponse() {
        return new FindTransferResponse();
    }

    /**
     * Create an instance of {@link PrepareNotice }
     * 
     */
    public PrepareNotice createPrepareNotice() {
        return new PrepareNotice();
    }

    /**
     * Create an instance of {@link CheckSmsConfirmationResponse }
     * 
     */
    public CheckSmsConfirmationResponse createCheckSmsConfirmationResponse() {
        return new CheckSmsConfirmationResponse();
    }

    /**
     * Create an instance of {@link InsertTransferWithCard }
     * 
     */
    public InsertTransferWithCard createInsertTransferWithCard() {
        return new InsertTransferWithCard();
    }

    /**
     * Create an instance of {@link CheckPersonListed }
     * 
     */
    public CheckPersonListed createCheckPersonListed() {
        return new CheckPersonListed();
    }

    /**
     * Create an instance of {@link FindRegionResponse }
     * 
     */
    public FindRegionResponse createFindRegionResponse() {
        return new FindRegionResponse();
    }

    /**
     * Create an instance of {@link GetTransfersChangesResponse }
     * 
     */
    public GetTransfersChangesResponse createGetTransfersChangesResponse() {
        return new GetTransfersChangesResponse();
    }

    /**
     * Create an instance of {@link ConfirmClearingReport }
     * 
     */
    public ConfirmClearingReport createConfirmClearingReport() {
        return new ConfirmClearingReport();
    }

    /**
     * Create an instance of {@link AddPersonDocument }
     * 
     */
    public AddPersonDocument createAddPersonDocument() {
        return new AddPersonDocument();
    }

    /**
     * Create an instance of {@link CreateSmsConfrmationResponse }
     * 
     */
    public CreateSmsConfrmationResponse createCreateSmsConfrmationResponse() {
        return new CreateSmsConfrmationResponse();
    }

    /**
     * Create an instance of {@link PersonificateWallet }
     * 
     */
    public PersonificateWallet createPersonificateWallet() {
        return new PersonificateWallet();
    }

    /**
     * Create an instance of {@link ReturnTransfer }
     * 
     */
    public ReturnTransfer createReturnTransfer() {
        return new ReturnTransfer();
    }

    /**
     * Create an instance of {@link GetNoticeByIDResponse }
     * 
     */
    public GetNoticeByIDResponse createGetNoticeByIDResponse() {
        return new GetNoticeByIDResponse();
    }

    /**
     * Create an instance of {@link GetNoticesChangesResponse }
     * 
     */
    public GetNoticesChangesResponse createGetNoticesChangesResponse() {
        return new GetNoticesChangesResponse();
    }

    /**
     * Create an instance of {@link FindRBankByBic }
     * 
     */
    public FindRBankByBic createFindRBankByBic() {
        return new FindRBankByBic();
    }

    /**
     * Create an instance of {@link ActivatePrepaidCard }
     * 
     */
    public ActivatePrepaidCard createActivatePrepaidCard() {
        return new ActivatePrepaidCard();
    }

    /**
     * Create an instance of {@link GetRegionsChanges }
     * 
     */
    public GetRegionsChanges createGetRegionsChanges() {
        return new GetRegionsChanges();
    }

    /**
     * Create an instance of {@link GetClientBonusPoints }
     * 
     */
    public GetClientBonusPoints createGetClientBonusPoints() {
        return new GetClientBonusPoints();
    }

    /**
     * Create an instance of {@link GetCountriesChanges }
     * 
     */
    public GetCountriesChanges createGetCountriesChanges() {
        return new GetCountriesChanges();
    }

    /**
     * Create an instance of {@link GetCountriesChangesResponse }
     * 
     */
    public GetCountriesChangesResponse createGetCountriesChangesResponse() {
        return new GetCountriesChangesResponse();
    }

    /**
     * Create an instance of {@link GetTransfersChanges }
     * 
     */
    public GetTransfersChanges createGetTransfersChanges() {
        return new GetTransfersChanges();
    }

    /**
     * Create an instance of {@link GetCurrenciesChanges }
     * 
     */
    public GetCurrenciesChanges createGetCurrenciesChanges() {
        return new GetCurrenciesChanges();
    }

    /**
     * Create an instance of {@link GetCardByNumberResponse }
     * 
     */
    public GetCardByNumberResponse createGetCardByNumberResponse() {
        return new GetCardByNumberResponse();
    }

    /**
     * Create an instance of {@link GetCountriesResponse }
     * 
     */
    public GetCountriesResponse createGetCountriesResponse() {
        return new GetCountriesResponse();
    }

    /**
     * Create an instance of {@link FindPersonResponse }
     * 
     */
    public FindPersonResponse createFindPersonResponse() {
        return new FindPersonResponse();
    }

    /**
     * Create an instance of {@link CreatePrepaidCardResponse }
     * 
     */
    public CreatePrepaidCardResponse createCreatePrepaidCardResponse() {
        return new CreatePrepaidCardResponse();
    }

    /**
     * Create an instance of {@link PrepareNoticeResponse }
     * 
     */
    public PrepareNoticeResponse createPrepareNoticeResponse() {
        return new PrepareNoticeResponse();
    }

    /**
     * Create an instance of {@link GetCurrenciesChangesResponse }
     * 
     */
    public GetCurrenciesChangesResponse createGetCurrenciesChangesResponse() {
        return new GetCurrenciesChangesResponse();
    }

    /**
     * Create an instance of {@link CreateAndSendNewPinForPrepaidCardResponse }
     * 
     */
    public CreateAndSendNewPinForPrepaidCardResponse createCreateAndSendNewPinForPrepaidCardResponse() {
        return new CreateAndSendNewPinForPrepaidCardResponse();
    }

    /**
     * Create an instance of {@link IsCardActivated }
     * 
     */
    public IsCardActivated createIsCardActivated() {
        return new IsCardActivated();
    }

    /**
     * Create an instance of {@link AddPersonPhoneResponse }
     * 
     */
    public AddPersonPhoneResponse createAddPersonPhoneResponse() {
        return new AddPersonPhoneResponse();
    }

    /**
     * Create an instance of {@link InsertNoticeResponse }
     * 
     */
    public InsertNoticeResponse createInsertNoticeResponse() {
        return new InsertNoticeResponse();
    }

    /**
     * Create an instance of {@link CheckPersonListedResponse }
     * 
     */
    public CheckPersonListedResponse createCheckPersonListedResponse() {
        return new CheckPersonListedResponse();
    }

    /**
     * Create an instance of {@link GetTransferByIDResponse }
     * 
     */
    public GetTransferByIDResponse createGetTransferByIDResponse() {
        return new GetTransferByIDResponse();
    }

    /**
     * Create an instance of {@link ApproveNoticeResponse }
     * 
     */
    public ApproveNoticeResponse createApproveNoticeResponse() {
        return new ApproveNoticeResponse();
    }

    /**
     * Create an instance of {@link GetTransferBySourceID }
     * 
     */
    public GetTransferBySourceID createGetTransferBySourceID() {
        return new GetTransferBySourceID();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link CreateRCompany }
     * 
     */
    public CreateRCompany createCreateRCompany() {
        return new CreateRCompany();
    }

    /**
     * Create an instance of {@link FindPerson }
     * 
     */
    public FindPerson createFindPerson() {
        return new FindPerson();
    }

    /**
     * Create an instance of {@link ReturnTransferResponse }
     * 
     */
    public ReturnTransferResponse createReturnTransferResponse() {
        return new ReturnTransferResponse();
    }

    /**
     * Create an instance of {@link InsertTransfer }
     * 
     */
    public InsertTransfer createInsertTransfer() {
        return new InsertTransfer();
    }

    /**
     * Create an instance of {@link GetBanksChanges }
     * 
     */
    public GetBanksChanges createGetBanksChanges() {
        return new GetBanksChanges();
    }

    /**
     * Create an instance of {@link AddPersonAddress }
     * 
     */
    public AddPersonAddress createAddPersonAddress() {
        return new AddPersonAddress();
    }

    /**
     * Create an instance of {@link GetTransfersListResponse }
     * 
     */
    public GetTransfersListResponse createGetTransfersListResponse() {
        return new GetTransfersListResponse();
    }

    /**
     * Create an instance of {@link CreateAndSendNewPinForUnistreamCard }
     * 
     */
    public CreateAndSendNewPinForUnistreamCard createCreateAndSendNewPinForUnistreamCard() {
        return new CreateAndSendNewPinForUnistreamCard();
    }

    /**
     * Create an instance of {@link GetClearingReportResponse }
     * 
     */
    public GetClearingReportResponse createGetClearingReportResponse() {
        return new GetClearingReportResponse();
    }

    /**
     * Create an instance of {@link PayoutTransferResponse }
     * 
     */
    public PayoutTransferResponse createPayoutTransferResponse() {
        return new PayoutTransferResponse();
    }

    /**
     * Create an instance of {@link FindRegion }
     * 
     */
    public FindRegion createFindRegion() {
        return new FindRegion();
    }

    /**
     * Create an instance of {@link CreateAndSendNewPinForUnistreamCardResponse }
     * 
     */
    public CreateAndSendNewPinForUnistreamCardResponse createCreateAndSendNewPinForUnistreamCardResponse() {
        return new CreateAndSendNewPinForUnistreamCardResponse();
    }

    /**
     * Create an instance of {@link AddPersonAddressResponse }
     * 
     */
    public AddPersonAddressResponse createAddPersonAddressResponse() {
        return new AddPersonAddressResponse();
    }

    /**
     * Create an instance of {@link GetNoticeByID }
     * 
     */
    public GetNoticeByID createGetNoticeByID() {
        return new GetNoticeByID();
    }

    /**
     * Create an instance of {@link GetNoticesList }
     * 
     */
    public GetNoticesList createGetNoticesList() {
        return new GetNoticesList();
    }

    /**
     * Create an instance of {@link AuthenticateClientbyCard }
     * 
     */
    public AuthenticateClientbyCard createAuthenticateClientbyCard() {
        return new AuthenticateClientbyCard();
    }

    /**
     * Create an instance of {@link GetBankInfosChangesResponse }
     * 
     */
    public GetBankInfosChangesResponse createGetBankInfosChangesResponse() {
        return new GetBankInfosChangesResponse();
    }

    /**
     * Create an instance of {@link ActivatePrepaidCardResponse }
     * 
     */
    public ActivatePrepaidCardResponse createActivatePrepaidCardResponse() {
        return new ActivatePrepaidCardResponse();
    }

    /**
     * Create an instance of {@link PrepareTransfer }
     * 
     */
    public PrepareTransfer createPrepareTransfer() {
        return new PrepareTransfer();
    }

    /**
     * Create an instance of {@link GetClientBonusPointsResponse }
     * 
     */
    public GetClientBonusPointsResponse createGetClientBonusPointsResponse() {
        return new GetClientBonusPointsResponse();
    }

    /**
     * Create an instance of {@link IdentifyPersonByCard }
     * 
     */
    public IdentifyPersonByCard createIdentifyPersonByCard() {
        return new IdentifyPersonByCard();
    }

    /**
     * Create an instance of {@link PrepareTransferResponse }
     * 
     */
    public PrepareTransferResponse createPrepareTransferResponse() {
        return new PrepareTransferResponse();
    }

    /**
     * Create an instance of {@link GetCountries }
     * 
     */
    public GetCountries createGetCountries() {
        return new GetCountries();
    }

    /**
     * Create an instance of {@link GetRegionsChangesResponse }
     * 
     */
    public GetRegionsChangesResponse createGetRegionsChangesResponse() {
        return new GetRegionsChangesResponse();
    }

    /**
     * Create an instance of {@link AddPersonPhone }
     * 
     */
    public AddPersonPhone createAddPersonPhone() {
        return new AddPersonPhone();
    }

    /**
     * Create an instance of {@link CreatePrepaidCard }
     * 
     */
    public CreatePrepaidCard createCreatePrepaidCard() {
        return new CreatePrepaidCard();
    }

    /**
     * Create an instance of {@link InsertTransfer2 }
     * 
     */
    public InsertTransfer2 createInsertTransfer2() {
        return new InsertTransfer2();
    }

    /**
     * Create an instance of {@link GetLastTransferTemplatesResponse }
     * 
     */
    public GetLastTransferTemplatesResponse createGetLastTransferTemplatesResponse() {
        return new GetLastTransferTemplatesResponse();
    }

    /**
     * Create an instance of {@link EstimateMainAmountResponse }
     * 
     */
    public EstimateMainAmountResponse createEstimateMainAmountResponse() {
        return new EstimateMainAmountResponse();
    }

    /**
     * Create an instance of {@link InsertTransferResponse }
     * 
     */
    public InsertTransferResponse createInsertTransferResponse() {
        return new InsertTransferResponse();
    }

    /**
     * Create an instance of {@link GetBanksChangesResponse }
     * 
     */
    public GetBanksChangesResponse createGetBanksChangesResponse() {
        return new GetBanksChangesResponse();
    }

    /**
     * Create an instance of {@link CreateRCompanyResponse }
     * 
     */
    public CreateRCompanyResponse createCreateRCompanyResponse() {
        return new CreateRCompanyResponse();
    }

    /**
     * Create an instance of {@link GetClearingReport }
     * 
     */
    public GetClearingReport createGetClearingReport() {
        return new GetClearingReport();
    }

    /**
     * Create an instance of {@link GetDocumentTypeChanges }
     * 
     */
    public GetDocumentTypeChanges createGetDocumentTypeChanges() {
        return new GetDocumentTypeChanges();
    }

    /**
     * Create an instance of {@link InsertTransfer2Response }
     * 
     */
    public InsertTransfer2Response createInsertTransfer2Response() {
        return new InsertTransfer2Response();
    }

    /**
     * Create an instance of {@link GetDocumentTypeChangesResponse }
     * 
     */
    public GetDocumentTypeChangesResponse createGetDocumentTypeChangesResponse() {
        return new GetDocumentTypeChangesResponse();
    }

    /**
     * Create an instance of {@link GetNoticesChanges }
     * 
     */
    public GetNoticesChanges createGetNoticesChanges() {
        return new GetNoticesChanges();
    }

    /**
     * Create an instance of {@link GetBankByIDResponse }
     * 
     */
    public GetBankByIDResponse createGetBankByIDResponse() {
        return new GetBankByIDResponse();
    }

    /**
     * Create an instance of {@link PersonificateWalletResponse }
     * 
     */
    public PersonificateWalletResponse createPersonificateWalletResponse() {
        return new PersonificateWalletResponse();
    }

    /**
     * Create an instance of {@link GetCardByNumber }
     * 
     */
    public GetCardByNumber createGetCardByNumber() {
        return new GetCardByNumber();
    }

    /**
     * Create an instance of {@link GetBankInfosChanges }
     * 
     */
    public GetBankInfosChanges createGetBankInfosChanges() {
        return new GetBankInfosChanges();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link AuthenticateClientbyCardResponse }
     * 
     */
    public AuthenticateClientbyCardResponse createAuthenticateClientbyCardResponse() {
        return new AuthenticateClientbyCardResponse();
    }

    /**
     * Create an instance of {@link CreateAndSendNewPinForPrepaidCard }
     * 
     */
    public CreateAndSendNewPinForPrepaidCard createCreateAndSendNewPinForPrepaidCard() {
        return new CreateAndSendNewPinForPrepaidCard();
    }

    /**
     * Create an instance of {@link InsertNotice }
     * 
     */
    public InsertNotice createInsertNotice() {
        return new InsertNotice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "CreatePersonResult", scope = CreatePersonResponse.class)
    public JAXBElement<CreatePersonResponseMessageType> createCreatePersonResponseCreatePersonResult(CreatePersonResponseMessageType value) {
        return new JAXBElement<CreatePersonResponseMessageType>(_CreatePersonResponseCreatePersonResult_QNAME, CreatePersonResponseMessageType.class, CreatePersonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonificateWalletResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "PersonificateWalletResult", scope = PersonificateWalletResponse.class)
    public JAXBElement<PersonificateWalletResponseMessageType> createPersonificateWalletResponsePersonificateWalletResult(PersonificateWalletResponseMessageType value) {
        return new JAXBElement<PersonificateWalletResponseMessageType>(_PersonificateWalletResponsePersonificateWalletResult_QNAME, PersonificateWalletResponseMessageType.class, PersonificateWalletResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionsChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetRegionsChanges.class)
    public JAXBElement<GetRegionsChangesRequestMessage> createGetRegionsChangesRequestMessage(GetRegionsChangesRequestMessage value) {
        return new JAXBElement<GetRegionsChangesRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetRegionsChangesRequestMessage.class, GetRegionsChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTransferRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = FindTransfer.class)
    public JAXBElement<FindTransferRequestMessageType> createFindTransferRequestMessage(FindTransferRequestMessageType value) {
        return new JAXBElement<FindTransferRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, FindTransferRequestMessageType.class, FindTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForUnistreamCardRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = CreateAndSendNewPinForUnistreamCard.class)
    public JAXBElement<CreateAndSendNewPinForUnistreamCardRequestMessage> createCreateAndSendNewPinForUnistreamCardRequestMessage(CreateAndSendNewPinForUnistreamCardRequestMessage value) {
        return new JAXBElement<CreateAndSendNewPinForUnistreamCardRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, CreateAndSendNewPinForUnistreamCardRequestMessage.class, CreateAndSendNewPinForUnistreamCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSMSConfirmationRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = CreateSmsConfrmation.class)
    public JAXBElement<CreateSMSConfirmationRequestMessageType> createCreateSmsConfrmationRequestMessage(CreateSMSConfirmationRequestMessageType value) {
        return new JAXBElement<CreateSMSConfirmationRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, CreateSMSConfirmationRequestMessageType.class, CreateSmsConfrmation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonAddressRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = AddPersonAddress.class)
    public JAXBElement<AddPersonAddressRequestMessageType> createAddPersonAddressRequestMessage(AddPersonAddressRequestMessageType value) {
        return new JAXBElement<AddPersonAddressRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, AddPersonAddressRequestMessageType.class, AddPersonAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticesChangesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetNoticesChanges.class)
    public JAXBElement<GetNoticesChangesRequestMessageType> createGetNoticesChangesRequestMessage(GetNoticesChangesRequestMessageType value) {
        return new JAXBElement<GetNoticesChangesRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetNoticesChangesRequestMessageType.class, GetNoticesChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifyPersonByCardResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "IdentifyPersonByCardResult", scope = IdentifyPersonByCardResponse.class)
    public JAXBElement<IdentifyPersonByCardResponseMessageType> createIdentifyPersonByCardResponseIdentifyPersonByCardResult(IdentifyPersonByCardResponseMessageType value) {
        return new JAXBElement<IdentifyPersonByCardResponseMessageType>(_IdentifyPersonByCardResponseIdentifyPersonByCardResult_QNAME, IdentifyPersonByCardResponseMessageType.class, IdentifyPersonByCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransfersListRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetTransfersList.class)
    public JAXBElement<GetTransfersListRequestMessageType> createGetTransfersListRequestMessage(GetTransfersListRequestMessageType value) {
        return new JAXBElement<GetTransfersListRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetTransfersListRequestMessageType.class, GetTransfersList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonPhoneRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = AddPersonPhone.class)
    public JAXBElement<AddPersonPhoneRequestMessageType> createAddPersonPhoneRequestMessage(AddPersonPhoneRequestMessageType value) {
        return new JAXBElement<AddPersonPhoneRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, AddPersonPhoneRequestMessageType.class, AddPersonPhone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentTypeChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetDocumentTypeChanges.class)
    public JAXBElement<GetDocumentTypeChangesRequestMessage> createGetDocumentTypeChangesRequestMessage(GetDocumentTypeChangesRequestMessage value) {
        return new JAXBElement<GetDocumentTypeChangesRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetDocumentTypeChangesRequestMessage.class, GetDocumentTypeChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardByNumberResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetCardByNumberResult", scope = GetCardByNumberResponse.class)
    public JAXBElement<GetCardByNumberResponseMessage> createGetCardByNumberResponseGetCardByNumberResult(GetCardByNumberResponseMessage value) {
        return new JAXBElement<GetCardByNumberResponseMessage>(_GetCardByNumberResponseGetCardByNumberResult_QNAME, GetCardByNumberResponseMessage.class, GetCardByNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientBonusPointsResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetClientBonusPointsResult", scope = GetClientBonusPointsResponse.class)
    public JAXBElement<GetClientBonusPointsResponseMessage> createGetClientBonusPointsResponseGetClientBonusPointsResult(GetClientBonusPointsResponseMessage value) {
        return new JAXBElement<GetClientBonusPointsResponseMessage>(_GetClientBonusPointsResponseGetClientBonusPointsResult_QNAME, GetClientBonusPointsResponseMessage.class, GetClientBonusPointsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "FindPersonResult", scope = FindPersonResponse.class)
    public JAXBElement<FindPersonResponseMessageType> createFindPersonResponseFindPersonResult(FindPersonResponseMessageType value) {
        return new JAXBElement<FindPersonResponseMessageType>(_FindPersonResponseFindPersonResult_QNAME, FindPersonResponseMessageType.class, FindPersonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNoticeRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = InsertNotice.class)
    public JAXBElement<InsertNoticeRequestMessageType> createInsertNoticeRequestMessage(InsertNoticeRequestMessageType value) {
        return new JAXBElement<InsertNoticeRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, InsertNoticeRequestMessageType.class, InsertNotice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticeByIDResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetNoticeByIDResult", scope = GetNoticeByIDResponse.class)
    public JAXBElement<GetNoticeByIDResponseMessageType> createGetNoticeByIDResponseGetNoticeByIDResult(GetNoticeByIDResponseMessageType value) {
        return new JAXBElement<GetNoticeByIDResponseMessageType>(_GetNoticeByIDResponseGetNoticeByIDResult_QNAME, GetNoticeByIDResponseMessageType.class, GetNoticeByIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonDocumentRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = AddPersonDocument.class)
    public JAXBElement<AddPersonDocumentRequestMessageType> createAddPersonDocumentRequestMessage(AddPersonDocumentRequestMessageType value) {
        return new JAXBElement<AddPersonDocumentRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, AddPersonDocumentRequestMessageType.class, AddPersonDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticesListResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetNoticesListResult", scope = GetNoticesListResponse.class)
    public JAXBElement<GetNoticesListResponseMessageType> createGetNoticesListResponseGetNoticesListResult(GetNoticesListResponseMessageType value) {
        return new JAXBElement<GetNoticesListResponseMessageType>(_GetNoticesListResponseGetNoticesListResult_QNAME, GetNoticesListResponseMessageType.class, GetNoticesListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientBonusPointsRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetClientBonusPoints.class)
    public JAXBElement<GetClientBonusPointsRequestMessage> createGetClientBonusPointsRequestMessage(GetClientBonusPointsRequestMessage value) {
        return new JAXBElement<GetClientBonusPointsRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetClientBonusPointsRequestMessage.class, GetClientBonusPoints.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTransferResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "FindTransferResult", scope = FindTransferResponse.class)
    public JAXBElement<FindTransferResponseMessageType> createFindTransferResponseFindTransferResult(FindTransferResponseMessageType value) {
        return new JAXBElement<FindTransferResponseMessageType>(_FindTransferResponseFindTransferResult_QNAME, FindTransferResponseMessageType.class, FindTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransfersChangesResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetTransfersChangesResult", scope = GetTransfersChangesResponse.class)
    public JAXBElement<GetTransfersChangesResponseMessageType> createGetTransfersChangesResponseGetTransfersChangesResult(GetTransfersChangesResponseMessageType value) {
        return new JAXBElement<GetTransfersChangesResponseMessageType>(_GetTransfersChangesResponseGetTransfersChangesResult_QNAME, GetTransfersChangesResponseMessageType.class, GetTransfersChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateClientByCardRequestMesasge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMesasge", scope = AuthenticateClientbyCard.class)
    public JAXBElement<AuthenticateClientByCardRequestMesasge> createAuthenticateClientbyCardRequestMesasge(AuthenticateClientByCardRequestMesasge value) {
        return new JAXBElement<AuthenticateClientByCardRequestMesasge>(_AuthenticateClientbyCardRequestMesasge_QNAME, AuthenticateClientByCardRequestMesasge.class, AuthenticateClientbyCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivatePrepaidCardRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = ActivatePrepaidCard.class)
    public JAXBElement<ActivatePrepaidCardRequestMessageType> createActivatePrepaidCardRequestMessage(ActivatePrepaidCardRequestMessageType value) {
        return new JAXBElement<ActivatePrepaidCardRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, ActivatePrepaidCardRequestMessageType.class, ActivatePrepaidCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetTaxesResult", scope = GetTaxesResponse.class)
    public JAXBElement<GetTaxesResponseMessage> createGetTaxesResponseGetTaxesResult(GetTaxesResponseMessage value) {
        return new JAXBElement<GetTaxesResponseMessage>(_GetTaxesResponseGetTaxesResult_QNAME, GetTaxesResponseMessage.class, GetTaxesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransferRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = InsertTransfer.class)
    public JAXBElement<InsertTransferRequestMessageType> createInsertTransferRequestMessage(InsertTransferRequestMessageType value) {
        return new JAXBElement<InsertTransferRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, InsertTransferRequestMessageType.class, InsertTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = CreatePerson.class)
    public JAXBElement<CreatePersonRequestMessageType> createCreatePersonRequestMessage(CreatePersonRequestMessageType value) {
        return new JAXBElement<CreatePersonRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, CreatePersonRequestMessageType.class, CreatePerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonPhoneResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "AddPersonPhoneResult", scope = AddPersonPhoneResponse.class)
    public JAXBElement<AddPersonPhoneResponseMessageType> createAddPersonPhoneResponseAddPersonPhoneResult(AddPersonPhoneResponseMessageType value) {
        return new JAXBElement<AddPersonPhoneResponseMessageType>(_AddPersonPhoneResponseAddPersonPhoneResult_QNAME, AddPersonPhoneResponseMessageType.class, AddPersonPhoneResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRBankByBicResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "FindRBankByBicResult", scope = FindRBankByBicResponse.class)
    public JAXBElement<FindRBankByBicResponseMessageType> createFindRBankByBicResponseFindRBankByBicResult(FindRBankByBicResponseMessageType value) {
        return new JAXBElement<FindRBankByBicResponseMessageType>(_FindRBankByBicResponseFindRBankByBicResult_QNAME, FindRBankByBicResponseMessageType.class, FindRBankByBicResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = FindPerson.class)
    public JAXBElement<FindPersonRequestMessageType> createFindPersonRequestMessage(FindPersonRequestMessageType value) {
        return new JAXBElement<FindPersonRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, FindPersonRequestMessageType.class, FindPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPersonListedResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "CheckPersonListedResult", scope = CheckPersonListedResponse.class)
    public JAXBElement<CheckPersonListedResponseMessageType> createCheckPersonListedResponseCheckPersonListedResult(CheckPersonListedResponseMessageType value) {
        return new JAXBElement<CheckPersonListedResponseMessageType>(_CheckPersonListedResponseCheckPersonListedResult_QNAME, CheckPersonListedResponseMessageType.class, CheckPersonListedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareNoticeRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = PrepareNotice.class)
    public JAXBElement<PrepareNoticeRequestMessageType> createPrepareNoticeRequestMessage(PrepareNoticeRequestMessageType value) {
        return new JAXBElement<PrepareNoticeRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, PrepareNoticeRequestMessageType.class, PrepareNotice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClearingReportRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetClearingReport.class)
    public JAXBElement<GetClearingReportRequestMessageType> createGetClearingReportRequestMessage(GetClearingReportRequestMessageType value) {
        return new JAXBElement<GetClearingReportRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetClearingReportRequestMessageType.class, GetClearingReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifyPersonByCardRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = IdentifyPersonByCard.class)
    public JAXBElement<IdentifyPersonByCardRequestMessageType> createIdentifyPersonByCardRequestMessage(IdentifyPersonByCardRequestMessageType value) {
        return new JAXBElement<IdentifyPersonByCardRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, IdentifyPersonByCardRequestMessageType.class, IdentifyPersonByCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankByIDRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetBankByID.class)
    public JAXBElement<GetBankByIDRequestMessageType> createGetBankByIDRequestMessage(GetBankByIDRequestMessageType value) {
        return new JAXBElement<GetBankByIDRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetBankByIDRequestMessageType.class, GetBankByID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareTransferResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "PrepareTransferResult", scope = PrepareTransferResponse.class)
    public JAXBElement<PrepareTransferResponseMessageType> createPrepareTransferResponsePrepareTransferResult(PrepareTransferResponseMessageType value) {
        return new JAXBElement<PrepareTransferResponseMessageType>(_PrepareTransferResponsePrepareTransferResult_QNAME, PrepareTransferResponseMessageType.class, PrepareTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivatePrepaidCardResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "ActivatePrepaidCardResult", scope = ActivatePrepaidCardResponse.class)
    public JAXBElement<ActivatePrepaidCardResponseMessageType> createActivatePrepaidCardResponseActivatePrepaidCardResult(ActivatePrepaidCardResponseMessageType value) {
        return new JAXBElement<ActivatePrepaidCardResponseMessageType>(_ActivatePrepaidCardResponseActivatePrepaidCardResult_QNAME, ActivatePrepaidCardResponseMessageType.class, ActivatePrepaidCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePrepaidCardResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "CreatePrepaidCardResult", scope = CreatePrepaidCardResponse.class)
    public JAXBElement<CreatePrepaidCardResponseMessageType> createCreatePrepaidCardResponseCreatePrepaidCardResult(CreatePrepaidCardResponseMessageType value) {
        return new JAXBElement<CreatePrepaidCardResponseMessageType>(_CreatePrepaidCardResponseCreatePrepaidCardResult_QNAME, CreatePrepaidCardResponseMessageType.class, CreatePrepaidCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareTransferRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = PrepareTransfer.class)
    public JAXBElement<PrepareTransferRequestMessageType> createPrepareTransferRequestMessage(PrepareTransferRequestMessageType value) {
        return new JAXBElement<PrepareTransferRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, PrepareTransferRequestMessageType.class, PrepareTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferByIDResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetTransferByIDResult", scope = GetTransferByIDResponse.class)
    public JAXBElement<GetTransferByIDResponseMessageType> createGetTransferByIDResponseGetTransferByIDResult(GetTransferByIDResponseMessageType value) {
        return new JAXBElement<GetTransferByIDResponseMessageType>(_GetTransferByIDResponseGetTransferByIDResult_QNAME, GetTransferByIDResponseMessageType.class, GetTransferByIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastTransferTemplatesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMsg", scope = GetLastTransferTemplates.class)
    public JAXBElement<GetLastTransferTemplatesRequestMessageType> createGetLastTransferTemplatesRequestMsg(GetLastTransferTemplatesRequestMessageType value) {
        return new JAXBElement<GetLastTransferTemplatesRequestMessageType>(_GetLastTransferTemplatesRequestMsg_QNAME, GetLastTransferTemplatesRequestMessageType.class, GetLastTransferTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionsChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetRegionsChangesResult", scope = GetRegionsChangesResponse.class)
    public JAXBElement<GetRegionsChangesResponseMessage> createGetRegionsChangesResponseGetRegionsChangesResult(GetRegionsChangesResponseMessage value) {
        return new JAXBElement<GetRegionsChangesResponseMessage>(_GetRegionsChangesResponseGetRegionsChangesResult_QNAME, GetRegionsChangesResponseMessage.class, GetRegionsChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanksChangesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetBanksChanges.class)
    public JAXBElement<GetBanksChangesRequestMessageType> createGetBanksChangesRequestMessage(GetBanksChangesRequestMessageType value) {
        return new JAXBElement<GetBanksChangesRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetBanksChangesRequestMessageType.class, GetBanksChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransferWithCardRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = InsertTransferWithCard.class)
    public JAXBElement<InsertTransferWithCardRequestMessageType> createInsertTransferWithCardRequestMessage(InsertTransferWithCardRequestMessageType value) {
        return new JAXBElement<InsertTransferWithCardRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, InsertTransferWithCardRequestMessageType.class, InsertTransferWithCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimateMainAmountResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "EstimateMainAmountResult", scope = EstimateMainAmountResponse.class)
    public JAXBElement<EstimateMainAmountResponseMessageType> createEstimateMainAmountResponseEstimateMainAmountResult(EstimateMainAmountResponseMessageType value) {
        return new JAXBElement<EstimateMainAmountResponseMessageType>(_EstimateMainAmountResponseEstimateMainAmountResult_QNAME, EstimateMainAmountResponseMessageType.class, EstimateMainAmountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmClearingReportRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = ConfirmClearingReport.class)
    public JAXBElement<ConfirmClearingReportRequestMessageType> createConfirmClearingReportRequestMessage(ConfirmClearingReportRequestMessageType value) {
        return new JAXBElement<ConfirmClearingReportRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, ConfirmClearingReportRequestMessageType.class, ConfirmClearingReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectNoticeResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "RejectNoticeResult", scope = RejectNoticeResponse.class)
    public JAXBElement<RejectNoticeResponseMessageType> createRejectNoticeResponseRejectNoticeResult(RejectNoticeResponseMessageType value) {
        return new JAXBElement<RejectNoticeResponseMessageType>(_RejectNoticeResponseRejectNoticeResult_QNAME, RejectNoticeResponseMessageType.class, RejectNoticeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankByIDResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetBankByIDResult", scope = GetBankByIDResponse.class)
    public JAXBElement<GetBankByIDResponseMessageType> createGetBankByIDResponseGetBankByIDResult(GetBankByIDResponseMessageType value) {
        return new JAXBElement<GetBankByIDResponseMessageType>(_GetBankByIDResponseGetBankByIDResult_QNAME, GetBankByIDResponseMessageType.class, GetBankByIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastTransferTemplatesResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetLastTransferTemplatesResult", scope = GetLastTransferTemplatesResponse.class)
    public JAXBElement<GetLastTransferTemplatesResponseMessageType> createGetLastTransferTemplatesResponseGetLastTransferTemplatesResult(GetLastTransferTemplatesResponseMessageType value) {
        return new JAXBElement<GetLastTransferTemplatesResponseMessageType>(_GetLastTransferTemplatesResponseGetLastTransferTemplatesResult_QNAME, GetLastTransferTemplatesResponseMessageType.class, GetLastTransferTemplatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferBySourceIDResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetTransferBySourceIDResult", scope = GetTransferBySourceIDResponse.class)
    public JAXBElement<GetTransferBySourceIDResponseMessageType> createGetTransferBySourceIDResponseGetTransferBySourceIDResult(GetTransferBySourceIDResponseMessageType value) {
        return new JAXBElement<GetTransferBySourceIDResponseMessageType>(_GetTransferBySourceIDResponseGetTransferBySourceIDResult_QNAME, GetTransferBySourceIDResponseMessageType.class, GetTransferBySourceIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrenciesChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetCurrenciesChanges.class)
    public JAXBElement<GetCurrenciesChangesRequestMessage> createGetCurrenciesChangesRequestMessage(GetCurrenciesChangesRequestMessage value) {
        return new JAXBElement<GetCurrenciesChangesRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetCurrenciesChangesRequestMessage.class, GetCurrenciesChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayoutTransferResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "PayoutTransferResult", scope = PayoutTransferResponse.class)
    public JAXBElement<PayoutTransferResponseMessageType> createPayoutTransferResponsePayoutTransferResult(PayoutTransferResponseMessageType value) {
        return new JAXBElement<PayoutTransferResponseMessageType>(_PayoutTransferResponsePayoutTransferResult_QNAME, PayoutTransferResponseMessageType.class, PayoutTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetCountriesChangesResult", scope = GetCountriesChangesResponse.class)
    public JAXBElement<GetCountriesChangesResponseMessage> createGetCountriesChangesResponseGetCountriesChangesResult(GetCountriesChangesResponseMessage value) {
        return new JAXBElement<GetCountriesChangesResponseMessage>(_GetCountriesChangesResponseGetCountriesChangesResult_QNAME, GetCountriesChangesResponseMessage.class, GetCountriesChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransfer2ResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "InsertTransfer2Result", scope = InsertTransfer2Response.class)
    public JAXBElement<InsertTransfer2ResponseMessageType> createInsertTransfer2ResponseInsertTransfer2Result(InsertTransfer2ResponseMessageType value) {
        return new JAXBElement<InsertTransfer2ResponseMessageType>(_InsertTransfer2ResponseInsertTransfer2Result_QNAME, InsertTransfer2ResponseMessageType.class, InsertTransfer2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForVirtualPrepaidCardRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = CreateAndSendNewPinForPrepaidCard.class)
    public JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardRequestMessage> createCreateAndSendNewPinForPrepaidCardRequestMessage(CreateAndSendNewPinForVirtualPrepaidCardRequestMessage value) {
        return new JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, CreateAndSendNewPinForVirtualPrepaidCardRequestMessage.class, CreateAndSendNewPinForPrepaidCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanksChangesResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetBanksChangesResult", scope = GetBanksChangesResponse.class)
    public JAXBElement<GetBanksChangesResponseMessageType> createGetBanksChangesResponseGetBanksChangesResult(GetBanksChangesResponseMessageType value) {
        return new JAXBElement<GetBanksChangesResponseMessageType>(_GetBanksChangesResponseGetBanksChangesResult_QNAME, GetBanksChangesResponseMessageType.class, GetBanksChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForUnistreamCardResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "CreateAndSendNewPinForUnistreamCardResult", scope = CreateAndSendNewPinForUnistreamCardResponse.class)
    public JAXBElement<CreateAndSendNewPinForUnistreamCardResponseMessage> createCreateAndSendNewPinForUnistreamCardResponseCreateAndSendNewPinForUnistreamCardResult(CreateAndSendNewPinForUnistreamCardResponseMessage value) {
        return new JAXBElement<CreateAndSendNewPinForUnistreamCardResponseMessage>(_CreateAndSendNewPinForUnistreamCardResponseCreateAndSendNewPinForUnistreamCardResult_QNAME, CreateAndSendNewPinForUnistreamCardResponseMessage.class, CreateAndSendNewPinForUnistreamCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRCompanyRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = CreateRCompany.class)
    public JAXBElement<CreateRCompanyRequestMessageType> createCreateRCompanyRequestMessage(CreateRCompanyRequestMessageType value) {
        return new JAXBElement<CreateRCompanyRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, CreateRCompanyRequestMessageType.class, CreateRCompany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPersonListedRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = CheckPersonListed.class)
    public JAXBElement<CheckPersonListedRequestMessageType> createCheckPersonListedRequestMessage(CheckPersonListedRequestMessageType value) {
        return new JAXBElement<CheckPersonListedRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, CheckPersonListedRequestMessageType.class, CheckPersonListed.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegionResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "FindRegionResult", scope = FindRegionResponse.class)
    public JAXBElement<FindRegionResponseMessage> createFindRegionResponseFindRegionResult(FindRegionResponseMessage value) {
        return new JAXBElement<FindRegionResponseMessage>(_FindRegionResponseFindRegionResult_QNAME, FindRegionResponseMessage.class, FindRegionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticesChangesResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetNoticesChangesResult", scope = GetNoticesChangesResponse.class)
    public JAXBElement<GetNoticesChangesResponseMessageType> createGetNoticesChangesResponseGetNoticesChangesResult(GetNoticesChangesResponseMessageType value) {
        return new JAXBElement<GetNoticesChangesResponseMessageType>(_GetNoticesChangesResponseGetNoticesChangesResult_QNAME, GetNoticesChangesResponseMessageType.class, GetNoticesChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNoticeResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "InsertNoticeResult", scope = InsertNoticeResponse.class)
    public JAXBElement<InsertNoticeResponseMessageType> createInsertNoticeResponseInsertNoticeResult(InsertNoticeResponseMessageType value) {
        return new JAXBElement<InsertNoticeResponseMessageType>(_InsertNoticeResponseInsertNoticeResult_QNAME, InsertNoticeResponseMessageType.class, InsertNoticeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransfersListResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetTransfersListResult", scope = GetTransfersListResponse.class)
    public JAXBElement<GetTransfersListResponseMessageType> createGetTransfersListResponseGetTransfersListResult(GetTransfersListResponseMessageType value) {
        return new JAXBElement<GetTransfersListResponseMessageType>(_GetTransfersListResponseGetTransfersListResult_QNAME, GetTransfersListResponseMessageType.class, GetTransfersListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransfersChangesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetTransfersChanges.class)
    public JAXBElement<GetTransfersChangesRequestMessageType> createGetTransfersChangesRequestMessage(GetTransfersChangesRequestMessageType value) {
        return new JAXBElement<GetTransfersChangesRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetTransfersChangesRequestMessageType.class, GetTransfersChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonificateWalletRequesetMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = PersonificateWallet.class)
    public JAXBElement<PersonificateWalletRequesetMessageType> createPersonificateWalletRequestMessage(PersonificateWalletRequesetMessageType value) {
        return new JAXBElement<PersonificateWalletRequesetMessageType>(_GetRegionsChangesRequestMessage_QNAME, PersonificateWalletRequesetMessageType.class, PersonificateWallet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectNoticeRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = RejectNotice.class)
    public JAXBElement<RejectNoticeRequestMessageType> createRejectNoticeRequestMessage(RejectNoticeRequestMessageType value) {
        return new JAXBElement<RejectNoticeRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, RejectNoticeRequestMessageType.class, RejectNotice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForVirtualPrepaidCardResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "CreateAndSendNewPinForPrepaidCardResult", scope = CreateAndSendNewPinForPrepaidCardResponse.class)
    public JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardResponseMessage> createCreateAndSendNewPinForPrepaidCardResponseCreateAndSendNewPinForPrepaidCardResult(CreateAndSendNewPinForVirtualPrepaidCardResponseMessage value) {
        return new JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardResponseMessage>(_CreateAndSendNewPinForPrepaidCardResponseCreateAndSendNewPinForPrepaidCardResult_QNAME, CreateAndSendNewPinForVirtualPrepaidCardResponseMessage.class, CreateAndSendNewPinForPrepaidCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetCountries.class)
    public JAXBElement<GetCountriesRequestMessage> createGetCountriesRequestMessage(GetCountriesRequestMessage value) {
        return new JAXBElement<GetCountriesRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetCountriesRequestMessage.class, GetCountries.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTransferResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "ReturnTransferResult", scope = ReturnTransferResponse.class)
    public JAXBElement<ReturnTransferResponseMessageType> createReturnTransferResponseReturnTransferResult(ReturnTransferResponseMessageType value) {
        return new JAXBElement<ReturnTransferResponseMessageType>(_ReturnTransferResponseReturnTransferResult_QNAME, ReturnTransferResponseMessageType.class, ReturnTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRCompanyResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "CreateRCompanyResult", scope = CreateRCompanyResponse.class)
    public JAXBElement<CreateRCompanyResponseMessageType> createCreateRCompanyResponseCreateRCompanyResult(CreateRCompanyResponseMessageType value) {
        return new JAXBElement<CreateRCompanyResponseMessageType>(_CreateRCompanyResponseCreateRCompanyResult_QNAME, CreateRCompanyResponseMessageType.class, CreateRCompanyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardByNymberRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetCardByNumber.class)
    public JAXBElement<GetCardByNymberRequestMessage> createGetCardByNumberRequestMessage(GetCardByNymberRequestMessage value) {
        return new JAXBElement<GetCardByNymberRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetCardByNymberRequestMessage.class, GetCardByNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSMSConfirmationResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "CheckSmsConfirmationResult", scope = CheckSmsConfirmationResponse.class)
    public JAXBElement<CheckSMSConfirmationResponseMessageType> createCheckSmsConfirmationResponseCheckSmsConfirmationResult(CheckSMSConfirmationResponseMessageType value) {
        return new JAXBElement<CheckSMSConfirmationResponseMessageType>(_CheckSmsConfirmationResponseCheckSmsConfirmationResult_QNAME, CheckSMSConfirmationResponseMessageType.class, CheckSmsConfirmationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimateMainAmountRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = EstimateMainAmount.class)
    public JAXBElement<EstimateMainAmountRequestMessageType> createEstimateMainAmountRequestMessage(EstimateMainAmountRequestMessageType value) {
        return new JAXBElement<EstimateMainAmountRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, EstimateMainAmountRequestMessageType.class, EstimateMainAmount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegionRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = FindRegion.class)
    public JAXBElement<FindRegionRequestMessage> createFindRegionRequestMessage(FindRegionRequestMessage value) {
        return new JAXBElement<FindRegionRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, FindRegionRequestMessage.class, FindRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonDocumentResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "AddPersonDocumentResult", scope = AddPersonDocumentResponse.class)
    public JAXBElement<AddPersonDocumentResponseMessageType> createAddPersonDocumentResponseAddPersonDocumentResult(AddPersonDocumentResponseMessageType value) {
        return new JAXBElement<AddPersonDocumentResponseMessageType>(_AddPersonDocumentResponseAddPersonDocumentResult_QNAME, AddPersonDocumentResponseMessageType.class, AddPersonDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankInfosChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetBankInfosChanges.class)
    public JAXBElement<GetBankInfosChangesRequestMessage> createGetBankInfosChangesRequestMessage(GetBankInfosChangesRequestMessage value) {
        return new JAXBElement<GetBankInfosChangesRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetBankInfosChangesRequestMessage.class, GetBankInfosChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransfer2RequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = InsertTransfer2 .class)
    public JAXBElement<InsertTransfer2RequestMessageType> createInsertTransfer2RequestMessage(InsertTransfer2RequestMessageType value) {
        return new JAXBElement<InsertTransfer2RequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, InsertTransfer2RequestMessageType.class, InsertTransfer2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrenciesChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetCurrenciesChangesResult", scope = GetCurrenciesChangesResponse.class)
    public JAXBElement<GetCurrenciesChangesResponseMessage> createGetCurrenciesChangesResponseGetCurrenciesChangesResult(GetCurrenciesChangesResponseMessage value) {
        return new JAXBElement<GetCurrenciesChangesResponseMessage>(_GetCurrenciesChangesResponseGetCurrenciesChangesResult_QNAME, GetCurrenciesChangesResponseMessage.class, GetCurrenciesChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSMSConfirmationRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = CheckSmsConfirmation.class)
    public JAXBElement<CheckSMSConfirmationRequestMessageType> createCheckSmsConfirmationRequestMessage(CheckSMSConfirmationRequestMessageType value) {
        return new JAXBElement<CheckSMSConfirmationRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, CheckSMSConfirmationRequestMessageType.class, CheckSmsConfirmation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetTaxes.class)
    public JAXBElement<GetTaxesRequestMessage> createGetTaxesRequestMessage(GetTaxesRequestMessage value) {
        return new JAXBElement<GetTaxesRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetTaxesRequestMessage.class, GetTaxes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransferResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "InsertTransferResult", scope = InsertTransferResponse.class)
    public JAXBElement<InsertTransferResponseMessageType> createInsertTransferResponseInsertTransferResult(InsertTransferResponseMessageType value) {
        return new JAXBElement<InsertTransferResponseMessageType>(_InsertTransferResponseInsertTransferResult_QNAME, InsertTransferResponseMessageType.class, InsertTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePrepaidCardRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = CreatePrepaidCard.class)
    public JAXBElement<CreatePrepaidCardRequestMessageType> createCreatePrepaidCardRequestMessage(CreatePrepaidCardRequestMessageType value) {
        return new JAXBElement<CreatePrepaidCardRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, CreatePrepaidCardRequestMessageType.class, CreatePrepaidCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticeByIDRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetNoticeByID.class)
    public JAXBElement<GetNoticeByIDRequestMessageType> createGetNoticeByIDRequestMessage(GetNoticeByIDRequestMessageType value) {
        return new JAXBElement<GetNoticeByIDRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetNoticeByIDRequestMessageType.class, GetNoticeByID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmClearingReportResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "ConfirmClearingReportResult", scope = ConfirmClearingReportResponse.class)
    public JAXBElement<ConfirmClearingReportResponseMessageType> createConfirmClearingReportResponseConfirmClearingReportResult(ConfirmClearingReportResponseMessageType value) {
        return new JAXBElement<ConfirmClearingReportResponseMessageType>(_ConfirmClearingReportResponseConfirmClearingReportResult_QNAME, ConfirmClearingReportResponseMessageType.class, ConfirmClearingReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticesListRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetNoticesList.class)
    public JAXBElement<GetNoticesListRequestMessageType> createGetNoticesListRequestMessage(GetNoticesListRequestMessageType value) {
        return new JAXBElement<GetNoticesListRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetNoticesListRequestMessageType.class, GetNoticesList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRBankByBicRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = FindRBankByBic.class)
    public JAXBElement<FindRBankByBicRequestMessageType> createFindRBankByBicRequestMessage(FindRBankByBicRequestMessageType value) {
        return new JAXBElement<FindRBankByBicRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, FindRBankByBicRequestMessageType.class, FindRBankByBic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClearingReportResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetClearingReportResult", scope = GetClearingReportResponse.class)
    public JAXBElement<GetClearingReportResponseMessageType> createGetClearingReportResponseGetClearingReportResult(GetClearingReportResponseMessageType value) {
        return new JAXBElement<GetClearingReportResponseMessageType>(_GetClearingReportResponseGetClearingReportResult_QNAME, GetClearingReportResponseMessageType.class, GetClearingReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveNoticeResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "ApproveNoticeResult", scope = ApproveNoticeResponse.class)
    public JAXBElement<ApproveNoticeResponseMessageType> createApproveNoticeResponseApproveNoticeResult(ApproveNoticeResponseMessageType value) {
        return new JAXBElement<ApproveNoticeResponseMessageType>(_ApproveNoticeResponseApproveNoticeResult_QNAME, ApproveNoticeResponseMessageType.class, ApproveNoticeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCardActivatedRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = IsCardActivated.class)
    public JAXBElement<IsCardActivatedRequestMessage> createIsCardActivatedRequestMessage(IsCardActivatedRequestMessage value) {
        return new JAXBElement<IsCardActivatedRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, IsCardActivatedRequestMessage.class, IsCardActivated.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferBySourceIDRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetTransferBySourceID.class)
    public JAXBElement<GetTransferBySourceIDRequestMessageType> createGetTransferBySourceIDRequestMessage(GetTransferBySourceIDRequestMessageType value) {
        return new JAXBElement<GetTransferBySourceIDRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetTransferBySourceIDRequestMessageType.class, GetTransferBySourceID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetCountriesResult", scope = GetCountriesResponse.class)
    public JAXBElement<GetCountriesResponseMessage> createGetCountriesResponseGetCountriesResult(GetCountriesResponseMessage value) {
        return new JAXBElement<GetCountriesResponseMessage>(_GetCountriesResponseGetCountriesResult_QNAME, GetCountriesResponseMessage.class, GetCountriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferByIDRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetTransferByID.class)
    public JAXBElement<GetTransferByIDRequestMessageType> createGetTransferByIDRequestMessage(GetTransferByIDRequestMessageType value) {
        return new JAXBElement<GetTransferByIDRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, GetTransferByIDRequestMessageType.class, GetTransferByID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransferWithCardResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "InsertTransferWithCardResult", scope = InsertTransferWithCardResponse.class)
    public JAXBElement<InsertTransferWithCardResponseMessageType> createInsertTransferWithCardResponseInsertTransferWithCardResult(InsertTransferWithCardResponseMessageType value) {
        return new JAXBElement<InsertTransferWithCardResponseMessageType>(_InsertTransferWithCardResponseInsertTransferWithCardResult_QNAME, InsertTransferWithCardResponseMessageType.class, InsertTransferWithCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveNoticeRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = ApproveNotice.class)
    public JAXBElement<ApproveNoticeRequestMessageType> createApproveNoticeRequestMessage(ApproveNoticeRequestMessageType value) {
        return new JAXBElement<ApproveNoticeRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, ApproveNoticeRequestMessageType.class, ApproveNotice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonAddressResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "AddPersonAddressResult", scope = AddPersonAddressResponse.class)
    public JAXBElement<AddPersonAddressResponseMessageType> createAddPersonAddressResponseAddPersonAddressResult(AddPersonAddressResponseMessageType value) {
        return new JAXBElement<AddPersonAddressResponseMessageType>(_AddPersonAddressResponseAddPersonAddressResult_QNAME, AddPersonAddressResponseMessageType.class, AddPersonAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentTypeChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetDocumentTypeChangesResult", scope = GetDocumentTypeChangesResponse.class)
    public JAXBElement<GetDocumentTypeChangesResponseMessage> createGetDocumentTypeChangesResponseGetDocumentTypeChangesResult(GetDocumentTypeChangesResponseMessage value) {
        return new JAXBElement<GetDocumentTypeChangesResponseMessage>(_GetDocumentTypeChangesResponseGetDocumentTypeChangesResult_QNAME, GetDocumentTypeChangesResponseMessage.class, GetDocumentTypeChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetCountriesChanges.class)
    public JAXBElement<GetCountriesChangesRequestMessage> createGetCountriesChangesRequestMessage(GetCountriesChangesRequestMessage value) {
        return new JAXBElement<GetCountriesChangesRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetCountriesChangesRequestMessage.class, GetCountriesChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCardActivatedResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "IsCardActivatedResult", scope = IsCardActivatedResponse.class)
    public JAXBElement<IsCardActivatedResponseMessage> createIsCardActivatedResponseIsCardActivatedResult(IsCardActivatedResponseMessage value) {
        return new JAXBElement<IsCardActivatedResponseMessage>(_IsCardActivatedResponseIsCardActivatedResult_QNAME, IsCardActivatedResponseMessage.class, IsCardActivatedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTransferRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = ReturnTransfer.class)
    public JAXBElement<ReturnTransferRequestMessageType> createReturnTransferRequestMessage(ReturnTransferRequestMessageType value) {
        return new JAXBElement<ReturnTransferRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, ReturnTransferRequestMessageType.class, ReturnTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSMSConfrmationResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "CreateSmsConfrmationResult", scope = CreateSmsConfrmationResponse.class)
    public JAXBElement<CreateSMSConfrmationResponseMessageType> createCreateSmsConfrmationResponseCreateSmsConfrmationResult(CreateSMSConfrmationResponseMessageType value) {
        return new JAXBElement<CreateSMSConfrmationResponseMessageType>(_CreateSmsConfrmationResponseCreateSmsConfrmationResult_QNAME, CreateSMSConfrmationResponseMessageType.class, CreateSmsConfrmationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateClientByCardResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "AuthenticateClientbyCardResult", scope = AuthenticateClientbyCardResponse.class)
    public JAXBElement<AuthenticateClientByCardResponseMessage> createAuthenticateClientbyCardResponseAuthenticateClientbyCardResult(AuthenticateClientByCardResponseMessage value) {
        return new JAXBElement<AuthenticateClientByCardResponseMessage>(_AuthenticateClientbyCardResponseAuthenticateClientbyCardResult_QNAME, AuthenticateClientByCardResponseMessage.class, AuthenticateClientbyCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayoutTransferRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = PayoutTransfer.class)
    public JAXBElement<PayoutTransferRequestMessageType> createPayoutTransferRequestMessage(PayoutTransferRequestMessageType value) {
        return new JAXBElement<PayoutTransferRequestMessageType>(_GetRegionsChangesRequestMessage_QNAME, PayoutTransferRequestMessageType.class, PayoutTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareNoticeResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "PrepareNoticeResult", scope = PrepareNoticeResponse.class)
    public JAXBElement<PrepareNoticeResponseMessageType> createPrepareNoticeResponsePrepareNoticeResult(PrepareNoticeResponseMessageType value) {
        return new JAXBElement<PrepareNoticeResponseMessageType>(_PrepareNoticeResponsePrepareNoticeResult_QNAME, PrepareNoticeResponseMessageType.class, PrepareNoticeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankInfosChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetBankInfosChangesResult", scope = GetBankInfosChangesResponse.class)
    public JAXBElement<GetBankInfosChangesResponseMessage> createGetBankInfosChangesResponseGetBankInfosChangesResult(GetBankInfosChangesResponseMessage value) {
        return new JAXBElement<GetBankInfosChangesResponseMessage>(_GetBankInfosChangesResponseGetBankInfosChangesResult_QNAME, GetBankInfosChangesResponseMessage.class, GetBankInfosChangesResponse.class, value);
    }

}
