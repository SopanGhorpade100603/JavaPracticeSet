package com.nt.array;

import java.util.Arrays;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {
		Integer arr[] = { 2, 4, 5, 6, 7, 8 };
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		}
		
	List<Integer> asList = Arrays.asList(arr);
	asList.reversed().forEach(System.out::println);

	}
}
