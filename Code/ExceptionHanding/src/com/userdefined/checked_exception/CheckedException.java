package com.userdefined.checked_exception;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {

	public InvalidAgeException() {

	}

	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class CheckedException {
	public static void main(String[] args) throws InvalidAgeException  {
		int age=17;
		if(age<18)
			throw new InvalidAgeException("age must be greter than 18"); //here handling is compulsory
		else {
			System.out.println("age is greter thean 18");
		}
	}
}
