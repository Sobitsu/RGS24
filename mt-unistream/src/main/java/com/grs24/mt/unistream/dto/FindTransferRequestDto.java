package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class FindTransferRequestDto 
{
	/** Контрольный код перевода */
	private String ControlNumber;

	/** Сумма */
	private Double Sum;

	/** Идентификатор валюты */
	private Integer CurrencyID;

	/** Идентификатор пункта, осуществляющего поиск перевода */
	private Integer BankID;

	public FindTransferRequestDto() {
	}

	public FindTransferRequestDto(String ControlNumber, Double Sum, Integer CurrencyID, Integer BankID) {
		this.ControlNumber = ControlNumber;
		this.Sum = Sum;
		this.CurrencyID = CurrencyID;
		this.BankID = BankID;
	}

	public String getControlNumber() {
		return ControlNumber;
	}

	public void setControlNumber(String ControlNumber) {
		this.ControlNumber = ControlNumber;
	}

	public Double getSum() {
		return Sum;
	}

	public void setSum(Double Sum) {
		this.Sum = Sum;
	}

	public Integer getCurrencyID() {
		return CurrencyID;
	}

	public void setCurrencyID(Integer CurrencyID) {
		this.CurrencyID = CurrencyID;
	}

	public Integer getBankID() {
		return BankID;
	}

	public void setBankID(Integer BankID) {
		this.BankID = BankID;
	}

	@Override
	public String toString() {
		return "FindTransferRequestDto{" + "ControlNumber=" + ControlNumber + ", Sum=" + Sum + ", CurrencyID=" + CurrencyID + ", BankID=" + BankID + '}';
	}
}
