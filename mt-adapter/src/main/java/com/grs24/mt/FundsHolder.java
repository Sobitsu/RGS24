package com.grs24.mt;

import java.math.BigDecimal;
import java.math.BigInteger;


public class FundsHolder  {

    // сумма в минимальных единицах валюты
    private BigDecimal amount_;
    // ISO 4217 символьный код валюты
    private String cur_;

    public void setAmount(BigDecimal Amount_) {
        this.amount_ = Amount_;
    }

    public BigDecimal getAmount() {
        return this.amount_;
    }

    public void setCur(String Cur_) {
        this.cur_ = Cur_;
    }

    public String getCur() {
        return this.cur_;
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Funds(");
        str.append(" amount=").append(getAmount());
        str.append(" cur=").append(getCur());
        str.append(")");
        return str.toString();
    }

}

