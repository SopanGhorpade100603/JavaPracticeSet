package com.list.arraylist;

import java.util.List;

public class ImmutableListD01 {

	public static void main(String[] args) {
		List<Integer> immutableList = List.of(1,2,6,4,5);
		immutableList.forEach(System.out::println);
//		immutableList.add(12);
//		immutableList.remove(1);
//		immutableList.set(1,222);
	}

}
//list interface has provided a predefined method asList(T...x) it will create 
//fixed immutable list and return type is list interface
//once it is created we can't perform any king of operatopn like add(),remove(),set() 