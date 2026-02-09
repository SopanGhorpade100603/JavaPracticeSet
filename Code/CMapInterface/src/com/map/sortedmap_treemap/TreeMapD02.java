package com.map.sortedmap_treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapD02 {

	public static void main(String[] args) {
		SortedMap<String,String> tm = new TreeMap<>();
		tm.put("rahul","hyd");
		tm.put("sopan","pune");
		tm.put("kartik","mumbai");
		tm.put("raj","goa");
		tm.put("john","usa");
		
		tm.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		System.out.println();
		
		System.out.println("reverse order");
		SortedMap<String,String> tm1 = new TreeMap<>((a,b)->b.compareTo(a));
		tm1.putAll(tm);
		tm1.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		

	}

}
