package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class PersonAddress 
{
	/** Идентификатор страны */
	private Integer CountryID;

	/** Наименование города */
	private String City;

	/** Улица */
	private String Street;

	/** Дом */
	private String House;

	/** Корпус  */
	private String Building;

	/** Квартира */
	private String Flat;
	
	/** Почтовый индекс */
	private String PostalCode;
	
	/** Идентификатор */
	private Integer ID;

	public PersonAddress() {
	}

	public Integer getCountryID() {
		return CountryID;
	}

	public void setCountryID(Integer CountryID) {
		this.CountryID = CountryID;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String Street) {
		this.Street = Street;
	}

	public String getHouse() {
		return House;
	}

	public void setHouse(String House) {
		this.House = House;
	}

	public String getBuilding() {
		return Building;
	}

	public void setBuilding(String Building) {
		this.Building = Building;
	}

	public String getFlat() {
		return Flat;
	}

	public void setFlat(String Flat) {
		this.Flat = Flat;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String PostalCode) {
		this.PostalCode = PostalCode;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	@Override
	public String toString() {
		return "PersonAddress{" + "CountryID=" + CountryID + ", City=" + City + ", Street=" + Street + ", House=" + House + ", Building=" + Building + ", Flat=" + Flat + ", PostalCode=" + PostalCode + ", ID=" + ID + '}';
	}
}
