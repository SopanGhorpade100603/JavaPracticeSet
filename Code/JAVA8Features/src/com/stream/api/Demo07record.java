package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

record Student2(Integer id, String name, String address, Integer age, double percentage, char gender) {
}

public class Demo07record {
	public static void main(String[] args) {

		Student2 s1 = new Student2(1, "rahul", "pune", 23, 78.0, 'M');
		Student2 s2 = new Student2(2, "sopan", "chh.sambhajinagar", 22, 74.0, 'M');
		Student2 s12 = new Student2(3, "rajshri", "pune", 22, 48.0, 'F');
		Student2 s10 = new Student2(4, "shreya", "nagpur", 22, 58.0, 'F');
		Student2 s5 = new Student2(5, "ram", "mumbai", 25, 88.0, 'M');
		Student2 s8 = new Student2(6, "sakshi", "nagpur", 23, 72.0, 'F');
		Student2 s7 = new Student2(7, "gauri", "nashik", 20, 62.0, 'F');
		Student2 s6 = new Student2(8, "nayan", "goa", 22, 48.0, 'M');
		Student2 s9 = new Student2(9, "aditi", "amravati", 21, 82.0, 'F');
		Student2 s4 = new Student2(10, "gaurav", "vardha", 24, 67.0, 'M');
		Student2 s11 = new Student2(11, "dipti", "mumbai", 25, 68.0, 'F');
		Student2 s3 = new Student2(12, "kartik", "amravati", 21, 72.0, 'M');

		List<Student2> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
		long count = students.stream().count();
		System.out.println("total no of students: " + count);
		
		long noOfGirls = students.stream().filter(g->g.gender()=='F').count();
		System.out.println("total no of Girls: " + noOfGirls);
		
		OptionalDouble average = students.stream().mapToInt(s->s.age()).average();
		System.out.println("average age of students: "+average.getAsDouble());
		
		boolean allPass = students.stream().allMatch(s->s.percentage() >50);
		System.out.println("did all student pass?: "+allPass);
		
		List<Student2> passStudents = students.stream().filter(s->s.percentage()>50).collect(Collectors.toList());
		System.out.println("passed student list: ");
		passStudents.forEach(System.out::println);
		System.out.println("passed student count: "+passStudents.size());
		
		Optional<Student2> max = students.stream().max(Comparator.comparing(Student2::percentage));
		System.out.println("1st rank students: "+max);
		
	}

}
