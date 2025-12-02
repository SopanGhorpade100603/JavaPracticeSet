package com.arraylist;

import java.util.ArrayList;

public class ArrayListD07 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();	//Generic type
		al.add(12);
		al.add("Sopan");
		al.add(true);
		al.add(12.44);al.add(null);
		al.add("hyderabad");
		System.out.println(al.toString());

		al.set(0, "rj");
		System.out.println(al.toString());
	}

}
