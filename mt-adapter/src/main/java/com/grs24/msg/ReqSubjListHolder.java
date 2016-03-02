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
public class ReqSubjListHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(ReqSubjListHolder.class.getName());

    private String stan;
    private String timeStamp;
    private String sysID;
    private BigDecimal userID;
    private String lang;
    private String targetSysID;
    private BigDecimal sysType;
    private String signature;

    public void setStan(String Stan) {
        this.stan = Stan;
    }

    public String getStan() {
        return this.stan;
    }

    public void setTimeStamp(String TimeStamp) {
        this.timeStamp = TimeStamp;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public void setSysID(String SysID) {
        this.sysID = SysID;
    }

    public String getSysID() {
        return this.sysID;
    }

    public void setUserID(BigDecimal UserID) {
        this.userID = UserID;
    }

    public BigDecimal getUserID() {
        return this.userID;
    }

    public void setLang(String Lang) {
        this.lang = Lang;
    }

    public String getLang() {
        return this.lang;
    }

    public void setTargetSysID(String TargetSysID) {
        this.targetSysID = TargetSysID;
    }

    public String getTargetSysID() {
        return this.targetSysID;
    }

    public void setSysType(BigDecimal SysType) {
        this.sysType = SysType;
    }

    public BigDecimal getSysType() {
        return this.sysType;
    }

    public void setSignature(String Signature) {
        this.signature = Signature;
    }

    public String getSignature() {
        return this.signature;
    }

    public ReqSubjListHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("ReqSubjList(");
        str.append(" stan=").append(getStan());
        str.append(" timeStamp=").append(getTimeStamp());
        str.append(" sysID=").append(getSysID());
        str.append(" userID=").append(getUserID());
        str.append(" lang=").append(getLang());
        str.append(" targetSysID=").append(getTargetSysID());
        str.append(" sysType=").append(getSysType());
        str.append(" signature=").append(getSignature());
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
        str.append(fmt(getStan()));
        str.append(fmt(getTimeStamp()));
        str.append(fmt(getSysID()));
        str.append(fmt(getUserID()));
        str.append(fmt(getLang()));
        str.append(fmt(getTargetSysID()));
        str.append(fmt(getSysType()));
        return str.toString();
    }

}
