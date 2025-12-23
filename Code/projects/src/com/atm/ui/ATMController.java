package com.atm.ui;


public class ATMController {

    ATMService service;

    public ATMController() {
        this.service = new ATMService(new ATMEntity());
    }

    public void startATM() {
        System.out.println("----- Welcome to ATM -----");

        while (true) {
            if (service.isAccountLocked()) {
                System.out.println("Too many wrong attempts. Account Locked!");
                return;
            }

            System.out.print("Enter PIN: ");
            int pin = InputUtil.getInt();

            if (service.validatePin(pin)) {
                service.atm.resetAttempts();
                menu();
                break;
            } else {
                System.out.println("Incorrect PIN! Try again.");
                service.atm.increaseAttempts();
            }
        }
    }

    private void menu() {

        while (true) {
            System.out.println("\n----- ATM Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Mini Statement");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = InputUtil.getInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + service.checkBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    float deposit = InputUtil.getFloat();
                    if (deposit > 0) service.deposit(deposit);
                    else System.out.println("Invalid amount!");
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    float withdraw = InputUtil.getFloat();
                    if (!service.withdraw(withdraw))
                        System.out.println("Insufficient balance!");
                    break;

                case 4:
                    System.out.print("Enter new PIN: ");
                    int newPin = InputUtil.getInt();
                    service.changePin(newPin);
                    System.out.println("PIN updated successfully!");
                    break;

                case 5:
                    service.showMiniStatement();
                    break;

                case 6:
                    System.out.println("Thank you for using ATM!");
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
