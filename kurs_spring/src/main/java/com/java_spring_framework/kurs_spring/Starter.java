package com.java_spring_framework.kurs_spring;

import com.java_spring_framework.kurs_spring.domain.Castle;
import com.java_spring_framework.kurs_spring.domain.Knight;
import com.java_spring_framework.kurs_spring.domain.Quest;

import com.java_spring_framework.kurs_spring.domain.Tournament;
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

    @Autowired
    Tournament tournament;
    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);
        tournament.duel();
        System.out.println(tournament);

    }
}
