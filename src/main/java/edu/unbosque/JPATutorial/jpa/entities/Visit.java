package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Visit") // Optional
@NamedQueries({
        @NamedQuery(name = "Visit.findByvisit_id",
                query = "SELECT a FROM Visit a WHERE a.visit_id = :visit_id")
})

public class Visit {

    @Id
    @Column(name = "visit_id",unique = true)
    private String visit_id;

    @Column(name = "created_at", nullable = false)
    private String created_at;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "description", nullable = false)
    private String description;

    @JoinColumn(name = "username", table="Vet")
    @Column(name = "vet_id", nullable = false)
    private String vet_id;

    @JoinColumn(name = "pet_id", table="Pet")
    @Column(name = "pet_id", nullable = false)
    private String pet_id;


}
