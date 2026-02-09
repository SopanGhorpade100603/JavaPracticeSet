package com.practice;

/*FizzBuzz variation (coding):
Print numbers from 1 to 50. For multiples of 3, print
Java; for multiples of 5, print Buzz; for multiples of both 3 and 5, print JavaBuzz.
Also print the count of each category at the end.
(Write full code and expected output snippet.*/
public class FizzBuzz {

	public static void main(String[] args) {
		int countJava = 0;
		int countBuzz = 0;
		int countJavaBuzz = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("java");
				countJava++;
			} else if (i % 3 == 0) {
				System.out.println("buzz");
				countBuzz++;
			} else if (i % 5 == 0) {
				System.out.println("javaBuzz");
				countJavaBuzz++;
			} else {
				System.out.println(i);
			}
		}

		System.out.println("count of 3 multiply:: " + countJava);
		System.out.println("count of 5 multiply:: " + countBuzz);
		System.out.println("count of 3&5 multiply:: " + countJavaBuzz);
	}
}