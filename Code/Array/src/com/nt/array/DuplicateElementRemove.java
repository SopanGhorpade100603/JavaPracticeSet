package com.nt.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementRemove {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 2, 3, 3 };

//		for (int i = 0; i < arr.length; i++) {
//			boolean isUnique = true;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] == arr[j] && i != j) {
//					isUnique = false;
//					break;
//				}
//			}
//			if (isUnique) {
//				System.out.print(arr[i] + " ");
//			}
//		}

//		using collection
		Set<Integer> set = new HashSet<>();
//		System.out.print("unique elements are: ");
//		for(Integer i : arr) {
//			if(set.add(i)) {
//				System.out.print(i+" ");
//			}
//		}

//		using stream
		Arrays.stream(arr).
						distinct().
								   sorted().
											forEach(System.out::println);
		

	}

}
