package com.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		long factorial = 1;
		while (num != 0) {
			factorial *= num;
			num--;
		}
		System.out.println("factorial of: " + temp + " is: " + factorial);
	}

}
