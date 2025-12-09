package com.practice;

import java.util.Arrays;

public class MovesAllZeroToEnd {

	public static void movesZero(int... arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		movesZero(0, 1, 0, 3, 12);
	}
}
