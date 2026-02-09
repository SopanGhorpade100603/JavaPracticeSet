package com.set.sortedset_treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetD01 {

	public static void main(String[] args) {
		Set<Object> ts = new TreeSet<>();
		ts.add("Sopan");
		ts.add("ajay");
		ts.add("kartik");
		ts.add("raj");
		ts.add("Sopan");
//		ts.add(12);		//ClassCastexception
//		ts.add(null);	//NullPointerException
		System.out.println(ts);

	}
}
