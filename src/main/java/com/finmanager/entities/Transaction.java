package com.finmanager.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Opération effectuée sur un compte (table transaction).
 */
public class Transaction {

    private String numTransac;
    private String typeTransac;
    private LocalDateTime dateTransac;
    private BigDecimal montantTransac;
    private String statutTransac;
    private Compte compte;
    private Notification notification;

    public Transaction() {
    }

    public Transaction(String numTransac, String typeTransac, LocalDateTime dateTransac, BigDecimal montantTransac, String statutTransac) {
        this();
        this.numTransac = numTransac;
        this.typeTransac = typeTransac;
        this.dateTransac = dateTransac;
        this.montantTransac = montantTransac;
        this.statutTransac = statutTransac;
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

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "numTransac=" + numTransac +
                ", typeTransac=" + typeTransac +
                ", dateTransac=" + dateTransac +
                ", montantTransac=" + montantTransac +
                ", statutTransac=" + statutTransac +
                "}";
    }
}
