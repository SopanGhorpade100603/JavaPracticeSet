package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
//sort customer using comratator

record Customer(Integer id, String name, Double custSal) implements Comparable<Customer>{

	@Override
	public int compareTo(Customer cust) {
		return this.custSal().compareTo(cust.custSal());
	}
	
}
public class ArrayListD03 {
	public static void main(String[] args) {
		ArrayList<Customer> listofCustmers = new ArrayList<>();
		listofCustmers.add(new Customer(111, "Sopan", 800D));
		listofCustmers.add(new Customer(222, "Raj", 1200D));
		listofCustmers.add(new Customer(333, "Abhi", 700D));
		listofCustmers.add(new Customer(444, "Kartik", 900D));
		listofCustmers.add(new Customer(555, "Scott", 1500D));
		
		listofCustmers.forEach(cust->System.out.println(cust));
		
		Collections.sort(listofCustmers);
		System.out.println("\nsort based on salary");
		listofCustmers.forEach(cust->System.out.println(cust));
	}

}
