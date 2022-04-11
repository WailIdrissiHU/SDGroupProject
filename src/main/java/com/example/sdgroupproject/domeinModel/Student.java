package com.example.sdgroupproject.domeinModel;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

public class Student {
    private int id;
    private SimpleStringProperty naam;
    private SimpleStringProperty achterNaam;
    private CheckBox presentie;
    private boolean presentieBoolean;
    private String email;
    private String wachtWoord;
    private String opleiding;

    public Student(String naam, String achterNaam) {
        this.naam = new SimpleStringProperty(naam);
        this.achterNaam = new SimpleStringProperty(achterNaam);
        this.presentie = new CheckBox();
    }

    public String getNaam() {
        return naam.get();
    }

    public String getAchterNaam() {
        return achterNaam.get();
    }

    public CheckBox getPresentie() {
        return presentie;
    }

    public boolean isPresentie() {
        return presentieBoolean;
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

    public void setPresentie(CheckBox presentie) {
        this.presentie = presentie;
    }

    public Boolean setPresentieBoolean(CheckBox presentie1) {
        if (presentie1.isSelected()) {
            return this.presentieBoolean = true;
        } return this.presentieBoolean = false;
    }

    public void setWachtWoord(String wachtWoord) {
        this.wachtWoord = wachtWoord;
    }
}
