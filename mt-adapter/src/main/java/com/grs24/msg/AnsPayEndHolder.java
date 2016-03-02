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
public class AnsPayEndHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(AnsPayEndHolder.class.getName());

    private String stan;
    private String timeStamp;
    private StatusHolder status;
    private String approvalCode;
    private String cardTxID;
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

    public void setStatus(StatusHolder Status) {
        this.status = Status;
    }

    public StatusHolder getStatus() {
        return this.status;
    }

    public void setApprovalCode(String ApprovalCode) {
        this.approvalCode = ApprovalCode;
    }

    public String getApprovalCode() {
        return this.approvalCode;
    }

    public void setCardTxID(String CardTxID) {
        this.cardTxID = CardTxID;
    }

    public String getCardTxID() {
        return this.cardTxID;
    }

    public void setSignature(String Signature) {
        this.signature = Signature;
    }

    public String getSignature() {
        return this.signature;
    }

    public AnsPayEndHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("AnsPayEnd(");
        str.append(" stan=").append(getStan());
        str.append(" timeStamp=").append(getTimeStamp());
        str.append(" status=").append(getStatus());
        str.append(" approvalCode=").append(getApprovalCode());
        str.append(" cardTxID=").append(getCardTxID());
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
        str.append(fmt(getStatus()));
        str.append(fmt(getApprovalCode()));
        str.append(fmt(getCardTxID()));
        return str.toString();
    }

}
