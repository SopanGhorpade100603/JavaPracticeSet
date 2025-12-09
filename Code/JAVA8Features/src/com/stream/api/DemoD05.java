package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*given a list of integers,WAP to:
	1.removes duplicate
	2.filter only even nuumbers
	3.sort them in descending order
	4.collect them into list*/

public class DemoD05 {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10,15,8,79,25,98,32,15,8);
		
		asList.
				stream().
						distinct().
									filter(n->n%2==0).
													sorted(Comparator.reverseOrder()).
																					collect(Collectors.toList()).
																											forEach(System.out::println);			
				
	}

}
