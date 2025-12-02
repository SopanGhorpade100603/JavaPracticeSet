package com.nt.association;

import java.util.Scanner;

class Student {
	int id;
	String name;
	String address;

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}

class Trainer {

	public void viewStudent(Student std) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id: ");
		int id = sc.nextInt();

		if (id == std.getId()) {
			System.out.println(std);
		} else {
			System.err.println("invalid student id");
		}
	}
}

public class Demo01 {
	public static void main(String[] args) {
		Student std = new Student(101, "sopan", "Chhatrapati Sambhajinagar");
		Trainer trainer = new Trainer();
		trainer.viewStudent(std);
	}

}
