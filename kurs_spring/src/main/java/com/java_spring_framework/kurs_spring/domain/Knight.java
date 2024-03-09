package com.java_spring_framework.kurs_spring.domain;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;


/**
 * Created by Adam Seweryn
 */

public class Knight {
    private int id;

    @NotNull
    @Size(min = 2, max = 40, message = "Imie rycerza musi miec miedzy 2, a 40 znakow.")
    private String name;
    @NotNull
    @Range(min = 18, max = 60, message = "Rycerz musi miec conajmniej 18 lat, a nie wiecej niz 60.")
    private int age;
    private int level;
    private Quest quest;

    public Knight() {
        this.level = 1;
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
        this.level = 1;
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

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {

        if(quest!=null){
            quest.setStarted(true);
        }
        this.quest = quest;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + " (" + age + "). " + "Zadanie: " + quest;
    }

}
