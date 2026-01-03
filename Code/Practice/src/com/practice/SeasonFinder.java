package com.practice;

import java.util.Scanner;

public class SeasonFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month number: ");
		int n = sc.nextInt();
		String msg = seasonFinder(n);
		System.out.println(msg);
	}

	private static String seasonFinder(int n) {
		String msg = switch (n) {
		case 3, 4, 5 -> "season is spring";
		case 6, 7, 8 -> "season is summer";
		case 9, 10, 11 -> "season is autumn";
		case 12, 1, 2 -> "season is winter";
		default -> "invalid months";
		};
		return msg;
	}

}
