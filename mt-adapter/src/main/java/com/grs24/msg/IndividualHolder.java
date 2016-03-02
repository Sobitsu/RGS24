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
public class IndividualHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(IndividualHolder.class.getName());

    private String first;
    private String middle;
    private String last;

    public void setFirst(String First) {
        this.first = First;
    }

    public String getFirst() {
        return this.first;
    }

    public void setMiddle(String Middle) {
        this.middle = Middle;
    }

    public String getMiddle() {
        return this.middle;
    }

    public void setLast(String Last) {
        this.last = Last;
    }

    public String getLast() {
        return this.last;
    }

    public IndividualHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Individual(");
        str.append(" first=").append(getFirst());
        str.append(" middle=").append(getMiddle());
        str.append(" last=").append(getLast());
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
        str.append(fmt(getFirst()));
        str.append(fmt(getMiddle()));
        str.append(fmt(getLast()));
        return str.toString();
    }

}
