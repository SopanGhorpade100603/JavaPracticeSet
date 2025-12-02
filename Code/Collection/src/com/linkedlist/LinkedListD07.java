package com.linkedlist;

import java.util.LinkedList;

public class LinkedListD07 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Item-1");
		ll.add("Item-2");
		ll.add("Item-3");
		ll.add("Item-4");
		ll.add("Item-5");
		ll.add("Item-6");
		ll.add("Item-7");
		ll.add("Item-8");
		ll.add("Item-9");
		
		System.out.println(ll.toString());
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll.toString());
		
		ll.set(0, "sopan");
		ll.set(6, "raj");
		System.out.println(ll.toString());
	}
}
