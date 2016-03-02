package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class Residentship 
{
	/** Идентификатор */
	private Integer ID;

	/** Идентификатор страны */
	private Integer CountryID;

	/** Резидент=true, Нерезидент=false */
	private Boolean IsResident;

	public Residentship() {
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

	public Boolean isIsResident() {
		return IsResident;
	}

	public void setIsResident(Boolean IsResident) {
		this.IsResident = IsResident;
	}

	@Override
	public String toString() {
		return "Residentship{" + "ID=" + ID + ", CountryID=" + CountryID + ", IsResident=" + IsResident + '}';
	}
}
