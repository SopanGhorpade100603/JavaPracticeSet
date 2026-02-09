package com.hashtable;

import java.util.Hashtable;

public class HashtableD02 {
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<>();
		ht.put(1, "priyanka");
		ht.put(2, "ruby");
		ht.put(3, "vibha");
		ht.put(4, "kanchan");
		
		ht.putIfAbsent(5, "bina");
		ht.putIfAbsent(24, "pooja");
		ht.putIfAbsent(26, "Ankita");
		ht.putIfAbsent(1, "sneha");
		System.out.println(ht);
	
		
	}

}
