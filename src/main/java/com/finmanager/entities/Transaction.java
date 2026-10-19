package com.finmanager.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Opération effectuée sur un compte (dépôt, retrait, virement).
 */
public class Transaction {

    private Long id;
    private TransactionType type;
    private BigDecimal amount;
    private LocalDateTime date;
    private String description;
    private Account account;

    public Transaction() {
    }

    public Transaction(Long id, TransactionType type, BigDecimal amount, LocalDateTime date, String description) {
        this();
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type=" + type +
                ", amount=" + amount +
                ", date=" + date +
                ", description=" + description +
                "}";
    }
}
