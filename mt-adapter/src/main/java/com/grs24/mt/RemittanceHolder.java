package com.grs24.mt;

import java.util.Date;

public class RemittanceHolder {

    // дентификатор денежного перевода в СДП
    private String mtID_;

    // дата отправки перевода
    private Date mtDate_;

    // Money Transfer Control Number, Контрольный Номер Перевода (КНП)
    private String mtcn_;

    // страна отправления перевода
    private String orgCountry_;

    // страна получения перевода
    private String dstCountry_;

    // сумма и валюта в которой перевод оплачен
    private FundsHolder orgFunds_;

    // сумма и валюта выдачи
    private FundsHolder dstFunds_;

    // полное имя отправителя
    private FullNameTypeHolder payer_;

    // полное имя получателя
    private FullNameTypeHolder payee_;

    public void setMtID(String mtID_) {
        this.mtID_ = mtID_;
    }

    public String getMtID() {
        return this.mtID_;
    }

    public void setMtDate(Date mtDate_) {
        this.mtDate_ = mtDate_;
    }

    public Date getMtDate() {
        return this.mtDate_;
    }

    public void setMtcn(String mtcn_) {
        this.mtcn_ = mtcn_;
    }

    public String getMtcn() {
        return this.mtcn_;
    }

    public void setOrgCountry(String orgCountry_) {
        this.orgCountry_ = orgCountry_;
    }

    public String getOrgCountry() {
        return this.orgCountry_;
    }

    public void setDstCountry(String dstCountry_) {
        this.dstCountry_ = dstCountry_;
    }

    public String getDstCountry() {
        return this.dstCountry_;
    }

    public void setOrgFunds(FundsHolder orgFunds_) {
        this.orgFunds_ = orgFunds_;
    }

    public FundsHolder getOrgFunds() {
        return this.orgFunds_;
    }

    public void setDstFunds(FundsHolder dstFunds_) {
        this.dstFunds_ = dstFunds_;
    }

    public FundsHolder getDstFunds() {
        return this.dstFunds_;
    }

    public void setPayer(FullNameTypeHolder payer_) {
        this.payer_ = payer_;
    }

    public FullNameTypeHolder getPayer() {
        return this.payer_;
    }

    public void setPayee(FullNameTypeHolder payee_) {
        this.payee_ = payee_;
    }

    public FullNameTypeHolder getPayee() {
        return this.payee_;
    }

	@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Remittance(");
        str.append(" mtID=").append(getMtID());
        str.append(" mtDate=").append(getMtDate());
        str.append(" mtcn=").append(getMtcn());
        str.append(" orgCountry=").append(getOrgCountry());
        str.append(" dstCountry=").append(getDstCountry());
        str.append(" orgFunds=").append(getOrgFunds());
        str.append(" dstFunds=").append(getDstFunds());
        str.append(" payer=").append(getPayer());
        str.append(" payee=").append(getPayee());
        str.append(")");
        return str.toString();
    }

}
