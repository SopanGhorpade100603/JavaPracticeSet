package com.set.sortedset_treeset;

import java.util.TreeSet;

public class TreeSetD02 {
public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet<>(); 
	ts.add(5);
	ts.add(7);		
	ts.add(3);
	ts.add(12);
	ts.add(2);
	System.out.println(ts);
	System.out.println(ts.headSet(7));
	System.out.println(ts.tailSet(5));
	System.out.println(ts.subSet(2, 11));
	System.out.println(ts.first());
	System.out.println(ts.last());
}
}
