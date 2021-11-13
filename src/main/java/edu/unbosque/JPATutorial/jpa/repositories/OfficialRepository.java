package edu.unbosque.JPATutorial.jpa.repositories;

import edu.unbosque.JPATutorial.jpa.entities.Official;
import java.util.List;
import java.util.Optional;

public interface OfficialRepository {

        List<Official> findAll();

        Optional<Official> save(Official official);

        void deleteByUserName (String username);

}
