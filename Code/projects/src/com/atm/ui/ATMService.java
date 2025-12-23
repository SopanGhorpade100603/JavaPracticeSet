package com.atm.ui;

public class ATMService {

    public ATMEntity atm;

    public ATMService(ATMEntity atm) {
        this.atm = atm;
    }

    public boolean validatePin(int pin) {
        return pin == atm.getPin();
    }

    public boolean isAccountLocked() {
        return atm.getAttempts() >= 3;
    }

    public void deposit(float amount) {
        atm.setBalance(atm.getBalance() + amount);
        atm.addTransaction("Deposited: " + amount);
    }

    public boolean withdraw(float amount) {
        if (amount <= atm.getBalance()) {
            atm.setBalance(atm.getBalance() - amount);
            atm.addTransaction("Withdrawn: " + amount);
            return true;
        }
        return false;
    }

    public float checkBalance() {
        return atm.getBalance();
    }

    public void changePin(int newPin) {
        atm.setPin(newPin);
        atm.addTransaction("PIN Changed");
    }

    public void showMiniStatement() {
        if (atm.getMiniStatement().isEmpty()) {
            System.out.println("No transactions yet!");
        } else {
            System.out.println("--------- Mini Statement ---------");
            atm.getMiniStatement().forEach(System.out::println);
        }
    }
}

