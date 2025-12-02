package com.nt.interface_;

interface Banking {

	public void deposit(double amount);

	public void withdraw(double amount);

	public double getBalance();
}

class HDFC implements Banking {

	private double balance;

	public HDFC(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		if (amount <= 0) {
			System.err.println("invalid amount");
			return;
		}
		balance += amount;
		System.out.println(this.getBalance());
	}

	@Override
	public void withdraw(double amount) {
		if (amount > this.balance) {
			System.err.println("insufficient fund");
		}
		this.balance -= amount;
		System.out.println(this.getBalance());
	}

	@Override
	public double getBalance() {
		return this.balance;
	}
}

public class Demo02 {

	public static void main(String[] args) {
		Banking bank = new HDFC(10000);
		bank.deposit(5000);
//		bank.withdraw(20000);
		
		bank.withdraw(4850);
		System.out.println(bank.getBalance());
	}

}
