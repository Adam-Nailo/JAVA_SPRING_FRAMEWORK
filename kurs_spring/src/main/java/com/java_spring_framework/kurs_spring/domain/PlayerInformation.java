package com.java_spring_framework.kurs_spring.domain;

import org.springframework.stereotype.Component;

@Component
public class PlayerInformation {

    private int gold = 0;

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
