package com.sortedmap_treemap;

import java.util.SortedMap;
import java.util.TreeMap;

record product(Integer id, String name) {}

public class TreeMapD03 {

	public static void main(String[] args) {
		SortedMap<product, String> tm = new TreeMap<>((p1, p2) -> p1.id().compareTo(p2.id()));
		tm.put(new product(222, "Camera"), "Hyderabad");
		tm.put(new product(111, "Mobile"), "Chennai");
		tm.put(new product(303, "Keyboard"), "Banglore");

		tm.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
