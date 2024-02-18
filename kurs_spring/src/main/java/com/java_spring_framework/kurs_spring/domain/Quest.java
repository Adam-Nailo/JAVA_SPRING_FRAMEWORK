package com.java_spring_framework.kurs_spring.domain;

/**
 * Created by Adam Seweryn
 */
public class Quest {

    private String description;

    public Quest(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
