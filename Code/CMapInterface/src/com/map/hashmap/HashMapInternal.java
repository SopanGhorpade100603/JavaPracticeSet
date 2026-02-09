package com.map.hashmap;

import java.util.HashMap;

public class HashMapInternal {
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("A", 1);
		hm.put("A", 2);
		hm.put(new String("A"),3);
		System.out.println(hm.size());  //1 a=3
		System.out.println(hm);
		
		HashMap<Integer,Integer> hm1 = new HashMap<>();
		hm1.put(122, 10);
		hm1.put(122, 20);
		System.out.println("\n"+hm1.size()); // 1 122->20
		System.out.println("\u001B[36m"+hm1);
		
		HashMap<Object,Object> hm2 = new HashMap<>();
		hm2.put("A", 1);
		hm2.put("A", 2);
		hm2.put(new String("A"), 2);
		System.out.println("\n"+hm2.size()); //1 a->2
		System.out.println("\u001B[31m"+hm2);
		
	}
}
