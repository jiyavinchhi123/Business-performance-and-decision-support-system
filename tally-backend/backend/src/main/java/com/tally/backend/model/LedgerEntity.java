package com.tally.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ledger")
public class LedgerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;       // Cash, Bank, Sales, Capital
    private String type;       // ASSET, LIABILITY, INCOME, EXPENSE
    private double balance;

    // Constructors
    public LedgerEntity() {}

    public LedgerEntity(String name, String type, double balance) {
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public double getBalance() { return balance; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setBalance(double balance) { this.balance = balance; }
}
