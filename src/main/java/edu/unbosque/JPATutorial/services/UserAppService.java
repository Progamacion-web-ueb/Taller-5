package edu.unbosque.JPATutorial.services;


import edu.unbosque.JPATutorial.jpa.entities.Author;
import edu.unbosque.JPATutorial.jpa.entities.UserApp;
import edu.unbosque.JPATutorial.jpa.repositories.UserAppRepository;
import edu.unbosque.JPATutorial.jpa.repositories.UserAppRepositoryImpl;
import edu.unbosque.JPATutorial.servlets.pojos.UserAppPojo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class UserAppService {

    UserAppRepository  userAppRepository;


    public List<UserAppPojo> listAuthors() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        userAppRepository = new UserAppRepositoryImpl(entityManager);
        List<UserApp> userApps = userAppRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();
        List<UserAppPojo> userAppPojo = new ArrayList<>();

        for (UserApp userApp : userApps) {
            userAppPojo.add(new UserAppPojo(
                    userApp.getUsername(),
                    userApp.getPasword(),
                    userApp.getEmail(),
                    userApp.getRole()

            ));
        }

        return userAppPojo;
    }

    public UserApp saveUserApp(String username,String password,String email,String role) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        userAppRepository = new UserAppRepositoryImpl(entityManager);

        UserApp userApp = new UserApp(username,password,email,role);
        UserApp persistedUserApp =  userAppRepository.save(userApp).get();

        entityManager.close();
        entityManagerFactory.close();

        return persistedUserApp;
    }





}
