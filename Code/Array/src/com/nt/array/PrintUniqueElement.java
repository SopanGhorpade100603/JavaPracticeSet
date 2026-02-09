package com.nt.array;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueElement {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 2, 8, 4 };
	
	/*	for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1)
				System.out.print(arr[i] + " ");
		} */
		
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		for(int e: arr) {
			if(!unique.add(e)) {
				duplicate.add(e);
			}
		}
		unique.removeAll(duplicate);
		System.out.println(unique);
		
	}
}
