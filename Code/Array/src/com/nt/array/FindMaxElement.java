package com.nt.array;

public class FindMaxElement {

	public static void main(String[] args) {
		int arr[] = { 14, 4, 6, 22, 12, 15, 11 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max element in array is: " + max);

		for (Integer val : arr) {
			if (val > max) {
				max = val;
			}
		}

		System.out.println("max element in array is: " + max);

	}

}
