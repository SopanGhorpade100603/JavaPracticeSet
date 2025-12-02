package com.nt.association.aggregation;

/* aggregation → week reference; one object can exist without another object.
	if we destroy the Student object, the College object is not affected.
	If we destroy the College object, the Student object is not affected. */

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

class College {
	String name;
	String address;
	Student std;

	public College(String name, String address, Student std) {
		super();
		this.name = name;
		this.address = address;
		this.std = std;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", address=" + address + ", student=" + std + "]";
	}

}

public class Demo01 {
	public static void main(String[] args) {
		Student std = new Student(101, "sopan");
		College clg = new College("SU", "NSK", std);
		System.out.println(std);
		System.out.println(clg);
	}

}
