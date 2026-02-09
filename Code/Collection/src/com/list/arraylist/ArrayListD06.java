package com.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListD06 {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Hyderabad");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Sambhajinagar");
		cities.add("Chennai");
		cities.add("Kolkata");
		cities.add("Banglore");
		
/*		
//		old approach
		Collections.sort(cities);
		System.out.println("\u001B[31m"+"ascending order");
		System.out.println(cities.toString());

		System.out.println("\u001B[33m"+"descending order");
		Collections.sort(cities.reversed());
		System.out.println(cities.toString());
		*/
	
		/*
//		new approach using lambda expression
		System.out.println("\u001B[32m"+"ascending order");
		cities.sort((c1,c2)->c1.compareTo(c2));
		System.out.println(cities.toString());

		System.out.println("\u001B[33m"+"descending order");
		cities.sort((c1,c2)->c2.compareTo(c1));
		System.out.println(cities.toString());
		*/
		
//		using method reference
		System.out.println("\u001B[35m"+"ascending order");
		cities.sort(String::compareTo);
		System.out.println(cities.toString());

		System.out.println("\u001B[36m"+"descending order");
		cities.sort(Comparator.reverseOrder());
		System.out.println(cities.toString());
	}

}
