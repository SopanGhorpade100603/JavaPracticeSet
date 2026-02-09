package com.set.sortedset.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetD01 {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		ns.add(30);
		ns.add(20);
		ns.add(40);
		ns.add(10);
		
		System.out.println(ns);
		System.out.println(ns.lower(30));  
		System.out.println(ns.floor(30));    
		System.out.println(ns.ceiling(25));  
		System.out.println(ns.higher(30)); 
		
		System.out.println("reverse Order: "+ns.descendingSet());
		
		System.out.println("remove and return first ele: "+ns.pollFirst());
		System.out.println(ns);
		System.out.println("remove and return last ele: "+ns.pollLast());
		System.out.println(ns);
	}
}
