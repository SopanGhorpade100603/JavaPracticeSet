package com.list.vector;

import java.util.Collections;
import java.util.Vector;

record Employee(Integer id, String name, Double salary) {
	
}
public class VectorD03 {

	public static void main(String[] args) {
		Vector<Employee> listofEmployees = new Vector<>();
		listofEmployees.add(new Employee(512, "Raj", 24000D));
		listofEmployees.add(new Employee(222, "Abhi", 18000D));
		listofEmployees.add(new Employee(311, "Kartik", 22000D));
		listofEmployees.add(new Employee(111, "Sopan", 20000D));
		listofEmployees.add(new Employee(426, "John", 260000D));
		
		System.out.println("\u001B[31m"+"Original Data: ");
		listofEmployees.forEach(emp->System.out.println(emp));
		
		System.out.println("\u001B[33m"+"\nsorting employee based on id:");
		Collections.sort(listofEmployees,(e1,e2)->e1.id().compareTo(e2.id()));
		listofEmployees.forEach(emp->System.out.println(emp));
		
		System.out.println("\u001B[35m"+"\nsorting employee based on salary:");
		listofEmployees.sort((e1,e2)->e1.salary().compareTo(e2.salary()));
		listofEmployees.forEach(emp->System.out.println(emp));

		
	}

}
