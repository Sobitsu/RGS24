package com.grs24.mt;

import java.util.Date;

public class PersonHolder  {

    private FullNameTypeHolder fullName_;
    private CredentialsHolder identification_;
    private Date birthday_;
    private String citizenCountry_;
    private String residentCountry_;
    private String[] phone_;
    private String email_;
    private AddressHolder registration_;

    public void setFullName(FullNameTypeHolder FullName_) {
        this.fullName_ = FullName_;
    }

    public FullNameTypeHolder getFullName() {
        return this.fullName_;
    }

    public void setIdentification(CredentialsHolder Identification_) {
        this.identification_ = Identification_;
    }

    public CredentialsHolder getIdentification() {
        return this.identification_;
    }

    public void setBirthday(Date Birthday_) {
        this.birthday_ = Birthday_;
    }

    public Date getBirthday() {
        return this.birthday_;
    }

    public void setCitizenCountry(String CitizenCountry_) {
        this.citizenCountry_ = CitizenCountry_;
    }

    public String getCitizenCountry() {
        return this.citizenCountry_;
    }

    public void setResidentCountry(String ResidentCountry_) {
        this.residentCountry_ = ResidentCountry_;
    }

    public String getResidentCountry() {
        return this.residentCountry_;
    }

    public void setPhone(String[] Phone_) {
        this.phone_ = Phone_;
    }

    public String[] getPhone() {
        return this.phone_;
    }

    public void setEmail(String Email_) {
        this.email_ = Email_;
    }

    public String getEmail() {
        return this.email_;
    }

    public void setRegistration(AddressHolder Registration_) {
        this.registration_ = Registration_;
    }

    public AddressHolder getRegistration() {
        return this.registration_;
    }


    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Person(");
        str.append(" fullName=").append(getFullName());
        str.append(" identification=").append(getIdentification());
        str.append(" birthday=").append(getBirthday());
        str.append(" citizenCountry=").append(getCitizenCountry());
        str.append(" residentCountry=").append(getResidentCountry());
        if ( getPhone() != null )
            for (int i=0; i < getPhone().length; i++) {
                str.append(" phone["+i+"]=").append(getPhone()[i]);
            }
        str.append(" email=").append(getEmail());
        str.append(" registration=").append(getRegistration());
        str.append(")");
        return str.toString();
    }

}

