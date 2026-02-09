package com.list.arraylist;

import java.util.ArrayList;

public class ArraylistD01 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(22);
		al.add(13);
		al.add(12);
		System.out.println(al.toString());

		
		int sum=0;
		for(int num : al) {
			sum +=num;
		}
		System.out.println("sum is: "+sum);

	}

}
