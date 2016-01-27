package com.grs24.mt.unistream.dto;

import java.util.Date;

/**
 *
 * @author Ctac
 */
public class FinDetail 
{
	/** Идентификатор */
	private Integer ID;

	/** Дата создания */
	private Date Date;

	/** Номер счёта/контракта */
	private String Number;
	
	/** Тип */
	private FinDetailType Type;

	public FinDetail() {
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String Number) {
		this.Number = Number;
	}

	public FinDetailType getType() {
		return Type;
	}

	public void setType(FinDetailType Type) {
		this.Type = Type;
	}

	@Override
	public String toString() {
		return "FinDetail{" + "ID=" + ID + ", Date=" + Date + ", Number=" + Number + ", Type=" + Type + '}';
	}
}
