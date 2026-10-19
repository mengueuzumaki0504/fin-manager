package com.finmanager.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Objet de transfert de données pour Role.
 */
public class RoleDTO {

    private Long idRole;
    private String nomRole;
    private String description;
    private List<Long> idPermissions;

    public RoleDTO() {
        this.idPermissions = new ArrayList<>();
    }

    public RoleDTO(Long idRole, String nomRole, String description) {
        this();
        this.idRole = idRole;
        this.nomRole = nomRole;
        this.description = description;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getIdPermissions() {
        return idPermissions;
    }

    public void setIdPermissions(List<Long> idPermissions) {
        this.idPermissions = idPermissions;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "idRole=" + idRole +
                ", nomRole=" + nomRole +
                ", description=" + description +
                ", idPermissions=" + idPermissions +
                "}";
    }
}
