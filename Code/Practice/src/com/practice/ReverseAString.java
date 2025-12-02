package com.practice;

import java.util.Scanner;
//write a code to reverse a String

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		reverseString(str);
	}

//	private static void reverseString(String str) {
//		for (int i = str.length()-1; i >= 0; i--) {
//			System.out.print(str.charAt(i)+" ");
//		}
//	}
	
	private static void reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		System.out.println(rev);
	}

}
