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
public class TermsOfServiceHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(TermsOfServiceHolder.class.getName());

    private String lang;
    private String text;

    public void setLang(String Lang) {
        this.lang = Lang;
    }

    public String getLang() {
        return this.lang;
    }

    public void setText(String Text) {
        this.text = Text;
    }

    public String getText() {
        return this.text;
    }

    public TermsOfServiceHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("TermsOfService(");
        str.append(" lang=").append(getLang());
        str.append(" text=").append(getText());
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
        str.append(fmt(getLang()));
        str.append(fmt(getText()));
        return str.toString();
    }

}
