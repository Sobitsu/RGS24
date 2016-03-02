package com.grs24.mt;

import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;

public class CredentialsHolder  {
    
    // ISO 3166-1 alpha-3 код страны эмитента документа
    private String cCountry_;
    private String cType_;
    private String serialNumber_;
    private String cNumber_;
    private String issuer_;
    private String issuerCode_;
    private String issueCity_;
    private Date issueDate_;
    private Date expiryDate_;

    public void setCCountry(String CCountry_) {
        this.cCountry_ = CCountry_;
    }

    public String getCCountry() {
        return this.cCountry_;
    }

    public void setCType(String CType_) {
        this.cType_ = CType_;
    }

    public String getCType() {
        return this.cType_;
    }

    public void setSerialNumber(String SerialNumber_) {
        this.serialNumber_ = SerialNumber_;
    }

    public String getSerialNumber() {
        return this.serialNumber_;
    }

    public void setCNumber(String CNumber_) {
        this.cNumber_ = CNumber_;
    }

    public String getCNumber() {
        return this.cNumber_;
    }

    public void setIssuer(String Issuer_) {
        this.issuer_ = Issuer_;
    }

    public String getIssuer() {
        return this.issuer_;
    }

    public void setIssuerCode(String IssuerCode_) {
        this.issuerCode_ = IssuerCode_;
    }

    public String getIssuerCode() {
        return this.issuerCode_;
    }

    public void setIssueCity(String IssueCity_) {
        this.issueCity_ = IssueCity_;
    }

    public String getIssueCity() {
        return this.issueCity_;
    }

    public void setIssueDate(Date IssueDate_) {
        this.issueDate_ = IssueDate_;
    }

    public Date getIssueDate() {
        return this.issueDate_;
    }

    public void setExpiryDate(Date ExpiryDate_) {
        this.expiryDate_ = ExpiryDate_;
    }

    public Date getExpiryDate() {
        return this.expiryDate_;
    }


    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Credentials(");
        str.append(" cCountry=").append(getCCountry());
        str.append(" cType=").append(getCType());
        str.append(" serialNumber=").append(getSerialNumber());
        str.append(" cNumber=").append(getCNumber());
        str.append(" issuer=").append(getIssuer());
        str.append(" issuerCode=").append(getIssuerCode());
        str.append(" issueCity=").append(getIssueCity());
        str.append(" issueDate=").append(getIssueDate());
        str.append(" expiryDate=").append(getExpiryDate());
        str.append(")");
        return str.toString();
    }

}

