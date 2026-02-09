package com.defaultmergemethod;

import java.util.HashMap;
import java.util.Map;

/*it id default method of map interface available in java.utl package it was introduce 
in java8. it will insert key in map only when key is new(unique) not already present
if key is already present then it will compute old key value and new key value*/

public class Demo01 {
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		hm.merge("Sopan", 10, (oldKey,newKey)->oldKey*newKey);
		hm.merge("Raj", 10, (oldKey,newKey)->oldKey*newKey);
		hm.merge("Sopan", 2, (oldKey,newKey)->oldKey*newKey);
		System.out.println(hm);
	}
}
