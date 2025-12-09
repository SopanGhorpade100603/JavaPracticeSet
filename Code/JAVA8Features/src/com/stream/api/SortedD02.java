package com.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//sort std based on id

record Student(Integer id, String name) {
}

public class SortedD02 {

	public static void main(String[] args) {
		Student s1 = new Student(404, "sopan");
		Student s2 = new Student(504, "raj");
		Student s3 = new Student(302, "kartik");
		Student s4 = new Student(200, "jay");
		Student s5 = new Student(101, "vijay");

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
		Stream<Student> sorted = students.stream().sorted(Comparator.comparing(Student::id));
		sorted.forEach(System.out::println);

		System.out.println("\nbased on name");

		students.sort((n1, n2) -> n1.name().compareTo(n2.name()));
		students.forEach(System.out::println);

	}

}
