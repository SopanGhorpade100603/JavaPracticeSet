package com.atm.ui;


import java.util.ArrayList;
import java.util.List;

public class ATMEntity {

    private int pin = 1234;
    private float balance = 10000f;
    private int attempts = 0;
    private List<String> miniStatement = new ArrayList<>();

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getAttempts() {
        return attempts;
    }

    public void increaseAttempts() {
        this.attempts++;
    }

    public void resetAttempts() {
        this.attempts = 0;
    }

    public List<String> getMiniStatement() {
        return miniStatement;
    }

    public void addTransaction(String t) {
        miniStatement.add(t);
    }
}
