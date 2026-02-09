package com.nt.exception;

public class TryCatchThrows {

	public static void main(String[] args) {
		System.out.println("main method started");
		m1();
		System.out.println("main method ended");
	}

	private static void m1() {
		System.out.println("m1 method started");
		try {
			m2();
		} catch (ClassNotFoundException e) {
			System.out.println("exception handle by m1()");
		}
		System.out.println("m1 method ended");
		
	}

	private static void m2() throws ClassNotFoundException {
		System.out.println("m2 method started");
		Class.forName("com.nt.exception.TryCatchThrows"); // here eclipse IDE need FQN
	}

}
