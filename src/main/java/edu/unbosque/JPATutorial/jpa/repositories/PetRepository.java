package edu.unbosque.JPATutorial.jpa.repositories;
import edu.unbosque.JPATutorial.jpa.entities.Pet;
import java.util.List;
import java.util.Optional;

public interface PetRepository {
    List<Pet> findAll();

    Optional<Pet> save(Pet pet);

    void deleteById (String Pet_ip);
}
