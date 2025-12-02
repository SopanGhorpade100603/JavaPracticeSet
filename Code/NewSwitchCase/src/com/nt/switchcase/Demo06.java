package com.nt.switchcase;

import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter performance grade[A/B/C]: ");
		char grade = sc.next().toLowerCase().charAt(0);
		
		double salary = 40000;
		double bonus = switch(grade) {
		case 'a' ->{
			System.out.println("grade a peformance");
			yield salary * 0.20;
		}
		case 'b' ->{
			System.out.println("grade b peformance");
			yield salary * 0.15;
		}
		case 'c' ->{
			System.out.println("grade c peformance");
			yield salary * 0.10;
		}
		default ->0.0;
		};
		
		System.out.println("your bonus is: "+bonus);
		System.out.println("total salary is: "+(salary+bonus));
		
	}
}
