package com.list.arraylist;

import java.util.ArrayList;

public class ArrayListD08 {

	public static void main(String[] args) {
		ArrayList<String> original  = new ArrayList<String>();
		original.add("JAVA");
		original.add("JDBC");
		original.add("Oracle");
		original.add("HTMl");
		
		System.out.println("By using clone method");
		@SuppressWarnings("unchecked")
		ArrayList<String> clone = (ArrayList<String>) original.clone();
		System.out.println(clone);
		
		System.out.println("By using copy Constructor");
		ArrayList<String> copy = new ArrayList<String>(original);
		System.out.println(copy);

	}

}
