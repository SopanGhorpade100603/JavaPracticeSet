package com.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetD01 {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		ns.add(6);
		ns.add(2);
		ns.add(3);
		ns.add(12);
		ns.add(1);
		System.out.println(ns);
	}
}
