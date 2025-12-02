package com.nt.userdefineexception;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends RuntimeException {

	String msg;

	public InvalidAgeException() {
	
	}

	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		if (age < 18) {
			throw new InvalidAgeException("age is less than 18");
		} else {
			System.out.println("you can vote");
		}

	}

}
