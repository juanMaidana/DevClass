package org.example.model;

import java.time.LocalDateTime;
import java.util.Random;

public class Transaction {
    private final int id;
    private final int accountId;
    private final double amount;
    private final LocalDateTime dateTime;
    private final TransactionType type;

    public Transaction(TransactionType type, double amount, int accountId) {
        this.id = new Random().nextInt();
        this.accountId = accountId;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
        this.type = type;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getAmount(){
        return this.amount;
    }

    public TransactionType getType(){
        return this.type;
    }
    public int getId(){
        return id;
    }
    public LocalDateTime getDateTime(){
        return dateTime;
    }
}
