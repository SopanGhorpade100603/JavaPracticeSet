package com.nt.switchcase;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter subject grade[A/B/C/D/E]: ");
		char grade = sc.next().toLowerCase().charAt(0);

		String result = switch (grade) {
		case 'a','b' ->"Excellent";
		case 'c' ->"very good";
		case 'd' ->"good";
		case 'e' ->" average";
		default->"invalid";
		};
		
		System.out.println("your grade is: "+result);
	}

}
