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
public class ReqAuthMoneySearchHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(ReqAuthMoneySearchHolder.class.getName());

    private String stan;
    private String timeStamp;
    private String sysID;
    private BigDecimal userID;
    private String mTCN;
    private FullNameTypeHolder payeeName;
    private String cardID;
    private String cardPAN;
    private String accountNumber;
    private String phone;
    private String clientID;
    private FundsHolder approxOrgFunds;
    private FundsHolder approxDstFunds;
    private String orgCountry;
    private String lang;
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

    public void setMTCN(String MTCN) {
        this.mTCN = MTCN;
    }

    public String getMTCN() {
        return this.mTCN;
    }

    public void setPayeeName(FullNameTypeHolder PayeeName) {
        this.payeeName = PayeeName;
    }

    public FullNameTypeHolder getPayeeName() {
        return this.payeeName;
    }

    public void setCardID(String CardID) {
        this.cardID = CardID;
    }

    public String getCardID() {
        return this.cardID;
    }

    public void setCardPAN(String CardPAN) {
        this.cardPAN = CardPAN;
    }

    public String getCardPAN() {
        return this.cardPAN;
    }

    public void setAccountNumber(String AccountNumber) {
        this.accountNumber = AccountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setPhone(String Phone) {
        this.phone = Phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setClientID(String ClientID) {
        this.clientID = ClientID;
    }

    public String getClientID() {
        return this.clientID;
    }

    public void setApproxOrgFunds(FundsHolder ApproxOrgFunds) {
        this.approxOrgFunds = ApproxOrgFunds;
    }

    public FundsHolder getApproxOrgFunds() {
        return this.approxOrgFunds;
    }

    public void setApproxDstFunds(FundsHolder ApproxDstFunds) {
        this.approxDstFunds = ApproxDstFunds;
    }

    public FundsHolder getApproxDstFunds() {
        return this.approxDstFunds;
    }

    public void setOrgCountry(String OrgCountry) {
        this.orgCountry = OrgCountry;
    }

    public String getOrgCountry() {
        return this.orgCountry;
    }

    public void setLang(String Lang) {
        this.lang = Lang;
    }

    public String getLang() {
        return this.lang;
    }

    public void setSignature(String Signature) {
        this.signature = Signature;
    }

    public String getSignature() {
        return this.signature;
    }

    public ReqAuthMoneySearchHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("ReqAuthMoneySearch(");
        str.append(" stan=").append(getStan());
        str.append(" timeStamp=").append(getTimeStamp());
        str.append(" sysID=").append(getSysID());
        str.append(" userID=").append(getUserID());
        str.append(" mTCN=").append(getMTCN());
        str.append(" payeeName=").append(getPayeeName());
        str.append(" cardID=").append(getCardID());
        str.append(" cardPAN=").append(getCardPAN());
        str.append(" accountNumber=").append(getAccountNumber());
        str.append(" phone=").append(getPhone());
        str.append(" clientID=").append(getClientID());
        str.append(" approxOrgFunds=").append(getApproxOrgFunds());
        str.append(" approxDstFunds=").append(getApproxDstFunds());
        str.append(" orgCountry=").append(getOrgCountry());
        str.append(" lang=").append(getLang());
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
        str.append(fmt(getMTCN()));
        str.append(fmt(getPayeeName()));
        str.append(fmt(getCardID()));
        str.append(fmt(getCardPAN()));
        str.append(fmt(getAccountNumber()));
        str.append(fmt(getPhone()));
        str.append(fmt(getClientID()));
        str.append(fmt(getApproxOrgFunds()));
        str.append(fmt(getApproxDstFunds()));
        str.append(fmt(getOrgCountry()));
        str.append(fmt(getLang()));
        return str.toString();
    }

}
