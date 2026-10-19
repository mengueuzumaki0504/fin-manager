package com.finmanager.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Droit accordé à un ou plusieurs rôles (table permissions).
 */
public class Permission {

    private Long idPer;
    private String nomPer;
    private String descriptionP;
    private List<Role> roles;

    public Permission() {
        this.roles = new ArrayList<>();
    }

    public Permission(Long idPer, String nomPer, String descriptionP) {
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "idPer=" + idPer +
                ", nomPer=" + nomPer +
                ", descriptionP=" + descriptionP +
                "}";
    }
}
