package com.map.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapD01 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("java", 1234);
		hm.put(new String("java"), 5555);
		System.out.println(hm);
		System.out.println(hm.size());

		System.out.println();
		IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>();
		ihm.put("java", 1234);
		ihm.put(new String("java"), 5555);
		System.out.println(ihm);
		System.out.println(ihm.size());
	}

}
