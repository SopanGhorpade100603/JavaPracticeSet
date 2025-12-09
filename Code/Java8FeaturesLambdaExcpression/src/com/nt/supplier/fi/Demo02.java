package com.nt.supplier.fi;

import java.util.function.Supplier;

record Student(Integer id, String name, double salary) {}

public class Demo02 {

	public static void main(String[] args) {
		Supplier<Student> std =()->{
			return new Student(101,"Sopan",15000);
		};
		Student s = std.get();
		System.out.println(s);
	}

}
