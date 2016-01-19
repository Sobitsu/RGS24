
package org.datacontract.schemas._2004._07.wcfservicelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoError"/>
 *     &lt;enumeration value="UnknownError"/>
 *     &lt;enumeration value="BadUsernameOrPassword"/>
 *     &lt;enumeration value="AuthenticationFailed"/>
 *     &lt;enumeration value="TransferControlNumberMustBeBlank"/>
 *     &lt;enumeration value="InvalidTransferSentDate"/>
 *     &lt;enumeration value="MustBeTheOnlySenderConsumer"/>
 *     &lt;enumeration value="MustBeTheOnlyExpectedReceiverConsumer"/>
 *     &lt;enumeration value="SendersRepresentativeCantMatchSender"/>
 *     &lt;enumeration value="WrongTransferConsumers"/>
 *     &lt;enumeration value="TransferWithSpecifiedSourceIDAlreadyExists"/>
 *     &lt;enumeration value="UnexpectedClientCertificate"/>
 *     &lt;enumeration value="TransferConsumersCantBeEmpty"/>
 *     &lt;enumeration value="PersonNameMismatch"/>
 *     &lt;enumeration value="UnknownOrExpiredAppKey"/>
 *     &lt;enumeration value="WrongDateTimeKind"/>
 *     &lt;enumeration value="UnknownSenderPosParticipator"/>
 *     &lt;enumeration value="InvalidTransferPayoutDate"/>
 *     &lt;enumeration value="SenderPosParticipatorCannotSendTransfers"/>
 *     &lt;enumeration value="TransferIdOrTransferSourceIdMustBeProvided"/>
 *     &lt;enumeration value="TransferNotFound"/>
 *     &lt;enumeration value="TransferDataMismatch"/>
 *     &lt;enumeration value="ActualReceiverPosParticipatorMustBeProvided"/>
 *     &lt;enumeration value="MustBeTheOnlyActualReceiverConsumer"/>
 *     &lt;enumeration value="ReceiversRepresentativeCantMatchReceiver"/>
 *     &lt;enumeration value="WrongNoticeConsumers"/>
 *     &lt;enumeration value="WrongNoticeParticipators"/>
 *     &lt;enumeration value="MustBeTheOnlyExpectedReceiverParticipator"/>
 *     &lt;enumeration value="NoticeDataMismatch"/>
 *     &lt;enumeration value="TimeComponentMustBeMidnight"/>
 *     &lt;enumeration value="UnknownReceiverPosParticipator"/>
 *     &lt;enumeration value="ReceiverPosParticipatorCannotPayoutTransfers"/>
 *     &lt;enumeration value="WrongServices"/>
 *     &lt;enumeration value="CardNotFound"/>
 *     &lt;enumeration value="BadCardPin"/>
 *     &lt;enumeration value="CardIsInactive"/>
 *     &lt;enumeration value="NoticeNotFound"/>
 *     &lt;enumeration value="PosCannotSendAddresslessTransfers"/>
 *     &lt;enumeration value="PosCannotPayoutAddresslessTransfers"/>
 *     &lt;enumeration value="FieldDataNotValid"/>
 *     &lt;enumeration value="InsufficientFunds"/>
 *     &lt;enumeration value="UncommittedNoticeExists"/>
 *     &lt;enumeration value="TransferControlNumberCantBeEmpty"/>
 *     &lt;enumeration value="DataIsNotAvailable"/>
 *     &lt;enumeration value="TransferWithSameControlNumberAlreadyExists"/>
 *     &lt;enumeration value="BadPromoCode"/>
 *     &lt;enumeration value="PrepaidCardAlreadyActivated"/>
 *     &lt;enumeration value="BicurrencyTransfersNotAvailable"/>
 *     &lt;enumeration value="SenderLimitExceeded"/>
 *     &lt;enumeration value="PersonListed"/>
 *     &lt;enumeration value="PersonDocumentListed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode", namespace = "http://schemas.datacontract.org/2004/07/WcfServiceLib.Operations")
@XmlEnum
public enum ErrorCode {

