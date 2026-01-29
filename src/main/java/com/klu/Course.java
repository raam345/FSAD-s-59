package com.klu;

import org.springframework.stereotype.Component;

@Component
public class Course {

    private String coursename = "FSAD - Spring";

    public String getCoursename() {
        return coursename;
    }
}
