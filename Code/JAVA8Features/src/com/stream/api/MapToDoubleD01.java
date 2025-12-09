package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class MapToDoubleD01 {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2,4,6,7);
		asList.stream().
						mapToDouble(n->n*n).
											forEach(System.out::println);
	}

}
