package com.hashtable;

import java.util.Hashtable;

public class HashtableD01 {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "Sopan");
		ht.put(2, "kartik");
		ht.put(3, "Abhi");
		ht.put(4, "Raj");
//		ht.put(null, "arnav");	//NullPointerException
//		ht.put(6, null);	//NullPointerException
		System.out.println(ht);
	}

}
