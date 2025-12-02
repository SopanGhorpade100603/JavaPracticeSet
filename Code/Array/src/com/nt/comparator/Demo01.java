package com.nt.comparator;

import java.util.Arrays;

//sort the employee based on employee id[comparator]
record Employee(Integer id, String name, Double salary){

}

public class Demo01 {
	public static void main(String[] args) {
		Employee[] listOfEmployees = new Employee[5];
		listOfEmployees[0] = new Employee(303, "rahul", 23000D);
		listOfEmployees[1] = new Employee(103, "sopan", 25000D);
		listOfEmployees[2] = new Employee(203, "kartik", 24000D);
		listOfEmployees[3] = new Employee(403, "john", 26000D);
		listOfEmployees[4] = new Employee(503, "miller", 21000D);

		System.out.println("original data");
		for (Employee emp : listOfEmployees) {
			System.out.println(emp);
		}

		System.out.println("\nsort based on id");
		Arrays.sort(listOfEmployees,(e1,e2)->e1.id().compareTo(e2.id()));
		for (Employee emp : listOfEmployees) {
			System.out.println(emp);
		}
		
		
		System.out.println("\nsort based on salary");
		Arrays.sort(listOfEmployees,(e1,e2)->Double.compare(e1.salary(), e2.salary()));
		for (Employee emp : listOfEmployees) {
			System.out.println(emp);
		}

	}
}
