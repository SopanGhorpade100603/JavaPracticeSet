package com.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HashSetD01 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Sopan");
		hs.add("ajay");
		hs.add("kartik");
		hs.add("raj");
		hs.add(null);
		hs.add("Sopan");
		hs.add(null);
		
//		Iterator<String> iterator = hs.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//
//		}
		
//		Spliterator<String> spliterator = hs.spliterator();
//		spliterator.forEachRemaining(name->System.out.println(name));
		
//		hs.forEach((name)->System.out.println(name));

		System.out.println(hs.toString());
	}
}

//HashSet does not maintain any order while iterating the elements from the Collection
