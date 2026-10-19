package com.finmanager.dto;

import java.time.LocalDateTime;

/**
 * Objet de transfert de données pour Notification.
 */
public class NotificationDTO {

    private Long idNotification;
    private String typeNot;
    private String contenuNot;
    private LocalDateTime dateNot;
    private String numTransac;

    public NotificationDTO() {
    }

    public NotificationDTO(Long idNotification, String typeNot, String contenuNot, LocalDateTime dateNot, String numTransac) {
        this();
        this.idNotification = idNotification;
        this.typeNot = typeNot;
        this.contenuNot = contenuNot;
        this.dateNot = dateNot;
        this.numTransac = numTransac;
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

    public String getNumTransac() {
        return numTransac;
    }

    public void setNumTransac(String numTransac) {
        this.numTransac = numTransac;
    }

    @Override
    public String toString() {
        return "NotificationDTO{" +
                "idNotification=" + idNotification +
                ", typeNot=" + typeNot +
                ", contenuNot=" + contenuNot +
                ", dateNot=" + dateNot +
                ", numTransac=" + numTransac +
                "}";
    }
}
