package com.finmanager.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Objet de transfert de données pour Credit.
 */
public class CreditDTO {

    private Long idCredit;
    private BigDecimal montantCredit;
    private LocalDate dateCredit;
    private String typeCredit;
    private String motifCredit;
    private String numCompte;

    public CreditDTO() {
    }

    public CreditDTO(Long idCredit, BigDecimal montantCredit, LocalDate dateCredit, String typeCredit, String motifCredit, String numCompte) {
        this();
        this.idCredit = idCredit;
        this.montantCredit = montantCredit;
        this.dateCredit = dateCredit;
        this.typeCredit = typeCredit;
        this.motifCredit = motifCredit;
        this.numCompte = numCompte;
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

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    @Override
    public String toString() {
        return "CreditDTO{" +
                "idCredit=" + idCredit +
                ", montantCredit=" + montantCredit +
                ", dateCredit=" + dateCredit +
                ", typeCredit=" + typeCredit +
                ", motifCredit=" + motifCredit +
                ", numCompte=" + numCompte +
                "}";
    }
}
