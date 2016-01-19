
package com.unistream.test.wcflib;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
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
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IWebService", targetNamespace = "http://test.unistream.com/wcflib/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    com.unistream.test.wcflib.ObjectFactory.class,
    org.datacontract.schemas._2004._07.wcfservicelib.ObjectFactory.class,
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
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.FindPersonResponseMessageType
     */
    @WebMethod(operationName = "FindPerson", action = "http://test.unistream.com/wcflib/IClientsStore/FindPerson")
    @WebResult(name = "FindPersonResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "FindPerson", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindPerson")
    @ResponseWrapper(localName = "FindPersonResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindPersonResponse")
    public FindPersonResponseMessageType findPerson(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        FindPersonRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.CheckPersonListedResponseMessageType
     */
    @WebMethod(operationName = "CheckPersonListed", action = "http://test.unistream.com/wcflib/IClientsStore/CheckPersonListed")
    @WebResult(name = "CheckPersonListedResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "CheckPersonListed", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CheckPersonListed")
    @ResponseWrapper(localName = "CheckPersonListedResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CheckPersonListedResponse")
    public CheckPersonListedResponseMessageType checkPersonListed(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        CheckPersonListedRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.CreatePersonResponseMessageType
     */
    @WebMethod(operationName = "CreatePerson", action = "http://test.unistream.com/wcflib/IClientsStore/CreatePerson")
    @WebResult(name = "CreatePersonResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "CreatePerson", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreatePerson")
    @ResponseWrapper(localName = "CreatePersonResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreatePersonResponse")
    public CreatePersonResponseMessageType createPerson(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        CreatePersonRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.IdentifyPersonByCardResponseMessageType
     */
    @WebMethod(operationName = "IdentifyPersonByCard", action = "http://test.unistream.com/wcflib/IClientsStore/IdentifyPersonByCard")
    @WebResult(name = "IdentifyPersonByCardResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "IdentifyPersonByCard", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.IdentifyPersonByCard")
    @ResponseWrapper(localName = "IdentifyPersonByCardResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.IdentifyPersonByCardResponse")
    public IdentifyPersonByCardResponseMessageType identifyPersonByCard(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        IdentifyPersonByCardRequestMessageType requestMessage);

    /**
     * 
     * @param requestMsg
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetLastTransferTemplatesResponseMessageType
     */
    @WebMethod(operationName = "GetLastTransferTemplates", action = "http://test.unistream.com/wcflib/IClientsStore/GetLastTransferTemplates")
    @WebResult(name = "GetLastTransferTemplatesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetLastTransferTemplates", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetLastTransferTemplates")
    @ResponseWrapper(localName = "GetLastTransferTemplatesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetLastTransferTemplatesResponse")
    public GetLastTransferTemplatesResponseMessageType getLastTransferTemplates(
        @WebParam(name = "requestMsg", targetNamespace = "http://test.unistream.com/wcflib/")
        GetLastTransferTemplatesRequestMessageType requestMsg);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.AddPersonAddressResponseMessageType
     */
    @WebMethod(operationName = "AddPersonAddress", action = "http://test.unistream.com/wcflib/IClientsStore/AddPersonAddress")
    @WebResult(name = "AddPersonAddressResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "AddPersonAddress", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonAddress")
    @ResponseWrapper(localName = "AddPersonAddressResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonAddressResponse")
    public AddPersonAddressResponseMessageType addPersonAddress(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        AddPersonAddressRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.AddPersonDocumentResponseMessageType
     */
    @WebMethod(operationName = "AddPersonDocument", action = "http://test.unistream.com/wcflib/IClientsStore/AddPersonDocument")
    @WebResult(name = "AddPersonDocumentResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "AddPersonDocument", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonDocument")
    @ResponseWrapper(localName = "AddPersonDocumentResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonDocumentResponse")
    public AddPersonDocumentResponseMessageType addPersonDocument(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        AddPersonDocumentRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.AddPersonPhoneResponseMessageType
     */
    @WebMethod(operationName = "AddPersonPhone", action = "http://test.unistream.com/wcflib/IClientsStore/AddPersonPhone")
    @WebResult(name = "AddPersonPhoneResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "AddPersonPhone", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonPhone")
    @ResponseWrapper(localName = "AddPersonPhoneResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AddPersonPhoneResponse")
    public AddPersonPhoneResponseMessageType addPersonPhone(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        AddPersonPhoneRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.CreateRCompanyResponseMessageType
     */
    @WebMethod(operationName = "CreateRCompany", action = "http://test.unistream.com/wcflib/IClientsStore/CreateRCompany")
    @WebResult(name = "CreateRCompanyResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "CreateRCompany", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreateRCompany")
    @ResponseWrapper(localName = "CreateRCompanyResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreateRCompanyResponse")
    public CreateRCompanyResponseMessageType createRCompany(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        CreateRCompanyRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.PersonificateWalletResponseMessageType
     */
    @WebMethod(operationName = "PersonificateWallet", action = "http://test.unistream.com/wcflib/IClientsStore/PersonificateWallet")
    @WebResult(name = "PersonificateWalletResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "PersonificateWallet", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PersonificateWallet")
    @ResponseWrapper(localName = "PersonificateWalletResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PersonificateWalletResponse")
    public PersonificateWalletResponseMessageType personificateWallet(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        PersonificateWalletRequesetMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBankByIDResponseMessageType
     */
    @WebMethod(operationName = "GetBankByID", action = "http://test.unistream.com/wcflib/IBankProvider/GetBankByID")
    @WebResult(name = "GetBankByIDResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetBankByID", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBankByID")
    @ResponseWrapper(localName = "GetBankByIDResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBankByIDResponse")
    public GetBankByIDResponseMessageType getBankByID(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetBankByIDRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetBanksChangesResponseMessageType
     */
    @WebMethod(operationName = "GetBanksChanges", action = "http://test.unistream.com/wcflib/IBankProvider/GetBanksChanges")
    @WebResult(name = "GetBanksChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetBanksChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBanksChanges")
    @ResponseWrapper(localName = "GetBanksChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetBanksChangesResponse")
    public GetBanksChangesResponseMessageType getBanksChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetBanksChangesRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.FindRBankByBicResponseMessageType
     */
    @WebMethod(operationName = "FindRBankByBic", action = "http://test.unistream.com/wcflib/IBankProvider/FindRBankByBic")
    @WebResult(name = "FindRBankByBicResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "FindRBankByBic", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindRBankByBic")
    @ResponseWrapper(localName = "FindRBankByBicResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindRBankByBicResponse")
    public FindRBankByBicResponseMessageType findRBankByBic(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        FindRBankByBicRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferResponseMessageType
     */
    @WebMethod(operationName = "InsertTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/InsertTransfer")
    @WebResult(name = "InsertTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "InsertTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransfer")
    @ResponseWrapper(localName = "InsertTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransferResponse")
    public InsertTransferResponseMessageType insertTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        InsertTransferRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.CreatePrepaidCardResponseMessageType
     */
    @WebMethod(operationName = "CreatePrepaidCard", action = "http://test.unistream.com/wcflib/ITransferProvider/CreatePrepaidCard")
    @WebResult(name = "CreatePrepaidCardResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "CreatePrepaidCard", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreatePrepaidCard")
    @ResponseWrapper(localName = "CreatePrepaidCardResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreatePrepaidCardResponse")
    public CreatePrepaidCardResponseMessageType createPrepaidCard(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        CreatePrepaidCardRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.ActivatePrepaidCardResponseMessageType
     */
    @WebMethod(operationName = "ActivatePrepaidCard", action = "http://test.unistream.com/wcflib/ITransferProvider/ActivatePrepaidCard")
    @WebResult(name = "ActivatePrepaidCardResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "ActivatePrepaidCard", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ActivatePrepaidCard")
    @ResponseWrapper(localName = "ActivatePrepaidCardResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ActivatePrepaidCardResponse")
    public ActivatePrepaidCardResponseMessageType activatePrepaidCard(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        ActivatePrepaidCardRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.InsertTransfer2ResponseMessageType
     */
    @WebMethod(operationName = "InsertTransfer2", action = "http://test.unistream.com/wcflib/ITransferProvider/InsertTransfer2")
    @WebResult(name = "InsertTransfer2Result", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "InsertTransfer2", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransfer2")
    @ResponseWrapper(localName = "InsertTransfer2Response", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransfer2Response")
    public InsertTransfer2ResponseMessageType insertTransfer2(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        InsertTransfer2RequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.PrepareTransferResponseMessageType
     */
    @WebMethod(operationName = "PrepareTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/PrepareTransfer")
    @WebResult(name = "PrepareTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "PrepareTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PrepareTransfer")
    @ResponseWrapper(localName = "PrepareTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PrepareTransferResponse")
    public PrepareTransferResponseMessageType prepareTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        PrepareTransferRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.FindTransferResponseMessageType
     */
    @WebMethod(operationName = "FindTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/FindTransfer")
    @WebResult(name = "FindTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "FindTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindTransfer")
    @ResponseWrapper(localName = "FindTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.FindTransferResponse")
    public FindTransferResponseMessageType findTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        FindTransferRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.PayoutTransferResponseMessageType
     */
    @WebMethod(operationName = "PayoutTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/PayoutTransfer")
    @WebResult(name = "PayoutTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "PayoutTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PayoutTransfer")
    @ResponseWrapper(localName = "PayoutTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PayoutTransferResponse")
    public PayoutTransferResponseMessageType payoutTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        PayoutTransferRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetTransferBySourceIDResponseMessageType
     */
    @WebMethod(operationName = "GetTransferBySourceID", action = "http://test.unistream.com/wcflib/ITransferProvider/GetTransferBySourceID")
    @WebResult(name = "GetTransferBySourceIDResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetTransferBySourceID", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransferBySourceID")
    @ResponseWrapper(localName = "GetTransferBySourceIDResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransferBySourceIDResponse")
    public GetTransferBySourceIDResponseMessageType getTransferBySourceID(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetTransferBySourceIDRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetTransferByIDResponseMessageType
     */
    @WebMethod(operationName = "GetTransferByID", action = "http://test.unistream.com/wcflib/ITransferProvider/GetTransferByID")
    @WebResult(name = "GetTransferByIDResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetTransferByID", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransferByID")
    @ResponseWrapper(localName = "GetTransferByIDResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransferByIDResponse")
    public GetTransferByIDResponseMessageType getTransferByID(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetTransferByIDRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.ReturnTransferResponseMessageType
     */
    @WebMethod(operationName = "ReturnTransfer", action = "http://test.unistream.com/wcflib/ITransferProvider/ReturnTransfer")
    @WebResult(name = "ReturnTransferResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "ReturnTransfer", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ReturnTransfer")
    @ResponseWrapper(localName = "ReturnTransferResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ReturnTransferResponse")
    public ReturnTransferResponseMessageType returnTransfer(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        ReturnTransferRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.EstimateMainAmountResponseMessageType
     */
    @WebMethod(operationName = "EstimateMainAmount", action = "http://test.unistream.com/wcflib/ITransferProvider/EstimateMainAmount")
    @WebResult(name = "EstimateMainAmountResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "EstimateMainAmount", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.EstimateMainAmount")
    @ResponseWrapper(localName = "EstimateMainAmountResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.EstimateMainAmountResponse")
    public EstimateMainAmountResponseMessageType estimateMainAmount(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        EstimateMainAmountRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetClearingReportResponseMessageType
     */
    @WebMethod(operationName = "GetClearingReport", action = "http://test.unistream.com/wcflib/ITransferProvider/GetClearingReport")
    @WebResult(name = "GetClearingReportResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetClearingReport", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetClearingReport")
    @ResponseWrapper(localName = "GetClearingReportResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetClearingReportResponse")
    public GetClearingReportResponseMessageType getClearingReport(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetClearingReportRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.ConfirmClearingReportResponseMessageType
     */
    @WebMethod(operationName = "ConfirmClearingReport", action = "http://test.unistream.com/wcflib/ITransferProvider/ConfirmClearingReport")
    @WebResult(name = "ConfirmClearingReportResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "ConfirmClearingReport", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ConfirmClearingReport")
    @ResponseWrapper(localName = "ConfirmClearingReportResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ConfirmClearingReportResponse")
    public ConfirmClearingReportResponseMessageType confirmClearingReport(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        ConfirmClearingReportRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersListResponseMessageType
     */
    @WebMethod(operationName = "GetTransfersList", action = "http://test.unistream.com/wcflib/ITransferProvider/GetTransfersList")
    @WebResult(name = "GetTransfersListResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetTransfersList", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransfersList")
    @ResponseWrapper(localName = "GetTransfersListResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransfersListResponse")
    public GetTransfersListResponseMessageType getTransfersList(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetTransfersListRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetTransfersChangesResponseMessageType
     */
    @WebMethod(operationName = "GetTransfersChanges", action = "http://test.unistream.com/wcflib/ITransferProvider/GetTransfersChanges")
    @WebResult(name = "GetTransfersChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetTransfersChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransfersChanges")
    @ResponseWrapper(localName = "GetTransfersChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTransfersChangesResponse")
    public GetTransfersChangesResponseMessageType getTransfersChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetTransfersChangesRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.InsertTransferWithCardResponseMessageType
     */
    @WebMethod(operationName = "InsertTransferWithCard", action = "http://test.unistream.com/wcflib/ITransferProvider/InsertTransferWithCard")
    @WebResult(name = "InsertTransferWithCardResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "InsertTransferWithCard", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransferWithCard")
    @ResponseWrapper(localName = "InsertTransferWithCardResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertTransferWithCardResponse")
    public InsertTransferWithCardResponseMessageType insertTransferWithCard(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        InsertTransferWithCardRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.CreateSMSConfrmationResponseMessageType
     */
    @WebMethod(operationName = "CreateSmsConfrmation", action = "http://test.unistream.com/wcflib/ITransferProvider/CreateSmsConfrmation")
    @WebResult(name = "CreateSmsConfrmationResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "CreateSmsConfrmation", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreateSmsConfrmation")
    @ResponseWrapper(localName = "CreateSmsConfrmationResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreateSmsConfrmationResponse")
    public CreateSMSConfrmationResponseMessageType createSmsConfrmation(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        CreateSMSConfirmationRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.CheckSMSConfirmationResponseMessageType
     */
    @WebMethod(operationName = "CheckSmsConfirmation", action = "http://test.unistream.com/wcflib/ITransferProvider/CheckSmsConfirmation")
    @WebResult(name = "CheckSmsConfirmationResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "CheckSmsConfirmation", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CheckSmsConfirmation")
    @ResponseWrapper(localName = "CheckSmsConfirmationResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CheckSmsConfirmationResponse")
    public CheckSMSConfirmationResponseMessageType checkSmsConfirmation(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        CheckSMSConfirmationRequestMessageType requestMessage);

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
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.InsertNoticeResponseMessageType
     */
    @WebMethod(operationName = "InsertNotice", action = "http://test.unistream.com/wcflib/INoticeProvider/InsertNotice")
    @WebResult(name = "InsertNoticeResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "InsertNotice", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertNotice")
    @ResponseWrapper(localName = "InsertNoticeResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.InsertNoticeResponse")
    public InsertNoticeResponseMessageType insertNotice(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        InsertNoticeRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.PrepareNoticeResponseMessageType
     */
    @WebMethod(operationName = "PrepareNotice", action = "http://test.unistream.com/wcflib/INoticeProvider/PrepareNotice")
    @WebResult(name = "PrepareNoticeResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "PrepareNotice", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PrepareNotice")
    @ResponseWrapper(localName = "PrepareNoticeResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.PrepareNoticeResponse")
    public PrepareNoticeResponseMessageType prepareNotice(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        PrepareNoticeRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetNoticeByIDResponseMessageType
     */
    @WebMethod(operationName = "GetNoticeByID", action = "http://test.unistream.com/wcflib/INoticeProvider/GetNoticeByID")
    @WebResult(name = "GetNoticeByIDResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetNoticeByID", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticeByID")
    @ResponseWrapper(localName = "GetNoticeByIDResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticeByIDResponse")
    public GetNoticeByIDResponseMessageType getNoticeByID(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetNoticeByIDRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.ApproveNoticeResponseMessageType
     */
    @WebMethod(operationName = "ApproveNotice", action = "http://test.unistream.com/wcflib/INoticeProvider/ApproveNotice")
    @WebResult(name = "ApproveNoticeResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "ApproveNotice", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ApproveNotice")
    @ResponseWrapper(localName = "ApproveNoticeResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.ApproveNoticeResponse")
    public ApproveNoticeResponseMessageType approveNotice(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        ApproveNoticeRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.RejectNoticeResponseMessageType
     */
    @WebMethod(operationName = "RejectNotice", action = "http://test.unistream.com/wcflib/INoticeProvider/RejectNotice")
    @WebResult(name = "RejectNoticeResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "RejectNotice", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.RejectNotice")
    @ResponseWrapper(localName = "RejectNoticeResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.RejectNoticeResponse")
    public RejectNoticeResponseMessageType rejectNotice(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        RejectNoticeRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesListResponseMessageType
     */
    @WebMethod(operationName = "GetNoticesList", action = "http://test.unistream.com/wcflib/INoticeProvider/GetNoticesList")
    @WebResult(name = "GetNoticesListResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetNoticesList", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticesList")
    @ResponseWrapper(localName = "GetNoticesListResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticesListResponse")
    public GetNoticesListResponseMessageType getNoticesList(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetNoticesListRequestMessageType requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib.GetNoticesChangesResponseMessageType
     */
    @WebMethod(operationName = "GetNoticesChanges", action = "http://test.unistream.com/wcflib/INoticeProvider/GetNoticesChanges")
    @WebResult(name = "GetNoticesChangesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetNoticesChanges", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticesChanges")
    @ResponseWrapper(localName = "GetNoticesChangesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetNoticesChangesResponse")
    public GetNoticesChangesResponseMessageType getNoticesChanges(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetNoticesChangesRequestMessageType requestMessage);

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

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetTaxesResponseMessage
     */
    @WebMethod(operationName = "GetTaxes", action = "http://test.unistream.com/wcflib/ITaxProvider/GetTaxes")
    @WebResult(name = "GetTaxesResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetTaxes", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTaxes")
    @ResponseWrapper(localName = "GetTaxesResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetTaxesResponse")
    public GetTaxesResponseMessage getTaxes(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetTaxesRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetCardByNumberResponseMessage
     */
    @WebMethod(operationName = "GetCardByNumber", action = "http://test.unistream.com/wcflib/ICardProvider/GetCardByNumber")
    @WebResult(name = "GetCardByNumberResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetCardByNumber", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetCardByNumber")
    @ResponseWrapper(localName = "GetCardByNumberResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetCardByNumberResponse")
    public GetCardByNumberResponseMessage getCardByNumber(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetCardByNymberRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.IsCardActivatedResponseMessage
     */
    @WebMethod(operationName = "IsCardActivated", action = "http://test.unistream.com/wcflib/ICardProvider/IsCardActivated")
    @WebResult(name = "IsCardActivatedResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "IsCardActivated", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.IsCardActivated")
    @ResponseWrapper(localName = "IsCardActivatedResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.IsCardActivatedResponse")
    public IsCardActivatedResponseMessage isCardActivated(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        IsCardActivatedRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetClientBonusPointsResponseMessage
     */
    @WebMethod(operationName = "GetClientBonusPoints", action = "http://test.unistream.com/wcflib/ICardProvider/GetClientBonusPoints")
    @WebResult(name = "GetClientBonusPointsResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "GetClientBonusPoints", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetClientBonusPoints")
    @ResponseWrapper(localName = "GetClientBonusPointsResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.GetClientBonusPointsResponse")
    public GetClientBonusPointsResponseMessage getClientBonusPoints(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        GetClientBonusPointsRequestMessage requestMessage);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForVirtualPrepaidCardResponseMessage
     */
    @WebMethod(operationName = "CreateAndSendNewPinForPrepaidCard", action = "http://test.unistream.com/wcflib/ICardProvider/CreateAndSendNewPinForPrepaidCard")
    @WebResult(name = "CreateAndSendNewPinForPrepaidCardResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "CreateAndSendNewPinForPrepaidCard", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreateAndSendNewPinForPrepaidCard")
    @ResponseWrapper(localName = "CreateAndSendNewPinForPrepaidCardResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreateAndSendNewPinForPrepaidCardResponse")
    public CreateAndSendNewPinForVirtualPrepaidCardResponseMessage createAndSendNewPinForPrepaidCard(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        CreateAndSendNewPinForVirtualPrepaidCardRequestMessage requestMessage);

    /**
     * 
     * @param requestMesasge
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.AuthenticateClientByCardResponseMessage
     */
    @WebMethod(operationName = "AuthenticateClientbyCard", action = "http://test.unistream.com/wcflib/ICardProvider/AuthenticateClientbyCard")
    @WebResult(name = "AuthenticateClientbyCardResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "AuthenticateClientbyCard", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AuthenticateClientbyCard")
    @ResponseWrapper(localName = "AuthenticateClientbyCardResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.AuthenticateClientbyCardResponse")
    public AuthenticateClientByCardResponseMessage authenticateClientbyCard(
        @WebParam(name = "requestMesasge", targetNamespace = "http://test.unistream.com/wcflib/")
        AuthenticateClientByCardRequestMesasge requestMesasge);

    /**
     * 
     * @param requestMessage
     * @return
     *     returns org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.CreateAndSendNewPinForUnistreamCardResponseMessage
     */
    @WebMethod(operationName = "CreateAndSendNewPinForUnistreamCard", action = "http://test.unistream.com/wcflib/ICardProvider/CreateAndSendNewPinForUnistreamCard")
    @WebResult(name = "CreateAndSendNewPinForUnistreamCardResult", targetNamespace = "http://test.unistream.com/wcflib/")
    @RequestWrapper(localName = "CreateAndSendNewPinForUnistreamCard", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreateAndSendNewPinForUnistreamCard")
    @ResponseWrapper(localName = "CreateAndSendNewPinForUnistreamCardResponse", targetNamespace = "http://test.unistream.com/wcflib/", className = "com.unistream.test.wcflib.CreateAndSendNewPinForUnistreamCardResponse")
    public CreateAndSendNewPinForUnistreamCardResponseMessage createAndSendNewPinForUnistreamCard(
        @WebParam(name = "requestMessage", targetNamespace = "http://test.unistream.com/wcflib/")
        CreateAndSendNewPinForUnistreamCardRequestMessage requestMessage);

}
