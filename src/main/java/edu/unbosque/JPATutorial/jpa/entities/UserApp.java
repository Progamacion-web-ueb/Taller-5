package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userApp") // Optional
@NamedQueries({
        @NamedQuery(name = "UserApp.findByUserName",
                query = "SELECT a FROM UserApp a WHERE a.username = :username")
})
public class UserApp {

    // --------- Columnas___________________

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password", nullable = false)
    private String pasword;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "role", nullable = false)
    private String role;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "username")
    private Owner owner;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "vet_username")
    private Vet vet;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "official_username")
    private Official official;

    public Official getOfficial() {
        return official;
    }

    public void setOfficial(Official official) {
        this.official = official;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

// ---------Constructrores_______________


    public UserApp() {
    }


    public UserApp(String username, String pasword, String email, String role) {
        this.username = username;
        this.pasword = pasword;
        this.email = email;
        this.role = role;
    }


    // ---------getter y setter_______________
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
