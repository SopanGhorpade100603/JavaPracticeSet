package com.list.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListD08 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Sopan");
		ll.add("Raj");
		ll.add("Kartik");
		ll.add("Anurag");
		ll.add("John");

		ListIterator<String> listItr = ll.listIterator();

		System.out.println("\u001B[31m" + "forward direction...");
		
		while (listItr.hasNext()) {
			int nextIndex = listItr.nextIndex();
			String next = listItr.next();
			System.out.println("index is: " + nextIndex + " value is: " + next);
		}

		System.out.println("\u001B[35m" + "Backward direction...");
		
		while (listItr.hasPrevious()) {
			int previousIndex = listItr.previousIndex();
			String previous = listItr.previous();
			System.out.println("previous index is: " + previousIndex + " value is: " + previous);
		}
	}

}
