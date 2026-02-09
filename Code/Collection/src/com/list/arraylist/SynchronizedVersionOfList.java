package com.list.arraylist;

import java.util.Collections;
import java.util.List;

/*we can get synchronized version or list by calling synchronizedList() method 
of Collections class*/
public class SynchronizedVersionOfList {
	public static void main(String[] args) {
		List<Integer> list = List.of(10, 20, 30, 40);
		List<Integer> synchList = Collections.synchronizedList(list);
		synchList.forEach(System.out::println);
	}
}
