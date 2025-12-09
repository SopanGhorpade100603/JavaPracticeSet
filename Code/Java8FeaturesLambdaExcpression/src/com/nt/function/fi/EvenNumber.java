package com.nt.function.fi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Given a list of integers, use a predefined interface to print only even numbers.

public class EvenNumber {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(2, 3, 5, 6, 7, 8, 9);
		List<Integer> list = new ArrayList<>();
		Function<Integer, Integer> e = (num) -> {
			if (num % 2 == 0) {
				list.add(num);
			}
			return null;
		};
		al.forEach(num -> e.apply(num));

		list
		.forEach(System.out::println);
	}

}
