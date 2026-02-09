package com.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListD03 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.addFirst("Sopan");
		ll.add("Raj");
		ll.addLast("Kartik");
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		List<String> asList = Arrays.asList("Sopan","12","23","Kartik","Ram");
			LinkedList<String> values = new LinkedList<>(asList);
			System.out.println(values);

	}

}
