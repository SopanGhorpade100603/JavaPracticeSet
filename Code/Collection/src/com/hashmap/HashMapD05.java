package com.hashmap;

import java.util.HashMap;

public class HashMapD05 {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		
		String str = "java is best, java is powerful, java is great";
		String[] split = str.split(" ");
		for(String word: split){
			hm.put(word, hm.getOrDefault(word, 0)+1);
		}
		System.out.println("word Frequency: "+hm);
		
	}

}
