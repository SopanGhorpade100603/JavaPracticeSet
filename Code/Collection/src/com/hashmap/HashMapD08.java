package com.hashmap;

import java.util.HashMap;

public class HashMapD08 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Sopan", "Sambhajinagar");
		hm.put("Kartik", "Amravati");
		hm.put("Anurag", "Nagpur");
		hm.put("Raj", "pune");
		hm.put(null, null);
		System.out.println(hm);
	}

}
