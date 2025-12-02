package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapD09 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>(); 
		hm.put(1, "Vanila");
		hm.put(2, "butterscott");
		hm.put(3, "Chocolate");
		hm.put(4, "American-dryfruits");
		hm.forEach((key,val)->System.out.println(key+" : "+val));
		
		System.out.println("value for key 2: "+hm.get(2));
		System.out.println("key 3 is available: \u001B[31m"+hm.containsKey(3));
		
		System.out.println();
		for(Map.Entry<Integer, String> entry:hm.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		System.out.println("\u001B[30m");
		for(Map.Entry<Integer, String> entry:hm.entrySet()) {
			System.out.println(entry);
		}
		
		System.out.println("\nSize of map: "+hm.size());
		
	}
}
