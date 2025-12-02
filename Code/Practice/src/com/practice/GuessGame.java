package com.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		int target = random.nextInt(100) + 1;

		int attempts = 5;

		System.out.println("Welcome to Guess Game!");
		System.out.println("You have " + attempts + " attempts.");

		while (attempts > 0) {
			System.out.print("Enter your guess (1-100): ");
			int guess = sc.nextInt();

			if (guess == target) {
				System.out.println("Congratulations! You guessed the correct number: " + target);
				return;
			} else {
				attempts--;

				if (guess < target) {
					System.out.println("Hint: The number is **higher** than " + guess);
				} else {
					System.out.println("Hint: The number is **lower** than " + guess);
				}

				if (attempts > 0) {
					System.out.println("Wrong guess! Attempts left: " + attempts);
				}
			}
		}

		System.err.println("\nYou lost! The number was: " + target);
		sc.close();
	}
}
