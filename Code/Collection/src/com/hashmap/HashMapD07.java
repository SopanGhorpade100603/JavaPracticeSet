package com.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapD07 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Mumbai", 5000);
		hm.put("Goa", 7000);
		hm.put("Sambhajinagar", 4000);
		hm.put("Chennai", 3000);
		hm.put("tirupati", 3000);
		hm.put("Viazag", 3500);
		hm.put("Pune", 5000);
		hm.put("Delhi", 7000);

//		cheapest flight
		System.out.println("cheapest flight");
		Entry<String, Integer> cheapFlight = Collections.min(hm.entrySet(),
				(f1, f2) -> f1.getValue().compareTo(f2.getValue()));
		System.out.println(cheapFlight.getKey() + " : " + cheapFlight.getValue());

		System.out.println("expensive flight");
		int max = Collections.max(hm.values());

		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue() == max) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}

	}

}
