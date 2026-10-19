package com.finmanager.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Agence qui gère des comptes (table Agence).
 */
public class Agence {

    private String numAg;
    private Double longitude;
    private Double latitude;
    private String nomAg;
    private String telAg;
    private String emailAg;
    private List<Compte> comptes;

    public Agence() {
        this.comptes = new ArrayList<>();
    }

    public Agence(String numAg, Double longitude, Double latitude, String nomAg, String telAg, String emailAg) {
        this();
        this.numAg = numAg;
        this.longitude = longitude;
        this.latitude = latitude;
        this.nomAg = nomAg;
        this.telAg = telAg;
        this.emailAg = emailAg;
    }

    public String getNumAg() {
        return numAg;
    }

    public void setNumAg(String numAg) {
        this.numAg = numAg;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getNomAg() {
        return nomAg;
    }

    public void setNomAg(String nomAg) {
        this.nomAg = nomAg;
    }

    public String getTelAg() {
        return telAg;
    }

    public void setTelAg(String telAg) {
        this.telAg = telAg;
    }

    public String getEmailAg() {
        return emailAg;
    }

    public void setEmailAg(String emailAg) {
        this.emailAg = emailAg;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    @Override
    public String toString() {
        return "Agence{" +
                "numAg=" + numAg +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", nomAg=" + nomAg +
                ", telAg=" + telAg +
                ", emailAg=" + emailAg +
                "}";
    }
}
