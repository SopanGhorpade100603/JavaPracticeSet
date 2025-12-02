package com.nt.switchcase;

import java.util.Scanner;

public class Demo01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter colour name: ");
		char charAt = sc.next().toLowerCase().charAt(0);
		switch (charAt) {
		case 'r':
			System.out.println("color is red");
			break;
		case 'g':
			System.out.println("color is green");
			break;
		case 'b':
			System.out.println("color is black");
			break;
		case 'y':
			System.out.println("color is yellow");
			break;
		case 'p':
			System.out.println("color is purple");
			break;
		default:
			throw new IllegalArgumentException("sorry we don't found any color");
		}
		sc.close();
	}

}
