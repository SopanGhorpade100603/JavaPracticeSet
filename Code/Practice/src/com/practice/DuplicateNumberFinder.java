package com.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberFinder {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 3, 2, 7, 5, 8, 3 };
		
		Map<Integer,Integer> hm = new HashMap<>();

		for(Integer i : arr) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		
		System.out.print("duplicate element is: ");
		hm.forEach((k,v)->{
			if(v>1) {
				System.out.print(k+" ");
			}
		});
		
		
//		old approach
	/*
	 int arr[] = { 2, 4, 5, 3, 2, 7, 5, 8, 3 };
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		 */
		
	}

}
