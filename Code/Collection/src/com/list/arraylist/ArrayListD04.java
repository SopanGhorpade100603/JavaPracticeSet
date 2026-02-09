package com.list.arraylist;

import java.util.ArrayList;

//sort customer using comparator

record CustomerC(Integer id, String name, Double custSal) {
	
}
public class ArrayListD04 {
	public static void main(String[] args) {
		ArrayList<CustomerC> listofCustmers = new ArrayList<>();
		listofCustmers.add(new CustomerC(111, "Sopan", 800D));
		listofCustmers.add(new CustomerC(222, "Raj", 1200D));
		listofCustmers.add(new CustomerC(333, "Abhi", 700D));
		listofCustmers.add(new CustomerC(444, "Kartik", 900D));
		listofCustmers.add(new CustomerC(555, "Scott", 1500D));
		
		System.out.println("\u001B[31m Original data");
		listofCustmers.forEach(cust->System.out.println(cust));
		
		System.out.println("\u001B[32m sort data by using salary");
//		using lambda
		listofCustmers.sort((c1,c2)->c1.custSal().compareTo(c2.custSal()));
//		using method reference
//		listofCustmers.sort(Comparator.comparing(CustomerC::custSal));
		
		listofCustmers.forEach(cust->System.out.println(cust));
	}

}
