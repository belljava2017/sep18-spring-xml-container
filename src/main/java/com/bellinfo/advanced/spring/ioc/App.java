package com.bellinfo.advanced.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
        Laptop l=context.getBean("hp",Laptop.class);
        System.out.println(l);

        Movie movie = context.getBean("m1",Movie.class);
        System.out.println(movie);

        Customer customer = context.getBean("customer", Customer.class);
        System.out.println(customer);

        Car car = context.getBean("car", Car.class);

        DBConnection connection = context.getBean("con",DBConnection.class);
        System.out.println(connection);


    }
}
