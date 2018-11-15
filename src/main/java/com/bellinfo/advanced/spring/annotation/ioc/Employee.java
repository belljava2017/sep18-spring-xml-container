package com.bellinfo.advanced.spring.annotation.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Qualifier(value = "department1")
    @Autowired
    Department dep;

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + dep +
                '}';
    }
}
