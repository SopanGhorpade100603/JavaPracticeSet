package com.nt.array;

import java.util.Arrays;
import java.util.List;

public class PrintAllPrimeNo {
	public static boolean isPrime(int num) {
		if(num<2)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num % i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 5, 4, 6, 7, 8, 9, 151, 251, 243};
		int[] prime = Arrays.stream(arr).sorted().distinct().filter(n->isPrime(n)).toArray();
		System.out.println(Arrays.toString(prime));
	}
}
