package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class Phone
{
	/** Идентификатор */
	private Integer ID;

	/** Идентификатор страны */
	private Integer CountryID;

	/** Код города */
	private String AreaCode;

	/** Номер телефона */
	private String Number;

	/** Добавочный номер */
	private String Ext;
	
	/** Тип */
	private PhoneType Type;

	public Phone() {
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public Integer getCountryID() {
		return CountryID;
	}

	public void setCountryID(Integer CountryID) {
		this.CountryID = CountryID;
	}

	public String getAreaCode() {
		return AreaCode;
	}

	public void setAreaCode(String AreaCode) {
		this.AreaCode = AreaCode;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String Number) {
		this.Number = Number;
	}

	public String getExt() {
		return Ext;
	}

	public void setExt(String Ext) {
		this.Ext = Ext;
	}

	public PhoneType getType() {
		return Type;
	}

	public void setType(PhoneType Type) {
		this.Type = Type;
	}

	@Override
	public String toString() {
		return "Phone{" + "ID=" + ID + ", CountryID=" + CountryID + ", AreaCode=" + AreaCode + ", Number=" + Number + ", Ext=" + Ext + ", Type=" + Type + '}';
	}
}
