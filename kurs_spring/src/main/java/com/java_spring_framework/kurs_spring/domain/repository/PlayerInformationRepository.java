package com.java_spring_framework.kurs_spring.domain.repository;

import com.java_spring_framework.kurs_spring.domain.PlayerInformation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerInformationRepository {

    @PersistenceContext
    private EntityManager em;
    @Transactional
    public void createPlayerInformation(PlayerInformation playerInformation) {

        PlayerInformation pi = new PlayerInformation();

        em.persist(pi);


    }

    public PlayerInformation getFirst() {
        return em.createQuery("from PlayerInformation", PlayerInformation.class).getResultList().get(0);
    }
}
