package com.vector;

import java.util.Vector;

public class VectorD05 {

	public static void main(String[] args) {
		Vector<String> listofCity = new Vector<>();
		listofCity.add("Hyderabad");
		listofCity.add("pune");
		listofCity.add("Sambhajinagar");
		listofCity.add("Mumbai");
		listofCity.add("Goa");
		listofCity.add("Indore");
		
		listofCity.forEach(System.out::println);

		listofCity.sort((c1, c2) -> c1.compareTo(c2));
		System.out.println("\u001B[31m" + "\nascending order");
		System.out.println(listofCity.toString());

		System.out.println();
		listofCity.forEach(city -> System.out.println(city.toLowerCase()));

	}

}
