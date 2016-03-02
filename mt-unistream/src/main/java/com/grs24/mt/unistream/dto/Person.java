package com.grs24.mt.unistream.dto;

import java.util.Date;

/**
 *
 * @author Ctac
 */
public class Person 
{
	/** Имя */
	private String FirstName;

	/** Отчество */
	private String MiddleName;

	/** Фамилия */
	private String LastName;

	/** Имя (латиницей) */
	private String FirstNameLat;

	/** Отчество (латиницей) */
	private String MiddleNameLat;

	/** Фамилия  (латиницей) */
	private String LastNameLat;

	/** Дата рождения */
	private Date BirthDate;

	/** Место рождения */
	private String BirthPlace;

	/** Адрес */
	private PersonAddress Address;

	/** Документы. Первый документ в списке является основным. */
	private Document[] Documents;

	/** Номер карты */
	private String UnistreamCardNumber;

	/** Идентификатор* */
	private Integer ID;

	/** Телефоны */
	private Phone[] Phones;

	/** информация о резидентстве */
	private Residentship[] Residentships;
	
	/** Финансовая информация */
	private FinDetail[] FinDetails;

	/** Российский банк. Только для переводов типа PayOrder, только для Consumer с ролью ExpectedReceiver. */
	private RBank RBank;

	public Person() {
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public String getFirstNameLat() {
		return FirstNameLat;
	}

	public void setFirstNameLat(String FirstNameLat) {
		this.FirstNameLat = FirstNameLat;
	}

	public String getMiddleNameLat() {
		return MiddleNameLat;
	}

	public void setMiddleNameLat(String MiddleNameLat) {
		this.MiddleNameLat = MiddleNameLat;
	}

	public String getLastNameLat() {
		return LastNameLat;
	}

	public void setLastNameLat(String LastNameLat) {
		this.LastNameLat = LastNameLat;
	}

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date BirthDate) {
		this.BirthDate = BirthDate;
	}

	public String getBirthPlace() {
		return BirthPlace;
	}

	public void setBirthPlace(String BirthPlace) {
		this.BirthPlace = BirthPlace;
	}

	public PersonAddress getAddress() {
		return Address;
	}

	public void setAddress(PersonAddress Address) {
		this.Address = Address;
	}

	public Document[] getDocuments() {
		return Documents;
	}

	public void setDocuments(Document[] Documents) {
		this.Documents = Documents;
	}

	public String getUnistreamCardNumber() {
		return UnistreamCardNumber;
	}

	public void setUnistreamCardNumber(String UnistreamCardNumber) {
		this.UnistreamCardNumber = UnistreamCardNumber;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public Phone[] getPhones() {
		return Phones;
	}

	public void setPhones(Phone[] Phones) {
		this.Phones = Phones;
	}

	public Residentship[] getResidentships() {
		return Residentships;
	}

	public void setResidentships(Residentship[] Residentships) {
		this.Residentships = Residentships;
	}

	public FinDetail[] getFinDetails() {
		return FinDetails;
	}

	public void setFinDetails(FinDetail[] FinDetails) {
		this.FinDetails = FinDetails;
	}

	public RBank getRBank() {
		return RBank;
	}

	public void setRBank(RBank RBank) {
		this.RBank = RBank;
	}

	@Override
	public String toString() {
		return "Person{" + "FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", LastName=" + LastName + ", FirstNameLat=" + FirstNameLat + ", MiddleNameLat=" + MiddleNameLat + ", LastNameLat=" + LastNameLat + ", BirthDate=" + BirthDate + ", BirthPlace=" + BirthPlace + ", Address=" + Address + ", Documents=" + Documents + ", UnistreamCardNumber=" + UnistreamCardNumber + ", ID=" + ID + ", Phones=" + Phones + ", Residentships=" + Residentships + ", FinDetails=" + FinDetails + ", RBank=" + RBank + '}';
	}
}
