package com.sortedset_treeset;

import java.util.TreeSet;

record Student(Integer id, String name) {}
public class TreeSetD05 {

	public static void main(String[] args) {
		TreeSet<Student> std = new TreeSet<>((s1,s2)->s1.id().compareTo(s2.id()));
		std.add(new Student(101,"Sopan"));
		std.add(new Student(107,"Raj"));
		std.add(new Student(105,"Kartik"));
		std.add(new Student(103,"Abhi"));
		
		std.forEach(System.out::println);
		
		System.out.println();
		TreeSet<StringBuffer> ts = new TreeSet<>();
		ts.add(new StringBuffer("a"));
		ts.add(new StringBuffer("b"));
		ts.add(new StringBuffer("c"));
		ts.add(new StringBuffer("d"));
		ts.forEach(System.out::println);
	}

}
