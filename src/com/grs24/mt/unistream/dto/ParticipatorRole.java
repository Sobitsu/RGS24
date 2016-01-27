package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public enum ParticipatorRole 
{
	/** Пункт отправителя */
	SenderPOS,
	
	/** Пункт получателя указанный отправителем */
	ExpectedReceiverPOS,
	
	/** Фактический пункт получателя */
	ActualReceiverPOS
}
