package com.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

record Employee(Integer id, String name) {
}

public class HashMapD04 {

	public static void main(String[] args) {
		HashMap<Employee,String> listOfEmp = new HashMap<>();
		listOfEmp.put(new Employee(101, "Sopan"), "Sambhajinagar");
		listOfEmp.put(new Employee(102, "aryan"), "Hyd");
		listOfEmp.put(new Employee(103, "Kartin"), "Amravati");
		
		listOfEmp.forEach((k,v)->System.out.println(k+" : "+v));
		

	}

}
