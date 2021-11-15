package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.Author;
import edu.unbosque.JPATutorial.jpa.entities.UserApp;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class UserAppRepositoryImpl implements UserAppRepository{

    private EntityManager entityManager;

    public UserAppRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<UserApp> findAll() {
        return entityManager.createQuery("from  UserApp ").getResultList();
    }

    @Override
    public Optional<UserApp> findByUserName(String username) {
        UserApp userApp = entityManager.find(UserApp.class, username);
        return userApp != null ? Optional.of(userApp) : Optional.empty();
    }


    @Override
    public Optional<UserApp> findByRole(String role) {
        UserApp userApp = entityManager.find(UserApp.class, role);
        return userApp != null ? Optional.of(userApp) : Optional.empty();
    }

    @Override
    public Optional<UserApp> save(UserApp userApp) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(userApp);
            entityManager.getTransaction().commit();
            return Optional.of(userApp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void deleteByUserName(String username) {
        UserApp userApp = entityManager.find(UserApp.class, username);
        if (userApp != null) {
            try {
                entityManager.remove(userApp);
                entityManager.getTransaction().commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
