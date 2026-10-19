package com.finmanager.entities;

import java.time.LocalDateTime;

/**
 * Notification liée à une transaction (table Notifications).
 */
public class Notification {

    private Long idNotification;
    private String typeNot;
    private String contenuNot;
    private LocalDateTime dateNot;
    private Transaction transaction;

    public Notification() {
    }

    public Notification(Long idNotification, String typeNot, String contenuNot, LocalDateTime dateNot) {
        this();
        this.idNotification = idNotification;
        this.typeNot = typeNot;
        this.contenuNot = contenuNot;
        this.dateNot = dateNot;
    }

    public Long getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(Long idNotification) {
        this.idNotification = idNotification;
    }

    public String getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(String typeNot) {
        this.typeNot = typeNot;
    }

    public String getContenuNot() {
        return contenuNot;
    }

    public void setContenuNot(String contenuNot) {
        this.contenuNot = contenuNot;
    }

    public LocalDateTime getDateNot() {
        return dateNot;
    }

    public void setDateNot(LocalDateTime dateNot) {
        this.dateNot = dateNot;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "idNotification=" + idNotification +
                ", typeNot=" + typeNot +
                ", contenuNot=" + contenuNot +
                ", dateNot=" + dateNot +
                "}";
    }
}
