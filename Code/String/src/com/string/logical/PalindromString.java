package com.string.logical;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromString {

	private static boolean isPalindrom(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev +=str.charAt(i);
		}
		return str.equals(rev);
		
//		String rev = new StringBuilder(str).reverse().toString();
//		return rev.equals(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		boolean isPalindrom = isPalindrom(str);
		System.out.println("does " + str + " is palindrom?: " + isPalindrom);
		
//		using stream
//		boolean isPalindrom = IntStream.range(0, str.length()/2).
//		allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
//		System.out.println("does " + str + " is palindrom?: " + isPalindrom);
	}
}
