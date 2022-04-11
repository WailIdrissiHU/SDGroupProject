package com.example.sdgroupproject.domeinModel;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

public class Student {
    private int id;
    private SimpleStringProperty naam;
    private SimpleStringProperty achterNaam;
    private CheckBox presentie;
    private String email;
    private String wachtWoord;
    private String opleiding;

    public Student(String naam, String achterNaam) {
        this.naam = new SimpleStringProperty(naam);
        this.achterNaam = new SimpleStringProperty(achterNaam);
    }

    public String getNaam() {
        return naam.get();
    }

    public String getAchterNaam() {
        return achterNaam.get();
    }

    public SimpleStringProperty achterNaamProperty() {
        return achterNaam;
    }

    public SimpleStringProperty naamProperty() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam.set(naam);
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam.set(achterNaam);
    }

    public void setWachtWoord(String wachtWoord) {
        this.wachtWoord = wachtWoord;
    }
}
