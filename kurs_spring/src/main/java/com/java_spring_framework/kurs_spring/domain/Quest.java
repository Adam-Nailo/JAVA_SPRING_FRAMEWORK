package com.java_spring_framework.kurs_spring.domain;



/**
 * Created by Adam Seweryn
 */

public class Quest {

    private String description;

    public Quest() {
        this.description = "uratuj księżniczkę";
    }

    @Override
    public String toString() {
        return description;
    }
}
