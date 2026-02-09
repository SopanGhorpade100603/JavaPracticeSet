package com.method_reference;

import java.util.List;

record Student(Integer id, String name) {

	public static void student() {
		System.out.println("Student.Student()");
	}

	void display() {
		System.out.println("id: " + id + " name: " + name);
	}
}

public class Demo07 {

	public static void main(String[] args) {
		Student s1 = new Student(101, "sopan");
		Student s2 = new Student(102, "ram");

		List<Student> of = List.of(s1, s2);
//		arbitrary Method Reference
		of.forEach(Student::display);

	}

}
