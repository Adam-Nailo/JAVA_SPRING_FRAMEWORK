package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.Knight;
import com.java_spring_framework.kurs_spring.domain.Quest;
import com.java_spring_framework.kurs_spring.utils.Ids;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class QuestRepository {

    @PersistenceContext
    private EntityManager em;

    Random rand = new Random();

    @Transactional
    public void createQuest(String description) {

        Quest newQuest = new Quest(description);

        em.persist(newQuest);

        System.out.println(newQuest);
    }

    public List<Quest> getAll() {
        return em.createQuery("from Quest", Quest.class).getResultList();
    }

    @Transactional
    public void deleteQuest(Quest quest) {
        em.remove(quest);
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    @Transactional
    public void createRandomQuest() {
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj księżniczkę.");
        descriptions.add("Weż udział w turnieju.");
        descriptions.add("Zabij bandę goblinów.");
        descriptions.add("Zabij smoka.");

        String description = descriptions.get(rand.nextInt(descriptions.size()));
        createQuest(description);

    }

    @Transactional
    public void update(Quest quest) {
        em.merge(quest);
    }

    public Quest getQuest(Integer id) {
        return em.find(Quest.class, id);
    }
}
