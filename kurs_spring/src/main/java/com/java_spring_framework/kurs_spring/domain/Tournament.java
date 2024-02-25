package com.java_spring_framework.kurs_spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class Tournament {

//    @Autowired
    Map<String,Knight> knights;

    public Tournament() {
    }

    public void setKnights(Map<String, Knight> knights) {
        this.knights = knights;
    }

    public void duel() {
//        knight.setAge(knight.getAge() + 1);
    }

    @Override
    public String toString() {
        return "W turnieju biorą udział rycerze: " + knights.stream().map(Object::toString).collect(Collectors.joining(","));
    }
}
