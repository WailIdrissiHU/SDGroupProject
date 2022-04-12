package com.example.sdgroupproject.domeinModel;

import javafx.scene.control.Button;

public class Rooster {
    private Integer les;
    private String blok;
    private String begin;
    private String eind;
    private Integer weekNummer;
    private Button naarAfwezigMeldenViaTabel;

    public Rooster(String blok, String begin, String eind, int weekNummer) {
        this.blok = blok;
        this.begin = begin;
        this.eind = eind;
        this.weekNummer = weekNummer;
    }

    public int getLes() {
        return les;
    }

    public String getBlok() {
        return blok;
    }

    public String getBegin() {
        return begin;
    }

    public String getEind() {
        return eind;
    }

    public int getWeekNummer() {
        return weekNummer;
    }

    public void setLes(int les) {
        this.les = les;
    }

    public void setBlok(String blok) {
        this.blok = blok;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public void setEind(String eind) {
        this.eind = eind;
    }

    public void setWeekNummer(int weekNummer) {
        this.weekNummer = weekNummer;
    }
}
