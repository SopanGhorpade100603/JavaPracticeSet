package com.nt.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Student(Integer id, String name, Double[] marks) {

	 @Override
	    public String toString() {
	        return "Student[id=" + id +
	               ", name=" + name +
	               ", marks=" + Arrays.toString(marks) + "]";
	    }
}

public class Demo02 {

	public static void main(String[] args) {
		List<Student>students = new ArrayList<>();
		students.add(new Student(142,"Sopan",new Double[] {78d,55d,67d,89d}));
		students.add(new Student(131,"Raj",new Double[] {74D,82D,78D,65D}));
		students.add(new Student(132,"Sham",new Double[] {88.5,72.66,59.33,45.50}));
		
//		sort based on id
		/*
		 * students.sort((n1,n2)->n1.id().compareTo(n2.id()));
		 * students.forEach(System.out::println);
		 */
		
//		sort based on marks average
		students.sort((m1,m2)->{
			Double avg1 = Arrays.stream(m1.marks()).mapToDouble(Double::doubleValue).average().orElse(0);
			Double avg2 = Arrays.stream(m2.marks()).mapToDouble(Double::doubleValue).average().orElse(0);
			return Double.compare(avg1,avg2);
		});
		students.forEach(System.out::println);
	}

}
