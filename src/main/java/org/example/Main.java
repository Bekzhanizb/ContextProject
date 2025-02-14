package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Laptop laptop = (Laptop) context.getBean("laptop");

        System.out.println(laptop.getName() + " " + laptop.getVideoCard().getName());
    }
}