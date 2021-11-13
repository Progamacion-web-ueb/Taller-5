package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "PetCase") // Optional
@NamedQueries({
        @NamedQuery(name = "Pet.findById",
                query = "SELECT a FROM PetCase a WHERE a.case_id = :case_id")
})

public class PetCase {
    // ---------Constructrores_______________

    public PetCase() {
    }

    public PetCase(String case_id, String created_at, String type, String description, String pet_id) {
        this.case_id = case_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.pet_id = pet_id;
    }

    // --------- Columnas___________________
    @Id
    @Column(name = "case_id",unique = true)
    private String case_id;

    @Column(name = "created_at",nullable = false)
    private String created_at;

    @Column(name = "type",nullable = false)
    private String type;

    @Column(name = "description",nullable = false)
    private String description;


    @Column(name = "pet_id",nullable = false)
    @JoinColumn(name = "pet_id", table="Pet")
    private String pet_id;


    // ---------getter y setter_______________

    public java.lang.String getCase_id() {
        return case_id;
    }

    public void setCase_id(String case_id) {
        this.case_id = case_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPet_id() {
        return pet_id;
    }

    public void setPet_id(String pet_id) {
        this.pet_id = pet_id;
    }
}
