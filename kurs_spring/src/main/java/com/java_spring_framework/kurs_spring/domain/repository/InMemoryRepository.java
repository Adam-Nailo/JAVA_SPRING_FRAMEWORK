package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.Knight;
import com.java_spring_framework.kurs_spring.utils.Ids;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;

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
        newKnight.setId(Ids.getNewId(knights.keySet()));
        knights.put(newKnight.getId(), newKnight);
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
        knight.setId(Ids.getNewId(knights.keySet()));
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
