package com.nt.exception;

public class Demo02 {
	public static void main(String[] args) {
		try {
			System.out.println("hello sopan");
			int res =10/0;
			System.out.println("bye sopan");
		}catch(ArithmeticException e) {
			System.err.println("cannot divide from 0");
		}
		System.out.println("after handling exception rest of code run smoothly");
	}

}
