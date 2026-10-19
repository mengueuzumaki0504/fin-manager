package com.finmanager.dto;

/**
 * Objet de transfert de données pour Permission.
 */
public class PermissionDTO {

    private Long id;
    private String name;
    private String description;

    public PermissionDTO() {
    }

    public PermissionDTO(Long id, String name, String description) {
        this();
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PermissionDTO{" +
                "id=" + id +
                ", name=" + name +
                ", description=" + description +
                "}";
    }
}
