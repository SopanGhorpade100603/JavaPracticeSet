package com.stream.api;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class IntStreamMethods {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);

		OptionalInt min = Arrays.stream(arr).min();
		System.out.println(min);

		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(max);

		long count = Arrays.stream(arr).count();
		System.out.println(count);

		OptionalDouble average = Arrays.stream(arr).average();
		System.out.println(average);

	}

}
