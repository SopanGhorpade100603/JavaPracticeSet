package com.nt.array;

import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) {
		Integer arr[] = { 8, 2, 4, 9, 3 };
//		ascending order
		Arrays.sort(arr);
		System.out.println("ascending order: "+Arrays.toString(arr));
		
//		reverse order
		Arrays.sort(arr,(a1,a2)->a2.compareTo(a1));
		System.out.println("descending order: "+Arrays.toString(arr));
	}
}
