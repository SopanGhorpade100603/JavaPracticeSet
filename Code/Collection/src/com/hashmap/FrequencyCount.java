package com.hashmap;

import java.util.HashMap;

public class FrequencyCount {

	public static void main(String[] args) {
		String str = "java is awesome java is beautiful java is highlevel";
		String[] split = str.split(" ");
	
		HashMap<String,Integer> hm= new HashMap<>();
		for(String word : split) {
			hm.put(word,hm.getOrDefault(word, 0)+1);
		}
		System.out.println("word frequency: "+hm);
		
	}

}
