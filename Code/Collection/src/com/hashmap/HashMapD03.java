package com.hashmap;

import java.util.HashMap;

public class HashMapD03 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>(); 
		hm.put(1,"Java");
		hm.put(2, "is");
		hm.put(3, "best");
		hm.forEach((k,v)->System.out.println(k+" : "+v));
		
		HashMap<Integer,String> hm2 = new HashMap<>(hm);
		hm2.put(4, "exam");
		System.out.println(hm2);
		
		
		
	}

}
