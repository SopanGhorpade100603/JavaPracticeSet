package com.sortedset_treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TressSetD03 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(); 
		ts.add(5);
		ts.add(7);		
		ts.add(3);
		ts.add(12);
		ts.add(2);
		
		System.out.println("natuaral sorting[ascending]");
		System.out.println(ts);
		
		System.out.println();
		System.out.println("descending order");
		NavigableSet<Integer> descendingSet = ts.descendingSet();
		descendingSet.forEach(System.out::println);

//		Iterator<Integer> descendingIterator = ts.descendingIterator();
//		descendingIterator.forEachRemaining(System.out::println);
	}

}
