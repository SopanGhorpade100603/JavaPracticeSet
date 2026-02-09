package com.set.hashset;

import java.util.HashSet;

public class HashSetD04 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add(new String("hello"));
		hs.add(new String("hello"));
		System.out.println(hs.size());	//1
	
		HashSet<StringBuffer> hs1 = new HashSet<>();
		hs1.add(new StringBuffer("sopan"));
		hs1.add(new StringBuffer("sopan"));
		System.out.println(hs1.size());	//2
	
	}
}

// from above code it's clear that hashCode() and equals() method are overridden in 
// string class but not in a StringBuffer class