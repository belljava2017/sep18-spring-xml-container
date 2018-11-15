package com.bellinfo.advanced.spring.xml.ioc;

public class Movie {
    String name;
    double rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
