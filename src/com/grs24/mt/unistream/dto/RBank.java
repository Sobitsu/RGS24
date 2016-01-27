package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class RBank 
{
	/** Идентификатор  */
	private Integer ID;

	/** Название  */
	private String Name;

	/** Город */
	private String City;

	/** Счёт в РКЦ */
	private String CorrespondentAcc;
	
	/** Банковский идентификационный код */
	private String Bic;

	public RBank() {
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public String getCorrespondentAcc() {
		return CorrespondentAcc;
	}

	public void setCorrespondentAcc(String CorrespondentAcc) {
		this.CorrespondentAcc = CorrespondentAcc;
	}

	public String getBic() {
		return Bic;
	}

	public void setBic(String Bic) {
		this.Bic = Bic;
	}

	@Override
	public String toString() {
		return "RBank{" + "ID=" + ID + ", Name=" + Name + ", City=" + City + ", CorrespondentAcc=" + CorrespondentAcc + ", Bic=" + Bic + '}';
	}
}
