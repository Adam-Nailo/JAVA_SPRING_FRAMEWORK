package com.java_spring_framework.kurs_spring;

import com.java_spring_framework.kurs_spring.domain.Castle;
import com.java_spring_framework.kurs_spring.domain.Knight;
import com.java_spring_framework.kurs_spring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Adam Seweryn
 */
@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;
    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

        Quest saveThePrincess = new Quest("Uratuj księżniczkę.");
        Knight lancelot = new Knight("Lancelot", 29, saveThePrincess);

        System.out.println(lancelot);
        Quest killTheDragon = new Quest("Zabij smoka.");
        Knight persival = new Knight("Persival", 31);
        System.out.println(persival);
        persival.setQuest(killTheDragon);
        System.out.println(persival);
    }
}
