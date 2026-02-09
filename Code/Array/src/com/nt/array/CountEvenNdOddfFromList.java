package com.nt.array;

import java.util.Arrays;
import java.util.List;

public class CountEvenNdOddfFromList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 1, 4, 8, 5, 3, 9, 7, 14);
		/*
		 * int odd = 0; int even = 0; for (int e : list) { if (e % 2 == 0) even++; else
		 * odd++;
		 * 
		 * }
		 * 
		 * System.out.println(even); System.out.println(odd);
		 */

		/* using java8 */
		long even = list.stream().filter(e -> e % 2 == 0).count();
		long odd = list.stream().filter(e -> e % 2 != 0).count();
		System.out.println(even);
		System.out.println(odd);
	}
}
