package com.bellinfo.advanced.spring.annotation.ioc;

import org.springframework.context.annotation.Bean;

public class Customer {

    Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address +
                '}';
    }
}
