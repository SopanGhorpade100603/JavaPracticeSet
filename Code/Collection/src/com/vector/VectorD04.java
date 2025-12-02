package com.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorD04 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= 1000000; i++) {
			al.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken by arrayList: " + (endTime - startTime) + "ms");
		
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i <= 1000000; i++) {
			v.add(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Total time taken by vector: " + (endTime - startTime) + "ms");

	}
}
// from above code it is clear that performance wise ArrayList is faster than Vector




