package com.nt.function.fi;

import java.util.function.Function;

public class Factorial {

	public static void main(String[] args) {
		Function<Integer, Integer> factorial = (num) -> {
			int fact = 1;
			while (num != 0) {
				fact = fact * num;
				num--;
			}
			return fact;
		};
		
		System.out.println("factorial of 6: " + factorial.apply(6));
	}
}
