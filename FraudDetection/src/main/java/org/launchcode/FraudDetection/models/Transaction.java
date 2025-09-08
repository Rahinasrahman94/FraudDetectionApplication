package org.launchcode.FraudDetection.models;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    private Long userId;
    private String company;
    private Double amount;
    private LocalDateTime timestamp;
    private String location;
    private boolean flagged;
    public Transaction(Long userId, String company, Double amount, LocalDateTime timestamp, String location, boolean flagged) {
        this.userId = userId;
        this.company = company;
        this.amount = amount;
        this.timestamp = timestamp;
        this.location = location;
        this.flagged = flagged;
    }

    public Long getId() {
        return id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }
}
