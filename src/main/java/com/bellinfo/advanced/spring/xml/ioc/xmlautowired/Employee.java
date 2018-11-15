package com.bellinfo.advanced.spring.xml.ioc.xmlautowired;

public class Employee {

    Department department1;

    public Employee(Department department1) {
        this.department1 = department1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department1=" + department1 +
                '}';
    }
}
