package com.sortedmap_treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap02 {

	public static void main(String[] args) {
		Map<String,String> tm = new TreeMap<>();
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
		Map<String,String> tm1 = new TreeMap<>((a,b)->b.compareTo(a));
		tm1.putAll(tm);
		tm1.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		

	}

}
