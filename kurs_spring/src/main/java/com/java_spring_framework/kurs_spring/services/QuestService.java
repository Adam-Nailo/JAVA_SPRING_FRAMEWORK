package com.java_spring_framework.kurs_spring.services;

import com.java_spring_framework.kurs_spring.domain.Quest;
import com.java_spring_framework.kurs_spring.domain.repository.InMemoryRepository;
import com.java_spring_framework.kurs_spring.domain.repository.KnightRepository;
import com.java_spring_framework.kurs_spring.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    final static Random rand = new Random();

    public void assignRandomQuest(String knightName) {
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(rand.nextInt(allQuests.size()));
        knightRepository.getKnight(knightName).ifPresent(knight -> knight.setQuest(randomQuest));
        questRepository.deleteQuest(randomQuest);
    }

}
