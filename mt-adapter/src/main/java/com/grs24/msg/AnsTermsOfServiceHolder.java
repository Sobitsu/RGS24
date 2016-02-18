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
public class AnsTermsOfServiceHolder implements Stickable {
    protected static Logger syslog = Logger.getLogger(AnsTermsOfServiceHolder.class.getName());

    private String stan;
    private String timeStamp;
    private String remID;
    private BigDecimal termsOfServiceVersion;
    private TermsOfServiceHolder[] termsOfService;

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

    public void setRemID(String RemID) {
        this.remID = RemID;
    }

    public String getRemID() {
        return this.remID;
    }

    public void setTermsOfServiceVersion(BigDecimal TermsOfServiceVersion) {
        this.termsOfServiceVersion = TermsOfServiceVersion;
    }

    public BigDecimal getTermsOfServiceVersion() {
        return this.termsOfServiceVersion;
    }

    public void setTermsOfService(TermsOfServiceHolder[] TermsOfService) {
        this.termsOfService = TermsOfService;
    }

    public TermsOfServiceHolder[] getTermsOfService() {
        return this.termsOfService;
    }

    public AnsTermsOfServiceHolder() {
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("AnsTermsOfService(");
        str.append(" stan=").append(getStan());
        str.append(" timeStamp=").append(getTimeStamp());
        str.append(" remID=").append(getRemID());
        str.append(" termsOfServiceVersion=").append(getTermsOfServiceVersion());
        if ( getTermsOfService() != null )
            for (int i=0; i < getTermsOfService().length; i++) {
                str.append(" termsOfService["+i+"]=").append(getTermsOfService()[i]);
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
        str.append(fmt(getStan()));
        str.append(fmt(getTimeStamp()));
        str.append(fmt(getRemID()));
        str.append(fmt(getTermsOfServiceVersion()));
        if ( getTermsOfService() != null )
            for (int i=0; i < getTermsOfService().length; i++) {
                str.append(fmt(getTermsOfService()[i]));
            }
        return str.toString();
    }

}

