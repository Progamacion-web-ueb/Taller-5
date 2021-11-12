package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Pet") // Optional
@NamedQueries({
        @NamedQuery(name = "Pet.findByName",
                query = "SELECT a FROM Pet a WHERE a.name = :name")
})
public class Pet {

    @Id
    @Column(name = "pet_id",unique = true)
    private String pet_id;

    @Column(name = "microchip",nullable = false, unique = true)
    private String microchip;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "species",nullable = false)
    private String species;

    @Column(name = "race",nullable = false)
    private String race;

    @Column(name = "size",nullable = false)
    private String size;

    @Column(name = "sex",nullable = false)
    private String sex;

    @Column(name = "pircture",nullable = false)
    private String pircture;

    @Column(name = "owner_id",nullable = false)
    @JoinColumn(name = "username", table="Owner")
    private String owner_id;

    // ---------getter y setter_______________


    public String getPet_id() {
        return pet_id;
    }

    public void setPet_id(String pet_id) {
        this.pet_id = pet_id;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPircture() {
        return pircture;
    }

    public void setPircture(String pircture) {
        this.pircture = pircture;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }
}
