package com.grs24.mt;

import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AddressHolder  {

    // ISO 3166-1 alpha-3 код страны 
    private String country_;
    private String state_;
    private String city_;
    private String zipCode_;
    private String street1_;
    private String street2_;

    public void setCountry(String Country_) {
        this.country_ = Country_;
    }

    public String getCountry() {
        return this.country_;
    }

    public void setState(String State_) {
        this.state_ = State_;
    }

    public String getState() {
        return this.state_;
    }

    public void setCity(String City_) {
        this.city_ = City_;
    }

    public String getCity() {
        return this.city_;
    }

    public void setZipCode(String ZipCode_) {
        this.zipCode_ = ZipCode_;
    }

    public String getZipCode() {
        return this.zipCode_;
    }

    public void setStreet1(String Street1_) {
        this.street1_ = Street1_;
    }

    public String getStreet1() {
        return this.street1_;
    }

    public void setStreet2(String Street2_) {
        this.street2_ = Street2_;
    }

    public String getStreet2() {
        return this.street2_;
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

}

