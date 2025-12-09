package com.nt.predicate.fi;

import java.util.Scanner;
import java.util.function.Predicate;

public class IsNameEndWithN {
	
	public static boolean isEndsWithN(String str) {
		String str1 = str.toLowerCase();
		Predicate<String> endWithN = (s)-> s.endsWith("n");
		return endWithN.test(str1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check palindrom: ");
		String str = sc.nextLine();
		boolean res = isEndsWithN(str);
		System.out.println(str+" is ends with N?: "+res);
	}

}
