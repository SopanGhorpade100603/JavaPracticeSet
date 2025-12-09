package com.nt.predicate.fi;

import java.util.function.Predicate;

public class isNumberEven{

	public static void main(String[] args) {
		Predicate<Integer> evenOdd = (num) -> num % 2 == 0;
		System.out.println("22 number is even: " + evenOdd.test(22));
		System.out.println("25 number is even: " + evenOdd.test(25));

	}

}
