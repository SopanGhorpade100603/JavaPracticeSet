package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//WAP code to return employees whose salary is greater than 50k

record Employee1(Integer id, String name,double salary) {}

public class EmployeeRecord {
	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1(101, "sopan", 55000));
		list.add(new Employee1(102, "raj", 45000));
		list.add(new Employee1(103, "kartik", 52000));
		list.add(new Employee1(104, "john", 58000));
		list.add(new Employee1(105, "marco", 47000));
		
		list.stream()
					.filter(emp->emp.salary()>50000).
												collect(Collectors.toList()).
																			forEach(System.out::println);
		
	}

}
