package com.map.sortedmap_treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapD03 {

	public static void main(String[] args) {
		SortedMap<String,Integer> map = new TreeMap<>();
		map.put("sopan", 12);
		map.put("raj", 22);
		map.put("john", 32);
		map.put("devid", 42);
		System.out.println(map);
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollLastEntry());
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
	

	}

}
