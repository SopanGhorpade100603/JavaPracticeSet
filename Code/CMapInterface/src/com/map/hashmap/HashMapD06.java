package com.map.hashmap;

import java.util.HashMap;

public class HashMapD06 {

	public static void main(String[] args) {
//		computeIfAbsent() it compute and insert the value only key is unique else do nothing
		HashMap<String, Integer> hm = new HashMap<>();
		hm.computeIfAbsent("Sopan", l->l.length());
		hm.computeIfAbsent("Raj", l->l.length());
		hm.computeIfAbsent("Sopana", l->l.length()*3); 
		hm.computeIfAbsent(null, l->400);
		hm.computeIfAbsent(null, l->500);
		
		System.out.println(hm);

		HashMap<String, Integer> hm1 = new HashMap<>();
//		merge() it add new entry in map if key is unique otherwise its combine oldValue + newValue and value is return null then remove the entire key from map
		hm1.merge("S",10,(oldVal,newVal)->oldVal+ newVal);
		hm1.merge("O",10,(oldVal,newVal)->oldVal+ newVal);
		hm1.merge("P",10,(oldVal,newVal)->oldVal+ newVal);
		hm1.merge("P",20,(oldVal,newVal)->oldVal+ newVal);
		hm1.merge("A",10,(oldVal,newVal)->oldVal+ newVal);
		hm1.merge("N",10,(oldVal,newVal)->oldVal+ newVal);
		hm1.merge("S",10,(oldVal,newVal)->null); // remove the entire entry
		
		System.out.println(hm1);
	}

}
