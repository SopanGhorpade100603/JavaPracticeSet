package com.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListD02 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		long startTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			al.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time taken by ArrayList: "+(endTime-startTime)+" ms");
		
		
		LinkedList<Integer> ll = new LinkedList<>();
		startTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			ll.add(i);
		}
		 endTime = System.currentTimeMillis();
		System.out.println("time taken by LinkedList: "+(endTime-startTime)+" ms");
	}
}
//from above code it is clear that linkedlist is very good choice for insertion and deletion 
//of the element from the list