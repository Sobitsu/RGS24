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
public class DstPayRateHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(DstPayRateHolder.class.getName());

    private String numCur;
    private String denCur;
    private Float rate;
    private String baseCur;

    public void setNumCur(String NumCur) {
        this.numCur = NumCur;
    }

    public String getNumCur() {
        return this.numCur;
    }

    public void setDenCur(String DenCur) {
        this.denCur = DenCur;
    }

    public String getDenCur() {
        return this.denCur;
    }

    public void setRate(Float Rate) {
        this.rate = Rate;
    }

    public Float getRate() {
        return this.rate;
    }

    public void setBaseCur(String BaseCur) {
        this.baseCur = BaseCur;
    }

    public String getBaseCur() {
        return this.baseCur;
    }

    public DstPayRateHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("DstPayRate(");
        str.append(" numCur=").append(getNumCur());
        str.append(" denCur=").append(getDenCur());
        str.append(" rate=").append(getRate());
        str.append(" baseCur=").append(getBaseCur());
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
        str.append(fmt(getNumCur()));
        str.append(fmt(getDenCur()));
        str.append(fmt(getRate()));
        str.append(fmt(getBaseCur()));
        return str.toString();
    }

}
