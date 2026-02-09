package com.method_reference;

import java.util.ArrayList;

public class Demo01 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("sopan");
		al.add("ram");
		al.add("ajay");
		al.add("balaji");
		al.add("vijay");
//		arbitary method reference
		al.sort(String::compareTo);
		System.out.println(al);
	}

}
