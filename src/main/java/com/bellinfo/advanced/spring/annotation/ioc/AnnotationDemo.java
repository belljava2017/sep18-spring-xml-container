package com.bellinfo.advanced.spring.annotation.ioc;


import org.springframework.context.annotation.*;


public class AnnotationDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Laptop l = context.getBean("laptop", Laptop.class);
        System.out.println(l);

        Customer c = context.getBean("customer", Customer.class);
        System.out.println(c);

        Employee e = context.getBean("employee",Employee.class);
        System.out.println(e);

        Account account = context.getBean("account", Account.class);
        System.out.println(account);

    }


}

@Configuration
@PropertySource(value="application.properties")
@ComponentScan(basePackages = "com.bellinfo.advanced.spring.annotation.ioc")
class MyConfiguration{

    // Laptop laptop = new Laptop()
    @Bean
    Laptop laptop(){
        System.out.println("I'm called");
        return new Laptop();
    }

    @Bean
    Address address(){
        return new Address();
    }

    @Bean
    Customer customer(){
        return new Customer(address());
    }

    @Bean
    Department department(){
        return new Department(10, "IT");
    }

    @Bean
    Department department1(){
        return new Department(11, "HR");
    }

    @Bean
    Employee employee(){
        return new Employee();
    }

  /*  @Bean
    Account account(){
        return new Account();
    }*/

}

