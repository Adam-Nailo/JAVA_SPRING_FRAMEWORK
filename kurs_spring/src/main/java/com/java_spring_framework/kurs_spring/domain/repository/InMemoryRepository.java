package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.Knight;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Adam Seweryn
 */

public class InMemoryRepository implements KnightRepository {

    Map<Integer, Knight> knights = new HashMap<>();

    public InMemoryRepository() {
    }

    @Override
    public void createKnight(String name, int age) {
        Knight newKnight = new Knight(name, age);
        newKnight.setId(getNewId());
        knights.put(newKnight.getId(), newKnight);
    }

    private int getNewId() {
        if (knights.isEmpty()) {
            return 0;
        } else {
           knights.keySet().stream().max(Integer::max);
           return
        }
    }

    @Override
    public Collection<Knight> getAllKnights() {
        return knights.values();
    }

    @Override
    public Optional<Knight> getKnight(String name) {

        Optional<Knight> knightByName = knights.values().stream().filter(knight -> knight.getName().equals(name)).findAny();

        return knightByName;
    }

    @Override
    public void deleteKnight(Integer id) {
        knights.remove(id);
    }

    @Override
    @PostConstruct
    public void build() {
        createKnight("Lancelot", 29);
        createKnight("Percival", 25);
    }

    @Override
    public void createKnight(Knight knight) {
        knight.setId(getNewId());
        knights.put(knight.getId(), knight);
    }

    @Override
    public Knight getKnightById(Integer id) {
        return knights.get(id);
    }

    @Override
    public String toString() {
        return "InMemoryRepository{" +
                "knights=" + knights +
                '}';
    }
}
