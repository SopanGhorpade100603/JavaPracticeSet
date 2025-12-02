package com.nt.switchcase;

import java.util.Scanner;

public class Demo02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter colour name: ");
		char charAt = sc.next().toLowerCase().charAt(0);
		 switch (charAt) {
		case 'r' -> System.out.println("color is red");
		case 'g' -> System.out.println("color is green");
		case 'b' -> System.out.println("color is black");
		case 'y' -> System.out.println("color is yellow");
		case 'p' -> System.out.println("color is purple");
		default -> throw new IllegalArgumentException("sorry we don't found any color");
		}
		sc.close();
	}

}
