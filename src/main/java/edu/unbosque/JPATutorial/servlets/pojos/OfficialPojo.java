package edu.unbosque.JPATutorial.servlets.pojos;

public class OfficialPojo {

    private String username;
    private String name;

    public OfficialPojo() {
    }

    public OfficialPojo(String username, String name) {
        this.username = username;
        this.name = name;
    }

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