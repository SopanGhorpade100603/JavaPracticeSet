package com.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListD04 {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		cities.add("Hyderabad");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Goa");
		
		ListIterator<String> listItr = cities.listIterator();
		while(listItr.hasNext()) {
			String city = listItr.next();
			if(city.equalsIgnoreCase("pune")) {
				listItr.add("sambhajinagar");
			}else if(city.equals("Mumbai")) {
				listItr.remove();
			}else if(city.equals("Goa")) {
				listItr.set("Jalna");
			}
		}
		cities.forEach(System.out::println);
	}
}

// in above program there is no ConcurrentModificationException becoz ListIterator is modifying
// the structure by it's own method hence there is no problem it is internal structure modification
