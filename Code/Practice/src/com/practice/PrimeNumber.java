package com.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean PrimeChecker(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
//		if (count == 0) {
//			return true;
//		} else {
//			return false;
//		}
		return count <1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean primeChecker = PrimeChecker(num);
		System.out.println(num + " is prime?: " + primeChecker);

	}

}
