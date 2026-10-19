package com.finmanager.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Rôle d'un utilisateur, regroupant des permissions (table Roles).
 */
public class Role {

    private Long idRole;
    private String nomRole;
    private String description;
    private List<User> users;
    private List<Permission> permissions;

    public Role() {
        this.users = new ArrayList<>();
        this.permissions = new ArrayList<>();
    }

    public Role(Long idRole, String nomRole, String description) {
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Role{" +
                "idRole=" + idRole +
                ", nomRole=" + nomRole +
                ", description=" + description +
                "}";
    }
}
