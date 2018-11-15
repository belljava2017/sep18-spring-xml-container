package com.bellinfo.advanced.spring.annotation.ioc;

public class Department {

    int depId;
    String depName;

    public Department(int depId, String depName) {
        this.depId = depId;
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", depName='" + depName + '\'' +
                '}';
    }
}
