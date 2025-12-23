package com.practice;

import java.util.Scanner;

public class isArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number to check is armstrong: ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		int len = 0;
		while (temp != 0) {
			len++;
			temp /= 10;
		}

		temp = num;
		while (temp != 0) {
			int rem = temp % 10;
			sum += Math.pow(rem, len);
			temp /= 10;
		}
		System.out.println(sum == num ? "armstrong" : "not a armstrong");

	}

}
