package com.grs24.mt.unistream.dto;

import java.util.Date;

/**
 *
 * @author Ctac
 */
public class TransferDto
{
	/** Идентификатор */
	private Integer ID;

	/** Контрольный номер перевода */
	private String ControlNumber;

	/** Дата отправки перевода */
	private Date SentDate;

	/** Дата выплаты перевода */
	private Date PayoutDate;

	/** Дата аннулирования */
	private Date CancelDate;

	/** Дата возврата */
	private Date ReturnDate;

	/** Тип перевода */
	private TransferType Type;

	/** Суммы */
	private Amount[] Amounts;

	/** Пункты обслуживания */
	private Participator[] Participators;
	
	/** Клиенты */
	private Consumer[] Consumers;

	/** Услуги (комиссии) */
	private Service[] Services;

	/** Статус перевода */
	private TransferStatus Status;

	/** Внутренний идентификатор перевода в системе отправителя. Сохраняется если не null и не пустая строка. 
	 * При сохранении проверятся уникальность. Значение доступно только системе отправителя перевода. 
	 * Остальные видят “0”.  */
	private String SourceID;

	/** Список  уведомлений по переводу. 
	 * Это поле возвращается только при вызове следующих методов: 
	 * GetTransferByID, GetTransferBySourceID, GetTransfersChanges, FindTransfer. */
	private NoticeListItem[] NoticeList;

	/** Комментарий */
	private String Comment;
	
	/** Сведения об операционисте (используются для мотивации). 
	 * Используется только методами Insert-, Payout-, ReturnTransfer. Вебсервис не возвращает это поле. */
	private UserActionInfo TellerUserAction;
	
	/** Сведения об кассире (используются для мотивации). 
	 * Используется только методами Insert-, Payout-, ReturnTransfer. Вебсервис не возвращает это поле. */
	private UserActionInfo CashierUserAction;

	/** Промо код. Вебсервис не возвращает это поле.*/
	private String PromoCode;

	public TransferDto() {
	}

	
	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getControlNumber() {
		return ControlNumber;
	}

	public void setControlNumber(String ControlNumber) {
		this.ControlNumber = ControlNumber;
	}

	public Date getSentDate() {
		return SentDate;
	}

	public void setSentDate(Date SentDate) {
		this.SentDate = SentDate;
	}

	public Date getPayoutDate() {
		return PayoutDate;
	}

	public void setPayoutDate(Date PayoutDate) {
		this.PayoutDate = PayoutDate;
	}

	public Date getCancelDate() {
		return CancelDate;
	}

	public void setCancelDate(Date CancelDate) {
		this.CancelDate = CancelDate;
	}

	public Date getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(Date ReturnDate) {
		this.ReturnDate = ReturnDate;
	}

	public TransferType getType() {
		return Type;
	}

	public void setType(TransferType Type) {
		this.Type = Type;
	}

	public Amount[] getAmounts() {
		return Amounts;
	}

	public void setAmounts(Amount[] Amounts) {
		this.Amounts = Amounts;
	}

	public Participator[] getParticipators() {
		return Participators;
	}

	public void setParticipators(Participator[] Participators) {
		this.Participators = Participators;
	}

	public Consumer[] getConsumers() {
		return Consumers;
	}

	public void setConsumers(Consumer[] Consumers) {
		this.Consumers = Consumers;
	}

	public Service[] getServices() {
		return Services;
	}

	public void setServices(Service[] Services) {
		this.Services = Services;
	}

	public TransferStatus getStatus() {
		return Status;
	}

	public void setStatus(TransferStatus Status) {
		this.Status = Status;
	}

	public String getSourceID() {
		return SourceID;
	}

	public void setSourceID(String SourceID) {
		this.SourceID = SourceID;
	}

	public NoticeListItem[] getNoticeList() {
		return NoticeList;
	}

	public void setNoticeList(NoticeListItem[] NoticeList) {
		this.NoticeList = NoticeList;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String Comment) {
		this.Comment = Comment;
	}

	public UserActionInfo getTellerUserAction() {
		return TellerUserAction;
	}

	public void setTellerUserAction(UserActionInfo TellerUserAction) {
		this.TellerUserAction = TellerUserAction;
	}

	public UserActionInfo getCashierUserAction() {
		return CashierUserAction;
	}

	public void setCashierUserAction(UserActionInfo CashierUserAction) {
		this.CashierUserAction = CashierUserAction;
	}

	public String getPromoCode() {
		return PromoCode;
	}

	public void setPromoCode(String PromoCode) {
		this.PromoCode = PromoCode;
	}

	@Override
	public String toString() {
		return "TransferDto{" + "ID=" + ID + ", ControlNumber=" + ControlNumber + ", SentDate=" + SentDate + ", PayoutDate=" + PayoutDate + ", CancelDate=" + CancelDate + ", ReturnDate=" + ReturnDate + ", Type=" + Type + ", Amounts=" + Amounts + ", Participators=" + Participators + ", Consumers=" + Consumers + ", Services=" + Services + ", Status=" + Status + ", SourceID=" + SourceID + ", NoticeList=" + NoticeList + ", Comment=" + Comment + ", TellerUserAction=" + TellerUserAction + ", CashierUserAction=" + CashierUserAction + ", PromoCode=" + PromoCode + '}';
	}
}
