package com.practice;

import java.util.Scanner;

/*	Round a number to it's previous or next 10 multiply  based on last digit 
	ex: 24 -> last digit 4 less then < 5  2 * 10 = 20
		27 -> last digit 7 greater than > 5 (2+1) * 10 = 30 */

public class RoundANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int lastDigit = num % 10;
		int firstDigit = num / 10;

		if (lastDigit < 5) {
			System.out.println("Round number is: " + (firstDigit * 10));
		} else {
			System.out.println("Round number is: " + (firstDigit + 1) * 10);
		}
		sc.close();
	}
}
