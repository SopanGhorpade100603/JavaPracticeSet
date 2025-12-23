package com.nt.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,2,3,3};
		
//		System.out.print("duplicate element are: ");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.print(arr[i]+" ");
//				}
//			}
//		}
		
//		using collection
		Set<Integer> set = new HashSet<>();
//		System.out.print("duplicate elements are: ");
//		for(Integer i : arr) {
//			if(!set.add(i)) {
//				System.out.print(i+" ");
//			}
//		}
		
//		using stream
		Arrays.stream(arr).
						filter(n-> !set.add(n)).
											forEach(System.out::println);
		

	}

}
