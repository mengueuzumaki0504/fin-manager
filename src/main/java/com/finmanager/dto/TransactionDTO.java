package com.finmanager.dto;

import com.finmanager.entities.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Objet de transfert de données pour Transaction.
 */
public class TransactionDTO {

    private Long id;
    private TransactionType type;
    private BigDecimal amount;
    private LocalDateTime date;
    private String description;
    private Long accountId;

    public TransactionDTO() {
    }

    public TransactionDTO(Long id, TransactionType type, BigDecimal amount, LocalDateTime date, String description, Long accountId) {
        this();
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.accountId = accountId;
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

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "id=" + id +
                ", type=" + type +
                ", amount=" + amount +
                ", date=" + date +
                ", description=" + description +
                ", accountId=" + accountId +
                "}";
    }
}
