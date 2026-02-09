package com.map.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapD02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,String> hm = new HashMap<>(); 
		hm.put(101, "Sopan");
		hm.put(102, "Kartik");
		hm.put(103, "Raj");
		hm.put(104, "Aryan");
		
		System.out.println("Student record: \u001B[31m"+hm);
		
		System.out.println("\u001B[30m");
		System.out.print("Enter id: ");
		Integer sId = sc.nextInt();
		String sName = hm.get(sId);
		
		if(sName != null) {
			System.out.println("student id is: "+sId+" name is: "+hm.get(sId));
		}else {
			System.err.println("student with id: "+sId+" not found");
		}
		
	}

}
