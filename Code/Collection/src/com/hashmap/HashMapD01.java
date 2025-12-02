package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapD01 {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		hm.put("Aryan",1011);
		hm.put("Kartik",1151);
		hm.put("Sopan",1001);
		hm.put("Raj",1010);
		
//		System.out.println(hm);
		hm.forEach((k,v)->System.out.println(k+" "+v));
	}

}
