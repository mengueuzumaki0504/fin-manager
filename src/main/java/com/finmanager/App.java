package com.finmanager;

import com.finmanager.dto.AccountDTO;
import com.finmanager.dto.UserDTO;
import com.finmanager.entities.Account;
import com.finmanager.entities.AccountType;
import com.finmanager.entities.Permission;
import com.finmanager.entities.Role;
import com.finmanager.entities.Transaction;
import com.finmanager.entities.TransactionType;
import com.finmanager.entities.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Petite démonstration : crée quelques entités, les relie, puis fabrique des DTO.
 */
public class App {

    public static void main(String[] args) {
        // Permission -> Role -> User
        Permission lecture = new Permission(1L, "READ_ACCOUNT", "Consulter un compte");
        Role client = new Role(1L, "CLIENT");
        client.getPermissions().add(lecture);

        User user = new User(1L, "Jean", "Mbarga", "jean@exemple.com", "motdepasse", "670000001", LocalDateTime.now());
        user.getRoles().add(client);

        // User -> Account -> Transaction
        Account compte = new Account(1L, "CM-0001", AccountType.CURRENT, new BigDecimal("50000"), "XAF", LocalDateTime.now());
        compte.setOwner(user);
        user.getAccounts().add(compte);

        Transaction depot = new Transaction(1L, TransactionType.DEPOSIT, new BigDecimal("20000"), LocalDateTime.now(), "Dépôt initial");
        depot.setAccount(compte);
        compte.getTransactions().add(depot);

        System.out.println("=== Entités ===");
        System.out.println(user);
        System.out.println(compte);
        System.out.println(depot);

        // Conversion manuelle entité -> DTO (le DTO ne contient ni mot de passe ni objets liés)
        UserDTO userDto = new UserDTO(user.getId(), user.getFirstName(), user.getLastName(),
                user.getEmail(), user.getPhone(), user.getCreatedAt());
        user.getRoles().forEach(r -> userDto.getRoleIds().add(r.getId()));

        AccountDTO accountDto = new AccountDTO(compte.getId(), compte.getAccountNumber(), compte.getType(),
                compte.getBalance(), compte.getCurrency(), compte.getCreatedAt(), compte.getOwner().getId());

        System.out.println();
        System.out.println("=== DTO ===");
        System.out.println(userDto);
        System.out.println(accountDto);
    }
}
