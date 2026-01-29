package com.klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Course course;

    public void display() {
        System.out.println("Course name is: " + course.getCoursename());
    }
}
