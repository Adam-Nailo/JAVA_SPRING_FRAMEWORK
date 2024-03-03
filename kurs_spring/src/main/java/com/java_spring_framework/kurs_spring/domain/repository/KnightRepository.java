package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.Knight;
import jakarta.annotation.PostConstruct;

import java.util.Collection;

public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    void deleteKnight(String name);

    void build();

    void createKnight(Knight knight);
}
