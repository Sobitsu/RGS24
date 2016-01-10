
package org.datacontract.schemas._2004._07.wcfservicelib_dictionaries;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfservicelib.ArrayOfLangText;
import org.datacontract.schemas._2004._07.wcfservicelib.BankAddress;
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

    private final static QName _GetBanksChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "GetBanksChangesRequestMessage");
    private final static QName _GetCountriesChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "GetCountriesChangesResponseMessage");
    private final static QName _DocumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "DocumentType");
    private final static QName _Country_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Country");
    private final static QName _GetBankByIDRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "GetBankByIDRequestMessage");
    private final static QName _ArrayOfDocumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "ArrayOfDocumentType");
    private final static QName _ArrayOfRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "ArrayOfRegion");
    private final static QName _ArrayOfBankInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "ArrayOfBankInfo");
    private final static QName _GetCountriesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "GetCountriesRequestMessage");
    private final static QName _GetDocumentTypeChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "GetDocumentTypeChangesRequestMessage");
    private final static QName _Currency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Currency");
    private final static QName _GetRegionsChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "GetRegionsChangesResponseMessage");
    private final static QName _GetBankInfosChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "GetBankInfosChangesResponseMessage");
    private final static QName _GetBanksChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "GetBanksChangesResponseMessage");
    private final static QName _FindRegionResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "FindRegionResponseMessage");
    private final static QName _Bank_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Bank");
    private final static QName _ArrayOfBank_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "ArrayOfBank");
    private final static QName _Region_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "Region");
    private final static QName _GetCurrenciesChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "GetCurrenciesChangesResponseMessage");
    private final static QName _GetBankByIDResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "GetBankByIDResponseMessage");
    private final static QName _ArrayOfAllowedCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "ArrayOfAllowedCurrency");
    private final static QName _GetDocumentTypeChangesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "GetDocumentTypeChangesResponseMessage");
    private final static QName _GetCountriesResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "GetCountriesResponseMessage");
    private final static QName _BankType_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "BankType");
    private final static QName _Direction_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Direction");
    private final static QName _AllowedCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "AllowedCurrency");
    private final static QName _GetCurrenciesChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "GetCurrenciesChangesRequestMessage");
    private final static QName _ArrayOfCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "ArrayOfCurrency");
    private final static QName _GetCountriesChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "GetCountriesChangesRequestMessage");
    private final static QName _FindRegionRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "FindRegionRequestMessage");
    private final static QName _GetRegionsChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "GetRegionsChangesRequestMessage");
    private final static QName _ArrayOfCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "ArrayOfCountry");
    private final static QName _GetBankInfosChangesRequestMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "GetBankInfosChangesRequestMessage");
    private final static QName _BankInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "BankInfo");
    private final static QName _GetBankInfosChangesResponseMessageBankInfos_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "BankInfos");
    private final static QName _BankInfoHomeDelivery_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "HomeDelivery");
    private final static QName _BankInfoDocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Document");
    private final static QName _BankInfoCancelTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "CancelTime");
    private final static QName _BankInfoRequirements_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Requirements");
    private final static QName _BankInfoLimits_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Limits");
    private final static QName _BankInfoHolidays_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Holidays");
    private final static QName _BankInfoAccountDeposit_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "AccountDeposit");
    private final static QName _BankInfoInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Information");
    private final static QName _BankInfoCallCenter_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "CallCenter");
    private final static QName _BankInfoSendCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "SendCurrency");
    private final static QName _BankInfoDeliverCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "DeliverCurrency");
    private final static QName _BankInfoDeliverTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "DeliverTime");
    private final static QName _BankInfoCash_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", "Cash");
    private final static QName _CurrencyDigital_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Digital");
    private final static QName _CurrencyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Name");
    private final static QName _CurrencyLatin3_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Latin3");
    private final static QName _FindRegionRequestMessageMask_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "Mask");
    private final static QName _FindRegionResponseMessageFoundRegions_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "FoundRegions");
    private final static QName _RegionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "Name");
    private final static QName _GetCurrenciesChangesResponseMessageCurrencies_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", "Currencies");
    private final static QName _GetRegionsChangesResponseMessageRegions_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", "Regions");
    private final static QName _GetCountriesChangesResponseMessageCountries_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Countries");
    private final static QName _CountryDigital_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Digital");
    private final static QName _CountryPhoneCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "PhoneCode");
    private final static QName _CountryLatin2_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Latin2");
    private final static QName _CountryLatin3_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Latin3");
    private final static QName _CountryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", "Name");
    private final static QName _GetBanksChangesResponseMessageBanks_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Banks");
    private final static QName _DocumentTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "Name");
    private final static QName _BankAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Address");
    private final static QName _BankPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Phone");
    private final static QName _BankAllowedCurrencies_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "AllowedCurrencies");
    private final static QName _BankName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Name");
    private final static QName _BankFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", "Flags");
    private final static QName _GetDocumentTypeChangesResponseMessageDocumentTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", "DocumentTypes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcfservicelib_dictionaries
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBankInfosChangesRequestMessage }
     * 
     */
    public GetBankInfosChangesRequestMessage createGetBankInfosChangesRequestMessage() {
        return new GetBankInfosChangesRequestMessage();
    }

    /**
     * Create an instance of {@link GetCountriesChangesRequestMessage }
     * 
     */
    public GetCountriesChangesRequestMessage createGetCountriesChangesRequestMessage() {
        return new GetCountriesChangesRequestMessage();
    }

    /**
     * Create an instance of {@link ArrayOfBankInfo }
     * 
     */
    public ArrayOfBankInfo createArrayOfBankInfo() {
        return new ArrayOfBankInfo();
    }

    /**
     * Create an instance of {@link GetBanksChangesRequestMessage }
     * 
     */
    public GetBanksChangesRequestMessage createGetBanksChangesRequestMessage() {
        return new GetBanksChangesRequestMessage();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link ArrayOfCurrency }
     * 
     */
    public ArrayOfCurrency createArrayOfCurrency() {
        return new ArrayOfCurrency();
    }

    /**
     * Create an instance of {@link ArrayOfCountry }
     * 
     */
    public ArrayOfCountry createArrayOfCountry() {
        return new ArrayOfCountry();
    }

    /**
     * Create an instance of {@link GetCountriesChangesResponseMessage }
     * 
     */
    public GetCountriesChangesResponseMessage createGetCountriesChangesResponseMessage() {
        return new GetCountriesChangesResponseMessage();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link AllowedCurrency }
     * 
     */
    public AllowedCurrency createAllowedCurrency() {
        return new AllowedCurrency();
    }

    /**
     * Create an instance of {@link GetRegionsChangesRequestMessage }
     * 
     */
    public GetRegionsChangesRequestMessage createGetRegionsChangesRequestMessage() {
        return new GetRegionsChangesRequestMessage();
    }

    /**
     * Create an instance of {@link GetBanksChangesResponseMessage }
     * 
     */
    public GetBanksChangesResponseMessage createGetBanksChangesResponseMessage() {
        return new GetBanksChangesResponseMessage();
    }

    /**
     * Create an instance of {@link ArrayOfRegion }
     * 
     */
    public ArrayOfRegion createArrayOfRegion() {
        return new ArrayOfRegion();
    }

    /**
     * Create an instance of {@link GetCurrenciesChangesRequestMessage }
     * 
     */
    public GetCurrenciesChangesRequestMessage createGetCurrenciesChangesRequestMessage() {
        return new GetCurrenciesChangesRequestMessage();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link Bank }
     * 
     */
    public Bank createBank() {
        return new Bank();
    }

    /**
     * Create an instance of {@link GetCountriesResponseMessage }
     * 
     */
    public GetCountriesResponseMessage createGetCountriesResponseMessage() {
        return new GetCountriesResponseMessage();
    }

    /**
     * Create an instance of {@link GetDocumentTypeChangesResponseMessage }
     * 
     */
    public GetDocumentTypeChangesResponseMessage createGetDocumentTypeChangesResponseMessage() {
        return new GetDocumentTypeChangesResponseMessage();
    }

    /**
     * Create an instance of {@link GetBankByIDRequestMessage }
     * 
     */
    public GetBankByIDRequestMessage createGetBankByIDRequestMessage() {
        return new GetBankByIDRequestMessage();
    }

    /**
     * Create an instance of {@link GetBankInfosChangesResponseMessage }
     * 
     */
    public GetBankInfosChangesResponseMessage createGetBankInfosChangesResponseMessage() {
        return new GetBankInfosChangesResponseMessage();
    }

    /**
     * Create an instance of {@link BankInfo }
     * 
     */
    public BankInfo createBankInfo() {
        return new BankInfo();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link FindRegionRequestMessage }
     * 
     */
    public FindRegionRequestMessage createFindRegionRequestMessage() {
        return new FindRegionRequestMessage();
    }

    /**
     * Create an instance of {@link GetCountriesRequestMessage }
     * 
     */
    public GetCountriesRequestMessage createGetCountriesRequestMessage() {
        return new GetCountriesRequestMessage();
    }

    /**
     * Create an instance of {@link FindRegionResponseMessage }
     * 
     */
    public FindRegionResponseMessage createFindRegionResponseMessage() {
        return new FindRegionResponseMessage();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentType }
     * 
     */
    public ArrayOfDocumentType createArrayOfDocumentType() {
        return new ArrayOfDocumentType();
    }

    /**
     * Create an instance of {@link GetCurrenciesChangesResponseMessage }
     * 
     */
    public GetCurrenciesChangesResponseMessage createGetCurrenciesChangesResponseMessage() {
        return new GetCurrenciesChangesResponseMessage();
    }

    /**
     * Create an instance of {@link ArrayOfAllowedCurrency }
     * 
     */
    public ArrayOfAllowedCurrency createArrayOfAllowedCurrency() {
        return new ArrayOfAllowedCurrency();
    }

    /**
     * Create an instance of {@link GetRegionsChangesResponseMessage }
     * 
     */
    public GetRegionsChangesResponseMessage createGetRegionsChangesResponseMessage() {
        return new GetRegionsChangesResponseMessage();
    }

    /**
     * Create an instance of {@link BankFlags }
     * 
     */
    public BankFlags createBankFlags() {
        return new BankFlags();
    }

    /**
     * Create an instance of {@link ArrayOfBank }
     * 
     */
    public ArrayOfBank createArrayOfBank() {
        return new ArrayOfBank();
    }

    /**
     * Create an instance of {@link GetDocumentTypeChangesRequestMessage }
     * 
     */
    public GetDocumentTypeChangesRequestMessage createGetDocumentTypeChangesRequestMessage() {
        return new GetDocumentTypeChangesRequestMessage();
    }

    /**
     * Create an instance of {@link GetBankByIDResponseMessage }
     * 
     */
    public GetBankByIDResponseMessage createGetBankByIDResponseMessage() {
        return new GetBankByIDResponseMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanksChangesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "GetBanksChangesRequestMessage")
    public JAXBElement<GetBanksChangesRequestMessage> createGetBanksChangesRequestMessage(GetBanksChangesRequestMessage value) {
        return new JAXBElement<GetBanksChangesRequestMessage>(_GetBanksChangesRequestMessage_QNAME, GetBanksChangesRequestMessage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", name = "DocumentType")
    public JAXBElement<DocumentType> createDocumentType(DocumentType value) {
        return new JAXBElement<DocumentType>(_DocumentType_QNAME, DocumentType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankByIDRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "GetBankByIDRequestMessage")
    public JAXBElement<GetBankByIDRequestMessage> createGetBankByIDRequestMessage(GetBankByIDRequestMessage value) {
        return new JAXBElement<GetBankByIDRequestMessage>(_GetBankByIDRequestMessage_QNAME, GetBankByIDRequestMessage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "ArrayOfRegion")
    public JAXBElement<ArrayOfRegion> createArrayOfRegion(ArrayOfRegion value) {
        return new JAXBElement<ArrayOfRegion>(_ArrayOfRegion_QNAME, ArrayOfRegion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "GetCountriesRequestMessage")
    public JAXBElement<GetCountriesRequestMessage> createGetCountriesRequestMessage(GetCountriesRequestMessage value) {
        return new JAXBElement<GetCountriesRequestMessage>(_GetCountriesRequestMessage_QNAME, GetCountriesRequestMessage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "Currency")
    public JAXBElement<Currency> createCurrency(Currency value) {
        return new JAXBElement<Currency>(_Currency_QNAME, Currency.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankInfosChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "GetBankInfosChangesResponseMessage")
    public JAXBElement<GetBankInfosChangesResponseMessage> createGetBankInfosChangesResponseMessage(GetBankInfosChangesResponseMessage value) {
        return new JAXBElement<GetBankInfosChangesResponseMessage>(_GetBankInfosChangesResponseMessage_QNAME, GetBankInfosChangesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanksChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "GetBanksChangesResponseMessage")
    public JAXBElement<GetBanksChangesResponseMessage> createGetBanksChangesResponseMessage(GetBanksChangesResponseMessage value) {
        return new JAXBElement<GetBanksChangesResponseMessage>(_GetBanksChangesResponseMessage_QNAME, GetBanksChangesResponseMessage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Bank }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Bank")
    public JAXBElement<Bank> createBank(Bank value) {
        return new JAXBElement<Bank>(_Bank_QNAME, Bank.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBank }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "ArrayOfBank")
    public JAXBElement<ArrayOfBank> createArrayOfBank(ArrayOfBank value) {
        return new JAXBElement<ArrayOfBank>(_ArrayOfBank_QNAME, ArrayOfBank.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrenciesChangesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "GetCurrenciesChangesResponseMessage")
    public JAXBElement<GetCurrenciesChangesResponseMessage> createGetCurrenciesChangesResponseMessage(GetCurrenciesChangesResponseMessage value) {
        return new JAXBElement<GetCurrenciesChangesResponseMessage>(_GetCurrenciesChangesResponseMessage_QNAME, GetCurrenciesChangesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankByIDResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "GetBankByIDResponseMessage")
    public JAXBElement<GetBankByIDResponseMessage> createGetBankByIDResponseMessage(GetBankByIDResponseMessage value) {
        return new JAXBElement<GetBankByIDResponseMessage>(_GetBankByIDResponseMessage_QNAME, GetBankByIDResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAllowedCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "ArrayOfAllowedCurrency")
    public JAXBElement<ArrayOfAllowedCurrency> createArrayOfAllowedCurrency(ArrayOfAllowedCurrency value) {
        return new JAXBElement<ArrayOfAllowedCurrency>(_ArrayOfAllowedCurrency_QNAME, ArrayOfAllowedCurrency.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountriesResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "GetCountriesResponseMessage")
    public JAXBElement<GetCountriesResponseMessage> createGetCountriesResponseMessage(GetCountriesResponseMessage value) {
        return new JAXBElement<GetCountriesResponseMessage>(_GetCountriesResponseMessage_QNAME, GetCountriesResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "BankType")
    public JAXBElement<BankType> createBankType(BankType value) {
        return new JAXBElement<BankType>(_BankType_QNAME, BankType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Direction")
    public JAXBElement<Direction> createDirection(Direction value) {
        return new JAXBElement<Direction>(_Direction_QNAME, Direction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "AllowedCurrency")
    public JAXBElement<AllowedCurrency> createAllowedCurrency(AllowedCurrency value) {
        return new JAXBElement<AllowedCurrency>(_AllowedCurrency_QNAME, AllowedCurrency.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "ArrayOfCurrency")
    public JAXBElement<ArrayOfCurrency> createArrayOfCurrency(ArrayOfCurrency value) {
        return new JAXBElement<ArrayOfCurrency>(_ArrayOfCurrency_QNAME, ArrayOfCurrency.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRegionRequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "FindRegionRequestMessage")
    public JAXBElement<FindRegionRequestMessage> createFindRegionRequestMessage(FindRegionRequestMessage value) {
        return new JAXBElement<FindRegionRequestMessage>(_FindRegionRequestMessage_QNAME, FindRegionRequestMessage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "ArrayOfCountry")
    public JAXBElement<ArrayOfCountry> createArrayOfCountry(ArrayOfCountry value) {
        return new JAXBElement<ArrayOfCountry>(_ArrayOfCountry_QNAME, ArrayOfCountry.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BankInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "BankInfo")
    public JAXBElement<BankInfo> createBankInfo(BankInfo value) {
        return new JAXBElement<BankInfo>(_BankInfo_QNAME, BankInfo.class, null, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "Document", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoDocument(String value) {
        return new JAXBElement<String>(_BankInfoDocument_QNAME, String.class, BankInfo.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "Requirements", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoRequirements(String value) {
        return new JAXBElement<String>(_BankInfoRequirements_QNAME, String.class, BankInfo.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "AccountDeposit", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoAccountDeposit(String value) {
        return new JAXBElement<String>(_BankInfoAccountDeposit_QNAME, String.class, BankInfo.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "CallCenter", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoCallCenter(String value) {
        return new JAXBElement<String>(_BankInfoCallCenter_QNAME, String.class, BankInfo.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "DeliverCurrency", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoDeliverCurrency(String value) {
        return new JAXBElement<String>(_BankInfoDeliverCurrency_QNAME, String.class, BankInfo.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.BankInfo", name = "Cash", scope = BankInfo.class)
    public JAXBElement<String> createBankInfoCash(String value) {
        return new JAXBElement<String>(_BankInfoCash_QNAME, String.class, BankInfo.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "Latin3", scope = Currency.class)
    public JAXBElement<String> createCurrencyLatin3(String value) {
        return new JAXBElement<String>(_CurrencyLatin3_QNAME, String.class, Currency.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Region", name = "FoundRegions", scope = FindRegionResponseMessage.class)
    public JAXBElement<ArrayOfRegion> createFindRegionResponseMessageFoundRegions(ArrayOfRegion value) {
        return new JAXBElement<ArrayOfRegion>(_FindRegionResponseMessageFoundRegions_QNAME, ArrayOfRegion.class, FindRegionResponseMessage.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Currency", name = "Currencies", scope = GetCurrenciesChangesResponseMessage.class)
    public JAXBElement<ArrayOfCurrency> createGetCurrenciesChangesResponseMessageCurrencies(ArrayOfCurrency value) {
        return new JAXBElement<ArrayOfCurrency>(_GetCurrenciesChangesResponseMessageCurrencies_QNAME, ArrayOfCurrency.class, GetCurrenciesChangesResponseMessage.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Digital", scope = Country.class)
    public JAXBElement<String> createCountryDigital(String value) {
        return new JAXBElement<String>(_CountryDigital_QNAME, String.class, Country.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Latin2", scope = Country.class)
    public JAXBElement<String> createCountryLatin2(String value) {
        return new JAXBElement<String>(_CountryLatin2_QNAME, String.class, Country.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLangText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Country", name = "Name", scope = Country.class)
    public JAXBElement<ArrayOfLangText> createCountryName(ArrayOfLangText value) {
        return new JAXBElement<ArrayOfLangText>(_CountryName_QNAME, ArrayOfLangText.class, Country.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBank }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Banks", scope = GetBanksChangesResponseMessage.class)
    public JAXBElement<ArrayOfBank> createGetBanksChangesResponseMessageBanks(ArrayOfBank value) {
        return new JAXBElement<ArrayOfBank>(_GetBanksChangesResponseMessageBanks_QNAME, ArrayOfBank.class, GetBanksChangesResponseMessage.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Address", scope = Bank.class)
    public JAXBElement<BankAddress> createBankAddress(BankAddress value) {
        return new JAXBElement<BankAddress>(_BankAddress_QNAME, BankAddress.class, Bank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Phone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Phone", scope = Bank.class)
    public JAXBElement<Phone> createBankPhone(Phone value) {
        return new JAXBElement<Phone>(_BankPhone_QNAME, Phone.class, Bank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAllowedCurrency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "AllowedCurrencies", scope = Bank.class)
    public JAXBElement<ArrayOfAllowedCurrency> createBankAllowedCurrencies(ArrayOfAllowedCurrency value) {
        return new JAXBElement<ArrayOfAllowedCurrency>(_BankAllowedCurrencies_QNAME, ArrayOfAllowedCurrency.class, Bank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLangText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Name", scope = Bank.class)
    public JAXBElement<ArrayOfLangText> createBankName(ArrayOfLangText value) {
        return new JAXBElement<ArrayOfLangText>(_BankName_QNAME, ArrayOfLangText.class, Bank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankFlags }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Flags", scope = Bank.class)
    public JAXBElement<BankFlags> createBankFlags(BankFlags value) {
        return new JAXBElement<BankFlags>(_BankFlags_QNAME, BankFlags.class, Bank.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Bank }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.Bank", name = "Bank", scope = GetBankByIDResponseMessage.class)
    public JAXBElement<Bank> createGetBankByIDResponseMessageBank(Bank value) {
        return new JAXBElement<Bank>(_Bank_QNAME, Bank.class, GetBankByIDResponseMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Dictionaries.DocumentType", name = "DocumentTypes", scope = GetDocumentTypeChangesResponseMessage.class)
    public JAXBElement<ArrayOfDocumentType> createGetDocumentTypeChangesResponseMessageDocumentTypes(ArrayOfDocumentType value) {
        return new JAXBElement<ArrayOfDocumentType>(_GetDocumentTypeChangesResponseMessageDocumentTypes_QNAME, ArrayOfDocumentType.class, GetDocumentTypeChangesResponseMessage.class, value);
    }

}
