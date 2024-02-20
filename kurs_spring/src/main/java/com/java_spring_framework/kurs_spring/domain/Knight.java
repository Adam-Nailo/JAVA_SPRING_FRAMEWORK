package com.java_spring_framework.kurs_spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Adam Seweryn
 */
@Component
public class Knight {

    private String name = "Lancelot";
    private int age = 29;
    private Quest quest;

    public Knight() {

    }


//    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }
//    public Knight(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
@Autowired
    public void setQuest(Quest quest) {
    System.out.println("Ustawiam zadanie dla rycerza.");
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + " (" + age + "). " + "Zadanie: " + quest;
    }
}
