package com.nt.switchcase;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter animal name: ");
		String language = sc.nextLine().toLowerCase();

		switch (language) {
		case "dog", "cat", "cow", "sheep" -> System.out.println("it is domestic animal");
		case "tiger", "lion", "elephant", "wolf" -> System.out.println("it is a wild animal");
		default -> throw new IllegalArgumentException("sorry invalid input");
		}
	}

}
