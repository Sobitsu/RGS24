package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public enum ConsumerRole 
{
	/** Отправитель */
	Sender,
	
	/** Представитель отправителя */
	SenderRepresentative,
	
	/** Получатель, указанный отправителем */
	ExpectedReceiver,
	
	/** Фактический получатель */
	ActualReceiver,
	
	/** Представитель получателя */
	ReceiverRepresentative,
	
	/** Компания получатель (Применяется для универсального платежа по свободным реквизитам 
	 * TransferType = PayOrder) */
	ReceiverCompany
}
