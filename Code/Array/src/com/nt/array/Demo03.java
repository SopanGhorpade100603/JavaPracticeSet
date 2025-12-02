package com.nt.array;
//create customer array to hold multiple customer object

record Customer(Integer id, String name, Double salary) {}

public class Demo03 {

	public static void main(String[] args) {
		Customer [] cust = new Customer[5];
		cust[0] = new Customer(101, "soapn", 15000d);
		cust[1] = new Customer(102, "raj", 12000d);
		cust[2] = new Customer(103, "kartik", 18000d);
		cust[3] = new Customer(104, "john", 22000d);
		cust[4] = new Customer(105, "devid", 10000d);
	
		for(Customer c :cust) {
			System.out.println(c);
		}
	}
}
