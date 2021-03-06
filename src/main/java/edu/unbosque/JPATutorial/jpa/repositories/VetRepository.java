package edu.unbosque.JPATutorial.jpa.repositories;
import edu.unbosque.JPATutorial.jpa.entities.Vet;
import java.util.List;
import java.util.Optional;

public interface VetRepository {
    List<Vet> findAll();

    Optional<Vet> save(Vet vet);

    void deleteByUserName (String username);
}
