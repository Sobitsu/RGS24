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
public class ExtInfoTypeHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(ExtInfoTypeHolder.class.getName());

    private String action;
    private String url;
    private AttachesHolder attaches;
    private SecureInfoHolder secureInfo;
    private AddInfoTypeExHolder[] addInfoEx;

    public void setAction(String Action) {
        this.action = Action;
    }

    public String getAction() {
        return this.action;
    }

    public void setUrl(String Url) {
        this.url = Url;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAttaches(AttachesHolder Attaches) {
        this.attaches = Attaches;
    }

    public AttachesHolder getAttaches() {
        return this.attaches;
    }

    public void setSecureInfo(SecureInfoHolder SecureInfo) {
        this.secureInfo = SecureInfo;
    }

    public SecureInfoHolder getSecureInfo() {
        return this.secureInfo;
    }

    public void setAddInfoEx(AddInfoTypeExHolder[] AddInfoEx) {
        this.addInfoEx = AddInfoEx;
    }

    public AddInfoTypeExHolder[] getAddInfoEx() {
        return this.addInfoEx;
    }

    public ExtInfoTypeHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("ExtInfoType(");
        str.append(" action=").append(getAction());
        str.append(" url=").append(getUrl());
        str.append(" attaches=").append(getAttaches());
        str.append(" secureInfo=").append(getSecureInfo());
        if ( getAddInfoEx() != null )
            for (int i=0; i < getAddInfoEx().length; i++) {
                str.append(" addInfoEx["+i+"]=").append(getAddInfoEx()[i]);
            }
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
        str.append(fmt(getAction()));
        str.append(fmt(getUrl()));
        str.append(fmt(getAttaches()));
        str.append(fmt(getSecureInfo()));
        if ( getAddInfoEx() != null )
            for (int i=0; i < getAddInfoEx().length; i++) {
                str.append(fmt(getAddInfoEx()[i]));
            }
        return str.toString();
    }

}
