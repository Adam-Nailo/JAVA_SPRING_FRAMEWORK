package com.java_spring_framework.kurs_spring;

import com.java_spring_framework.kurs_spring.domain.repository.KnightRepository;

import com.java_spring_framework.kurs_spring.domain.repository.QuestRepository;
import com.java_spring_framework.kurs_spring.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Adam Seweryn
 */
@Component
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Override
    public void run(String... args) throws Exception {
        questService.assignRandomQuest("Lancelot");
        questService.assignRandomQuest("Percival");

        System.out.println(knightRepository);
    }
}
