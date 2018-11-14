package com.bellinfo.advanced.spring.ioc;

public class Car {
    String model;
    Double cost;

    public Car(String model, Double cost) {
        System.out.println("I'll create only when asked not at application star up");
        this.model = model;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
