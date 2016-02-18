// This file was automatically generated by udr2java.sh utility.
// ($Id: udr2java.sh,v 1.60 2015/07/17 05:29:18 black Exp $)
// Do not edit, please!

/**
 * Copyright (C) GRS24, Inc. 2014-2015.
 * All rights reserved.
 */

package com.grs24.msg;

import org.apache.log4j.Logger;
import com.grs24.core.Stickable;
import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.roo.addon.json.annotations.RooJson;

@RooJson(deepSerialize = true, iso8601Dates = true)
public class PersonHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(PersonHolder.class.getName());

    private FullNameTypeHolder fullName;
    private CredentialsHolder identification;
    private Date birthday;
    private String citizenCountry;
    private String residentCountry;
    private String[] phone;
    private String email;
    private AddressHolder registration;

    public void setFullName(FullNameTypeHolder FullName) {
        this.fullName = FullName;
    }

    public FullNameTypeHolder getFullName() {
        return this.fullName;
    }

    public void setIdentification(CredentialsHolder Identification) {
        this.identification = Identification;
    }

    public CredentialsHolder getIdentification() {
        return this.identification;
    }

    public void setBirthday(Date Birthday) {
        this.birthday = Birthday;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setCitizenCountry(String CitizenCountry) {
        this.citizenCountry = CitizenCountry;
    }

    public String getCitizenCountry() {
        return this.citizenCountry;
    }

    public void setResidentCountry(String ResidentCountry) {
        this.residentCountry = ResidentCountry;
    }

    public String getResidentCountry() {
        return this.residentCountry;
    }

    public void setPhone(String[] Phone) {
        this.phone = Phone;
    }

    public String[] getPhone() {
        return this.phone;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setRegistration(AddressHolder Registration) {
        this.registration = Registration;
    }

    public AddressHolder getRegistration() {
        return this.registration;
    }

    public PersonHolder() {
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

    private String fmt(Object data) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        StringBuffer str = new StringBuffer();
	if (data == null) return null;
	if (data instanceof Date) 
		str.append(sdf.format((Date)data));
     else
		str.append( (data instanceof Stickable) ? ((Stickable)data).stickString() : data);
	return str.toString();
    }

    public String stickString() {
        StringBuffer str = new StringBuffer();
        str.append(fmt(getFullName()));
        str.append(fmt(getIdentification()));
        str.append(fmt(getBirthday()));
        str.append(fmt(getCitizenCountry()));
        str.append(fmt(getResidentCountry()));
        if ( getPhone() != null )
            for (int i=0; i < getPhone().length; i++) {
                str.append(fmt(getPhone()[i]));
            }
        str.append(fmt(getEmail()));
        str.append(fmt(getRegistration()));
        return str.toString();
    }

}

