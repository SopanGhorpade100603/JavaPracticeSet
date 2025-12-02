package com.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetD02 {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(6);
		ns.add(3);
		ns.add(5);
		ns.add(2);
		ns.add(4);
		ns.add(7);
		ns.add(8);
		System.out.println(ns);
		System.out.println("lower(4): "+ns.lower(4)); 		// it will return lower than that value or return null
		System.out.println("floor(5): "+ns.floor(5)); 		// it will return equal, less, or null
		System.out.println("floor(11): "+ns.floor(11)); 	// it will return equal, less, or null
		System.out.println("higher(3): "+ns.higher(3)); 	// it will return greater than or null
		System.out.println("ceiling(1): "+ns.ceiling(1)); 	// it will return greater equal or null
	}

}
