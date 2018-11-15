package com.bellinfo.advanced.spring.xml.ioc;

import java.util.Properties;

public class DBConnection {

    String driver;
    String url;
    String username;
    String password;

    Properties dbDetails;

    public void setDbDetails(Properties dbDetails) {
        this.dbDetails = dbDetails;
        driver = dbDetails.getProperty("pg.driver");
        url = dbDetails.getProperty("pg.url");
        username = dbDetails.getProperty("pg.user");
        password = dbDetails.getProperty("pg.pass");
    }

    @Override
    public String toString() {
        return "DBConnection{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dbDetails=" + dbDetails +
                '}';
    }
}
