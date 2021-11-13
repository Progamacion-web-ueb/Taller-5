package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.UserApp;
import java.util.List;
import java.util.Optional;

public interface UserAppRepository {

    List<UserApp> findAll();

    Optional<UserApp> findByUserName(String username);

    Optional<UserApp> findByRole(String role);

    Optional<UserApp> save(UserApp userApp);

    void deleteByUserName(String username);

}
