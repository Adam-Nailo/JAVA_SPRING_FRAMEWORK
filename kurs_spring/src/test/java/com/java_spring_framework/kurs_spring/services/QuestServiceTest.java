package com.java_spring_framework.kurs_spring.services;

import com.java_spring_framework.kurs_spring.domain.Quest;
import com.java_spring_framework.kurs_spring.domain.repository.QuestRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class QuestServiceTest {

    @Mock
    QuestRepository repositoryMock;

    @Test
    public void returnNotStartedQuests() {

        List<Quest> quests = new ArrayList<>();

        Quest q1 = new Quest("Test quest 1");
        Quest q2 = new Quest("Test quest 2");
        Quest q3 = new Quest("Test quest 3");

        q2.setStarted(true);

        quests.add(q1);
        quests.add(q2);
        quests.add(q3);


        when(repositoryMock.getAll()).thenReturn(quests);

        QuestService qs = new QuestService();

        qs.setQuestRepository(repositoryMock);

        List<Quest> allNotStartedQuests = qs.getAllNotStartedQuests();

        assertEquals( 2, allNotStartedQuests.size());

    }

}