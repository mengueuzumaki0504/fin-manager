package com.finmanager;

import com.finmanager.dto.CompteDTO;
import com.finmanager.dto.TransactionDTO;
import com.finmanager.dto.UserDTO;
import com.finmanager.entities.Agence;
import com.finmanager.entities.Compte;
import com.finmanager.entities.Credit;
import com.finmanager.entities.Notification;
import com.finmanager.entities.Permission;
import com.finmanager.entities.Role;
import com.finmanager.entities.Transaction;
import com.finmanager.entities.User;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Démonstration : crée les entités du diagramme de classe, les relie, puis fabrique des DTO.
 */
public class App {

    public static void main(String[] args) {
        // Role * -- * Permission
        Permission lecture = new Permission(1L, "READ_COMPTE", "Consulter un compte");
        Role client = new Role(1L, "CLIENT", "Client de la banque");
        client.getPermissions().add(lecture);
        lecture.getRoles().add(client);

        // User * -- * Role
        User user = new User(1L, "Mbarga", "Jean", "jean@exemple.com", "670000001",
                LocalDate.of(2000, 5, 12), "M", "Étudiant");
        user.getRoles().add(client);
        client.getUsers().add(user);

        // Agence 1 -- 1..* Compte ; User 1 -- * Compte
        Agence agence = new Agence("AG-01", 11.5167, 3.8667, "Agence Yaoundé", "699000000", "yaounde@banque.cm");
        Compte compte = new Compte("CM-0001", new BigDecimal("50000"), "Compte courant",
                "COURANT", LocalDate.now(), "ACTIF");
        compte.setUser(user);
        compte.setAgence(agence);
        user.getComptes().add(compte);
        agence.getComptes().add(compte);

        // Compte 1 -- * Transaction ; Transaction 1 -- 0..1 Notification
        Transaction depot = new Transaction("TR-0001", "DEPOT", LocalDateTime.now(),
                new BigDecimal("20000"), "VALIDEE");
        depot.setCompte(compte);
        compte.getTransactions().add(depot);

        Notification notif = new Notification(1L, "INFO", "Dépôt de 20 000 FCFA effectué", LocalDateTime.now());
        notif.setTransaction(depot);
        depot.setNotification(notif);

        // Compte 1 -- * Credit
        Credit credit = new Credit(1L, new BigDecimal("300000"), LocalDate.now(), "CONSOMMATION", "Achat d'un ordinateur");
        credit.setCompte(compte);
        compte.getCredits().add(credit);

        System.out.println("=== Entités ===");
        System.out.println(user);
        System.out.println(compte);
        System.out.println(depot);
        System.out.println(notif);
        System.out.println(credit);
        System.out.println(agence);

        // Conversion manuelle entité -> DTO : les objets liés sont remplacés par leur identifiant
        UserDTO userDto = new UserDTO(user.getIdUser(), user.getNomUser(), user.getPrenomUser(),
                user.getEmail(), user.getPhone(), user.getDateN(), user.getSexe(), user.getProfession());
        user.getRoles().forEach(r -> userDto.getIdRoles().add(r.getIdRole()));
        user.getComptes().forEach(c -> userDto.getNumComptes().add(c.getNumCompte()));

        CompteDTO compteDto = new CompteDTO(compte.getNumCompte(), compte.getSolde(), compte.getIntituleCompte(),
                compte.getTypeCompte(), compte.getDateOuverture(), compte.getStatutCompte(),
                compte.getUser().getIdUser(), compte.getAgence().getNumAg());

        TransactionDTO trDto = new TransactionDTO(depot.getNumTransac(), depot.getTypeTransac(), depot.getDateTransac(),
                depot.getMontantTransac(), depot.getStatutTransac(),
                depot.getCompte().getNumCompte(), depot.getNotification().getIdNotification());

        System.out.println();
        System.out.println("=== DTO ===");
        System.out.println(userDto);
        System.out.println(compteDto);
        System.out.println(trDto);
    }
}
