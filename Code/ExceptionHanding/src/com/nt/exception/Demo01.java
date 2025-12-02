package com.nt.exception;

import java.io.FileNotFoundException;

//Exception is super class of all exception
public class Demo01 {

	public static void main(String[] args) {
		Exception e = new ArithmeticException();
		System.out.println(e);

		e = new FileNotFoundException("divide by 10");
		System.out.println(e.toString());

	}

}
