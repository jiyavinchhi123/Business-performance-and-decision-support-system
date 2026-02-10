package com.tally.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "voucher")
public class VoucherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;      // 2026-02-10
    private String narration;

    private double amount;

    private String debitLedger;   // Cash, Bank, Purchase
    private String creditLedger;  // Sales, Capital, Bank

    public VoucherEntity() {}

    public VoucherEntity(String date, String narration,
                         String debitLedger, String creditLedger,
                         double amount) {
        this.date = date;
        this.narration = narration;
        this.debitLedger = debitLedger;
        this.creditLedger = creditLedger;
        this.amount = amount;
    }

    public Long getId() { return id; }
    public String getDate() { return date; }
    public String getNarration() { return narration; }
    public double getAmount() { return amount; }
    public String getDebitLedger() { return debitLedger; }
    public String getCreditLedger() { return creditLedger; }

    public void setId(Long id) { this.id = id; }
    public void setDate(String date) { this.date = date; }
    public void setNarration(String narration) { this.narration = narration; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDebitLedger(String debitLedger) { this.debitLedger = debitLedger; }
    public void setCreditLedger(String creditLedger) { this.creditLedger = creditLedger; }
}
