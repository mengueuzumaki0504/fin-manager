package com.finmanager.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Utilisateur de l'application (table User).
 */
public class User {

    private Long idUser;
    private String nomUser;
    private String prenomUser;
    private String email;
    private String phone;
    private LocalDate dateN;
    private String sexe;
    private String profession;
    private List<Compte> comptes;
    private List<Role> roles;

    public User() {
        this.comptes = new ArrayList<>();
        this.roles = new ArrayList<>();
    }

    public User(Long idUser, String nomUser, String prenomUser, String email, String phone, LocalDate dateN, String sexe, String profession) {
        this();
        this.idUser = idUser;
        this.nomUser = nomUser;
        this.prenomUser = prenomUser;
        this.email = email;
        this.phone = phone;
        this.dateN = dateN;
        this.sexe = sexe;
        this.profession = profession;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateN() {
        return dateN;
    }

    public void setDateN(LocalDate dateN) {
        this.dateN = dateN;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nomUser=" + nomUser +
                ", prenomUser=" + prenomUser +
                ", email=" + email +
                ", phone=" + phone +
                ", dateN=" + dateN +
                ", sexe=" + sexe +
                ", profession=" + profession +
                "}";
    }
}
