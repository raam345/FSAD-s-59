package com.klu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiringusingannotation {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		ApplicationContext context =
                new ClassPathXmlApplicationContext("beanconfig.xml");

        Student s = context.getBean(Student.class);
        s.display();
    }
}
