package com.bellinfo.advanced.spring.xml.ioc;

public class Customer {
    String name;
    Address address;

    public void setName(String name) {
        this.name = name;
    }

    public Customer(Address address) {
        System.out.println("I'm inside Customer and created at application start up");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
