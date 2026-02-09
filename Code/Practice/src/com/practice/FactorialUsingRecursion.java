package com.practice;

import java.util.Scanner;

public class FactorialUsingRecursion {
	 public static long fact(int num) {
		 if(num==0 || num==1) {
			 return 1;
		 }return num *fact(num-1);
	 }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int num = sc.nextInt();
		long fact = fact(num);
		System.out.println("factorial of "+num+" is:: "+fact);
		sc.close();
	}

}
