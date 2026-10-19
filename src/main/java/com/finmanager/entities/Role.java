package com.finmanager.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Rôle d'un utilisateur (ADMIN, CLIENT, ...) regroupant des permissions.
 */
public class Role {

    private Long id;
    private String name;
    private List<Permission> permissions;

    public Role() {
        this.permissions = new ArrayList<>();
    }

    public Role(Long id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "id=" + id +
                ", name=" + name +
                "}";
    }
}
