package com.java_spring_framework.kurs_spring;

import com.java_spring_framework.kurs_spring.domain.PlayerInformation;
import com.java_spring_framework.kurs_spring.domain.repository.InMemoryRepository;

import com.java_spring_framework.kurs_spring.domain.repository.KnightRepository;
import com.java_spring_framework.kurs_spring.domain.repository.PlayerInformationRepository;
import com.java_spring_framework.kurs_spring.domain.repository.QuestRepository;
import com.java_spring_framework.kurs_spring.services.QuestService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Adam Seweryn
 */
@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    PlayerInformationRepository playerInformationRepository;

    @Autowired
    QuestService questService;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

        knightRepository.createKnight("Percival",32);

        playerInformationRepository.createPlayerInformation(new PlayerInformation());

        questService.assignRandomQuest("Percival");
    }
}
