package com.arraylist;

import java.util.Arrays;
import java.util.List;

public class FixedLengthArrayD01 {
	public static void main(String[] args) {
		List<Integer> nums =Arrays.asList(4,5,8,2,1,3);
		nums.forEach(num->System.out.println(num));
//		nums.add(5);
//		nums.remove(0);
		nums.set(2, 222);
		System.out.println(nums);
	}
}

//in Arrays class has provided a predefined method asList(T...x) it will create 
//fixed length array and return type is list interface
//we can't perform add(), remove() operation only set/replace the existing element is possible 