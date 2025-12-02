package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListD09 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		System.out.println("size of list: "+list.size());

		System.out.println(list);
		List<Integer> subList = list.subList(2, 7);
		System.out.println(subList);

		System.out.println(list.contains(5));
		System.out.println(list.indexOf(5));

		list.removeIf(ele -> ele % 2 == 0);
		System.out.println(list);
		
		list.trimToSize();
		System.out.println("size of list: "+list.size());

		
	}

}
