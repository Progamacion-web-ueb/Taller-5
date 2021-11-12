package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "UserApp") // Optional
@NamedQueries({
        @NamedQuery(name = "UserApp.findByUserName",
                query = "SELECT a FROM UserApp a WHERE a.username = :username")
})
public class UserApp {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "password", nullable = false)
    private String pasword;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "role", nullable = false)
    private String role;


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
