package com.practice;

import java.util.Scanner;

/*	in a cricket match.the batting team is scoring runs with some run rate.
 *	the match is of 20 overs. write a program to find the total runs scored by batting team
 *	ex: input 13:
 *				Output: total runs scored in 20 overs 260.00
 *	    input 15:
 *				Output: total runs scored in 20 overs 300.00
  */

public class TotalRunsScoreAccentureTest {

	private static int scoreCalculator(int runRate) {
		int totalOvers = 20;
		int totalScore = 0;
		totalScore = runRate * totalOvers;
		return totalScore;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Run rate");
		int runRate = sc.nextInt();
		int scoreCalculator = scoreCalculator(runRate);
		System.out.println("total score is: " + scoreCalculator);
		sc.close();
	}
}
