
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfLangText;
import org.datacontract.schemas._2004._07.wcfservicelib.BankAddressType;
import org.datacontract.schemas._2004._07.wcfservicelib.PersonType;
import org.datacontract.schemas._2004._07.wcfservicelib.Phone;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcfservicelib_dictionaries package. 
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

    private final static QName _GetBankInfosChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "GetBankInfosChangesRequestMessage");
    private final static QName _GetClientBonusPointsRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "GetClientBonusPointsRequestMessage");
    private final static QName _GetClientBonusPointsResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "GetClientBonusPointsResponseMessage");
    private final static QName _BankBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "BankBase");
    private final static QName _Bank_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Bank");
    private final static QName _CardStatesTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "CardStatesTypes");
    private final static QName _VirtualCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "VirtualCard");
    private final static QName _BankFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "BankFlags");
    private final static QName _GetBanksChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "GetBanksChangesResponseMessage");
    private final static QName _AllowedCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "AllowedCurrency");
    private final static QName _GetBankInfosChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "GetBankInfosChangesResponseMessage");
    private final static QName _Region_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "Region");
    private final static QName _ArrayOfCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "ArrayOfCountry");
    private final static QName _GetCountriesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "GetCountriesResponseMessage");
    private final static QName _GetBankByIDRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "GetBankByIDRequestMessage");
    private final static QName _ArrayOfTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", "ArrayOfTax");
    private final static QName _IsCardActivatedResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "IsCardActivatedResponseMessage");
    private final static QName _AuthenticateClientByCardResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "AuthenticateClientByCardResponseMessage");
    private final static QName _IsCardActivatedRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "IsCardActivatedRequestMessage");
    private final static QName _GetDocumentTypeChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "GetDocumentTypeChangesResponseMessage");
    private final static QName _GetRegionsChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "GetRegionsChangesResponseMessage");
    private final static QName _CreateAndSendNewPinForVirtualPrepaidCardResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "CreateAndSendNewPinForVirtualPrepaidCardResponseMessage");
    private final static QName _CreateAndSendNewPinForVirtualPrepaidCardRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "CreateAndSendNewPinForVirtualPrepaidCardRequestMessage");
    private final static QName _BankType_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "BankType");
    private final static QName _CreateAndSendNewPinForUnistreamCardResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "CreateAndSendNewPinForUnistreamCardResponseMessage");
    private final static QName _FindRBankByBicRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "FindRBankByBicRequestMessage");
    private final static QName _ArrayOfBank_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "ArrayOfBank");
    private final static QName _ArrayOfCardState_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "ArrayOfCardState");
    private final static QName _Direction_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Direction");
    private final static QName _GetBanksChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "GetBanksChangesRequestMessage");
    private final static QName _GetCountriesChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "GetCountriesChangesRequestMessage");
    private final static QName _Tax_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", "Tax");
    private final static QName _BankInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "BankInfo");
    private final static QName _Currency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Currency");
    private final static QName _ArrayOfBankInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "ArrayOfBankInfo");
    private final static QName _GetRegionsChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "GetRegionsChangesRequestMessage");
    private final static QName _ArrayOfCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "ArrayOfCurrency");
    private final static QName _RBank_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "RBank");
    private final static QName _DocumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "DocumentType");
    private final static QName _GetDocumentTypeChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "GetDocumentTypeChangesRequestMessage");
    private final static QName _GetCurrenciesChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "GetCurrenciesChangesRequestMessage");
    private final static QName _GetBankByIDResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "GetBankByIDResponseMessage");
    private final static QName _Country_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Country");
    private final static QName _GetCurrenciesChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "GetCurrenciesChangesResponseMessage");
    private final static QName _CreateAndSendNewPinForUnistreamCardRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "CreateAndSendNewPinForUnistreamCardRequestMessage");
    private final static QName _ArrayOfAllowedCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "ArrayOfAllowedCurrency");
    private final static QName _GetCardByNymberRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "GetCardByNymberRequestMessage");
    private final static QName _GetCountriesChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "GetCountriesChangesResponseMessage");
    private final static QName _FindRegionResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "FindRegionResponseMessage");
    private final static QName _GetTaxesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", "GetTaxesRequestMessage");
    private final static QName _CardStateCategoryTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "CardStateCategoryTypes");
    private final static QName _CardTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "CardTypes");
    private final static QName _ArrayOfRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "ArrayOfRegion");
    private final static QName _GetCountriesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "GetCountriesRequestMessage");
    private final static QName _GetTaxesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", "GetTaxesResponseMessage");
    private final static QName _Card_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "Card");
    private final static QName _GetCardByNumberResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "GetCardByNumberResponseMessage");
    private final static QName _FindRegionRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "FindRegionRequestMessage");
    private final static QName _ArrayOfDocumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "ArrayOfDocumentType");
    private final static QName _CardState_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "CardState");
    private final static QName _AuthenticateClientByCardRequestMesasge_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "AuthenticateClientByCardRequestMesasge");
    private final static QName _FindRBankByBicResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "FindRBankByBicResponseMessage");
    private final static QName _AuthenticateClientByCardRequestMesasgePIN_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "PIN");
    private final static QName _AuthenticateClientByCardRequestMesasgeCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "CardNumber");
    private final static QName _GetBanksChangesResponseMessageTypeBanks_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Banks");
    private final static QName _FindRegionResponseMessageFoundRegions_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "FoundRegions");
    private final static QName _BankInfoRequirements_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Requirements");
    private final static QName _BankInfoCallCenter_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "CallCenter");
    private final static QName _BankInfoCash_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Cash");
    private final static QName _BankInfoDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Document");
    private final static QName _BankInfoInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Information");
    private final static QName _BankInfoAccountDeposit_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "AccountDeposit");
    private final static QName _BankInfoDeliverTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "DeliverTime");
    private final static QName _BankInfoHomeDelivery_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "HomeDelivery");
    private final static QName _BankInfoDeliverCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "DeliverCurrency");
    private final static QName _BankInfoCancelTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "CancelTime");
    private final static QName _BankInfoSendCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "SendCurrency");
    private final static QName _BankInfoLimits_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Limits");
    private final static QName _BankInfoHolidays_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Holidays");
    private final static QName _FindRBankByBicRequestMessageTypeBic_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Bic");
    private final static QName _RegionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "Name");
    private final static QName _AuthenticateClientByCardResponseMessagePerson_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "Person");
    private final static QName _CardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "Number");
    private final static QName _CardStatuses_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "Statuses");
    private final static QName _CardHolderName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", "HolderName");
    private final static QName _GetDocumentTypeChangesResponseMessageDocumentTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "DocumentTypes");
    private final static QName _GetCountriesChangesResponseMessageCountries_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Countries");
    private final static QName _FindRegionRequestMessageMask_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "Mask");
    private final static QName _BankBaseTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Name");
    private final static QName _CurrencyLatin3_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Latin3");
    private final static QName _CurrencyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Name");
    private final static QName _CurrencyDigital_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Digital");
    private final static QName _GetBankInfosChangesResponseMessageBankInfos_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "BankInfos");
    private final static QName _GetCurrenciesChangesResponseMessageCurrencies_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Currencies");
    private final static QName _CountryPhoneCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "PhoneCode");
    private final static QName _CountryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Name");
    private final static QName _CountryDigital_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Digital");
    private final static QName _CountryLatin3_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Latin3");
    private final static QName _CountryLatin2_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Latin2");
    private final static QName _GetRegionsChangesResponseMessageRegions_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "Regions");
    private final static QName _BankTypeAllowedCurrencies_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "AllowedCurrencies");
    private final static QName _BankTypeFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Flags");
    private final static QName _BankTypeAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Address");
    private final static QName _BankTypeSourceID_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "SourceID");
    private final static QName _BankTypePhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Phone");
    private final static QName _RBankTypeCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "City");
    private final static QName _RBankTypeCorrespondentAcc_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "CorrespondentAcc");
    private final static QName _DocumentTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "Name");
    private final static QName _GetTaxesResponseMessageTaxes_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", "Taxes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcfservicelib_dictionaries
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBankByIDRequestMessageType }
     * 
     */
    public GetBankByIDRequestMessageType createGetBankByIDRequestMessageType() {
        return new GetBankByIDRequestMessageType();
    }

    /**
     * Create an instance of {@link GetTaxesRequestMessage }
     * 
     */
    public GetTaxesRequestMessage createGetTaxesRequestMessage() {
        return new GetTaxesRequestMessage();
    }

    /**
     * Create an instance of {@link FindRBankByBicResponseMessageType }
     * 
     */
    public FindRBankByBicResponseMessageType createFindRBankByBicResponseMessageType() {
        return new FindRBankByBicResponseMessageType();
    }

    /**
     * Create an instance of {@link IsCardActivatedResponseMessage }
     * 
     */
    public IsCardActivatedResponseMessage createIsCardActivatedResponseMessage() {
        return new IsCardActivatedResponseMessage();
    }

    /**
     * Create an instance of {@link GetTaxesResponseMessage }
     * 
     */
    public GetTaxesResponseMessage createGetTaxesResponseMessage() {
        return new GetTaxesResponseMessage();
    }

    /**
     * Create an instance of {@link FindRegionResponseMessage }
     * 
     */
    public FindRegionResponseMessage createFindRegionResponseMessage() {
        return new FindRegionResponseMessage();
    }

    /**
     * Create an instance of {@link FindRBankByBicRequestMessageType }
     * 
     */
    public FindRBankByBicRequestMessageType createFindRBankByBicRequestMessageType() {
        return new FindRBankByBicRequestMessageType();
    }

    /**
     * Create an instance of {@link GetRegionsChangesRequestMessage }
     * 
     */
    public GetRegionsChangesRequestMessage createGetRegionsChangesRequestMessage() {
        return new GetRegionsChangesRequestMessage();
    }

    /**
     * Create an instance of {@link GetClientBonusPointsRequestMessage }
     * 
     */
    public GetClientBonusPointsRequestMessage createGetClientBonusPointsRequestMessage() {
        return new GetClientBonusPointsRequestMessage();
    }

    /**
     * Create an instance of {@link GetCountriesChangesRequestMessage }
     * 
     */
    public GetCountriesChangesRequestMessage createGetCountriesChangesRequestMessage() {
        return new GetCountriesChangesRequestMessage();
    }

    /**
     * Create an instance of {@link GetCountriesChangesResponseMessage }
     * 
     */
    public GetCountriesChangesResponseMessage createGetCountriesChangesResponseMessage() {
        return new GetCountriesChangesResponseMessage();
    }

    /**
     * Create an instance of {@link GetCurrenciesChangesRequestMessage }
     * 
     */
    public GetCurrenciesChangesRequestMessage createGetCurrenciesChangesRequestMessage() {
        return new GetCurrenciesChangesRequestMessage();
    }

    /**
     * Create an instance of {@link GetCardByNumberResponseMessage }
     * 
     */
    public GetCardByNumberResponseMessage createGetCardByNumberResponseMessage() {
        return new GetCardByNumberResponseMessage();
    }

    /**
     * Create an instance of {@link GetCountriesResponseMessage }
     * 
     */
    public GetCountriesResponseMessage createGetCountriesResponseMessage() {
        return new GetCountriesResponseMessage();
    }

    /**
     * Create an instance of {@link GetCurrenciesChangesResponseMessage }
     * 
     */
    public GetCurrenciesChangesResponseMessage createGetCurrenciesChangesResponseMessage() {
        return new GetCurrenciesChangesResponseMessage();
    }

    /**
     * Create an instance of {@link CreateAndSendNewPinForVirtualPrepaidCardResponseMessage }
     * 
     */
    public CreateAndSendNewPinForVirtualPrepaidCardResponseMessage createCreateAndSendNewPinForVirtualPrepaidCardResponseMessage() {
        return new CreateAndSendNewPinForVirtualPrepaidCardResponseMessage();
    }

    /**
     * Create an instance of {@link IsCardActivatedRequestMessage }
     * 
     */
    public IsCardActivatedRequestMessage createIsCardActivatedRequestMessage() {
        return new IsCardActivatedRequestMessage();
    }

    /**
     * Create an instance of {@link GetBanksChangesRequestMessageType }
     * 
     */
    public GetBanksChangesRequestMessageType createGetBanksChangesRequestMessageType() {
        return new GetBanksChangesRequestMessageType();
    }

    /**
     * Create an instance of {@link CreateAndSendNewPinForUnistreamCardRequestMessage }
     * 
     */
    public CreateAndSendNewPinForUnistreamCardRequestMessage createCreateAndSendNewPinForUnistreamCardRequestMessage() {
        return new CreateAndSendNewPinForUnistreamCardRequestMessage();
    }

    /**
     * Create an instance of {@link FindRegionRequestMessage }
     * 
     */
    public FindRegionRequestMessage createFindRegionRequestMessage() {
        return new FindRegionRequestMessage();
    }

    /**
     * Create an instance of {@link CreateAndSendNewPinForUnistreamCardResponseMessage }
     * 
     */
    public CreateAndSendNewPinForUnistreamCardResponseMessage createCreateAndSendNewPinForUnistreamCardResponseMessage() {
        return new CreateAndSendNewPinForUnistreamCardResponseMessage();
    }

    /**
     * Create an instance of {@link AuthenticateClientByCardRequestMesasge }
     * 
     */
    public AuthenticateClientByCardRequestMesasge createAuthenticateClientByCardRequestMesasge() {
        return new AuthenticateClientByCardRequestMesasge();
    }

    /**
     * Create an instance of {@link GetBankInfosChangesResponseMessage }
     * 
     */
    public GetBankInfosChangesResponseMessage createGetBankInfosChangesResponseMessage() {
        return new GetBankInfosChangesResponseMessage();
    }

    /**
     * Create an instance of {@link GetClientBonusPointsResponseMessage }
     * 
     */
    public GetClientBonusPointsResponseMessage createGetClientBonusPointsResponseMessage() {
        return new GetClientBonusPointsResponseMessage();
    }

    /**
     * Create an instance of {@link GetCountriesRequestMessage }
     * 
     */
    public GetCountriesRequestMessage createGetCountriesRequestMessage() {
        return new GetCountriesRequestMessage();
    }

    /**
     * Create an instance of {@link GetRegionsChangesResponseMessage }
     * 
     */
    public GetRegionsChangesResponseMessage createGetRegionsChangesResponseMessage() {
        return new GetRegionsChangesResponseMessage();
    }

    /**
     * Create an instance of {@link GetBanksChangesResponseMessageType }
     * 
     */
    public GetBanksChangesResponseMessageType createGetBanksChangesResponseMessageType() {
        return new GetBanksChangesResponseMessageType();
    }

    /**
     * Create an instance of {@link GetDocumentTypeChangesRequestMessage }
     * 
     */
    public GetDocumentTypeChangesRequestMessage createGetDocumentTypeChangesRequestMessage() {
        return new GetDocumentTypeChangesRequestMessage();
    }

    /**
     * Create an instance of {@link GetDocumentTypeChangesResponseMessage }
     * 
     */
    public GetDocumentTypeChangesResponseMessage createGetDocumentTypeChangesResponseMessage() {
        return new GetDocumentTypeChangesResponseMessage();
    }

    /**
     * Create an instance of {@link GetBankByIDResponseMessageType }
     * 
     */
    public GetBankByIDResponseMessageType createGetBankByIDResponseMessageType() {
        return new GetBankByIDResponseMessageType();
    }

    /**
     * Create an instance of {@link GetCardByNymberRequestMessage }
     * 
     */
    public GetCardByNymberRequestMessage createGetCardByNymberRequestMessage() {
        return new GetCardByNymberRequestMessage();
    }

    /**
     * Create an instance of {@link GetBankInfosChangesRequestMessage }
     * 
     */
    public GetBankInfosChangesRequestMessage createGetBankInfosChangesRequestMessage() {
        return new GetBankInfosChangesRequestMessage();
    }

    /**
     * Create an instance of {@link AuthenticateClientByCardResponseMessage }
     * 
     */
    public AuthenticateClientByCardResponseMessage createAuthenticateClientByCardResponseMessage() {
        return new AuthenticateClientByCardResponseMessage();
    }

    /**
     * Create an instance of {@link CreateAndSendNewPinForVirtualPrepaidCardRequestMessage }
     * 
     */
    public CreateAndSendNewPinForVirtualPrepaidCardRequestMessage createCreateAndSendNewPinForVirtualPrepaidCardRequestMessage() {
        return new CreateAndSendNewPinForVirtualPrepaidCardRequestMessage();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link ArrayOfCountry }
     * 
     */
    public ArrayOfCountry createArrayOfCountry() {
        return new ArrayOfCountry();
    }

    /**
     * Create an instance of {@link ArrayOfBankType }
     * 
     */
    public ArrayOfBankType createArrayOfBankType() {
        return new ArrayOfBankType();
    }

    /**
     * Create an instance of {@link BankType }
     * 
     */
    public BankType createBankType() {
        return new BankType();
    }

    /**
     * Create an instance of {@link ArrayOfAllowedCurrencyType }
     * 
     */
    public ArrayOfAllowedCurrencyType createArrayOfAllowedCurrencyType() {
        return new ArrayOfAllowedCurrencyType();
    }

    /**
     * Create an instance of {@link AllowedCurrencyType }
     * 
     */
    public AllowedCurrencyType createAllowedCurrencyType() {
        return new AllowedCurrencyType();
    }

    /**
     * Create an instance of {@link BankFlagsType }
     * 
     */
    public BankFlagsType createBankFlagsType() {
        return new BankFlagsType();
    }

    /**
     * Create an instance of {@link RBankType }
     * 
     */
    public RBankType createRBankType() {
        return new RBankType();
    }

    /**
     * Create an instance of {@link BankBaseType }
     * 
     */
    public BankBaseType createBankBaseType() {
        return new BankBaseType();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link ArrayOfCurrency }
     * 
     */
    public ArrayOfCurrency createArrayOfCurrency() {
        return new ArrayOfCurrency();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link ArrayOfRegion }
     * 
     */
    public ArrayOfRegion createArrayOfRegion() {
        return new ArrayOfRegion();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentType }
     * 
     */
    public ArrayOfDocumentType createArrayOfDocumentType() {
        return new ArrayOfDocumentType();
    }

    /**
     * Create an instance of {@link ArrayOfBankInfo }
     * 
     */
    public ArrayOfBankInfo createArrayOfBankInfo() {
        return new ArrayOfBankInfo();
    }

    /**
     * Create an instance of {@link BankInfo }
     * 
     */
    public BankInfo createBankInfo() {
        return new BankInfo();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link ArrayOfTax }
     * 
     */
    public ArrayOfTax createArrayOfTax() {
        return new ArrayOfTax();
    }

    /**
     * Create an instance of {@link CardState }
     * 
     */
    public CardState createCardState() {
        return new CardState();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link ArrayOfCardState }
     * 
     */
    public ArrayOfCardState createArrayOfCardState() {
        return new ArrayOfCardState();
    }

    /**
     * Create an instance of {@link VirtualCard }
     * 
     */
    public VirtualCard createVirtualCard() {
        return new VirtualCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankInfosChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "GetBankInfosChangesRequestMessage")
    public JAXBElement<GetBankInfosChangesRequestMessage> createGetBankInfosChangesRequestMessage(GetBankInfosChangesRequestMessage value) {
        return new JAXBElement<GetBankInfosChangesRequestMessage>(_GetBankInfosChangesRequestMessage_QNAME, GetBankInfosChangesRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientBonusPointsRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "GetClientBonusPointsRequestMessage")
    public JAXBElement<GetClientBonusPointsRequestMessage> createGetClientBonusPointsRequestMessage(GetClientBonusPointsRequestMessage value) {
        return new JAXBElement<GetClientBonusPointsRequestMessage>(_GetClientBonusPointsRequestMessage_QNAME, GetClientBonusPointsRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientBonusPointsResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "GetClientBonusPointsResponseMessage")
    public JAXBElement<GetClientBonusPointsResponseMessage> createGetClientBonusPointsResponseMessage(GetClientBonusPointsResponseMessage value) {
        return new JAXBElement<GetClientBonusPointsResponseMessage>(_GetClientBonusPointsResponseMessage_QNAME, GetClientBonusPointsResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankBaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "BankBase")
    public JAXBElement<BankBaseType> createBankBase(BankBaseType value) {
        return new JAXBElement<BankBaseType>(_BankBase_QNAME, BankBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Bank")
    public JAXBElement<BankType> createBank(BankType value) {
        return new JAXBElement<BankType>(_Bank_QNAME, BankType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatesTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CardStatesTypes")
    public JAXBElement<CardStatesTypes> createCardStatesTypes(CardStatesTypes value) {
        return new JAXBElement<CardStatesTypes>(_CardStatesTypes_QNAME, CardStatesTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirtualCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "VirtualCard")
    public JAXBElement<VirtualCard> createVirtualCard(VirtualCard value) {
        return new JAXBElement<VirtualCard>(_VirtualCard_QNAME, VirtualCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankFlagsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "BankFlags")
    public JAXBElement<BankFlagsType> createBankFlags(BankFlagsType value) {
        return new JAXBElement<BankFlagsType>(_BankFlags_QNAME, BankFlagsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanksChangesResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "GetBanksChangesResponseMessage")
    public JAXBElement<GetBanksChangesResponseMessageType> createGetBanksChangesResponseMessage(GetBanksChangesResponseMessageType value) {
        return new JAXBElement<GetBanksChangesResponseMessageType>(_GetBanksChangesResponseMessage_QNAME, GetBanksChangesResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedCurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "AllowedCurrency")
    public JAXBElement<AllowedCurrencyType> createAllowedCurrency(AllowedCurrencyType value) {
        return new JAXBElement<AllowedCurrencyType>(_AllowedCurrency_QNAME, AllowedCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankInfosChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "GetBankInfosChangesResponseMessage")
    public JAXBElement<GetBankInfosChangesResponseMessage> createGetBankInfosChangesResponseMessage(GetBankInfosChangesResponseMessage value) {
        return new JAXBElement<GetBankInfosChangesResponseMessage>(_GetBankInfosChangesResponseMessage_QNAME, GetBankInfosChangesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Region }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "Region")
    public JAXBElement<Region> createRegion(Region value) {
        return new JAXBElement<Region>(_Region_QNAME, Region.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "ArrayOfCountry")
    public JAXBElement<ArrayOfCountry> createArrayOfCountry(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_ArrayOfCountry_QNAME, ArrayOfCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "GetCountriesResponseMessage")
    public JAXBElement<GetCountriesResponseMessage> createGetCountriesResponseMessage(GetCountriesResponseMessage value) {
        return new JAXBElement<GetCountriesResponseMessage>(_GetCountriesResponseMessage_QNAME, GetCountriesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankByIDRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "GetBankByIDRequestMessage")
    public JAXBElement<GetBankByIDRequestMessageType> createGetBankByIDRequestMessage(GetBankByIDRequestMessageType value) {
        return new JAXBElement<GetBankByIDRequestMessageType>(_GetBankByIDRequestMessage_QNAME, GetBankByIDRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", name = "ArrayOfTax")
    public JAXBElement<ArrayOfTax> createArrayOfTax(ArrayOfTax value) {
        return new JAXBElement<ArrayOfTax>(_ArrayOfTax_QNAME, ArrayOfTax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCardActivatedResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "IsCardActivatedResponseMessage")
    public JAXBElement<IsCardActivatedResponseMessage> createIsCardActivatedResponseMessage(IsCardActivatedResponseMessage value) {
        return new JAXBElement<IsCardActivatedResponseMessage>(_IsCardActivatedResponseMessage_QNAME, IsCardActivatedResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateClientByCardResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "AuthenticateClientByCardResponseMessage")
    public JAXBElement<AuthenticateClientByCardResponseMessage> createAuthenticateClientByCardResponseMessage(AuthenticateClientByCardResponseMessage value) {
        return new JAXBElement<AuthenticateClientByCardResponseMessage>(_AuthenticateClientByCardResponseMessage_QNAME, AuthenticateClientByCardResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsCardActivatedRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "IsCardActivatedRequestMessage")
    public JAXBElement<IsCardActivatedRequestMessage> createIsCardActivatedRequestMessage(IsCardActivatedRequestMessage value) {
        return new JAXBElement<IsCardActivatedRequestMessage>(_IsCardActivatedRequestMessage_QNAME, IsCardActivatedRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentTypeChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", name = "GetDocumentTypeChangesResponseMessage")
    public JAXBElement<GetDocumentTypeChangesResponseMessage> createGetDocumentTypeChangesResponseMessage(GetDocumentTypeChangesResponseMessage value) {
        return new JAXBElement<GetDocumentTypeChangesResponseMessage>(_GetDocumentTypeChangesResponseMessage_QNAME, GetDocumentTypeChangesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionsChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "GetRegionsChangesResponseMessage")
    public JAXBElement<GetRegionsChangesResponseMessage> createGetRegionsChangesResponseMessage(GetRegionsChangesResponseMessage value) {
        return new JAXBElement<GetRegionsChangesResponseMessage>(_GetRegionsChangesResponseMessage_QNAME, GetRegionsChangesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForVirtualPrepaidCardResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CreateAndSendNewPinForVirtualPrepaidCardResponseMessage")
    public JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardResponseMessage> createCreateAndSendNewPinForVirtualPrepaidCardResponseMessage(CreateAndSendNewPinForVirtualPrepaidCardResponseMessage value) {
        return new JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardResponseMessage>(_CreateAndSendNewPinForVirtualPrepaidCardResponseMessage_QNAME, CreateAndSendNewPinForVirtualPrepaidCardResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForVirtualPrepaidCardRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CreateAndSendNewPinForVirtualPrepaidCardRequestMessage")
    public JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardRequestMessage> createCreateAndSendNewPinForVirtualPrepaidCardRequestMessage(CreateAndSendNewPinForVirtualPrepaidCardRequestMessage value) {
        return new JAXBElement<CreateAndSendNewPinForVirtualPrepaidCardRequestMessage>(_CreateAndSendNewPinForVirtualPrepaidCardRequestMessage_QNAME, CreateAndSendNewPinForVirtualPrepaidCardRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "BankType")
    public JAXBElement<BankTypeType> createBankType(BankTypeType value) {
        return new JAXBElement<BankTypeType>(_BankType_QNAME, BankTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForUnistreamCardResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CreateAndSendNewPinForUnistreamCardResponseMessage")
    public JAXBElement<CreateAndSendNewPinForUnistreamCardResponseMessage> createCreateAndSendNewPinForUnistreamCardResponseMessage(CreateAndSendNewPinForUnistreamCardResponseMessage value) {
        return new JAXBElement<CreateAndSendNewPinForUnistreamCardResponseMessage>(_CreateAndSendNewPinForUnistreamCardResponseMessage_QNAME, CreateAndSendNewPinForUnistreamCardResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRBankByBicRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "FindRBankByBicRequestMessage")
    public JAXBElement<FindRBankByBicRequestMessageType> createFindRBankByBicRequestMessage(FindRBankByBicRequestMessageType value) {
        return new JAXBElement<FindRBankByBicRequestMessageType>(_FindRBankByBicRequestMessage_QNAME, FindRBankByBicRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "ArrayOfBank")
    public JAXBElement<ArrayOfBankType> createArrayOfBank(ArrayOfBankType value) {
        return new JAXBElement<ArrayOfBankType>(_ArrayOfBank_QNAME, ArrayOfBankType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCardState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "ArrayOfCardState")
    public JAXBElement<ArrayOfCardState> createArrayOfCardState(ArrayOfCardState value) {
        return new JAXBElement<ArrayOfCardState>(_ArrayOfCardState_QNAME, ArrayOfCardState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Direction")
    public JAXBElement<DirectionType> createDirection(DirectionType value) {
        return new JAXBElement<DirectionType>(_Direction_QNAME, DirectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanksChangesRequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "GetBanksChangesRequestMessage")
    public JAXBElement<GetBanksChangesRequestMessageType> createGetBanksChangesRequestMessage(GetBanksChangesRequestMessageType value) {
        return new JAXBElement<GetBanksChangesRequestMessageType>(_GetBanksChangesRequestMessage_QNAME, GetBanksChangesRequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "GetCountriesChangesRequestMessage")
    public JAXBElement<GetCountriesChangesRequestMessage> createGetCountriesChangesRequestMessage(GetCountriesChangesRequestMessage value) {
        return new JAXBElement<GetCountriesChangesRequestMessage>(_GetCountriesChangesRequestMessage_QNAME, GetCountriesChangesRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", name = "Tax")
    public JAXBElement<Tax> createTax(Tax value) {
        return new JAXBElement<Tax>(_Tax_QNAME, Tax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "BankInfo")
    public JAXBElement<BankInfo> createBankInfo(BankInfo value) {
        return new JAXBElement<BankInfo>(_BankInfo_QNAME, BankInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "Currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBankInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "ArrayOfBankInfo")
    public JAXBElement<ArrayOfBankInfo> createArrayOfBankInfo(ArrayOfBankInfo value) {
        return new JAXBElement<ArrayOfBankInfo>(_ArrayOfBankInfo_QNAME, ArrayOfBankInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionsChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "GetRegionsChangesRequestMessage")
    public JAXBElement<GetRegionsChangesRequestMessage> createGetRegionsChangesRequestMessage(GetRegionsChangesRequestMessage value) {
        return new JAXBElement<GetRegionsChangesRequestMessage>(_GetRegionsChangesRequestMessage_QNAME, GetRegionsChangesRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "ArrayOfCurrency")
    public JAXBElement<ArrayOfCurrency> createArrayOfCurrency(ArrayOfCurrency value) {
        return new JAXBElement<ArrayOfCurrency>(_ArrayOfCurrency_QNAME, ArrayOfCurrency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RBankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "RBank")
    public JAXBElement<RBankType> createRBank(RBankType value) {
        return new JAXBElement<RBankType>(_RBank_QNAME, RBankType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", name = "DocumentType")
    public JAXBElement<DocumentType> createDocumentType(DocumentType value) {
        return new JAXBElement<DocumentType>(_DocumentType_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentTypeChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", name = "GetDocumentTypeChangesRequestMessage")
    public JAXBElement<GetDocumentTypeChangesRequestMessage> createGetDocumentTypeChangesRequestMessage(GetDocumentTypeChangesRequestMessage value) {
        return new JAXBElement<GetDocumentTypeChangesRequestMessage>(_GetDocumentTypeChangesRequestMessage_QNAME, GetDocumentTypeChangesRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrenciesChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "GetCurrenciesChangesRequestMessage")
    public JAXBElement<GetCurrenciesChangesRequestMessage> createGetCurrenciesChangesRequestMessage(GetCurrenciesChangesRequestMessage value) {
        return new JAXBElement<GetCurrenciesChangesRequestMessage>(_GetCurrenciesChangesRequestMessage_QNAME, GetCurrenciesChangesRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankByIDResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "GetBankByIDResponseMessage")
    public JAXBElement<GetBankByIDResponseMessageType> createGetBankByIDResponseMessage(GetBankByIDResponseMessageType value) {
        return new JAXBElement<GetBankByIDResponseMessageType>(_GetBankByIDResponseMessage_QNAME, GetBankByIDResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Country }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Country")
    public JAXBElement<Country> createCountry(Country value) {
        return new JAXBElement<Country>(_Country_QNAME, Country.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrenciesChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "GetCurrenciesChangesResponseMessage")
    public JAXBElement<GetCurrenciesChangesResponseMessage> createGetCurrenciesChangesResponseMessage(GetCurrenciesChangesResponseMessage value) {
        return new JAXBElement<GetCurrenciesChangesResponseMessage>(_GetCurrenciesChangesResponseMessage_QNAME, GetCurrenciesChangesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAndSendNewPinForUnistreamCardRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CreateAndSendNewPinForUnistreamCardRequestMessage")
    public JAXBElement<CreateAndSendNewPinForUnistreamCardRequestMessage> createCreateAndSendNewPinForUnistreamCardRequestMessage(CreateAndSendNewPinForUnistreamCardRequestMessage value) {
        return new JAXBElement<CreateAndSendNewPinForUnistreamCardRequestMessage>(_CreateAndSendNewPinForUnistreamCardRequestMessage_QNAME, CreateAndSendNewPinForUnistreamCardRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAllowedCurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "ArrayOfAllowedCurrency")
    public JAXBElement<ArrayOfAllowedCurrencyType> createArrayOfAllowedCurrency(ArrayOfAllowedCurrencyType value) {
        return new JAXBElement<ArrayOfAllowedCurrencyType>(_ArrayOfAllowedCurrency_QNAME, ArrayOfAllowedCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardByNymberRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "GetCardByNymberRequestMessage")
    public JAXBElement<GetCardByNymberRequestMessage> createGetCardByNymberRequestMessage(GetCardByNymberRequestMessage value) {
        return new JAXBElement<GetCardByNymberRequestMessage>(_GetCardByNymberRequestMessage_QNAME, GetCardByNymberRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "GetCountriesChangesResponseMessage")
    public JAXBElement<GetCountriesChangesResponseMessage> createGetCountriesChangesResponseMessage(GetCountriesChangesResponseMessage value) {
        return new JAXBElement<GetCountriesChangesResponseMessage>(_GetCountriesChangesResponseMessage_QNAME, GetCountriesChangesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegionResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "FindRegionResponseMessage")
    public JAXBElement<FindRegionResponseMessage> createFindRegionResponseMessage(FindRegionResponseMessage value) {
        return new JAXBElement<FindRegionResponseMessage>(_FindRegionResponseMessage_QNAME, FindRegionResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", name = "GetTaxesRequestMessage")
    public JAXBElement<GetTaxesRequestMessage> createGetTaxesRequestMessage(GetTaxesRequestMessage value) {
        return new JAXBElement<GetTaxesRequestMessage>(_GetTaxesRequestMessage_QNAME, GetTaxesRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStateCategoryTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CardStateCategoryTypes")
    public JAXBElement<CardStateCategoryTypes> createCardStateCategoryTypes(CardStateCategoryTypes value) {
        return new JAXBElement<CardStateCategoryTypes>(_CardStateCategoryTypes_QNAME, CardStateCategoryTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CardTypes")
    public JAXBElement<CardTypes> createCardTypes(CardTypes value) {
        return new JAXBElement<CardTypes>(_CardTypes_QNAME, CardTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "ArrayOfRegion")
    public JAXBElement<ArrayOfRegion> createArrayOfRegion(ArrayOfRegion value) {
        return new JAXBElement<ArrayOfRegion>(_ArrayOfRegion_QNAME, ArrayOfRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "GetCountriesRequestMessage")
    public JAXBElement<GetCountriesRequestMessage> createGetCountriesRequestMessage(GetCountriesRequestMessage value) {
        return new JAXBElement<GetCountriesRequestMessage>(_GetCountriesRequestMessage_QNAME, GetCountriesRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", name = "GetTaxesResponseMessage")
    public JAXBElement<GetTaxesResponseMessage> createGetTaxesResponseMessage(GetTaxesResponseMessage value) {
        return new JAXBElement<GetTaxesResponseMessage>(_GetTaxesResponseMessage_QNAME, GetTaxesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Card }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "Card")
    public JAXBElement<Card> createCard(Card value) {
        return new JAXBElement<Card>(_Card_QNAME, Card.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardByNumberResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "GetCardByNumberResponseMessage")
    public JAXBElement<GetCardByNumberResponseMessage> createGetCardByNumberResponseMessage(GetCardByNumberResponseMessage value) {
        return new JAXBElement<GetCardByNumberResponseMessage>(_GetCardByNumberResponseMessage_QNAME, GetCardByNumberResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegionRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "FindRegionRequestMessage")
    public JAXBElement<FindRegionRequestMessage> createFindRegionRequestMessage(FindRegionRequestMessage value) {
        return new JAXBElement<FindRegionRequestMessage>(_FindRegionRequestMessage_QNAME, FindRegionRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", name = "ArrayOfDocumentType")
    public JAXBElement<ArrayOfDocumentType> createArrayOfDocumentType(ArrayOfDocumentType value) {
        return new JAXBElement<ArrayOfDocumentType>(_ArrayOfDocumentType_QNAME, ArrayOfDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CardState")
    public JAXBElement<CardState> createCardState(CardState value) {
        return new JAXBElement<CardState>(_CardState_QNAME, CardState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateClientByCardRequestMesasge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "AuthenticateClientByCardRequestMesasge")
    public JAXBElement<AuthenticateClientByCardRequestMesasge> createAuthenticateClientByCardRequestMesasge(AuthenticateClientByCardRequestMesasge value) {
        return new JAXBElement<AuthenticateClientByCardRequestMesasge>(_AuthenticateClientByCardRequestMesasge_QNAME, AuthenticateClientByCardRequestMesasge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRBankByBicResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "FindRBankByBicResponseMessage")
    public JAXBElement<FindRBankByBicResponseMessageType> createFindRBankByBicResponseMessage(FindRBankByBicResponseMessageType value) {
        return new JAXBElement<FindRBankByBicResponseMessageType>(_FindRBankByBicResponseMessage_QNAME, FindRBankByBicResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "PIN", scope = AuthenticateClientByCardRequestMesasge.class)
    public JAXBElement<String> createAuthenticateClientByCardRequestMesasgePIN(String value) {
        return new JAXBElement<String>(_AuthenticateClientByCardRequestMesasgePIN_QNAME, String.class, AuthenticateClientByCardRequestMesasge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CardNumber", scope = AuthenticateClientByCardRequestMesasge.class)
    public JAXBElement<String> createAuthenticateClientByCardRequestMesasgeCardNumber(String value) {
        return new JAXBElement<String>(_AuthenticateClientByCardRequestMesasgeCardNumber_QNAME, String.class, AuthenticateClientByCardRequestMesasge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CardNumber", scope = CreateAndSendNewPinForVirtualPrepaidCardRequestMessage.class)
    public JAXBElement<String> createCreateAndSendNewPinForVirtualPrepaidCardRequestMessageCardNumber(String value) {
        return new JAXBElement<String>(_AuthenticateClientByCardRequestMesasgeCardNumber_QNAME, String.class, CreateAndSendNewPinForVirtualPrepaidCardRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Banks", scope = GetBanksChangesResponseMessageType.class)
    public JAXBElement<ArrayOfBankType> createGetBanksChangesResponseMessageTypeBanks(ArrayOfBankType value) {
        return new JAXBElement<ArrayOfBankType>(_GetBanksChangesResponseMessageTypeBanks_QNAME, ArrayOfBankType.class, GetBanksChangesResponseMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "FoundRegions", scope = FindRegionResponseMessage.class)
    public JAXBElement<ArrayOfRegion> createFindRegionResponseMessageFoundRegions(ArrayOfRegion value) {
        return new JAXBElement<ArrayOfRegion>(_FindRegionResponseMessageFoundRegions_QNAME, ArrayOfRegion.class, FindRegionResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "Requirements", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoRequirements(String value) {
        return new JAXBElement<String>(_BankInfoRequirements_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "CallCenter", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoCallCenter(String value) {
        return new JAXBElement<String>(_BankInfoCallCenter_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "Cash", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoCash(String value) {
        return new JAXBElement<String>(_BankInfoCash_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "Document", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoDocument(String value) {
        return new JAXBElement<String>(_BankInfoDocument_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "Information", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoInformation(String value) {
        return new JAXBElement<String>(_BankInfoInformation_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "AccountDeposit", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoAccountDeposit(String value) {
        return new JAXBElement<String>(_BankInfoAccountDeposit_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "DeliverTime", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoDeliverTime(String value) {
        return new JAXBElement<String>(_BankInfoDeliverTime_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "HomeDelivery", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoHomeDelivery(String value) {
        return new JAXBElement<String>(_BankInfoHomeDelivery_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "DeliverCurrency", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoDeliverCurrency(String value) {
        return new JAXBElement<String>(_BankInfoDeliverCurrency_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "CancelTime", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoCancelTime(String value) {
        return new JAXBElement<String>(_BankInfoCancelTime_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "SendCurrency", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoSendCurrency(String value) {
        return new JAXBElement<String>(_BankInfoSendCurrency_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "Limits", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoLimits(String value) {
        return new JAXBElement<String>(_BankInfoLimits_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "Holidays", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoHolidays(String value) {
        return new JAXBElement<String>(_BankInfoHolidays_QNAME, String.class, BankInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Bic", scope = FindRBankByBicRequestMessageType.class)
    public JAXBElement<String> createFindRBankByBicRequestMessageTypeBic(String value) {
        return new JAXBElement<String>(_FindRBankByBicRequestMessageTypeBic_QNAME, String.class, FindRBankByBicRequestMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Card }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "Card", scope = GetCardByNumberResponseMessage.class)
    public JAXBElement<Card> createGetCardByNumberResponseMessageCard(Card value) {
        return new JAXBElement<Card>(_Card_QNAME, Card.class, GetCardByNumberResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLangText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "Name", scope = Region.class)
    public JAXBElement<ArrayOfLangText> createRegionName(ArrayOfLangText value) {
        return new JAXBElement<ArrayOfLangText>(_RegionName_QNAME, ArrayOfLangText.class, Region.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "Person", scope = AuthenticateClientByCardResponseMessage.class)
    public JAXBElement<PersonType> createAuthenticateClientByCardResponseMessagePerson(PersonType value) {
        return new JAXBElement<PersonType>(_AuthenticateClientByCardResponseMessagePerson_QNAME, PersonType.class, AuthenticateClientByCardResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "Number", scope = Card.class)
    public JAXBElement<String> createCardNumber(String value) {
        return new JAXBElement<String>(_CardNumber_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCardState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "Statuses", scope = Card.class)
    public JAXBElement<ArrayOfCardState> createCardStatuses(ArrayOfCardState value) {
        return new JAXBElement<ArrayOfCardState>(_CardStatuses_QNAME, ArrayOfCardState.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "HolderName", scope = Card.class)
    public JAXBElement<String> createCardHolderName(String value) {
        return new JAXBElement<String>(_CardHolderName_QNAME, String.class, Card.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CardNumber", scope = CreateAndSendNewPinForUnistreamCardRequestMessage.class)
    public JAXBElement<String> createCreateAndSendNewPinForUnistreamCardRequestMessageCardNumber(String value) {
        return new JAXBElement<String>(_AuthenticateClientByCardRequestMesasgeCardNumber_QNAME, String.class, CreateAndSendNewPinForUnistreamCardRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Card }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "Card", scope = IsCardActivatedResponseMessage.class)
    public JAXBElement<Card> createIsCardActivatedResponseMessageCard(Card value) {
        return new JAXBElement<Card>(_Card_QNAME, Card.class, IsCardActivatedResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", name = "DocumentTypes", scope = GetDocumentTypeChangesResponseMessage.class)
    public JAXBElement<ArrayOfDocumentType> createGetDocumentTypeChangesResponseMessageDocumentTypes(ArrayOfDocumentType value) {
        return new JAXBElement<ArrayOfDocumentType>(_GetDocumentTypeChangesResponseMessageDocumentTypes_QNAME, ArrayOfDocumentType.class, GetDocumentTypeChangesResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Countries", scope = GetCountriesChangesResponseMessage.class)
    public JAXBElement<ArrayOfCountry> createGetCountriesChangesResponseMessageCountries(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_GetCountriesChangesResponseMessageCountries_QNAME, ArrayOfCountry.class, GetCountriesChangesResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "Mask", scope = FindRegionRequestMessage.class)
    public JAXBElement<String> createFindRegionRequestMessageMask(String value) {
        return new JAXBElement<String>(_FindRegionRequestMessageMask_QNAME, String.class, FindRegionRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Name", scope = BankBaseType.class)
    public JAXBElement<String> createBankBaseTypeName(String value) {
        return new JAXBElement<String>(_BankBaseTypeName_QNAME, String.class, BankBaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "Latin3", scope = Currency.class)
    public JAXBElement<String> createCurrencyLatin3(String value) {
        return new JAXBElement<String>(_CurrencyLatin3_QNAME, String.class, Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLangText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "Name", scope = Currency.class)
    public JAXBElement<ArrayOfLangText> createCurrencyName(ArrayOfLangText value) {
        return new JAXBElement<ArrayOfLangText>(_CurrencyName_QNAME, ArrayOfLangText.class, Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "Digital", scope = Currency.class)
    public JAXBElement<String> createCurrencyDigital(String value) {
        return new JAXBElement<String>(_CurrencyDigital_QNAME, String.class, Currency.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Bank", scope = GetBankByIDResponseMessageType.class)
    public JAXBElement<BankType> createGetBankByIDResponseMessageTypeBank(BankType value) {
        return new JAXBElement<BankType>(_Bank_QNAME, BankType.class, GetBankByIDResponseMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Countries", scope = GetCountriesResponseMessage.class)
    public JAXBElement<ArrayOfCountry> createGetCountriesResponseMessageCountries(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_GetCountriesChangesResponseMessageCountries_QNAME, ArrayOfCountry.class, GetCountriesResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CardNumber", scope = GetCardByNymberRequestMessage.class)
    public JAXBElement<String> createGetCardByNymberRequestMessageCardNumber(String value) {
        return new JAXBElement<String>(_AuthenticateClientByCardRequestMesasgeCardNumber_QNAME, String.class, GetCardByNymberRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBankInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "BankInfos", scope = GetBankInfosChangesResponseMessage.class)
    public JAXBElement<ArrayOfBankInfo> createGetBankInfosChangesResponseMessageBankInfos(ArrayOfBankInfo value) {
        return new JAXBElement<ArrayOfBankInfo>(_GetBankInfosChangesResponseMessageBankInfos_QNAME, ArrayOfBankInfo.class, GetBankInfosChangesResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "Currencies", scope = GetCurrenciesChangesResponseMessage.class)
    public JAXBElement<ArrayOfCurrency> createGetCurrenciesChangesResponseMessageCurrencies(ArrayOfCurrency value) {
        return new JAXBElement<ArrayOfCurrency>(_GetCurrenciesChangesResponseMessageCurrencies_QNAME, ArrayOfCurrency.class, GetCurrenciesChangesResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RBankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "RBank", scope = FindRBankByBicResponseMessageType.class)
    public JAXBElement<RBankType> createFindRBankByBicResponseMessageTypeRBank(RBankType value) {
        return new JAXBElement<RBankType>(_RBank_QNAME, RBankType.class, FindRBankByBicResponseMessageType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Card", name = "CardNumber", scope = IsCardActivatedRequestMessage.class)
    public JAXBElement<String> createIsCardActivatedRequestMessageCardNumber(String value) {
        return new JAXBElement<String>(_AuthenticateClientByCardRequestMesasgeCardNumber_QNAME, String.class, IsCardActivatedRequestMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "PhoneCode", scope = Country.class)
    public JAXBElement<String> createCountryPhoneCode(String value) {
        return new JAXBElement<String>(_CountryPhoneCode_QNAME, String.class, Country.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLangText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Name", scope = Country.class)
    public JAXBElement<ArrayOfLangText> createCountryName(ArrayOfLangText value) {
        return new JAXBElement<ArrayOfLangText>(_CountryName_QNAME, ArrayOfLangText.class, Country.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Digital", scope = Country.class)
    public JAXBElement<String> createCountryDigital(String value) {
        return new JAXBElement<String>(_CountryDigital_QNAME, String.class, Country.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Latin3", scope = Country.class)
    public JAXBElement<String> createCountryLatin3(String value) {
        return new JAXBElement<String>(_CountryLatin3_QNAME, String.class, Country.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Latin2", scope = Country.class)
    public JAXBElement<String> createCountryLatin2(String value) {
        return new JAXBElement<String>(_CountryLatin2_QNAME, String.class, Country.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "Regions", scope = GetRegionsChangesResponseMessage.class)
    public JAXBElement<ArrayOfRegion> createGetRegionsChangesResponseMessageRegions(ArrayOfRegion value) {
        return new JAXBElement<ArrayOfRegion>(_GetRegionsChangesResponseMessageRegions_QNAME, ArrayOfRegion.class, GetRegionsChangesResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAllowedCurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "AllowedCurrencies", scope = BankType.class)
    public JAXBElement<ArrayOfAllowedCurrencyType> createBankTypeAllowedCurrencies(ArrayOfAllowedCurrencyType value) {
        return new JAXBElement<ArrayOfAllowedCurrencyType>(_BankTypeAllowedCurrencies_QNAME, ArrayOfAllowedCurrencyType.class, BankType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankFlagsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Flags", scope = BankType.class)
    public JAXBElement<BankFlagsType> createBankTypeFlags(BankFlagsType value) {
        return new JAXBElement<BankFlagsType>(_BankTypeFlags_QNAME, BankFlagsType.class, BankType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLangText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Name", scope = BankType.class)
    public JAXBElement<ArrayOfLangText> createBankTypeName(ArrayOfLangText value) {
        return new JAXBElement<ArrayOfLangText>(_BankBaseTypeName_QNAME, ArrayOfLangText.class, BankType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Address", scope = BankType.class)
    public JAXBElement<BankAddressType> createBankTypeAddress(BankAddressType value) {
        return new JAXBElement<BankAddressType>(_BankTypeAddress_QNAME, BankAddressType.class, BankType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "SourceID", scope = BankType.class)
    public JAXBElement<String> createBankTypeSourceID(String value) {
        return new JAXBElement<String>(_BankTypeSourceID_QNAME, String.class, BankType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Phone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Phone", scope = BankType.class)
    public JAXBElement<Phone> createBankTypePhone(Phone value) {
        return new JAXBElement<Phone>(_BankTypePhone_QNAME, Phone.class, BankType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "City", scope = RBankType.class)
    public JAXBElement<String> createRBankTypeCity(String value) {
        return new JAXBElement<String>(_RBankTypeCity_QNAME, String.class, RBankType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Bic", scope = RBankType.class)
    public JAXBElement<String> createRBankTypeBic(String value) {
        return new JAXBElement<String>(_FindRBankByBicRequestMessageTypeBic_QNAME, String.class, RBankType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "CorrespondentAcc", scope = RBankType.class)
    public JAXBElement<String> createRBankTypeCorrespondentAcc(String value) {
        return new JAXBElement<String>(_RBankTypeCorrespondentAcc_QNAME, String.class, RBankType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLangText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", name = "Name", scope = DocumentType.class)
    public JAXBElement<ArrayOfLangText> createDocumentTypeName(ArrayOfLangText value) {
        return new JAXBElement<ArrayOfLangText>(_DocumentTypeName_QNAME, ArrayOfLangText.class, DocumentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Tax", name = "Taxes", scope = GetTaxesResponseMessage.class)
    public JAXBElement<ArrayOfTax> createGetTaxesResponseMessageTaxes(ArrayOfTax value) {
        return new JAXBElement<ArrayOfTax>(_GetTaxesResponseMessageTaxes_QNAME, ArrayOfTax.class, GetTaxesResponseMessage.class, value);
    }

}
