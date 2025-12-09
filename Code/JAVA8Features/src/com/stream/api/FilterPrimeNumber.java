package com.stream.api;

import java.util.Arrays;
import java.util.List;

/*WAP to filter all the prime number from the given array.*/

public class FilterPrimeNumber {

	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 3, 2, 5, 4, 6, 7, 8, 9, 151, 251, 243);
		Object[] primeNo = list.stream().
										filter(n -> isPrime(n)).toArray();
		
		System.out.println(Arrays.toString(primeNo));
	}

}
