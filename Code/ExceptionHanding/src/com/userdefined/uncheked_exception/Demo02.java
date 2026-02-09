package com.userdefined.uncheked_exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class GreterMarkException extends Exception{
	
	String msg;

	public GreterMarkException(String msg) {
		super(msg);
	}

	public GreterMarkException() {
		
	}
}

public class Demo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		try {
			validateMarks(marks);
		} catch (GreterMarkException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	private static void validateMarks(int marks) throws GreterMarkException {
		if(marks > 100) {
			throw new GreterMarkException("marks is greater than 100");
		}else {
			System.out.println("your marks is: "+marks);
		}
	}

}
