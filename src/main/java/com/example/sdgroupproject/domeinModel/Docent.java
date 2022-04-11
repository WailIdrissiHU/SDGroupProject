package com.example.sdgroupproject.domeinModel;

public class Docent {
    private Integer id;
    private String naam;
    private String email;
    private String wachtWoord;

    public Docent(Integer id, String naam, String email, String wachtWoord) {
        this.id = id;
        this.naam = naam;
        this.email = email;
        this.wachtWoord = wachtWoord;
    }

    public Integer getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String getEmail() {
        return email;
    }

    public String getWachtWoord() {
        return wachtWoord;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWachtWoord(String wachtWoord) {
        this.wachtWoord = wachtWoord;
    }
}
