package com.nt.inheritance;

class Father {
	public double balance = 50000;
}

class Son extends Father {
	public double balance = 20000;

	public void showBalance() {
		System.out.println("father balance is: " + super.balance);
		System.out.println("son balance is: " + balance);
	}
}

public class Demo03 {

	public static void main(String[] args) {
		Son son = new Son();
		son.showBalance();
	}

}
