package com.set.sortedset_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetD03 {

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
		TreeSet<String> descending = new TreeSet<String>((str1,str2)->str2.compareTo(str1));
		descending.addAll(ts);
		System.out.println(descending);
		
//		OR
		Iterator<String> descendingItr = ts.descendingIterator();
		descendingItr.forEachRemaining(str->System.out.print(str+" "));
	}

}
