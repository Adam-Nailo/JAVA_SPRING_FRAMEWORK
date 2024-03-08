package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.Knight;
import com.java_spring_framework.kurs_spring.domain.Quest;
import com.java_spring_framework.kurs_spring.utils.Ids;
import jakarta.annotation.PostConstruct;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class QuestRepository {

    Random rand = new Random();

    Map<Integer, Quest> quests = new HashMap<>();


    public void createQuest(String description) {
        int newId = Ids.getNewId(quests.keySet());
        Quest newQuest = new Quest(newId, description);
        quests.put(newId, newQuest);
    }

    public List<Quest> getAll() {
        return new ArrayList<>(quests.values());
    }

    public void deleteQuest(Quest quest) {
        quests.remove(quest.getId());
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "quests=" + quests +
                '}';
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj księżniczkę.");
        descriptions.add("Weż udział w turnieju.");
        descriptions.add("Zabij bandę goblinów.");
        descriptions.add("Zabij smoka.");

        String description = descriptions.get(rand.nextInt(descriptions.size()));
        createQuest(description);

    }

    public void update(Quest quest) {
        quests.put(quest.getId(), quest);
    }

    public Quest getQuest(Integer id) {
        return quests.get(id);
    }
}
