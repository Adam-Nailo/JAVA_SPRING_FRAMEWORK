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
    KnightRepository repository;
    public List<Knight> getAllKnights(){
        return new ArrayList<>(repository.getAllKnights());
    }

    public void saveKnight(Knight knight) {
        repository.createKnight(knight);
    }
}
