package com.map.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapD01 {
	public static void main(String[] args) {
		LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
		lhm.put("Sopan", "Sambhajinagar");
		lhm.put("kartik", "Amravati");
		lhm.put("Anurag", "Nagpur");
		lhm.put(null, null);
		
		System.out.println(lhm);
		
	}
}
