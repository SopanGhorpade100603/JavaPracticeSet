package com.list.arraylist;

import java.util.ArrayList;

public class ArrayListD02 {
//	removing duplicate from array list
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Strawbery");
		fruits.add("Mango");
		
//		HashSet<String> hs = new HashSet<>(fruits);
//		hs.forEach(System.out::println);
		fruits.
			stream().
					distinct().
								forEach(System.out::println);
		
	}

}
