package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Visit") // Optional
@NamedQueries({
        @NamedQuery(name = "Visit.findByvisit_id",
                query = "SELECT a FROM Visit a WHERE a.visit_id = :visit_id")
})

public class Visit {
    // ---------Constructrores_______________


    public Visit() {
    }

    public Visit(String visit_id, String created_at, String type, String description, String vet_id, String pet_id) {
        this.visit_id = visit_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.vet_id = vet_id;
        this.pet_id = pet_id;
    }

    // --------- Columnas___________________
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
