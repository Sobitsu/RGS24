package com.grs24.mt.unistream.dto;

import java.util.Date;

/**
 *
 * @author Ctac
 */
public class Document 
{
	/** Идентификатор типа документа */
	private Integer TypeID;
	
	/** Серия. Контроль: Длина значения поля Series должна быть больше трёх 
	 * или длина значения поля Number должна быть больше трёх. */
	private String Series;

	/** Номер. Контроль: Длина значения поля Series должна быть больше трёх 
	 * или длина значения поля Number должна быть больше трёх. */
	private String Number;

	/** Кем выдано */
	private String Issuer;

	/** Код подразделения */
	private String IssuerCode;

	/** Дата выдачи. Контроль: если заполнено, дата должна быть в прошлом  */
	private Date IssueDate;

	/** Дата окончания срока действия. 
	 * Контроль: если заполнено, дата должна быть больше чем IssueDate */
	private Date ExpiryDate;

	/** Идентификатор */
	private Integer ID;

	public Document() {
	}

	public Integer getTypeID() {
		return TypeID;
	}

	public void setTypeID(Integer TypeID) {
		this.TypeID = TypeID;
	}

	public String getSeries() {
		return Series;
	}

	public void setSeries(String Series) {
		this.Series = Series;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String Number) {
		this.Number = Number;
	}

	public String getIssuer() {
		return Issuer;
	}

	public void setIssuer(String Issuer) {
		this.Issuer = Issuer;
	}

	public String getIssuerCode() {
		return IssuerCode;
	}

	public void setIssuerCode(String IssuerCode) {
		this.IssuerCode = IssuerCode;
	}

	public Date getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(Date IssueDate) {
		this.IssueDate = IssueDate;
	}

	public Date getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(Date ExpiryDate) {
		this.ExpiryDate = ExpiryDate;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	@Override
	public String toString() {
		return "Document{" + "TypeID=" + TypeID + ", Series=" + Series + ", Number=" + Number + ", Issuer=" + Issuer + ", IssuerCode=" + IssuerCode + ", IssueDate=" + IssueDate + ", ExpiryDate=" + ExpiryDate + ", ID=" + ID + '}';
	}
}
