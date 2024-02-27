package com.java_spring_framework.kurs_spring.domain;


/**
 * Created by Adam Seweryn
 */

public class Knight {

    private String name;
    private int age;
    private Quest quest;

    public Knight() {
        this.name = "Lancelot";
        this.age = 29;

    }


    //    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }
    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza.");
        this.quest = quest;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + " (" + age + "). " + "Zadanie: " + quest;
    }

}
