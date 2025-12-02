package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

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
		
//		Collections.sort(cities);
		cities.sort((c1,c2)->c1.compareTo(c2));
		System.out.println("\u001B[31m"+"ascending order");
		System.out.println(cities.toString());

		System.out.println("\u001B[33m"+"descending order");
//		Collections.sort(cities.reversO());
//		Collections.sort(cities,Collections.reverseOrder());
		cities.sort((c1,c2)->c2.compareTo(c1));
		System.out.println(cities.toString());

	}

}
