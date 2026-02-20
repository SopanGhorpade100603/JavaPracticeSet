package com.nt.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestElementinArray {
	public static void main(String[] args) {
		 int arr[]={ 7, 2, 5, 1, 4};
//			int max=Integer.MIN_VALUE;
//			for(int e : arr) {
//				if(e>max) {
//					max=e;
//				}
//			}
//			System.out.println(max);
		 
		 OptionalInt max = Arrays.stream(arr).max();
		 System.out.println(max);
		 System.out.println(max.getAsInt());
		
	}

}
