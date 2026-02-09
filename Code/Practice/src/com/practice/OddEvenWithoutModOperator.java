package com.practice;

import java.util.Scanner;

public class OddEvenWithoutModOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num=sc.nextInt();
//		with mod
		String res = (num %2==0)?"even":"odd";
//		System.out.println(res);
		
		if(num/2 *2 == num) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		sc.close();
	}
}
