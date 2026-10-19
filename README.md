# Fin Manager

Projet Java (Maven) de gestion financière.

## Structure

```
src/main/java/com/finmanager/
├── App.java            démonstration
├── entities/           modèles (conformes au diagramme de classe)
│   ├── User, Account, Transaction, Role, Permission, Loan, Notification
│   └── AccountType, TransactionType, LoanStatus   (enums)
└── dto/                un DTO par entité
    └── UserDTO, AccountDTO, TransactionDTO, RoleDTO, PermissionDTO, LoanDTO, NotificationDTO
```

## Lancer

```bash
mvn clean package
java -cp target/fin-manager-1.0-SNAPSHOT.jar com.finmanager.App
```
