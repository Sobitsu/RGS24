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
public class AddressHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(AddressHolder.class.getName());

    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String street1;
    private String street2;

    public void setCountry(String Country) {
        this.country = Country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setState(String State) {
        this.state = State;
    }

    public String getState() {
        return this.state;
    }

    public void setCity(String City) {
        this.city = City;
    }

    public String getCity() {
        return this.city;
    }

    public void setZipCode(String ZipCode) {
        this.zipCode = ZipCode;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setStreet1(String Street1) {
        this.street1 = Street1;
    }

    public String getStreet1() {
        return this.street1;
    }

    public void setStreet2(String Street2) {
        this.street2 = Street2;
    }

    public String getStreet2() {
        return this.street2;
    }

    public AddressHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Address(");
        str.append(" country=").append(getCountry());
        str.append(" state=").append(getState());
        str.append(" city=").append(getCity());
        str.append(" zipCode=").append(getZipCode());
        str.append(" street1=").append(getStreet1());
        str.append(" street2=").append(getStreet2());
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
        str.append(fmt(getCountry()));
        str.append(fmt(getState()));
        str.append(fmt(getCity()));
        str.append(fmt(getZipCode()));
        str.append(fmt(getStreet1()));
        str.append(fmt(getStreet2()));
        return str.toString();
    }

}
