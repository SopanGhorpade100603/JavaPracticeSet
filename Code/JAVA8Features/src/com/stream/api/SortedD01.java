package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedD01 {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(30, 10, 20, 60, 50, 40);
//		asList.stream().sorted().forEach(System.out::println);
		
//		asList.stream().sorted((p1,p2)->Integer.compare(p2, p1)).forEach(System.out::println);
//		asList.stream().sorted((p1,p2)->p2.compareTo(p1)).forEach(System.out::println);
		asList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		

	}

}
