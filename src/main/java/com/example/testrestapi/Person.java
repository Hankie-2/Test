package com.example.testrestapi;

import com.example.testrestapi.something.BaseEntity;

public class Person extends BaseEntity {

    private String msisdn;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "msisdn='" + msisdn + '\'' +
                '}';
    }
}
