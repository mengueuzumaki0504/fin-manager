package com.finmanager.dto;

/**
 * Objet de transfert de données pour Permission.
 */
public class PermissionDTO {

    private Long idPer;
    private String nomPer;
    private String descriptionP;

    public PermissionDTO() {
    }

    public PermissionDTO(Long idPer, String nomPer, String descriptionP) {
        this();
        this.idPer = idPer;
        this.nomPer = nomPer;
        this.descriptionP = descriptionP;
    }

    public Long getIdPer() {
        return idPer;
    }

    public void setIdPer(Long idPer) {
        this.idPer = idPer;
    }

    public String getNomPer() {
        return nomPer;
    }

    public void setNomPer(String nomPer) {
        this.nomPer = nomPer;
    }

    public String getDescriptionP() {
        return descriptionP;
    }

    public void setDescriptionP(String descriptionP) {
        this.descriptionP = descriptionP;
    }

    @Override
    public String toString() {
        return "PermissionDTO{" +
                "idPer=" + idPer +
                ", nomPer=" + nomPer +
                ", descriptionP=" + descriptionP +
                "}";
    }
}
