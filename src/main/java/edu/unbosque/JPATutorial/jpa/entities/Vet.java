package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Vet") // Optional
@NamedQueries({
        @NamedQuery(name = "Vet.findByName",
                query = "SELECT a FROM Author a WHERE a.name = :name")
})

public class Vet {

    @Id
    @JoinColumn(name = "username")
    @Column(name = "username")
    private String username;


}
