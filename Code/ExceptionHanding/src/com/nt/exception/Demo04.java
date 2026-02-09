package com.nt.exception;
//print exception object methods
public class Demo04 {

	public static void main(String[] args) {
		try {
			int res = 10/0;
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("------------------------ ");
			System.out.println(e.getMessage());
			System.out.println("------------------------ ");
			e.printStackTrace();
		}

	}

}
