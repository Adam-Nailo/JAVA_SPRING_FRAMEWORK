package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.Knight;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adam Seweryn
 */

public class InMemoryRepository implements KnightRepository {

    Map<String, Knight> knights = new HashMap<>();

    public InMemoryRepository() {
    }

    @Override
    public void createKnight(String name, int age) {
        knights.put(name, new Knight(name, age));
    }

    @Override
    public Collection<Knight> getAllKnights() {
        return knights.values();
    }

    @Override
    public Knight getKnight(String name) {
        return knights.get(name);
    }

    @Override
    public void deleteKnight(String name) {
        knights.remove(name);
    }

    @Override
    @PostConstruct
    public void build() {
        createKnight("Lancelot", 29);
        createKnight("Percival", 25);
    }

    @Override
    public void createKnight(Knight knight) {
        knights.put(knight.getName(),knight);
    }

    @Override
    public String toString() {
        return "InMemoryRepository{" +
                "knights=" + knights +
                '}';
    }
}
