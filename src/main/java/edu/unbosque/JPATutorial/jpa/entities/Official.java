package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Official") // Optional
@NamedQueries({
        @NamedQuery(name = "Official.findByName",
                query = "SELECT a FROM Official a WHERE a.name = :name")
})

public class Official {

    @Id
    @JoinColumn(name = "username",table="UserApp")
    @Column(name = "username")
    private String username;

    @Column(name = "name", nullable = false)
    private String name;


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
}
