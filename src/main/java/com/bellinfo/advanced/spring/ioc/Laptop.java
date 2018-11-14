package com.bellinfo.advanced.spring.ioc;

public class Laptop {

    String name;
    double cost;

    public Laptop(String name, double cost) {
        System.out.println("I'm inside Laptop and created at application start up");
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
