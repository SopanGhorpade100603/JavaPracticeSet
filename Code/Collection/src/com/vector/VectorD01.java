package com.vector;

import java.util.Collections;
import java.util.Vector;

public class VectorD01 {

	public static void main(String[] args) {
		Vector<String> listofCity = new Vector<>();
		listofCity.add("Hyderabad");
		listofCity.add("Sambhajinagr");
		listofCity.add("Pune");
		listofCity.add("Mumbai");
		listofCity.add("Chennai");
		System.out.println(listofCity);
		
		Collections.sort(listofCity);	//old approach
		System.out.println("\u001B[31m"+"\nafter sorting ");
		System.out.println(listofCity);
		
		listofCity.sort((l1,l2)->l1.compareTo(l2));	//new approach
		System.out.println(listofCity);

		System.out.println("\u001B[32m"+"\nremove the element using object[Chennai]");
		listofCity.remove("Chennai");
		System.out.println(listofCity);
		
		System.out.println("\u001B[33m"+"\nremove the element using index[2]");
		listofCity.remove(2);
		System.out.println(listofCity);

	}

}
