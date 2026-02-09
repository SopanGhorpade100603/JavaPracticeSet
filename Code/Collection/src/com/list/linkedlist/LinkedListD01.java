package com.list.linkedlist;

import java.util.LinkedList;

public class LinkedListD01 {

	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<>();
		ll.add("Sopan");
		ll.add("Ram");
		ll.add(23);
		ll.add(null);
		
		System.out.println(ll.get(0));
		ll.addFirst(44);
		ll.addLast(10);
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);

	}
}
