package com.nt.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestelementinArray {
	public static void main(String[] args) {
		 int arr[]={ 7, 2, 5, 1, 4};
//		 int max=0;
//		 for(int i=0;i<arr.length;i++) {
//			 if(arr[i]>max)
//				 max=arr[i];
//		 }
//		System.out.println(max);
		 
		 OptionalInt max = Arrays.stream(arr).max();
		 System.out.println(max);
		 System.out.println(max.getAsInt());
		
	}

}
