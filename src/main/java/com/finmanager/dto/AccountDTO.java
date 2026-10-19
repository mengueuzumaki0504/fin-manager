package com.finmanager.dto;

import com.finmanager.entities.AccountType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Objet de transfert de données pour Account.
 */
public class AccountDTO {

    private Long id;
    private String accountNumber;
    private AccountType type;
    private BigDecimal balance;
    private String currency;
    private LocalDateTime createdAt;
    private Long ownerId;

    public AccountDTO() {
    }

    public AccountDTO(Long id, String accountNumber, AccountType type, BigDecimal balance, String currency, LocalDateTime createdAt, Long ownerId) {
        this();
        this.id = id;
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = balance;
        this.currency = currency;
        this.createdAt = createdAt;
        this.ownerId = ownerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", type=" + type +
                ", balance=" + balance +
                ", currency=" + currency +
                ", createdAt=" + createdAt +
                ", ownerId=" + ownerId +
                "}";
    }
}
