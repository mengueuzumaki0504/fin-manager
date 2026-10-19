# Fin Manager

Projet Java (Maven). Les modèles suivent le diagramme de classe du devoir.

## Structure

```
src/main/java/com/finmanager/
├── App.java        démonstration
├── entities/       User, Compte, Transaction, Notification, Role, Permission, Credit, Agence
└── dto/            UserDTO, CompteDTO, TransactionDTO, NotificationDTO, RoleDTO, PermissionDTO, CreditDTO, AgenceDTO
```

## Relations (diagramme)

- User 1 — * Compte
- Compte 1 — * Transaction
- Compte 1 — * Credit
- Agence 1 — 1..* Compte
- Transaction 0..1 — 1 Notification
- User * — 1..* Role
- Role * — * Permission

## Lancer

```bash
mvn clean package
java -cp target/fin-manager-1.0-SNAPSHOT.jar com.finmanager.App
```
