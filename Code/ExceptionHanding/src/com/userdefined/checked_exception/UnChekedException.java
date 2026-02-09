package com.userdefined.checked_exception;

@SuppressWarnings("serial")
class InvalidAgeException1 extends RuntimeException {

	public InvalidAgeException1() {
		super();
	}

	public InvalidAgeException1(String msg) {
		super(msg);
	}

}

public class UnChekedException {
	public static void main(String[] args) {
		int age = 16;
		if(age<18) {
			throw new InvalidAgeException1("age must be greater than 18"); //here handling is not compulsory
		}else {
			System.out.println("age is greater than 18");
		}
	}
}
