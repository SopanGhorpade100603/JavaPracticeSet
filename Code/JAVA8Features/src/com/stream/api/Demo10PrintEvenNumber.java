package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//WAP to print even number from list

public class Demo10PrintEvenNumber {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//		list.stream().
//					filter(n -> n % 2 == 0).
//											forEach(System.out::println);

		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Arrays.stream(arr).
					filter(n->n%2==0).
									forEach(System.out::println); 
									
	}

}
