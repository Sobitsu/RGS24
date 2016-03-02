package com.grs24.mt;

public class IndividualHolder {

    private String first_;
    private String middle_;
    private String last_;

    public void setFirst(String First_) {
        this.first_ = First_;
    }

    public String getFirst() {
        return this.first_;
    }

    public void setMiddle(String Middle_) {
        this.middle_ = Middle_;
    }

    public String getMiddle() {
        return this.middle_;
    }

    public void setLast(String Last_) {
        this.last_ = Last_;
    }

    public String getLast() {
        return this.last_;
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("Individual(");
        str.append(" first=").append(getFirst());
        str.append(" middle=").append(getMiddle());
        str.append(" last=").append(getLast());
        str.append(")");
        return str.toString();
    }

}

