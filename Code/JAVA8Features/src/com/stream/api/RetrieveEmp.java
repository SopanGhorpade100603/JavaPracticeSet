package com.stream.api;

import java.util.List;
import java.util.stream.Collectors;

/* retrieve employee names whose salary is greater than 50k
and convert them into list object*/

record Employee(Integer id, String name, double salary) {}

public class RetrieveEmp {

	public static void main(String[] args) {
	Employee e1 = new Employee(101, "Sopan", 56000);
	Employee e2 = new Employee(102, "Raj", 46000);
	Employee e3 = new Employee(103, "Kartik", 51000);
	Employee e4 = new Employee(104, "Abhi", 54000);
	Employee e5 = new Employee(105, "Rahul",486000);
	Employee e6 = new Employee(106, "Ram", 58000);
	Employee e7 = new Employee(107, "Akash", 60000);
	Employee e8 = new Employee(108, "Nilesh", 50000);

	List<Employee> listOfEmployees = List.of(e1,e2,e3,e4,e5,e6,e7,e8);
	
//	List<Employee> list = new ArrayList<>();
//	listOfEmployees.forEach(emp->{
//		if(emp.salary()>50000) {
//			list.add(emp);
//		}
//	});
//			list.forEach(System.out::println);
	
	listOfEmployees.stream().
							filter(emp->emp.salary()>50000).
														collect(Collectors.toList()).
																			forEach(System.out::println);
	
	}
}
