package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.Quest;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestRepository {
    List<Quest> questList = new ArrayList<>();

    public void createQuest (String description){
        questList.add(new Quest(description));
    }

    public List<Quest> getAll(){
        return questList;
    }

    public void deleteQuest (Quest quest){
        questList.remove(quest);
    }

    @PostConstruct
    public void init(){
        createQuest("Uratuj księżniczkę.");
        createQuest("Weż udział w turnieju.");
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
}
