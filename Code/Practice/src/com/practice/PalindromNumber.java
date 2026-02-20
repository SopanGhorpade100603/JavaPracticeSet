package com.practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromNumber {

	public static boolean isPalindrom(int num) {
		int temp = num;
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		
		return temp == rev;
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
//		boolean palindrom = isPalindrom(num);
//		System.out.println(num + " is palindrom?: " + palindrom);
		
		
//	
		String str = String.valueOf(num);
//		String rev = new StringBuilder(str).reverse().toString();
//		System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
	
//		using stream
		boolean isPalindrom = IntStream.range(0, str.length()/2).
							allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
		System.out.println(num + " is palindrom?: " + isPalindrom);
	
		sc.close();		
	}

}
