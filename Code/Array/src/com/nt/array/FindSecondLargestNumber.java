package com.nt.array;

import java.util.Arrays;

//find the second largest number without sorting

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 2, 8, 4, 10 };

//		using sort
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-2]);

//		using without sort
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max) {
				secondMax = max;
				max = i;
			} else if (i > secondMax && i != max) {
				secondMax = i;
			}
		}
		System.out.println(secondMax);
		System.out.println(max);
	}

}
