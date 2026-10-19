package com.finmanager.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Objet de transfert de données pour Compte.
 */
public class CompteDTO {

    private String numCompte;
    private BigDecimal solde;
    private String intituleCompte;
    private String typeCompte;
    private LocalDate dateOuverture;
    private String statutCompte;
    private Long idUser;
    private String numAg;

    public CompteDTO() {
    }

    public CompteDTO(String numCompte, BigDecimal solde, String intituleCompte, String typeCompte, LocalDate dateOuverture, String statutCompte, Long idUser, String numAg) {
        this();
        this.numCompte = numCompte;
        this.solde = solde;
        this.intituleCompte = intituleCompte;
        this.typeCompte = typeCompte;
        this.dateOuverture = dateOuverture;
        this.statutCompte = statutCompte;
        this.idUser = idUser;
        this.numAg = numAg;
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

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNumAg() {
        return numAg;
    }

    public void setNumAg(String numAg) {
        this.numAg = numAg;
    }

    @Override
    public String toString() {
        return "CompteDTO{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                ", intituleCompte=" + intituleCompte +
                ", typeCompte=" + typeCompte +
                ", dateOuverture=" + dateOuverture +
                ", statutCompte=" + statutCompte +
                ", idUser=" + idUser +
                ", numAg=" + numAg +
                "}";
    }
}
