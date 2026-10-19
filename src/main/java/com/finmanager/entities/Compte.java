package com.finmanager.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Compte bancaire d'un utilisateur, rattaché à une agence (table Comptes).
 */
public class Compte {

    private String numCompte;
    private BigDecimal solde;
    private String intituleCompte;
    private String typeCompte;
    private LocalDate dateOuverture;
    private String statutCompte;
    private User user;
    private Agence agence;
    private List<Transaction> transactions;
    private List<Credit> credits;

    public Compte() {
        this.transactions = new ArrayList<>();
        this.credits = new ArrayList<>();
    }

    public Compte(String numCompte, BigDecimal solde, String intituleCompte, String typeCompte, LocalDate dateOuverture, String statutCompte) {
        this();
        this.numCompte = numCompte;
        this.solde = solde;
        this.intituleCompte = intituleCompte;
        this.typeCompte = typeCompte;
        this.dateOuverture = dateOuverture;
        this.statutCompte = statutCompte;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    public String getIntituleCompte() {
        return intituleCompte;
    }

    public void setIntituleCompte(String intituleCompte) {
        this.intituleCompte = intituleCompte;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public LocalDate getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(LocalDate dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public String getStatutCompte() {
        return statutCompte;
    }

    public void setStatutCompte(String statutCompte) {
        this.statutCompte = statutCompte;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                ", intituleCompte=" + intituleCompte +
                ", typeCompte=" + typeCompte +
                ", dateOuverture=" + dateOuverture +
                ", statutCompte=" + statutCompte +
                "}";
    }
}
