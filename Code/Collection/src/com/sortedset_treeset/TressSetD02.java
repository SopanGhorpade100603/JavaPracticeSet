package com.sortedset_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TressSetD02 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(); 
		ts.add("Mango");
		ts.add("Strawbery");		
		ts.add("Banana");
		ts.add("Grapes");
		ts.add("Apple");
		
		System.out.println("natuaral sorting[ascending]");
		System.out.println(ts);
		
		System.out.println();
		System.out.println("descending order");
		Iterator<String> descendingIterator = ts.descendingIterator();
		descendingIterator.forEachRemaining(System.out::println);
	}

}
