
package com.unistream.test.wcflib;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonAddressRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonAddressResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonDocumentRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonDocumentResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonPhoneRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.AddPersonPhoneResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.ApproveNoticeRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.ApproveNoticeResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.ConfirmClearingReportRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.ConfirmClearingReportResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.EstimateMainAmountRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.EstimateMainAmountResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetClearingReportRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetClearingReportResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetLastTransferTemplatesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetLastTransferTemplatesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticeByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticeByIDResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesListRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesListResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferBySourceIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransferBySourceIDResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersListRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersListResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.IdentifyPersonByCardRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.IdentifyPersonByCardResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertNoticeRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertNoticeResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransfer2RequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransfer2ResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PrepareNoticeRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PrepareNoticeResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PrepareTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.PrepareTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.RejectNoticeRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.RejectNoticeResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.ReturnTransferRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.ReturnTransferResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.SellPrepaidCardRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib.SellPrepaidCardResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRegionRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRegionResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesResponseMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesRequestMessage;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesResponseMessage;
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

    private final static QName _GetTransferByIDResponseGetTransferByIDResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetTransferByIDResult");
    private final static QName _GetDocumentTypeChangesRequestMessage_QNAME = new QName("http://test.unistream.com/wcflib/", "requestMessage");
    private final static QName _SellPrepaidCardResponseSellPrepaidCardResult_QNAME = new QName("http://test.unistream.com/wcflib/", "SellPrepaidCardResult");
    private final static QName _EstimateMainAmountResponseEstimateMainAmountResult_QNAME = new QName("http://test.unistream.com/wcflib/", "EstimateMainAmountResult");
    private final static QName _InsertNoticeResponseInsertNoticeResult_QNAME = new QName("http://test.unistream.com/wcflib/", "InsertNoticeResult");
    private final static QName _GetTransfersListResponseGetTransfersListResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetTransfersListResult");
    private final static QName _PayoutTransferResponsePayoutTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "PayoutTransferResult");
    private final static QName _GetBankInfosChangesResponseGetBankInfosChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetBankInfosChangesResult");
    private final static QName _GetBankByIDResponseGetBankByIDResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetBankByIDResult");
    private final static QName _AddPersonPhoneResponseAddPersonPhoneResult_QNAME = new QName("http://test.unistream.com/wcflib/", "AddPersonPhoneResult");
    private final static QName _GetTransfersChangesResponseGetTransfersChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetTransfersChangesResult");
    private final static QName _GetRegionsChangesResponseGetRegionsChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetRegionsChangesResult");
    private final static QName _FindRegionResponseFindRegionResult_QNAME = new QName("http://test.unistream.com/wcflib/", "FindRegionResult");
    private final static QName _RejectNoticeResponseRejectNoticeResult_QNAME = new QName("http://test.unistream.com/wcflib/", "RejectNoticeResult");
    private final static QName _GetCountriesChangesResponseGetCountriesChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetCountriesChangesResult");
    private final static QName _GetNoticeByIDResponseGetNoticeByIDResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetNoticeByIDResult");
    private final static QName _FindPersonResponseFindPersonResult_QNAME = new QName("http://test.unistream.com/wcflib/", "FindPersonResult");
    private final static QName _AddPersonAddressResponseAddPersonAddressResult_QNAME = new QName("http://test.unistream.com/wcflib/", "AddPersonAddressResult");
    private final static QName _GetBanksChangesResponseGetBanksChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetBanksChangesResult");
    private final static QName _GetNoticesChangesResponseGetNoticesChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetNoticesChangesResult");
    private final static QName _GetLastTransferTemplatesRequestMsg_QNAME = new QName("http://test.unistream.com/wcflib/", "requestMsg");
    private final static QName _GetClearingReportResponseGetClearingReportResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetClearingReportResult");
    private final static QName _ReturnTransferResponseReturnTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "ReturnTransferResult");
    private final static QName _GetNoticesListResponseGetNoticesListResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetNoticesListResult");
    private final static QName _ApproveNoticeResponseApproveNoticeResult_QNAME = new QName("http://test.unistream.com/wcflib/", "ApproveNoticeResult");
    private final static QName _GetDocumentTypeChangesResponseGetDocumentTypeChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetDocumentTypeChangesResult");
    private final static QName _GetLastTransferTemplatesResponseGetLastTransferTemplatesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetLastTransferTemplatesResult");
    private final static QName _InsertTransferResponseInsertTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "InsertTransferResult");
    private final static QName _PrepareNoticeResponsePrepareNoticeResult_QNAME = new QName("http://test.unistream.com/wcflib/", "PrepareNoticeResult");
    private final static QName _GetCurrenciesChangesResponseGetCurrenciesChangesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetCurrenciesChangesResult");
    private final static QName _ConfirmClearingReportResponseConfirmClearingReportResult_QNAME = new QName("http://test.unistream.com/wcflib/", "ConfirmClearingReportResult");
    private final static QName _CreatePersonResponseCreatePersonResult_QNAME = new QName("http://test.unistream.com/wcflib/", "CreatePersonResult");
    private final static QName _FindTransferResponseFindTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "FindTransferResult");
    private final static QName _GetTransferBySourceIDResponseGetTransferBySourceIDResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetTransferBySourceIDResult");
    private final static QName _IdentifyPersonByCardResponseIdentifyPersonByCardResult_QNAME = new QName("http://test.unistream.com/wcflib/", "IdentifyPersonByCardResult");
    private final static QName _AddPersonDocumentResponseAddPersonDocumentResult_QNAME = new QName("http://test.unistream.com/wcflib/", "AddPersonDocumentResult");
    private final static QName _GetCountriesResponseGetCountriesResult_QNAME = new QName("http://test.unistream.com/wcflib/", "GetCountriesResult");
    private final static QName _InsertTransfer2ResponseInsertTransfer2Result_QNAME = new QName("http://test.unistream.com/wcflib/", "InsertTransfer2Result");
    private final static QName _PrepareTransferResponsePrepareTransferResult_QNAME = new QName("http://test.unistream.com/wcflib/", "PrepareTransferResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unistream.test.wcflib
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertTransfer }
     * 
     */
    public InsertTransfer createInsertTransfer() {
        return new InsertTransfer();
    }

    /**
     * Create an instance of {@link InsertNotice }
     * 
     */
    public InsertNotice createInsertNotice() {
        return new InsertNotice();
    }

    /**
     * Create an instance of {@link IdentifyPersonByCard }
     * 
     */
    public IdentifyPersonByCard createIdentifyPersonByCard() {
        return new IdentifyPersonByCard();
    }

    /**
     * Create an instance of {@link PrepareNotice }
     * 
     */
    public PrepareNotice createPrepareNotice() {
        return new PrepareNotice();
    }

    /**
     * Create an instance of {@link InsertNoticeResponse }
     * 
     */
    public InsertNoticeResponse createInsertNoticeResponse() {
        return new InsertNoticeResponse();
    }

    /**
     * Create an instance of {@link GetBankInfosChangesResponse }
     * 
     */
    public GetBankInfosChangesResponse createGetBankInfosChangesResponse() {
        return new GetBankInfosChangesResponse();
    }

    /**
     * Create an instance of {@link GetBankByIDResponse }
     * 
     */
    public GetBankByIDResponse createGetBankByIDResponse() {
        return new GetBankByIDResponse();
    }

    /**
     * Create an instance of {@link AddPersonPhoneResponse }
     * 
     */
    public AddPersonPhoneResponse createAddPersonPhoneResponse() {
        return new AddPersonPhoneResponse();
    }

    /**
     * Create an instance of {@link GetRegionsChangesResponse }
     * 
     */
    public GetRegionsChangesResponse createGetRegionsChangesResponse() {
        return new GetRegionsChangesResponse();
    }

    /**
     * Create an instance of {@link FindRegionResponse }
     * 
     */
    public FindRegionResponse createFindRegionResponse() {
        return new FindRegionResponse();
    }

    /**
     * Create an instance of {@link FindRegion }
     * 
     */
    public FindRegion createFindRegion() {
        return new FindRegion();
    }

    /**
     * Create an instance of {@link RejectNoticeResponse }
     * 
     */
    public RejectNoticeResponse createRejectNoticeResponse() {
        return new RejectNoticeResponse();
    }

    /**
     * Create an instance of {@link PayoutTransfer }
     * 
     */
    public PayoutTransfer createPayoutTransfer() {
        return new PayoutTransfer();
    }

    /**
     * Create an instance of {@link GetCountriesChangesResponse }
     * 
     */
    public GetCountriesChangesResponse createGetCountriesChangesResponse() {
        return new GetCountriesChangesResponse();
    }

    /**
     * Create an instance of {@link FindPersonResponse }
     * 
     */
    public FindPersonResponse createFindPersonResponse() {
        return new FindPersonResponse();
    }

    /**
     * Create an instance of {@link ConfirmClearingReport }
     * 
     */
    public ConfirmClearingReport createConfirmClearingReport() {
        return new ConfirmClearingReport();
    }

    /**
     * Create an instance of {@link GetTransfersChanges }
     * 
     */
    public GetTransfersChanges createGetTransfersChanges() {
        return new GetTransfersChanges();
    }

    /**
     * Create an instance of {@link EstimateMainAmount }
     * 
     */
    public EstimateMainAmount createEstimateMainAmount() {
        return new EstimateMainAmount();
    }

    /**
     * Create an instance of {@link GetNoticesChangesResponse }
     * 
     */
    public GetNoticesChangesResponse createGetNoticesChangesResponse() {
        return new GetNoticesChangesResponse();
    }

    /**
     * Create an instance of {@link GetLastTransferTemplates }
     * 
     */
    public GetLastTransferTemplates createGetLastTransferTemplates() {
        return new GetLastTransferTemplates();
    }

    /**
     * Create an instance of {@link GetClearingReportResponse }
     * 
     */
    public GetClearingReportResponse createGetClearingReportResponse() {
        return new GetClearingReportResponse();
    }

    /**
     * Create an instance of {@link FindTransfer }
     * 
     */
    public FindTransfer createFindTransfer() {
        return new FindTransfer();
    }

    /**
     * Create an instance of {@link ReturnTransferResponse }
     * 
     */
    public ReturnTransferResponse createReturnTransferResponse() {
        return new ReturnTransferResponse();
    }

    /**
     * Create an instance of {@link GetNoticesList }
     * 
     */
    public GetNoticesList createGetNoticesList() {
        return new GetNoticesList();
    }

    /**
     * Create an instance of {@link ReturnTransfer }
     * 
     */
    public ReturnTransfer createReturnTransfer() {
        return new ReturnTransfer();
    }

    /**
     * Create an instance of {@link GetCurrenciesChangesResponse }
     * 
     */
    public GetCurrenciesChangesResponse createGetCurrenciesChangesResponse() {
        return new GetCurrenciesChangesResponse();
    }

    /**
     * Create an instance of {@link FindPerson }
     * 
     */
    public FindPerson createFindPerson() {
        return new FindPerson();
    }

    /**
     * Create an instance of {@link InsertTransfer2 }
     * 
     */
    public InsertTransfer2 createInsertTransfer2() {
        return new InsertTransfer2();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link PrepareTransfer }
     * 
     */
    public PrepareTransfer createPrepareTransfer() {
        return new PrepareTransfer();
    }

    /**
     * Create an instance of {@link GetCountriesResponse }
     * 
     */
    public GetCountriesResponse createGetCountriesResponse() {
        return new GetCountriesResponse();
    }

    /**
     * Create an instance of {@link GetTransfersList }
     * 
     */
    public GetTransfersList createGetTransfersList() {
        return new GetTransfersList();
    }

    /**
     * Create an instance of {@link AddPersonAddress }
     * 
     */
    public AddPersonAddress createAddPersonAddress() {
        return new AddPersonAddress();
    }

    /**
     * Create an instance of {@link PrepareTransferResponse }
     * 
     */
    public PrepareTransferResponse createPrepareTransferResponse() {
        return new PrepareTransferResponse();
    }

    /**
     * Create an instance of {@link GetTransferByIDResponse }
     * 
     */
    public GetTransferByIDResponse createGetTransferByIDResponse() {
        return new GetTransferByIDResponse();
    }

    /**
     * Create an instance of {@link GetDocumentTypeChanges }
     * 
     */
    public GetDocumentTypeChanges createGetDocumentTypeChanges() {
        return new GetDocumentTypeChanges();
    }

    /**
     * Create an instance of {@link SellPrepaidCardResponse }
     * 
     */
    public SellPrepaidCardResponse createSellPrepaidCardResponse() {
        return new SellPrepaidCardResponse();
    }

    /**
     * Create an instance of {@link EstimateMainAmountResponse }
     * 
     */
    public EstimateMainAmountResponse createEstimateMainAmountResponse() {
        return new EstimateMainAmountResponse();
    }

    /**
     * Create an instance of {@link GetBanksChanges }
     * 
     */
    public GetBanksChanges createGetBanksChanges() {
        return new GetBanksChanges();
    }

    /**
     * Create an instance of {@link GetTransfersListResponse }
     * 
     */
    public GetTransfersListResponse createGetTransfersListResponse() {
        return new GetTransfersListResponse();
    }

    /**
     * Create an instance of {@link PayoutTransferResponse }
     * 
     */
    public PayoutTransferResponse createPayoutTransferResponse() {
        return new PayoutTransferResponse();
    }

    /**
     * Create an instance of {@link RejectNotice }
     * 
     */
    public RejectNotice createRejectNotice() {
        return new RejectNotice();
    }

    /**
     * Create an instance of {@link ApproveNotice }
     * 
     */
    public ApproveNotice createApproveNotice() {
        return new ApproveNotice();
    }

    /**
     * Create an instance of {@link SellPrepaidCard }
     * 
     */
    public SellPrepaidCard createSellPrepaidCard() {
        return new SellPrepaidCard();
    }

    /**
     * Create an instance of {@link GetRegionsChanges }
     * 
     */
    public GetRegionsChanges createGetRegionsChanges() {
        return new GetRegionsChanges();
    }

    /**
     * Create an instance of {@link GetTransfersChangesResponse }
     * 
     */
    public GetTransfersChangesResponse createGetTransfersChangesResponse() {
        return new GetTransfersChangesResponse();
    }

    /**
     * Create an instance of {@link GetNoticeByID }
     * 
     */
    public GetNoticeByID createGetNoticeByID() {
        return new GetNoticeByID();
    }

    /**
     * Create an instance of {@link GetClearingReport }
     * 
     */
    public GetClearingReport createGetClearingReport() {
        return new GetClearingReport();
    }

    /**
     * Create an instance of {@link GetBankInfosChanges }
     * 
     */
    public GetBankInfosChanges createGetBankInfosChanges() {
        return new GetBankInfosChanges();
    }

    /**
     * Create an instance of {@link GetNoticeByIDResponse }
     * 
     */
    public GetNoticeByIDResponse createGetNoticeByIDResponse() {
        return new GetNoticeByIDResponse();
    }

    /**
     * Create an instance of {@link AddPersonAddressResponse }
     * 
     */
    public AddPersonAddressResponse createAddPersonAddressResponse() {
        return new AddPersonAddressResponse();
    }

    /**
     * Create an instance of {@link GetBanksChangesResponse }
     * 
     */
    public GetBanksChangesResponse createGetBanksChangesResponse() {
        return new GetBanksChangesResponse();
    }

    /**
     * Create an instance of {@link AddPersonPhone }
     * 
     */
    public AddPersonPhone createAddPersonPhone() {
        return new AddPersonPhone();
    }

    /**
     * Create an instance of {@link GetNoticesListResponse }
     * 
     */
    public GetNoticesListResponse createGetNoticesListResponse() {
        return new GetNoticesListResponse();
    }

    /**
     * Create an instance of {@link ApproveNoticeResponse }
     * 
     */
    public ApproveNoticeResponse createApproveNoticeResponse() {
        return new ApproveNoticeResponse();
    }

    /**
     * Create an instance of {@link GetCountries }
     * 
     */
    public GetCountries createGetCountries() {
        return new GetCountries();
    }

    /**
     * Create an instance of {@link GetDocumentTypeChangesResponse }
     * 
     */
    public GetDocumentTypeChangesResponse createGetDocumentTypeChangesResponse() {
        return new GetDocumentTypeChangesResponse();
    }

    /**
     * Create an instance of {@link GetLastTransferTemplatesResponse }
     * 
     */
    public GetLastTransferTemplatesResponse createGetLastTransferTemplatesResponse() {
        return new GetLastTransferTemplatesResponse();
    }

    /**
     * Create an instance of {@link InsertTransferResponse }
     * 
     */
    public InsertTransferResponse createInsertTransferResponse() {
        return new InsertTransferResponse();
    }

    /**
     * Create an instance of {@link PrepareNoticeResponse }
     * 
     */
    public PrepareNoticeResponse createPrepareNoticeResponse() {
        return new PrepareNoticeResponse();
    }

    /**
     * Create an instance of {@link GetTransferBySourceID }
     * 
     */
    public GetTransferBySourceID createGetTransferBySourceID() {
        return new GetTransferBySourceID();
    }

    /**
     * Create an instance of {@link ConfirmClearingReportResponse }
     * 
     */
    public ConfirmClearingReportResponse createConfirmClearingReportResponse() {
        return new ConfirmClearingReportResponse();
    }

    /**
     * Create an instance of {@link GetCountriesChanges }
     * 
     */
    public GetCountriesChanges createGetCountriesChanges() {
        return new GetCountriesChanges();
    }

    /**
     * Create an instance of {@link FindTransferResponse }
     * 
     */
    public FindTransferResponse createFindTransferResponse() {
        return new FindTransferResponse();
    }

    /**
     * Create an instance of {@link GetBankByID }
     * 
     */
    public GetBankByID createGetBankByID() {
        return new GetBankByID();
    }

    /**
     * Create an instance of {@link GetCurrenciesChanges }
     * 
     */
    public GetCurrenciesChanges createGetCurrenciesChanges() {
        return new GetCurrenciesChanges();
    }

    /**
     * Create an instance of {@link GetTransferByID }
     * 
     */
    public GetTransferByID createGetTransferByID() {
        return new GetTransferByID();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link GetTransferBySourceIDResponse }
     * 
     */
    public GetTransferBySourceIDResponse createGetTransferBySourceIDResponse() {
        return new GetTransferBySourceIDResponse();
    }

    /**
     * Create an instance of {@link IdentifyPersonByCardResponse }
     * 
     */
    public IdentifyPersonByCardResponse createIdentifyPersonByCardResponse() {
        return new IdentifyPersonByCardResponse();
    }

    /**
     * Create an instance of {@link AddPersonDocumentResponse }
     * 
     */
    public AddPersonDocumentResponse createAddPersonDocumentResponse() {
        return new AddPersonDocumentResponse();
    }

    /**
     * Create an instance of {@link GetNoticesChanges }
     * 
     */
    public GetNoticesChanges createGetNoticesChanges() {
        return new GetNoticesChanges();
    }

    /**
     * Create an instance of {@link InsertTransfer2Response }
     * 
     */
    public InsertTransfer2Response createInsertTransfer2Response() {
        return new InsertTransfer2Response();
    }

    /**
     * Create an instance of {@link AddPersonDocument }
     * 
     */
    public AddPersonDocument createAddPersonDocument() {
        return new AddPersonDocument();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferByIDResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetTransferByIDResult", scope = GetTransferByIDResponse.class)
    public JAXBElement<GetTransferByIDResponseMessage> createGetTransferByIDResponseGetTransferByIDResult(GetTransferByIDResponseMessage value) {
        return new JAXBElement<GetTransferByIDResponseMessage>(_GetTransferByIDResponseGetTransferByIDResult_QNAME, GetTransferByIDResponseMessage.class, GetTransferByIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentTypeChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetDocumentTypeChanges.class)
    public JAXBElement<GetDocumentTypeChangesRequestMessage> createGetDocumentTypeChangesRequestMessage(GetDocumentTypeChangesRequestMessage value) {
        return new JAXBElement<GetDocumentTypeChangesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetDocumentTypeChangesRequestMessage.class, GetDocumentTypeChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransferRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = InsertTransfer.class)
    public JAXBElement<InsertTransferRequestMessage> createInsertTransferRequestMessage(InsertTransferRequestMessage value) {
        return new JAXBElement<InsertTransferRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, InsertTransferRequestMessage.class, InsertTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNoticeRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = InsertNotice.class)
    public JAXBElement<InsertNoticeRequestMessage> createInsertNoticeRequestMessage(InsertNoticeRequestMessage value) {
        return new JAXBElement<InsertNoticeRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, InsertNoticeRequestMessage.class, InsertNotice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifyPersonByCardRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = IdentifyPersonByCard.class)
    public JAXBElement<IdentifyPersonByCardRequestMessage> createIdentifyPersonByCardRequestMessage(IdentifyPersonByCardRequestMessage value) {
        return new JAXBElement<IdentifyPersonByCardRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, IdentifyPersonByCardRequestMessage.class, IdentifyPersonByCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellPrepaidCardResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "SellPrepaidCardResult", scope = SellPrepaidCardResponse.class)
    public JAXBElement<SellPrepaidCardResponseMessage> createSellPrepaidCardResponseSellPrepaidCardResult(SellPrepaidCardResponseMessage value) {
        return new JAXBElement<SellPrepaidCardResponseMessage>(_SellPrepaidCardResponseSellPrepaidCardResult_QNAME, SellPrepaidCardResponseMessage.class, SellPrepaidCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimateMainAmountResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "EstimateMainAmountResult", scope = EstimateMainAmountResponse.class)
    public JAXBElement<EstimateMainAmountResponseMessage> createEstimateMainAmountResponseEstimateMainAmountResult(EstimateMainAmountResponseMessage value) {
        return new JAXBElement<EstimateMainAmountResponseMessage>(_EstimateMainAmountResponseEstimateMainAmountResult_QNAME, EstimateMainAmountResponseMessage.class, EstimateMainAmountResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareNoticeRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = PrepareNotice.class)
    public JAXBElement<PrepareNoticeRequestMessage> createPrepareNoticeRequestMessage(PrepareNoticeRequestMessage value) {
        return new JAXBElement<PrepareNoticeRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, PrepareNoticeRequestMessage.class, PrepareNotice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNoticeResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "InsertNoticeResult", scope = InsertNoticeResponse.class)
    public JAXBElement<InsertNoticeResponseMessage> createInsertNoticeResponseInsertNoticeResult(InsertNoticeResponseMessage value) {
        return new JAXBElement<InsertNoticeResponseMessage>(_InsertNoticeResponseInsertNoticeResult_QNAME, InsertNoticeResponseMessage.class, InsertNoticeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanksChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetBanksChanges.class)
    public JAXBElement<GetBanksChangesRequestMessage> createGetBanksChangesRequestMessage(GetBanksChangesRequestMessage value) {
        return new JAXBElement<GetBanksChangesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetBanksChangesRequestMessage.class, GetBanksChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransfersListResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetTransfersListResult", scope = GetTransfersListResponse.class)
    public JAXBElement<GetTransfersListResponseMessage> createGetTransfersListResponseGetTransfersListResult(GetTransfersListResponseMessage value) {
        return new JAXBElement<GetTransfersListResponseMessage>(_GetTransfersListResponseGetTransfersListResult_QNAME, GetTransfersListResponseMessage.class, GetTransfersListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayoutTransferResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "PayoutTransferResult", scope = PayoutTransferResponse.class)
    public JAXBElement<PayoutTransferResponseMessage> createPayoutTransferResponsePayoutTransferResult(PayoutTransferResponseMessage value) {
        return new JAXBElement<PayoutTransferResponseMessage>(_PayoutTransferResponsePayoutTransferResult_QNAME, PayoutTransferResponseMessage.class, PayoutTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankInfosChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetBankInfosChangesResult", scope = GetBankInfosChangesResponse.class)
    public JAXBElement<GetBankInfosChangesResponseMessage> createGetBankInfosChangesResponseGetBankInfosChangesResult(GetBankInfosChangesResponseMessage value) {
        return new JAXBElement<GetBankInfosChangesResponseMessage>(_GetBankInfosChangesResponseGetBankInfosChangesResult_QNAME, GetBankInfosChangesResponseMessage.class, GetBankInfosChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectNoticeRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = RejectNotice.class)
    public JAXBElement<RejectNoticeRequestMessage> createRejectNoticeRequestMessage(RejectNoticeRequestMessage value) {
        return new JAXBElement<RejectNoticeRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, RejectNoticeRequestMessage.class, RejectNotice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveNoticeRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = ApproveNotice.class)
    public JAXBElement<ApproveNoticeRequestMessage> createApproveNoticeRequestMessage(ApproveNoticeRequestMessage value) {
        return new JAXBElement<ApproveNoticeRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, ApproveNoticeRequestMessage.class, ApproveNotice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankByIDResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetBankByIDResult", scope = GetBankByIDResponse.class)
    public JAXBElement<GetBankByIDResponseMessage> createGetBankByIDResponseGetBankByIDResult(GetBankByIDResponseMessage value) {
        return new JAXBElement<GetBankByIDResponseMessage>(_GetBankByIDResponseGetBankByIDResult_QNAME, GetBankByIDResponseMessage.class, GetBankByIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellPrepaidCardRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = SellPrepaidCard.class)
    public JAXBElement<SellPrepaidCardRequestMessage> createSellPrepaidCardRequestMessage(SellPrepaidCardRequestMessage value) {
        return new JAXBElement<SellPrepaidCardRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, SellPrepaidCardRequestMessage.class, SellPrepaidCard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonPhoneResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "AddPersonPhoneResult", scope = AddPersonPhoneResponse.class)
    public JAXBElement<AddPersonPhoneResponseMessage> createAddPersonPhoneResponseAddPersonPhoneResult(AddPersonPhoneResponseMessage value) {
        return new JAXBElement<AddPersonPhoneResponseMessage>(_AddPersonPhoneResponseAddPersonPhoneResult_QNAME, AddPersonPhoneResponseMessage.class, AddPersonPhoneResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionsChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetRegionsChanges.class)
    public JAXBElement<GetRegionsChangesRequestMessage> createGetRegionsChangesRequestMessage(GetRegionsChangesRequestMessage value) {
        return new JAXBElement<GetRegionsChangesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetRegionsChangesRequestMessage.class, GetRegionsChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransfersChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetTransfersChangesResult", scope = GetTransfersChangesResponse.class)
    public JAXBElement<GetTransfersChangesResponseMessage> createGetTransfersChangesResponseGetTransfersChangesResult(GetTransfersChangesResponseMessage value) {
        return new JAXBElement<GetTransfersChangesResponseMessage>(_GetTransfersChangesResponseGetTransfersChangesResult_QNAME, GetTransfersChangesResponseMessage.class, GetTransfersChangesResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticeByIDRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetNoticeByID.class)
    public JAXBElement<GetNoticeByIDRequestMessage> createGetNoticeByIDRequestMessage(GetNoticeByIDRequestMessage value) {
        return new JAXBElement<GetNoticeByIDRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetNoticeByIDRequestMessage.class, GetNoticeByID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClearingReportRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetClearingReport.class)
    public JAXBElement<GetClearingReportRequestMessage> createGetClearingReportRequestMessage(GetClearingReportRequestMessage value) {
        return new JAXBElement<GetClearingReportRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetClearingReportRequestMessage.class, GetClearingReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankInfosChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetBankInfosChanges.class)
    public JAXBElement<GetBankInfosChangesRequestMessage> createGetBankInfosChangesRequestMessage(GetBankInfosChangesRequestMessage value) {
        return new JAXBElement<GetBankInfosChangesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetBankInfosChangesRequestMessage.class, GetBankInfosChanges.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegionRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = FindRegion.class)
    public JAXBElement<FindRegionRequestMessage> createFindRegionRequestMessage(FindRegionRequestMessage value) {
        return new JAXBElement<FindRegionRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, FindRegionRequestMessage.class, FindRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectNoticeResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "RejectNoticeResult", scope = RejectNoticeResponse.class)
    public JAXBElement<RejectNoticeResponseMessage> createRejectNoticeResponseRejectNoticeResult(RejectNoticeResponseMessage value) {
        return new JAXBElement<RejectNoticeResponseMessage>(_RejectNoticeResponseRejectNoticeResult_QNAME, RejectNoticeResponseMessage.class, RejectNoticeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayoutTransferRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = PayoutTransfer.class)
    public JAXBElement<PayoutTransferRequestMessage> createPayoutTransferRequestMessage(PayoutTransferRequestMessage value) {
        return new JAXBElement<PayoutTransferRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, PayoutTransferRequestMessage.class, PayoutTransfer.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticeByIDResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetNoticeByIDResult", scope = GetNoticeByIDResponse.class)
    public JAXBElement<GetNoticeByIDResponseMessage> createGetNoticeByIDResponseGetNoticeByIDResult(GetNoticeByIDResponseMessage value) {
        return new JAXBElement<GetNoticeByIDResponseMessage>(_GetNoticeByIDResponseGetNoticeByIDResult_QNAME, GetNoticeByIDResponseMessage.class, GetNoticeByIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "FindPersonResult", scope = FindPersonResponse.class)
    public JAXBElement<FindPersonResponseMessage> createFindPersonResponseFindPersonResult(FindPersonResponseMessage value) {
        return new JAXBElement<FindPersonResponseMessage>(_FindPersonResponseFindPersonResult_QNAME, FindPersonResponseMessage.class, FindPersonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonAddressResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "AddPersonAddressResult", scope = AddPersonAddressResponse.class)
    public JAXBElement<AddPersonAddressResponseMessage> createAddPersonAddressResponseAddPersonAddressResult(AddPersonAddressResponseMessage value) {
        return new JAXBElement<AddPersonAddressResponseMessage>(_AddPersonAddressResponseAddPersonAddressResult_QNAME, AddPersonAddressResponseMessage.class, AddPersonAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmClearingReportRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = ConfirmClearingReport.class)
    public JAXBElement<ConfirmClearingReportRequestMessage> createConfirmClearingReportRequestMessage(ConfirmClearingReportRequestMessage value) {
        return new JAXBElement<ConfirmClearingReportRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, ConfirmClearingReportRequestMessage.class, ConfirmClearingReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransfersChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetTransfersChanges.class)
    public JAXBElement<GetTransfersChangesRequestMessage> createGetTransfersChangesRequestMessage(GetTransfersChangesRequestMessage value) {
        return new JAXBElement<GetTransfersChangesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetTransfersChangesRequestMessage.class, GetTransfersChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimateMainAmountRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = EstimateMainAmount.class)
    public JAXBElement<EstimateMainAmountRequestMessage> createEstimateMainAmountRequestMessage(EstimateMainAmountRequestMessage value) {
        return new JAXBElement<EstimateMainAmountRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, EstimateMainAmountRequestMessage.class, EstimateMainAmount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanksChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetBanksChangesResult", scope = GetBanksChangesResponse.class)
    public JAXBElement<GetBanksChangesResponseMessage> createGetBanksChangesResponseGetBanksChangesResult(GetBanksChangesResponseMessage value) {
        return new JAXBElement<GetBanksChangesResponseMessage>(_GetBanksChangesResponseGetBanksChangesResult_QNAME, GetBanksChangesResponseMessage.class, GetBanksChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticesChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetNoticesChangesResult", scope = GetNoticesChangesResponse.class)
    public JAXBElement<GetNoticesChangesResponseMessage> createGetNoticesChangesResponseGetNoticesChangesResult(GetNoticesChangesResponseMessage value) {
        return new JAXBElement<GetNoticesChangesResponseMessage>(_GetNoticesChangesResponseGetNoticesChangesResult_QNAME, GetNoticesChangesResponseMessage.class, GetNoticesChangesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonPhoneRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = AddPersonPhone.class)
    public JAXBElement<AddPersonPhoneRequestMessage> createAddPersonPhoneRequestMessage(AddPersonPhoneRequestMessage value) {
        return new JAXBElement<AddPersonPhoneRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, AddPersonPhoneRequestMessage.class, AddPersonPhone.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastTransferTemplatesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMsg", scope = GetLastTransferTemplates.class)
    public JAXBElement<GetLastTransferTemplatesRequestMessage> createGetLastTransferTemplatesRequestMsg(GetLastTransferTemplatesRequestMessage value) {
        return new JAXBElement<GetLastTransferTemplatesRequestMessage>(_GetLastTransferTemplatesRequestMsg_QNAME, GetLastTransferTemplatesRequestMessage.class, GetLastTransferTemplates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClearingReportResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetClearingReportResult", scope = GetClearingReportResponse.class)
    public JAXBElement<GetClearingReportResponseMessage> createGetClearingReportResponseGetClearingReportResult(GetClearingReportResponseMessage value) {
        return new JAXBElement<GetClearingReportResponseMessage>(_GetClearingReportResponseGetClearingReportResult_QNAME, GetClearingReportResponseMessage.class, GetClearingReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTransferRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = FindTransfer.class)
    public JAXBElement<FindTransferRequestMessage> createFindTransferRequestMessage(FindTransferRequestMessage value) {
        return new JAXBElement<FindTransferRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, FindTransferRequestMessage.class, FindTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTransferResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "ReturnTransferResult", scope = ReturnTransferResponse.class)
    public JAXBElement<ReturnTransferResponseMessage> createReturnTransferResponseReturnTransferResult(ReturnTransferResponseMessage value) {
        return new JAXBElement<ReturnTransferResponseMessage>(_ReturnTransferResponseReturnTransferResult_QNAME, ReturnTransferResponseMessage.class, ReturnTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticesListResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetNoticesListResult", scope = GetNoticesListResponse.class)
    public JAXBElement<GetNoticesListResponseMessage> createGetNoticesListResponseGetNoticesListResult(GetNoticesListResponseMessage value) {
        return new JAXBElement<GetNoticesListResponseMessage>(_GetNoticesListResponseGetNoticesListResult_QNAME, GetNoticesListResponseMessage.class, GetNoticesListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveNoticeResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "ApproveNoticeResult", scope = ApproveNoticeResponse.class)
    public JAXBElement<ApproveNoticeResponseMessage> createApproveNoticeResponseApproveNoticeResult(ApproveNoticeResponseMessage value) {
        return new JAXBElement<ApproveNoticeResponseMessage>(_ApproveNoticeResponseApproveNoticeResult_QNAME, ApproveNoticeResponseMessage.class, ApproveNoticeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticesListRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetNoticesList.class)
    public JAXBElement<GetNoticesListRequestMessage> createGetNoticesListRequestMessage(GetNoticesListRequestMessage value) {
        return new JAXBElement<GetNoticesListRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetNoticesListRequestMessage.class, GetNoticesList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetCountries.class)
    public JAXBElement<GetCountriesRequestMessage> createGetCountriesRequestMessage(GetCountriesRequestMessage value) {
        return new JAXBElement<GetCountriesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetCountriesRequestMessage.class, GetCountries.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTransferRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = ReturnTransfer.class)
    public JAXBElement<ReturnTransferRequestMessage> createReturnTransferRequestMessage(ReturnTransferRequestMessage value) {
        return new JAXBElement<ReturnTransferRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, ReturnTransferRequestMessage.class, ReturnTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastTransferTemplatesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetLastTransferTemplatesResult", scope = GetLastTransferTemplatesResponse.class)
    public JAXBElement<GetLastTransferTemplatesResponseMessage> createGetLastTransferTemplatesResponseGetLastTransferTemplatesResult(GetLastTransferTemplatesResponseMessage value) {
        return new JAXBElement<GetLastTransferTemplatesResponseMessage>(_GetLastTransferTemplatesResponseGetLastTransferTemplatesResult_QNAME, GetLastTransferTemplatesResponseMessage.class, GetLastTransferTemplatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransferResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "InsertTransferResult", scope = InsertTransferResponse.class)
    public JAXBElement<InsertTransferResponseMessage> createInsertTransferResponseInsertTransferResult(InsertTransferResponseMessage value) {
        return new JAXBElement<InsertTransferResponseMessage>(_InsertTransferResponseInsertTransferResult_QNAME, InsertTransferResponseMessage.class, InsertTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareNoticeResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "PrepareNoticeResult", scope = PrepareNoticeResponse.class)
    public JAXBElement<PrepareNoticeResponseMessage> createPrepareNoticeResponsePrepareNoticeResult(PrepareNoticeResponseMessage value) {
        return new JAXBElement<PrepareNoticeResponseMessage>(_PrepareNoticeResponsePrepareNoticeResult_QNAME, PrepareNoticeResponseMessage.class, PrepareNoticeResponse.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferBySourceIDRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetTransferBySourceID.class)
    public JAXBElement<GetTransferBySourceIDRequestMessage> createGetTransferBySourceIDRequestMessage(GetTransferBySourceIDRequestMessage value) {
        return new JAXBElement<GetTransferBySourceIDRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetTransferBySourceIDRequestMessage.class, GetTransferBySourceID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmClearingReportResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "ConfirmClearingReportResult", scope = ConfirmClearingReportResponse.class)
    public JAXBElement<ConfirmClearingReportResponseMessage> createConfirmClearingReportResponseConfirmClearingReportResult(ConfirmClearingReportResponseMessage value) {
        return new JAXBElement<ConfirmClearingReportResponseMessage>(_ConfirmClearingReportResponseConfirmClearingReportResult_QNAME, ConfirmClearingReportResponseMessage.class, ConfirmClearingReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = FindPerson.class)
    public JAXBElement<FindPersonRequestMessage> createFindPersonRequestMessage(FindPersonRequestMessage value) {
        return new JAXBElement<FindPersonRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, FindPersonRequestMessage.class, FindPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransfer2RequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = InsertTransfer2 .class)
    public JAXBElement<InsertTransfer2RequestMessage> createInsertTransfer2RequestMessage(InsertTransfer2RequestMessage value) {
        return new JAXBElement<InsertTransfer2RequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, InsertTransfer2RequestMessage.class, InsertTransfer2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetCountriesChanges.class)
    public JAXBElement<GetCountriesChangesRequestMessage> createGetCountriesChangesRequestMessage(GetCountriesChangesRequestMessage value) {
        return new JAXBElement<GetCountriesChangesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetCountriesChangesRequestMessage.class, GetCountriesChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "CreatePersonResult", scope = CreatePersonResponse.class)
    public JAXBElement<CreatePersonResponseMessage> createCreatePersonResponseCreatePersonResult(CreatePersonResponseMessage value) {
        return new JAXBElement<CreatePersonResponseMessage>(_CreatePersonResponseCreatePersonResult_QNAME, CreatePersonResponseMessage.class, CreatePersonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTransferResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "FindTransferResult", scope = FindTransferResponse.class)
    public JAXBElement<FindTransferResponseMessage> createFindTransferResponseFindTransferResult(FindTransferResponseMessage value) {
        return new JAXBElement<FindTransferResponseMessage>(_FindTransferResponseFindTransferResult_QNAME, FindTransferResponseMessage.class, FindTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankByIDRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetBankByID.class)
    public JAXBElement<GetBankByIDRequestMessage> createGetBankByIDRequestMessage(GetBankByIDRequestMessage value) {
        return new JAXBElement<GetBankByIDRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetBankByIDRequestMessage.class, GetBankByID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrenciesChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetCurrenciesChanges.class)
    public JAXBElement<GetCurrenciesChangesRequestMessage> createGetCurrenciesChangesRequestMessage(GetCurrenciesChangesRequestMessage value) {
        return new JAXBElement<GetCurrenciesChangesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetCurrenciesChangesRequestMessage.class, GetCurrenciesChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferByIDRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetTransferByID.class)
    public JAXBElement<GetTransferByIDRequestMessage> createGetTransferByIDRequestMessage(GetTransferByIDRequestMessage value) {
        return new JAXBElement<GetTransferByIDRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetTransferByIDRequestMessage.class, GetTransferByID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = CreatePerson.class)
    public JAXBElement<CreatePersonRequestMessage> createCreatePersonRequestMessage(CreatePersonRequestMessage value) {
        return new JAXBElement<CreatePersonRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, CreatePersonRequestMessage.class, CreatePerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransferBySourceIDResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "GetTransferBySourceIDResult", scope = GetTransferBySourceIDResponse.class)
    public JAXBElement<GetTransferBySourceIDResponseMessage> createGetTransferBySourceIDResponseGetTransferBySourceIDResult(GetTransferBySourceIDResponseMessage value) {
        return new JAXBElement<GetTransferBySourceIDResponseMessage>(_GetTransferBySourceIDResponseGetTransferBySourceIDResult_QNAME, GetTransferBySourceIDResponseMessage.class, GetTransferBySourceIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifyPersonByCardResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "IdentifyPersonByCardResult", scope = IdentifyPersonByCardResponse.class)
    public JAXBElement<IdentifyPersonByCardResponseMessage> createIdentifyPersonByCardResponseIdentifyPersonByCardResult(IdentifyPersonByCardResponseMessage value) {
        return new JAXBElement<IdentifyPersonByCardResponseMessage>(_IdentifyPersonByCardResponseIdentifyPersonByCardResult_QNAME, IdentifyPersonByCardResponseMessage.class, IdentifyPersonByCardResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonDocumentResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "AddPersonDocumentResult", scope = AddPersonDocumentResponse.class)
    public JAXBElement<AddPersonDocumentResponseMessage> createAddPersonDocumentResponseAddPersonDocumentResult(AddPersonDocumentResponseMessage value) {
        return new JAXBElement<AddPersonDocumentResponseMessage>(_AddPersonDocumentResponseAddPersonDocumentResult_QNAME, AddPersonDocumentResponseMessage.class, AddPersonDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareTransferRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = PrepareTransfer.class)
    public JAXBElement<PrepareTransferRequestMessage> createPrepareTransferRequestMessage(PrepareTransferRequestMessage value) {
        return new JAXBElement<PrepareTransferRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, PrepareTransferRequestMessage.class, PrepareTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoticesChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetNoticesChanges.class)
    public JAXBElement<GetNoticesChangesRequestMessage> createGetNoticesChangesRequestMessage(GetNoticesChangesRequestMessage value) {
        return new JAXBElement<GetNoticesChangesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetNoticesChangesRequestMessage.class, GetNoticesChanges.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransfersListRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = GetTransfersList.class)
    public JAXBElement<GetTransfersListRequestMessage> createGetTransfersListRequestMessage(GetTransfersListRequestMessage value) {
        return new JAXBElement<GetTransfersListRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetTransfersListRequestMessage.class, GetTransfersList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTransfer2ResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "InsertTransfer2Result", scope = InsertTransfer2Response.class)
    public JAXBElement<InsertTransfer2ResponseMessage> createInsertTransfer2ResponseInsertTransfer2Result(InsertTransfer2ResponseMessage value) {
        return new JAXBElement<InsertTransfer2ResponseMessage>(_InsertTransfer2ResponseInsertTransfer2Result_QNAME, InsertTransfer2ResponseMessage.class, InsertTransfer2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonAddressRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = AddPersonAddress.class)
    public JAXBElement<AddPersonAddressRequestMessage> createAddPersonAddressRequestMessage(AddPersonAddressRequestMessage value) {
        return new JAXBElement<AddPersonAddressRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, AddPersonAddressRequestMessage.class, AddPersonAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonDocumentRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "requestMessage", scope = AddPersonDocument.class)
    public JAXBElement<AddPersonDocumentRequestMessage> createAddPersonDocumentRequestMessage(AddPersonDocumentRequestMessage value) {
        return new JAXBElement<AddPersonDocumentRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, AddPersonDocumentRequestMessage.class, AddPersonDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepareTransferResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test.unistream.com/wcflib/", name = "PrepareTransferResult", scope = PrepareTransferResponse.class)
    public JAXBElement<PrepareTransferResponseMessage> createPrepareTransferResponsePrepareTransferResult(PrepareTransferResponseMessage value) {
        return new JAXBElement<PrepareTransferResponseMessage>(_PrepareTransferResponsePrepareTransferResult_QNAME, PrepareTransferResponseMessage.class, PrepareTransferResponse.class, value);
    }

}
