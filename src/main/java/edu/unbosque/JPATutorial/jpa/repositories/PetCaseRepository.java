package edu.unbosque.JPATutorial.jpa.repositories;
import edu.unbosque.JPATutorial.jpa.entities.PetCase;
import java.util.List;
import java.util.Optional;

public interface PetCaseRepository {
    List<PetCase> findAll();

    Optional<PetCase> save(PetCase petcase);

    void deleteById (String case_id);
}
