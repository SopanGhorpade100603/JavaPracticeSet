package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

record Employee2(Integer id, String name,double salary) {}

public class TotalSalaryOfEmp {
	public static void main(String[] args) {
		List<Employee2> list = new ArrayList<>();
		list.add(new Employee2(202, "sopan", 55000));
		list.add(new Employee2(202, "raj", 45000));
		list.add(new Employee2(203, "kartik", 52000));
		list.add(new Employee2(204, "john", 58000));
		list.add(new Employee2(205, "marco", 47000));
		
	
		double sum = list.stream().
									mapToDouble(emp->emp.salary()).sum();
		System.out.println("total salary of all emp: "+sum);
		
		
		long count = list.stream().
					mapToInt(n->n.id()).count();
		System.out.println("total emp: "+count);
		
		  OptionalDouble min = list.stream().
					mapToDouble(n->n.salary()).min();
		System.out.println("min salary: "+min);
		
		OptionalDouble max = list.stream().
				mapToDouble(n->n.salary()).max();
		System.out.println("max salary: "+max);
	}

}

