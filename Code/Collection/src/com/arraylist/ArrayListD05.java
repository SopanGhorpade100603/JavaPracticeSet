package com.arraylist;

import java.util.ArrayList;

public class ArrayListD05 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sopan");
		list.add("Raj");
		list.add("Kartik");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Devid");
		list2.add("Warner");
		list2.add("Raj");
		list2.add("Smith");
		
		list.addAll(list2);
		System.out.println(list.toString());
		System.out.println("size is: "+list.size());
		
		System.out.println("\u001B[31m");
		list.forEach(name->System.out.println(name.toUpperCase()));
		
	}

}
