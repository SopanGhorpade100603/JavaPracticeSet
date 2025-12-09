package com.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean PrimeChecker(int num) {
		if(num <2) {
			return false;
		}
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean primeChecker = PrimeChecker(num);
		System.out.println(num + " is prime?: " + primeChecker);
		
		
//		boolean isPrime = true;
//		for (int i = 2; i <= Math.sqrt(num); i++) {
//		    if (num % i == 0) {
//		        isPrime = false;
//		        break; 
//		    }
//		}
//
//		System.out.println(isPrime);

	}

}
