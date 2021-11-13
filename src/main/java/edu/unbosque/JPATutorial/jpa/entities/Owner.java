package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Owner") // Optional
@NamedQueries({
        @NamedQuery(name = "Owner.findByName",
                query = "SELECT a FROM Owner a WHERE a.name = :name")
})

public class Owner {
    // ---------Constructrores_______________


    public Owner() {
    }

    public Owner(String name) {
        this.name = name;
    }

    public Owner(String username, String person_id, String name, String address, String neghborhood) {
        this.username = username;
        this.person_id = person_id;
        this.name = name;
        this.address = address;
        this.neghborhood = neghborhood;
    }

    public Owner(String name, String address, String neghborhood) {
        this.name = name;
        this.address = address;
        this.neghborhood = neghborhood;
    }

    // --------- Columnas_______________
    @Id
    @JoinColumn(name = "username",table="UserApp")
    @Column(name = "username")
    private String username;

    @Column(name = "person_id",nullable = false, unique = true)
    private String person_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "neghborhood", nullable = false)
    private String neghborhood;


    // ---------getter y setter_______________

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeghborhood() {
        return neghborhood;
    }

    public void setNeghborhood(String neghborhood) {
        this.neghborhood = neghborhood;
    }
}
