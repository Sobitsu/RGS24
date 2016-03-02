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
public class NonRepudationHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(NonRepudationHolder.class.getName());

    private OriginNonRepudationHolder originNonRepudation;
    private String deliveryNonRepudation;

    public void setOriginNonRepudation(OriginNonRepudationHolder OriginNonRepudation) {
        this.originNonRepudation = OriginNonRepudation;
    }

    public OriginNonRepudationHolder getOriginNonRepudation() {
        return this.originNonRepudation;
    }

    public void setDeliveryNonRepudation(String DeliveryNonRepudation) {
        this.deliveryNonRepudation = DeliveryNonRepudation;
    }

    public String getDeliveryNonRepudation() {
        return this.deliveryNonRepudation;
    }

    public NonRepudationHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("NonRepudation(");
        str.append(" originNonRepudation=").append(getOriginNonRepudation());
        str.append(" deliveryNonRepudation=").append(getDeliveryNonRepudation());
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
        str.append(fmt(getOriginNonRepudation()));
        str.append(fmt(getDeliveryNonRepudation()));
        return str.toString();
    }

}
