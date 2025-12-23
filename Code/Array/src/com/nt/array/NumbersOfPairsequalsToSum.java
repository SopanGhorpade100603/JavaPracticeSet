package com.nt.array;

import java.util.HashSet;
import java.util.Set;

//WAP to find the total number of pairs equals to the sum
public class NumbersOfPairsequalsToSum {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 3, 5, 8, 2 };
		int target = 7;
		int pairs = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] + arr[j] == target) {
//					pairs++;
//				}
//			}
//		}
//		System.out.println("total no of pairs: "+pairs);

		Set<Integer> set = new HashSet<>();
		for (Integer num : arr) {
			int diff = target - num;
			if (set.contains(diff)) {
				pairs++;
			}

			set.add(num);
		}
		System.out.println("total no of pairs: " + pairs);

	}

}
