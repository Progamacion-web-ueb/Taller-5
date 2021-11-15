package edu.unbosque.JPATutorial.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "Official") // Optional
@NamedQueries({
        @NamedQuery(name = "Official.findByName",
                query = "SELECT a FROM Official a WHERE a.name = :name")
})

public class Official {
    // --------- Constructrores_______________


    public Official() {
    }

    public Official(String name) {
        this.name = name;
    }

    public Official(String username, String name) {
        this.username = username;
        this.name = name;
    }

    // --------- Columnas_______________
    @Id
    @JoinColumn(name = "username")
    private String username;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne(mappedBy = "official")
    private UserApp userapp;


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
