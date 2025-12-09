package com.stream.api;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfElements {
	public static void main(String[] args) {
		Stream<Integer> of = Stream.of(1,2,3,4,5);
		int sum = of.mapToInt(n->n).sum();
		System.out.println(sum);
	}

}
