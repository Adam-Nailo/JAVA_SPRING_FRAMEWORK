package com.java_spring_framework.kurs_spring.domain;

import com.java_spring_framework.kurs_spring.domain.Castle;
import com.java_spring_framework.kurs_spring.domain.Knight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CastleTest {
    @Test
    public void castleToStringMessage(){
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle("Castle Black",knight);
        String expect = "Znajduje się tu zamek o nazwie Castle Black, zamieszkały jest on przez Rycerz o imieniu Lancelot (29). Zadanie: uratuj księżniczkę";
        Assertions.assertEquals(expect,castle.toString());
    }
}
