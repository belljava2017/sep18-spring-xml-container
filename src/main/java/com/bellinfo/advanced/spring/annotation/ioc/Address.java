package com.bellinfo.advanced.spring.annotation.ioc;

public class Address {

    int hno = 123;
    String street = "Dogwood Glen";

    @Override
    public String toString() {
        return "Address{" +
                "hno=" + hno +
                ", street='" + street + '\'' +
                '}';
    }
}
