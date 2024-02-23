package com.java_spring_framework.kurs_spring;

public enum PersonUtils {

    INSTANCE;

    public final String operacja(Person person){
        return person.name.toUpperCase();
    }
}
