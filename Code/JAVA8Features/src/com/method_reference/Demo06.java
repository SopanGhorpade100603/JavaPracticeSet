package com.method_reference;

interface Worker1{
	void work();
}

class Employee1 {
	void getSalary() {
		System.out.println("employee is getting salary");
	}
}

public class Demo06 {
public static void main(String[] args) {
	Worker w1 = new Employee1()::getSalary;
	w1.work();
}
}
