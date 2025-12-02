package com.sortedset_treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetD02 {

	public static void main(String[] args) {
		SortedSet<Integer> ss = new TreeSet<>();
		ss.add(1255);
		ss.add(800);
		ss.add(895);
		ss.add(1100);
		ss.add(798);
		ss.add(1050);
		ss.add(1285);
		ss.add(900);
		ss.add(1200);
		ss.add(1300);
		System.out.println(ss);
		System.out.println("first element: "+ss.first());
		System.out.println("last element: "+ss.last());
		System.out.println("headSet[900]: "+ss.headSet(900));  // it will return range of value up to specified range
		System.out.println("tailSet[900]: "+ss.tailSet(900));  // it will return range of value greater than or equal specified range
		System.out.println("subSet[800-1200]: "+ss.subSet(800, 1200)); //will provide all value up to start range and end range
	}

}
