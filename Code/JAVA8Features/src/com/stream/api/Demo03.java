package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo03 {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2,7,14,12,20,21,24,27,28,32,35,40);
		
		asList.stream().
					filter(n->n%7==0).
									collect(Collectors.toList()).
																forEach(System.out::println);
		
	}

}
