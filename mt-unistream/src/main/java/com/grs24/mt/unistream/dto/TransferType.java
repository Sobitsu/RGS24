package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public enum TransferType 
{
	/** Денежный перевод между физическими лицами  */
	Remittance,
	
	/**Погашение кредита*/
	Credit,
	
	/** Оплата услуг */
	Payment,
	
	/** Платёж по свободным реквизитам в российский банк (через РКЦ) */
	PayOrder
	
	
}
