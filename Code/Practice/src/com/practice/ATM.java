package com.practice;

import java.util.Scanner;

//WAP to interactive with user and withdraw amount
public class ATM {

	public static void main(String[] args) {
		double balance = 100;
		Scanner sc = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Exit");
			int choice = 0;
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("invalid input please try again\n");
				sc.nextLine();
				continue;
			}
			switch (choice) {
			case 1:
				System.out.println("Current balance: " + balance + "\n");
				break;

			case 2:
				System.out.print("Enter Amount to deposit: ");
				try {
					double deposit = sc.nextDouble();
					if (deposit <= 0) {
						System.out.println("Invalid amount. Enter a positive value.\n");
					} else {
						balance += deposit;
						System.out.println("Current Amount: " + balance + "\n");
					}
				} catch (Exception e) {
					System.out.println("invalid input please try again\n");
					sc.nextLine();
				}
				break;

			case 3:
				System.out.print("Enter amount to withdraw: ");
				try {
					double withdraw = sc.nextDouble();
					if (withdraw < 0) {
						System.out.println("Invalid amount. Enter a positive value.\n");
					} else if (withdraw > balance) {
						System.out.println("insufficient balance. transaction failed\n");
					} else {
						balance -= withdraw;
						System.out.println("remaining balance:: " + balance + "\n");
					}
				} catch (Exception e) {
					System.out.println("invalid input please try again\n");
					sc.nextLine();
				}
				break;

			case 4:
				for (int i = 0; i < 3; i++) {
					try {
						System.out.print(".");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("thanks for Using ATM");
				exit = true;
				break;

			default:
				System.out.println("invalid input");
			}

		}
	}

}
