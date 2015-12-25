package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class Amount 
{
	/** Идентификатор валюты */
	private Integer CurrencyID;

	/** Сумма */
	private Double Sum;

	/** Тип суммы */
	private AmountType Type;

	/** Курс валюты, используемый при вычислении суммы к выплате бивалютного перевода. 
	 * Поле будет заполнено только в ответе метода PrepareTransfer, только в вычисленной 
	 * сумме типа ActualPaid или EstimatedPaidout. В остальных случаях следует игнорировать.  */
	private Double Rate;

	public Amount() {
	}

	public Integer getCurrencyID() {
		return CurrencyID;
	}

	public void setCurrencyID(Integer CurrencyID) {
		this.CurrencyID = CurrencyID;
	}

	public Double getSum() {
		return Sum;
	}

	public void setSum(Double Sum) {
		this.Sum = Sum;
	}

	public AmountType getType() {
		return Type;
	}

	public void setType(AmountType Type) {
		this.Type = Type;
	}

	public Double getRate() {
		return Rate;
	}

	public void setRate(Double Rate) {
		this.Rate = Rate;
	}

	@Override
	public String toString() {
		return "Amount{" + "CurrencyID=" + CurrencyID + ", Sum=" + Sum + ", Type=" + Type + ", Rate=" + Rate + '}';
	}
}
