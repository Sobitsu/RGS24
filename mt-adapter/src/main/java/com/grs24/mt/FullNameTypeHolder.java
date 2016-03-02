package com.grs24.mt;

public class FullNameTypeHolder {

    private IndividualHolder individual_;

    public void setIndividual(IndividualHolder Individual_) {
        this.individual_ = Individual_;
    }

    public IndividualHolder getIndividual() {
        return this.individual_;
    }


	@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("FullNameType(");
        str.append(" individual=").append(getIndividual());
        str.append(")");
        return str.toString();
    }

}

