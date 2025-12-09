package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicateDistinctD01 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,4,1,2,3,5,6,9,7,5,8);
		Stream<Integer> unique = num.stream().
											distinct().
														sorted();
		unique.forEach(System.out::println);
		
		System.out.println("-------------------------------");
		
		int arr[] = {2,4,1,2,3,5,6,9,7,5,8};
		Stream<Integer> sorted = Arrays.stream(arr).
													boxed().
															distinct().
																		sorted();
		sorted.forEach(i->System.out.print(i+" "));
	}

}
