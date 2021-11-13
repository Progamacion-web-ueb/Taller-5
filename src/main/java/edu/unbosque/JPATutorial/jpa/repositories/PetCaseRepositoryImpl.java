package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.PetCase;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class PetCaseRepositoryImpl implements PetCaseRepository{

    private EntityManager entityManager;

    public PetCaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<PetCase> findAll() {
        return entityManager.createQuery("from  PetCase ").getResultList();
    }

    @Override
    public Optional<PetCase> save(PetCase petcase) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(petcase);
            entityManager.getTransaction().commit();
            return Optional.of(petcase);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void deleteById(String case_id) {

    }
}
