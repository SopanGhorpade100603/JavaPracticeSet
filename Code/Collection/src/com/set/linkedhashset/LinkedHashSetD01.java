package com.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetD01 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
//		HashSet<String> lhs = new HashSet<>();
		lhs.add("Sopan");
		lhs.add("Kartik");
		lhs.add("Raj");
		lhs.add("Anurag");
		lhs.add("Abhi");
		lhs.forEach(System.out::println);
		
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
		lhs2.add(15);
		lhs2.add(10);
		lhs2.add(5);
		lhs2.add(20);
		System.out.println("\n"+lhs2);
	}

}
