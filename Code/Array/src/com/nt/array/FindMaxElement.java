package com.nt.array;

import java.util.Arrays;

public class FindMaxElement {

	public static void main(String[] args) {
		int arr[] = { 14, 4, 6, 22, 12, 15, 11 };
		int max = arr[0];

		/* for (Integer val : arr) {
		 *  if (val > max) { 
		 *  max = val; 
		 *  } 
		 *  }
		 * System.out.println("max element in array is: " + max);
		 */
		
//		using java
		int max2 = Arrays.stream(arr).max().getAsInt();
		 System.out.println("max element in array is: " + max2);

	}

}
