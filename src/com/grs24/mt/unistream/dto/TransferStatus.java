package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public enum TransferStatus 
{
	/** Нет статуса */
	None(0),
	
	/** Перевод принят Расчётным Центром «Юнистрим» */
	Accepted(40),
	
	/** Перевод выплачен получателю */
	Paid(50), 
	
	/** Перевод отозван.  Инициация отзыва перевода не поддерживается в Global 2, 
	 * статус  приводится для обратной совместимости с другими участниками СДП Юнистрим. */
	Rejected(60),
	
	/** Перевод аннулирован */
	Cancelled(65);
	
	private final int value;
	
	TransferStatus(int value){
		this.value = value;
	}
		
    /**
     * Получение идентификатора статуса.
     * @return
     */
    public Integer getId(){
		return this.value;
	}

}
