package com.practice;

import java.util.Scanner;

public class PalindromString {

	private static boolean isPalindrom(String str) {
		String rev = new StringBuilder(str).reverse().toString();
		return rev.equals(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		boolean isPalindrom = isPalindrom(str);
		System.out.println("does " + str + " is palindrom?: " + isPalindrom);
	}
}
