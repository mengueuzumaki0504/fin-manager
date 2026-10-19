package com.finmanager.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Objet de transfert de données pour Role.
 */
public class RoleDTO {

    private Long id;
    private String name;
    private List<Long> permissionIds;

    public RoleDTO() {
        this.permissionIds = new ArrayList<>();
    }

    public RoleDTO(Long id, String name) {
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

    public List<Long> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<Long> permissionIds) {
        this.permissionIds = permissionIds;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "id=" + id +
                ", name=" + name +
                ", permissionIds=" + permissionIds +
                "}";
    }
}
