package com.atm.ui;

import java.util.Scanner;

public class InputUtil {

	private static final Scanner scanner = new Scanner(System.in);

	public static int getInt() {
		while (true) {
			try {
				return scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid input! Enter a number:");
				scanner.nextLine();
			}
		}
	}

	public static float getFloat() {
		while (true) {
			try {
				return scanner.nextFloat();
			} catch (Exception e) {
				System.out.println("Invalid amount! Enter a valid number:");
				scanner.nextLine();
			}
		}
	}
}