    @XmlEnumValue("NoError")
    NO_ERROR("NoError"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError"),
    @XmlEnumValue("BadUsernameOrPassword")
    BAD_USERNAME_OR_PASSWORD("BadUsernameOrPassword"),
    @XmlEnumValue("AuthenticationFailed")
    AUTHENTICATION_FAILED("AuthenticationFailed"),
    @XmlEnumValue("TransferControlNumberMustBeBlank")
    TRANSFER_CONTROL_NUMBER_MUST_BE_BLANK("TransferControlNumberMustBeBlank"),
    @XmlEnumValue("InvalidTransferSentDate")
    INVALID_TRANSFER_SENT_DATE("InvalidTransferSentDate"),
    @XmlEnumValue("MustBeTheOnlySenderConsumer")
    MUST_BE_THE_ONLY_SENDER_CONSUMER("MustBeTheOnlySenderConsumer"),
    @XmlEnumValue("MustBeTheOnlyExpectedReceiverConsumer")
    MUST_BE_THE_ONLY_EXPECTED_RECEIVER_CONSUMER("MustBeTheOnlyExpectedReceiverConsumer"),
    @XmlEnumValue("SendersRepresentativeCantMatchSender")
    SENDERS_REPRESENTATIVE_CANT_MATCH_SENDER("SendersRepresentativeCantMatchSender"),
    @XmlEnumValue("WrongTransferConsumers")
    WRONG_TRANSFER_CONSUMERS("WrongTransferConsumers"),
    @XmlEnumValue("TransferWithSpecifiedSourceIDAlreadyExists")
    TRANSFER_WITH_SPECIFIED_SOURCE_ID_ALREADY_EXISTS("TransferWithSpecifiedSourceIDAlreadyExists"),
    @XmlEnumValue("UnexpectedClientCertificate")
    UNEXPECTED_CLIENT_CERTIFICATE("UnexpectedClientCertificate"),
    @XmlEnumValue("TransferConsumersCantBeEmpty")
    TRANSFER_CONSUMERS_CANT_BE_EMPTY("TransferConsumersCantBeEmpty"),
    @XmlEnumValue("PersonNameMismatch")
    PERSON_NAME_MISMATCH("PersonNameMismatch"),
    @XmlEnumValue("UnknownOrExpiredAppKey")
    UNKNOWN_OR_EXPIRED_APP_KEY("UnknownOrExpiredAppKey"),
    @XmlEnumValue("WrongDateTimeKind")
    WRONG_DATE_TIME_KIND("WrongDateTimeKind"),
    @XmlEnumValue("UnknownSenderPosParticipator")
    UNKNOWN_SENDER_POS_PARTICIPATOR("UnknownSenderPosParticipator"),
    @XmlEnumValue("InvalidTransferPayoutDate")
    INVALID_TRANSFER_PAYOUT_DATE("InvalidTransferPayoutDate"),
    @XmlEnumValue("SenderPosParticipatorCannotSendTransfers")
    SENDER_POS_PARTICIPATOR_CANNOT_SEND_TRANSFERS("SenderPosParticipatorCannotSendTransfers"),
    @XmlEnumValue("TransferIdOrTransferSourceIdMustBeProvided")
    TRANSFER_ID_OR_TRANSFER_SOURCE_ID_MUST_BE_PROVIDED("TransferIdOrTransferSourceIdMustBeProvided"),
    @XmlEnumValue("TransferNotFound")
    TRANSFER_NOT_FOUND("TransferNotFound"),
    @XmlEnumValue("TransferDataMismatch")
    TRANSFER_DATA_MISMATCH("TransferDataMismatch"),
    @XmlEnumValue("ActualReceiverPosParticipatorMustBeProvided")
    ACTUAL_RECEIVER_POS_PARTICIPATOR_MUST_BE_PROVIDED("ActualReceiverPosParticipatorMustBeProvided"),
    @XmlEnumValue("MustBeTheOnlyActualReceiverConsumer")
    MUST_BE_THE_ONLY_ACTUAL_RECEIVER_CONSUMER("MustBeTheOnlyActualReceiverConsumer"),
    @XmlEnumValue("ReceiversRepresentativeCantMatchReceiver")
    RECEIVERS_REPRESENTATIVE_CANT_MATCH_RECEIVER("ReceiversRepresentativeCantMatchReceiver"),
    @XmlEnumValue("WrongNoticeConsumers")
    WRONG_NOTICE_CONSUMERS("WrongNoticeConsumers"),
    @XmlEnumValue("WrongNoticeParticipators")
    WRONG_NOTICE_PARTICIPATORS("WrongNoticeParticipators"),
    @XmlEnumValue("MustBeTheOnlyExpectedReceiverParticipator")
    MUST_BE_THE_ONLY_EXPECTED_RECEIVER_PARTICIPATOR("MustBeTheOnlyExpectedReceiverParticipator"),
    @XmlEnumValue("NoticeDataMismatch")
    NOTICE_DATA_MISMATCH("NoticeDataMismatch"),
    @XmlEnumValue("TimeComponentMustBeMidnight")
    TIME_COMPONENT_MUST_BE_MIDNIGHT("TimeComponentMustBeMidnight"),
    @XmlEnumValue("UnknownReceiverPosParticipator")
    UNKNOWN_RECEIVER_POS_PARTICIPATOR("UnknownReceiverPosParticipator"),
    @XmlEnumValue("ReceiverPosParticipatorCannotPayoutTransfers")
    RECEIVER_POS_PARTICIPATOR_CANNOT_PAYOUT_TRANSFERS("ReceiverPosParticipatorCannotPayoutTransfers"),
    @XmlEnumValue("WrongServices")
    WRONG_SERVICES("WrongServices"),
    @XmlEnumValue("CardNotFound")
    CARD_NOT_FOUND("CardNotFound"),
    @XmlEnumValue("BadCardPin")
    BAD_CARD_PIN("BadCardPin"),
    @XmlEnumValue("CardIsInactive")
    CARD_IS_INACTIVE("CardIsInactive"),
    @XmlEnumValue("NoticeNotFound")
    NOTICE_NOT_FOUND("NoticeNotFound"),
    @XmlEnumValue("PosCannotSendAddresslessTransfers")
    POS_CANNOT_SEND_ADDRESSLESS_TRANSFERS("PosCannotSendAddresslessTransfers"),
    @XmlEnumValue("PosCannotPayoutAddresslessTransfers")
    POS_CANNOT_PAYOUT_ADDRESSLESS_TRANSFERS("PosCannotPayoutAddresslessTransfers"),
    @XmlEnumValue("FieldDataNotValid")
    FIELD_DATA_NOT_VALID("FieldDataNotValid"),
    @XmlEnumValue("InsufficientFunds")
    INSUFFICIENT_FUNDS("InsufficientFunds"),
    @XmlEnumValue("UncommittedNoticeExists")
    UNCOMMITTED_NOTICE_EXISTS("UncommittedNoticeExists"),
    @XmlEnumValue("TransferControlNumberCantBeEmpty")
    TRANSFER_CONTROL_NUMBER_CANT_BE_EMPTY("TransferControlNumberCantBeEmpty"),
    @XmlEnumValue("DataIsNotAvailable")
    DATA_IS_NOT_AVAILABLE("DataIsNotAvailable"),
    @XmlEnumValue("TransferWithSameControlNumberAlreadyExists")
    TRANSFER_WITH_SAME_CONTROL_NUMBER_ALREADY_EXISTS("TransferWithSameControlNumberAlreadyExists"),
    @XmlEnumValue("BadPromoCode")
    BAD_PROMO_CODE("BadPromoCode"),
    @XmlEnumValue("PrepaidCardAlreadyActivated")
    PREPAID_CARD_ALREADY_ACTIVATED("PrepaidCardAlreadyActivated"),
    @XmlEnumValue("BicurrencyTransfersNotAvailable")
    BICURRENCY_TRANSFERS_NOT_AVAILABLE("BicurrencyTransfersNotAvailable"),
    @XmlEnumValue("SenderLimitExceeded")
    SENDER_LIMIT_EXCEEDED("SenderLimitExceeded"),
    @XmlEnumValue("PersonListed")
    PERSON_LISTED("PersonListed"),
    @XmlEnumValue("PersonDocumentListed")
    PERSON_DOCUMENT_LISTED("PersonDocumentListed");
    private final String value;

    ErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCode fromValue(String v) {
        for (ErrorCode c: ErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
