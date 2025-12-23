package com.nt.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortanArray {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 4, 8, 6, 9, };
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

//		int[] array = Arrays.stream(arr).sorted().toArray();
//		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
