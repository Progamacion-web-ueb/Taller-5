package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Vet") // Optional
@NamedQueries({
        @NamedQuery(name = "Vet.findByName",
                query = "SELECT a FROM Vet a WHERE a.name = :name")
})

public class Vet {

    @Id
    @JoinColumn(name = "username",table="UserApp")
    @Column(name = "username")
    private String username;

    @Column(name = "name",nullable = false, unique = true)
    private String name;

    @Column(name = "address",nullable = false, unique = true)
    private String address;

    @Column(name = "neghborhood",nullable = false, unique = true)
    private String neghborhood;

    // ---------getter y setter_______________

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
