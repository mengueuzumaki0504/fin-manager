package com.finmanager.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Prêt accordé à un utilisateur.
 */
public class Loan {

    private Long id;
    private BigDecimal amount;
    private BigDecimal interestRate;
    private int durationMonths;
    private LocalDate startDate;
    private LoanStatus status;
    private User borrower;

    public Loan() {
    }

    public Loan(Long id, BigDecimal amount, BigDecimal interestRate, int durationMonths, LocalDate startDate, LoanStatus status) {
        this();
        this.id = id;
        this.amount = amount;
        this.interestRate = interestRate;
        this.durationMonths = durationMonths;
        this.startDate = startDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", interestRate=" + interestRate +
                ", durationMonths=" + durationMonths +
                ", startDate=" + startDate +
                ", status=" + status +
                "}";
    }
}
