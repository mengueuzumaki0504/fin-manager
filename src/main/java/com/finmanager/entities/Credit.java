package com.finmanager.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Crédit accordé sur un compte (table Crédit).
 */
public class Credit {

    private Long idCredit;
    private BigDecimal montantCredit;
    private LocalDate dateCredit;
    private String typeCredit;
    private String motifCredit;
    private Compte compte;

    public Credit() {
    }

    public Credit(Long idCredit, BigDecimal montantCredit, LocalDate dateCredit, String typeCredit, String motifCredit) {
        this();
        this.idCredit = idCredit;
        this.montantCredit = montantCredit;
        this.dateCredit = dateCredit;
        this.typeCredit = typeCredit;
        this.motifCredit = motifCredit;
    }

    public Long getIdCredit() {
        return idCredit;
    }

    public void setIdCredit(Long idCredit) {
        this.idCredit = idCredit;
    }

    public BigDecimal getMontantCredit() {
        return montantCredit;
    }

    public void setMontantCredit(BigDecimal montantCredit) {
        this.montantCredit = montantCredit;
    }

    public LocalDate getDateCredit() {
        return dateCredit;
    }

    public void setDateCredit(LocalDate dateCredit) {
        this.dateCredit = dateCredit;
    }

    public String getTypeCredit() {
        return typeCredit;
    }

    public void setTypeCredit(String typeCredit) {
        this.typeCredit = typeCredit;
    }

    public String getMotifCredit() {
        return motifCredit;
    }

    public void setMotifCredit(String motifCredit) {
        this.motifCredit = motifCredit;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "idCredit=" + idCredit +
                ", montantCredit=" + montantCredit +
                ", dateCredit=" + dateCredit +
                ", typeCredit=" + typeCredit +
                ", motifCredit=" + motifCredit +
                "}";
    }
}
