package com.sortedmap_treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapD01 {

	public static void main(String[] args) {
		SortedMap<Integer,String> tm = new TreeMap<>();
		tm.put(1,"Sopan");
		tm.put(5,"Raj");
		tm.put(3,"Kartik");
		tm.put(2,"Abhi");
		tm.put(4,"Anurag");
//		tm.put(null, "abhi"); //NullPointerException
		tm.put(7, null);
		tm.put(8, null);
		
		tm.forEach((k,v)->System.out.println(k+" : "+v));

	}

}
