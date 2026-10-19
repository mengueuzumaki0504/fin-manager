package com.finmanager.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Objet de transfert de données pour User.
 */
public class UserDTO {

    private Long idUser;
    private String nomUser;
    private String prenomUser;
    private String email;
    private String phone;
    private LocalDate dateN;
    private String sexe;
    private String profession;
    private List<String> numComptes;
    private List<Long> idRoles;

    public UserDTO() {
        this.numComptes = new ArrayList<>();
        this.idRoles = new ArrayList<>();
    }

    public UserDTO(Long idUser, String nomUser, String prenomUser, String email, String phone, LocalDate dateN, String sexe, String profession) {
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

    public List<String> getNumComptes() {
        return numComptes;
    }

    public void setNumComptes(List<String> numComptes) {
        this.numComptes = numComptes;
    }

    public List<Long> getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(List<Long> idRoles) {
        this.idRoles = idRoles;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "idUser=" + idUser +
                ", nomUser=" + nomUser +
                ", prenomUser=" + prenomUser +
                ", email=" + email +
                ", phone=" + phone +
                ", dateN=" + dateN +
                ", sexe=" + sexe +
                ", profession=" + profession +
                ", numComptes=" + numComptes +
                ", idRoles=" + idRoles +
                "}";
    }
}
