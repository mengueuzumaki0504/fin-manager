package com.finmanager.dto;

import com.finmanager.entities.LoanStatus;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Objet de transfert de données pour Loan.
 */
public class LoanDTO {

    private Long id;
    private BigDecimal amount;
    private BigDecimal interestRate;
    private int durationMonths;
    private LocalDate startDate;
    private LoanStatus status;
    private Long borrowerId;

    public LoanDTO() {
    }

    public LoanDTO(Long id, BigDecimal amount, BigDecimal interestRate, int durationMonths, LocalDate startDate, LoanStatus status, Long borrowerId) {
        this();
        this.id = id;
        this.amount = amount;
        this.interestRate = interestRate;
        this.durationMonths = durationMonths;
        this.startDate = startDate;
        this.status = status;
        this.borrowerId = borrowerId;
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

    public Long getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Long borrowerId) {
        this.borrowerId = borrowerId;
    }

    @Override
    public String toString() {
        return "LoanDTO{" +
                "id=" + id +
                ", amount=" + amount +
                ", interestRate=" + interestRate +
                ", durationMonths=" + durationMonths +
                ", startDate=" + startDate +
                ", status=" + status +
                ", borrowerId=" + borrowerId +
                "}";
    }
}
