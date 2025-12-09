package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitD01 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sun", "Orange", "Pen", "Apple", "Nose");
			names.
			     stream().
			     		limit(3).
			     				forEach(System.out::println);
	}

}
