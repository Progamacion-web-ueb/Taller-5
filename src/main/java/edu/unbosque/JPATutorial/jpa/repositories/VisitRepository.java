package edu.unbosque.JPATutorial.jpa.repositories;


import edu.unbosque.JPATutorial.jpa.entities.Visit;
import java.util.List;
import java.util.Optional;

public interface VisitRepository {
    List<Visit> findAll();

    Optional<Visit> save(Visit visit);

    void deleteById (String visit_id);
}
