package com.nt.consumer.fi;

import java.util.function.Consumer;

record Student(Integer id, String name, double salary) {
}

public class Demo01 {

	public static void student(Student... Obj) {
		Consumer<Student> cons = obj -> System.out.println(obj);
		for(int i=0;i<Obj.length;i++) {
			cons.accept(Obj[i]);
		}
	}

	public static void main(String[] args) {
		Student std1 = new Student(101, "Sopan", 15000);
		Student std2 = new Student(102, "raj", 15000);
		Student std3 = new Student(103, "kartik", 15000);
		Student std4 = new Student(104, "john", 15000);
		student(std1, std2, std3, std4);

	}
}
