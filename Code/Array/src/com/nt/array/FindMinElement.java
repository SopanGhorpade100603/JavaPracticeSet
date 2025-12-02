package com.nt.array;

public class FindMinElement {

	public static void main(String[] args) {
		int arr[] = { 14, 4, 6, 2, 12, 15 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min element in array is: " + min);

		for (Integer val : arr) {
			if (val < min) {
				min = val;
			}
		}
		System.out.println("min element in array is: " + min);

	}

}
