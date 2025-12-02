package com.nt.array;

import java.util.Arrays;

public class Demo01 {

	public static void main(String[] args) {
//		creating array using new keyword
		int []arr = new int[5];
		arr[0] = 15;
		arr[1] = 45;
		arr[2] = 55;
		arr[3] = 65;
		arr[4] = 44;
		
//		for(Integer a : arr) {
//			System.out.println(a);
//		}
		
		System.out.println(Arrays.toString(arr));
		
//		creating array using inline initializer
		int arr1[] = new int[] {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr1));

//		creating array using anonymous array
		int arr2[] = {2,4,6,8,10};
		System.out.println(Arrays.toString(arr2));

	}
}
