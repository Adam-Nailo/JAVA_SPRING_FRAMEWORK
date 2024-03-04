package com.java_spring_framework.kurs_spring.domain;


/**
 * Created by Adam Seweryn
 */

public class Knight {
    private int id;
    private String name;
    private int age;
    private int level;
    private Quest quest;

    public Knight() {

    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
        this.level = 1;
    }


    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza.");
        this.quest = quest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + " (" + age + "). " + "Zadanie: " + quest;
    }

}
