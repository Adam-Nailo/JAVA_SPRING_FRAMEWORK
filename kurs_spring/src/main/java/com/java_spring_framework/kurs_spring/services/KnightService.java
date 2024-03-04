package com.java_spring_framework.kurs_spring.services;


import com.java_spring_framework.kurs_spring.domain.Knight;
import com.java_spring_framework.kurs_spring.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KnightService {

    @Autowired
    KnightRepository knightRepository;
    public List<Knight> getAllKnights(){
        return new ArrayList<>(knightRepository.getAllKnights());
    }

    public void saveKnight(Knight knight) {
        knightRepository.createKnight(knight);
    }

    public Knight getKnight(Integer id) {
        return knightRepository.getKnightById(id);
    }
}
