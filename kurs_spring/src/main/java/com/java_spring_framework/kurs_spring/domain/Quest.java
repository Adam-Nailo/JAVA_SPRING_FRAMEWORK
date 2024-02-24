package com.java_spring_framework.kurs_spring.domain;


import org.springframework.stereotype.Component;

/**
 * Created by Adam Seweryn
 */
@Component
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
