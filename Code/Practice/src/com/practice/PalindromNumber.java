package com.practice;

import java.util.Scanner;

public class PalindromNumber {

	public static boolean isPalindrom(int num) {
		int temp = num;
		int rev = 0;
		while (num != 0) {
			int res = num % 10;
			rev = rev * 10 + res;
			num /= 10;
		}
		
		return temp == rev;
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean palindrom = isPalindrom(num);
		System.out.println(num + " is palindrom?: " + palindrom);
		
		
//		int num = 323;
//		String str = String.valueOf(num);
//		String rev = new StringBuilder(str).reverse().toString();
//		System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
		
		sc.close();
	}

}
