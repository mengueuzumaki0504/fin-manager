package com.finmanager.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Objet de transfert de données pour Transaction.
 */
public class TransactionDTO {

    private String numTransac;
    private String typeTransac;
    private LocalDateTime dateTransac;
    private BigDecimal montantTransac;
    private String statutTransac;
    private String numCompte;
    private Long idNotification;

    public TransactionDTO() {
    }

    public TransactionDTO(String numTransac, String typeTransac, LocalDateTime dateTransac, BigDecimal montantTransac, String statutTransac, String numCompte, Long idNotification) {
        this();
        this.numTransac = numTransac;
        this.typeTransac = typeTransac;
        this.dateTransac = dateTransac;
        this.montantTransac = montantTransac;
        this.statutTransac = statutTransac;
        this.numCompte = numCompte;
        this.idNotification = idNotification;
    }

    public String getNumTransac() {
        return numTransac;
    }

    public void setNumTransac(String numTransac) {
        this.numTransac = numTransac;
    }

    public String getTypeTransac() {
        return typeTransac;
    }

    public void setTypeTransac(String typeTransac) {
        this.typeTransac = typeTransac;
    }

    public LocalDateTime getDateTransac() {
        return dateTransac;
    }

    public void setDateTransac(LocalDateTime dateTransac) {
        this.dateTransac = dateTransac;
    }

    public BigDecimal getMontantTransac() {
        return montantTransac;
    }

    public void setMontantTransac(BigDecimal montantTransac) {
        this.montantTransac = montantTransac;
    }

    public String getStatutTransac() {
        return statutTransac;
    }

    public void setStatutTransac(String statutTransac) {
        this.statutTransac = statutTransac;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public Long getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(Long idNotification) {
        this.idNotification = idNotification;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "numTransac=" + numTransac +
                ", typeTransac=" + typeTransac +
                ", dateTransac=" + dateTransac +
                ", montantTransac=" + montantTransac +
                ", statutTransac=" + statutTransac +
                ", numCompte=" + numCompte +
                ", idNotification=" + idNotification +
                "}";
    }
}
