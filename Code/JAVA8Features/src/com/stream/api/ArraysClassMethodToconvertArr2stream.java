package com.stream.api;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ArraysClassMethodToconvertArr2stream {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		IntStream stream = Arrays.stream(arr);
//		stream.forEach(System.out::println);

		String str[] = { "sopan", "raj", "john" };
		Stream<String> stream2 = Arrays.stream(str);
//		stream2.forEach(System.out::println);

		Double d[] = { 33.33, 44.44, 55.55 };
		Stream<Double> stream3 = Arrays.stream(d);
//		stream3.forEach(System.out::println);

		long[] longg = { 24l, 555l, 432l };
		LongStream stream4 = Arrays.stream(longg);
		stream4.forEach(System.out::println);

	}

}
