package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.Knight;
import jakarta.annotation.PostConstruct;

import java.util.Collection;
import java.util.Optional;

public interface KnightRepository {
    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Optional<Knight> getKnight(String name);

    void deleteKnight(Integer id);

    void build();

    void createKnight(Knight knight);

    Knight getKnightById(Integer id);
}
