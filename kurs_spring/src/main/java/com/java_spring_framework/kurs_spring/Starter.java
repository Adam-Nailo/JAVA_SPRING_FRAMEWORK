package com.java_spring_framework.kurs_spring;

import com.java_spring_framework.kurs_spring.domain.PlayerInformation;
import com.java_spring_framework.kurs_spring.domain.repository.*;

import com.java_spring_framework.kurs_spring.services.QuestService;
import com.java_spring_framework.kurs_spring.utils.Role;
import com.java_spring_framework.kurs_spring.utils.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
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
    RoleRepository roleRepository;

    @Autowired
    PlayerInformationRepository playerInformationRepository;

    @Autowired
    QuestService questService;

    @Override
    @Transactional
    public void run(String... args) {
        questRepository.createRandomQuest();
        questRepository.createRandomQuest();

        knightRepository.createKnight("Percival", 32);

        PlayerInformation playerInformation1 = new PlayerInformation("user1", "user1");
        playerInformationRepository.createPlayerInformation(playerInformation1);
        PlayerInformation playerInformation2 = new PlayerInformation("user2", "user2");
        playerInformationRepository.createPlayerInformation(playerInformation2);

        Role user1RoleUSER = new Role("user1", "USER");
        Role user2RoleUSER = new Role("user2", "USER");
        Role user2RoleADMIN = new Role("user2", "ADMIN");

        roleRepository.persistRole(user1RoleUSER);
        roleRepository.persistRole(user2RoleUSER);
        roleRepository.persistRole(user2RoleADMIN);

        questService.assignRandomQuest("Percival");
    }
}
