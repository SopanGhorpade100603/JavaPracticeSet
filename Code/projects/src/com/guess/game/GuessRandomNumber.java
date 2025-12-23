package com.guess.game;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==============================================");
        System.out.println("             Guess the Number Game");
        System.out.println("==============================================");

        boolean playAgain = true;

        while (playAgain) {

            int randomNumber = random.nextInt(10); // Number between 0–9
            int attempts = 3;

            System.out.println("\nI have selected a number between 0 and 9.");
            System.out.println("You have " + attempts + " attempts to guess it correctly.");

            while (attempts > 0) {

                System.out.print("\nEnter your guess: ");
                int guess = sc.nextInt();
                attempts--;

                if (guess == randomNumber) {
                    System.out.println("\nCorrect! You guessed the number.");
                    System.out.println("Selected Number: " + randomNumber);
                    break;
                } else {
                    System.out.println("Incorrect guess.");

                    if (guess < randomNumber) {
                        System.out.println("Hint: Try a higher number.");
                    } else {
                        System.out.println("Hint: Try a lower number.");
                    }

                    System.out.println("Attempts remaining: " + attempts);
                }

                if (attempts == 0) {
                    System.out.println("\nYou have used all attempts.");
                    System.out.println("The correct number was: " + randomNumber);
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String option = sc.next().trim().toLowerCase();
            playAgain = option.equals("yes");
        }

        System.out.println("\nThank you for playing the game.");
    }
}

