package com.nt.switchcase;

import java.util.Scanner;

public class Demo03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter language name: ");
		String language = sc.nextLine().toLowerCase();

		switch (language) {
		case "c" -> System.out.println("i want to learn c language");
		case "java" -> System.out.println("i want to learn java language");
		case "javascript" -> System.out.println("i want to learn javascript language");
		case "python" -> System.out.println("i want to learn python language");
		default -> throw new IllegalArgumentException("sorry invalid input");
		}
	}

}
