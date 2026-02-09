package com.nt.exception;

public class ExceptionPropagation {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			m1();
		} catch (ClassNotFoundException e) { /* if here also callee not handle then default JVM 
//				Exception handler handle the Exception and terminate the Program abnormally */
			System.out.println("exception handle by main()");
		}
		System.out.println("main method ended");
	}

	private static void m1() throws ClassNotFoundException { //Exception Propogate to caller
		System.out.println("m1 method started");
		m2();
		System.out.println("m1 method ended");
		
	}

	private static void m2() throws ClassNotFoundException { //Exception Propogate to caller
		System.out.println("m2 method started");
		Class.forName("ExceptionPropogation"); // here eclipse IDE need FQN
		System.out.println("m2 method end");
	}

}
