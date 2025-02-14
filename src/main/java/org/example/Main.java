package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Laptop laptop = context.getBean("lenovo", Laptop.class);
        Laptop gigabyte = context.getBean("gigabyte", Laptop.class);


        System.out.println(laptop.getName() + " " + laptop.getVideoCard().getName());
        System.out.println(gigabyte.getName() + " " + gigabyte.getVideoCard().getName());
    }
}