
package com.unistream.test.wcflib;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
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
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IWebService", targetNamespace = "http://test.unistream.com/wcflib/")
@XmlSeeAlso({
    org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory.class,
    com.unistream.test.wcflib.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.ObjectFactory.class
})
public interface IWebService {


    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesResponseMessage
     */
    @WebMethod(operationName = "GetCountries", action = "http://test.unistream.com/wcflib/ICountryProvider/GetCountries")
    @WebResult(name = "GetCountriesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetCountries", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetCountries")
    @ResponseWrapper(localName = "GetCountriesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetCountriesResponse")
    public GetCountriesResponseMessage getCountries(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetCountriesRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCountriesChangesResponseMessage
     */
    @WebMethod(operationName = "GetCountriesChanges", action = "http://test.unistream.com/wcflib/ICountryProvider/GetCountriesChanges")
    @WebResult(name = "GetCountriesChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetCountriesChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetCountriesChanges")
    @ResponseWrapper(localName = "GetCountriesChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetCountriesChangesResponse")
    public GetCountriesChangesResponseMessage getCountriesChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetCountriesChangesRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCurrenciesChangesResponseMessage
     */
    @WebMethod(operationName = "GetCurrenciesChanges", action = "http://test.unistream.com/wcflib/ICurrencyProvider/GetCurrenciesChanges")
    @WebResult(name = "GetCurrenciesChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetCurrenciesChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetCurrenciesChanges")
    @ResponseWrapper(localName = "GetCurrenciesChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetCurrenciesChangesResponse")
    public GetCurrenciesChangesResponseMessage getCurrenciesChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetCurrenciesChangesRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessage
     */
    @WebMethod(operationName = "FindPerson", action = "http://test.unistream.com/wcflib/IClientsStore/FindPerson")
    @WebResult(name = "FindPersonResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "FindPerson", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindPerson")
    @ResponseWrapper(localName = "FindPersonResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindPersonResponse")
    public FindPersonResponseMessage findPerson(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        FindPersonRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessage
     */
    @WebMethod(operationName = "CreatePerson", action = "http://test.unistream.com/wcflib/IClientsStore/CreatePerson")
    @WebResult(name = "CreatePersonResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "CreatePerson", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreatePerson")
    @ResponseWrapper(localName = "CreatePersonResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreatePersonResponse")
    public CreatePersonResponseMessage createPerson(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        CreatePersonRequestMessage requestMessage);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetLastTransferTemplatesResponseMessage
     */
    @WebMethod(operationName = "GetLastTransferTemplates", action = "http://test.unistream.com/wcflib/IClientsStore/GetLastTransferTemplates")
    @WebResult(name = "GetLastTransferTemplatesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetLastTransferTemplates", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetLastTransferTemplates")
    @ResponseWrapper(localName = "GetLastTransferTemplatesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetLastTransferTemplatesResponse")
    public GetLastTransferTemplatesResponseMessage getLastTransferTemplates(
        @WebParam(name = "requestMsg", targetNamespace = "http://test.unistream.com/wcflib/")
        GetLastTransferTemplatesRequestMessage requestMsg);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.AddPersonAddressResponseMessage
     */
    @WebMethod(operationName = "AddPersonAddress", action = "http://test.unistream.com/wcflib/IClientsStore/AddPersonAddress")
    @WebResult(name = "AddPersonAddressResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "AddPersonAddress", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonAddress")
    @ResponseWrapper(localName = "AddPersonAddressResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonAddressResponse")
    public AddPersonAddressResponseMessage addPersonAddress(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        AddPersonAddressRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.AddPersonDocumentResponseMessage
     */
    @WebMethod(operationName = "AddPersonDocument", action = "http://test.unistream.com/wcflib/IClientsStore/AddPersonDocument")
    @WebResult(name = "AddPersonDocumentResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "AddPersonDocument", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonDocument")
    @ResponseWrapper(localName = "AddPersonDocumentResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonDocumentResponse")
    public AddPersonDocumentResponseMessage addPersonDocument(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        AddPersonDocumentRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.AddPersonPhoneResponseMessage
     */
    @WebMethod(operationName = "AddPersonPhone", action = "http://test.unistream.com/wcflib/IClientsStore/AddPersonPhone")
    @WebResult(name = "AddPersonPhoneResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "AddPersonPhone", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonPhone")
    @ResponseWrapper(localName = "AddPersonPhoneResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonPhoneResponse")
    public AddPersonPhoneResponseMessage addPersonPhone(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        AddPersonPhoneRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDResponseMessage
     */
    @WebMethod(operationName = "GetBankByID", action = "http://test.unistream.com/wcflib/IBankProvider/GetBankByID")
    @WebResult(name = "GetBankByIDResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetBankByID", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBankByID")
    @ResponseWrapper(localName = "GetBankByIDResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBankByIDResponse")
    public GetBankByIDResponseMessage getBankByID(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetBankByIDRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesResponseMessage
     */
    @WebMethod(operationName = "GetBanksChanges", action = "http://test.unistream.com/wcflib/IBankProvider/GetBanksChanges")
    @WebResult(name = "GetBanksChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetBanksChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBanksChanges")
    @ResponseWrapper(localName = "GetBanksChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBanksChangesResponse")
    public GetBanksChangesResponseMessage getBanksChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetBanksChangesRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferResponseMessage
     */
    @WebMethod(operationName = "InsertTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/InsertTransfer")
    @WebResult(name = "InsertTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "InsertTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransfer")
    @ResponseWrapper(localName = "InsertTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransferResponse")
    public InsertTransferResponseMessage insertTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        InsertTransferRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.InsertTransfer2ResponseMessage
     */
    @WebMethod(operationName = "InsertTransfer2", action = "http://test.unistream.com/wcflib/ITransferProvider/InsertTransfer2")
    @WebResult(name = "InsertTransfer2Result", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "InsertTransfer2", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransfer2")
    @ResponseWrapper(localName = "InsertTransfer2Response", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransfer2Response")
    public InsertTransfer2ResponseMessage insertTransfer2(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        InsertTransfer2RequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.PrepareTransferResponseMessage
     */
    @WebMethod(operationName = "PrepareTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/PrepareTransfer")
    @WebResult(name = "PrepareTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "PrepareTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PrepareTransfer")
    @ResponseWrapper(localName = "PrepareTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PrepareTransferResponse")
    public PrepareTransferResponseMessage prepareTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        PrepareTransferRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessage
     */
    @WebMethod(operationName = "FindTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/FindTransfer")
    @WebResult(name = "FindTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "FindTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindTransfer")
    @ResponseWrapper(localName = "FindTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindTransferResponse")
    public FindTransferResponseMessage findTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        FindTransferRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessage
     */
    @WebMethod(operationName = "PayoutTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/PayoutTransfer")
    @WebResult(name = "PayoutTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "PayoutTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PayoutTransfer")
    @ResponseWrapper(localName = "PayoutTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PayoutTransferResponse")
    public PayoutTransferResponseMessage payoutTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        PayoutTransferRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetTransferBySourceIDResponseMessage
     */
    @WebMethod(operationName = "GetTransferBySourceID", action = "http://test.unistream.com/wcflib/ITransferProvider/GetTransferBySourceID")
    @WebResult(name = "GetTransferBySourceIDResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetTransferBySourceID", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransferBySourceID")
    @ResponseWrapper(localName = "GetTransferBySourceIDResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransferBySourceIDResponse")
    public GetTransferBySourceIDResponseMessage getTransferBySourceID(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetTransferBySourceIDRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessage
     */
    @WebMethod(operationName = "GetTransferByID", action = "http://test.unistream.com/wcflib/ITransferProvider/GetTransferByID")
    @WebResult(name = "GetTransferByIDResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetTransferByID", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransferByID")
    @ResponseWrapper(localName = "GetTransferByIDResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransferByIDResponse")
    public GetTransferByIDResponseMessage getTransferByID(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetTransferByIDRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.ReturnTransferResponseMessage
     */
    @WebMethod(operationName = "ReturnTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/ReturnTransfer")
    @WebResult(name = "ReturnTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "ReturnTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ReturnTransfer")
    @ResponseWrapper(localName = "ReturnTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ReturnTransferResponse")
    public ReturnTransferResponseMessage returnTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        ReturnTransferRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.EstimateMainAmountResponseMessage
     */
    @WebMethod(operationName = "EstimateMainAmount", action = "http://test.unistream.com/wcflib/ITransferProvider/EstimateMainAmount")
    @WebResult(name = "EstimateMainAmountResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "EstimateMainAmount", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.EstimateMainAmount")
    @ResponseWrapper(localName = "EstimateMainAmountResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.EstimateMainAmountResponse")
    public EstimateMainAmountResponseMessage estimateMainAmount(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        EstimateMainAmountRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetClearingReportResponseMessage
     */
    @WebMethod(operationName = "GetClearingReport", action = "http://test.unistream.com/wcflib/ITransferProvider/GetClearingReport")
    @WebResult(name = "GetClearingReportResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetClearingReport", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetClearingReport")
    @ResponseWrapper(localName = "GetClearingReportResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetClearingReportResponse")
    public GetClearingReportResponseMessage getClearingReport(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetClearingReportRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.ConfirmClearingReportResponseMessage
     */
    @WebMethod(operationName = "ConfirmClearingReport", action = "http://test.unistream.com/wcflib/ITransferProvider/ConfirmClearingReport")
    @WebResult(name = "ConfirmClearingReportResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "ConfirmClearingReport", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ConfirmClearingReport")
    @ResponseWrapper(localName = "ConfirmClearingReportResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ConfirmClearingReportResponse")
    public ConfirmClearingReportResponseMessage confirmClearingReport(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        ConfirmClearingReportRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersListResponseMessage
     */
    @WebMethod(operationName = "GetTransfersList", action = "http://test.unistream.com/wcflib/ITransferProvider/GetTransfersList")
    @WebResult(name = "GetTransfersListResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetTransfersList", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransfersList")
    @ResponseWrapper(localName = "GetTransfersListResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransfersListResponse")
    public GetTransfersListResponseMessage getTransfersList(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetTransfersListRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersChangesResponseMessage
     */
    @WebMethod(operationName = "GetTransfersChanges", action = "http://test.unistream.com/wcflib/ITransferProvider/GetTransfersChanges")
    @WebResult(name = "GetTransfersChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetTransfersChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransfersChanges")
    @ResponseWrapper(localName = "GetTransfersChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransfersChangesResponse")
    public GetTransfersChangesResponseMessage getTransfersChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetTransfersChangesRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRegionResponseMessage
     */
    @WebMethod(operationName = "FindRegion", action = "http://test.unistream.com/wcflib/IRegionProvider/FindRegion")
    @WebResult(name = "FindRegionResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "FindRegion", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindRegion")
    @ResponseWrapper(localName = "FindRegionResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindRegionResponse")
    public FindRegionResponseMessage findRegion(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        FindRegionRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetRegionsChangesResponseMessage
     */
    @WebMethod(operationName = "GetRegionsChanges", action = "http://test.unistream.com/wcflib/IRegionProvider/GetRegionsChanges")
    @WebResult(name = "GetRegionsChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetRegionsChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetRegionsChanges")
    @ResponseWrapper(localName = "GetRegionsChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetRegionsChangesResponse")
    public GetRegionsChangesResponseMessage getRegionsChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetRegionsChangesRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.InsertNoticeResponseMessage
     */
    @WebMethod(operationName = "InsertNotice", action = "http://test.unistream.com/wcflib/INoticeProvider/InsertNotice")
    @WebResult(name = "InsertNoticeResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "InsertNotice", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertNotice")
    @ResponseWrapper(localName = "InsertNoticeResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertNoticeResponse")
    public InsertNoticeResponseMessage insertNotice(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        InsertNoticeRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.PrepareNoticeResponseMessage
     */
    @WebMethod(operationName = "PrepareNotice", action = "http://test.unistream.com/wcflib/INoticeProvider/PrepareNotice")
    @WebResult(name = "PrepareNoticeResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "PrepareNotice", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PrepareNotice")
    @ResponseWrapper(localName = "PrepareNoticeResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PrepareNoticeResponse")
    public PrepareNoticeResponseMessage prepareNotice(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        PrepareNoticeRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetNoticeByIDResponseMessage
     */
    @WebMethod(operationName = "GetNoticeByID", action = "http://test.unistream.com/wcflib/INoticeProvider/GetNoticeByID")
    @WebResult(name = "GetNoticeByIDResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetNoticeByID", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticeByID")
    @ResponseWrapper(localName = "GetNoticeByIDResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticeByIDResponse")
    public GetNoticeByIDResponseMessage getNoticeByID(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetNoticeByIDRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.ApproveNoticeResponseMessage
     */
    @WebMethod(operationName = "ApproveNotice", action = "http://test.unistream.com/wcflib/INoticeProvider/ApproveNotice")
    @WebResult(name = "ApproveNoticeResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "ApproveNotice", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ApproveNotice")
    @ResponseWrapper(localName = "ApproveNoticeResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ApproveNoticeResponse")
    public ApproveNoticeResponseMessage approveNotice(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        ApproveNoticeRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.RejectNoticeResponseMessage
     */
    @WebMethod(operationName = "RejectNotice", action = "http://test.unistream.com/wcflib/INoticeProvider/RejectNotice")
    @WebResult(name = "RejectNoticeResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "RejectNotice", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.RejectNotice")
    @ResponseWrapper(localName = "RejectNoticeResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.RejectNoticeResponse")
    public RejectNoticeResponseMessage rejectNotice(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        RejectNoticeRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesListResponseMessage
     */
    @WebMethod(operationName = "GetNoticesList", action = "http://test.unistream.com/wcflib/INoticeProvider/GetNoticesList")
    @WebResult(name = "GetNoticesListResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetNoticesList", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticesList")
    @ResponseWrapper(localName = "GetNoticesListResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticesListResponse")
    public GetNoticesListResponseMessage getNoticesList(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetNoticesListRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesChangesResponseMessage
     */
    @WebMethod(operationName = "GetNoticesChanges", action = "http://test.unistream.com/wcflib/INoticeProvider/GetNoticesChanges")
    @WebResult(name = "GetNoticesChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetNoticesChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticesChanges")
    @ResponseWrapper(localName = "GetNoticesChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticesChangesResponse")
    public GetNoticesChangesResponseMessage getNoticesChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetNoticesChangesRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesResponseMessage
     */
    @WebMethod(operationName = "GetDocumentTypeChanges", action = "http://test.unistream.com/wcflib/IDocumentTypeProvider/GetDocumentTypeChanges")
    @WebResult(name = "GetDocumentTypeChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetDocumentTypeChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetDocumentTypeChanges")
    @ResponseWrapper(localName = "GetDocumentTypeChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetDocumentTypeChangesResponse")
    public GetDocumentTypeChangesResponseMessage getDocumentTypeChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetDocumentTypeChangesRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankInfosChangesResponseMessage
     */
    @WebMethod(operationName = "GetBankInfosChanges", action = "http://test.unistream.com/wcflib/IBankInfoProvider/GetBankInfosChanges")
    @WebResult(name = "GetBankInfosChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetBankInfosChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBankInfosChanges")
    @ResponseWrapper(localName = "GetBankInfosChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBankInfosChangesResponse")
    public GetBankInfosChangesResponseMessage getBankInfosChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetBankInfosChangesRequestMessage requestMessage);

}
