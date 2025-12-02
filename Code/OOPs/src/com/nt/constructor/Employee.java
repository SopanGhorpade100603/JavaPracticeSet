package com.nt.constructor;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double salary;
	int noOfProject;

	public Employee(int id, String name, double salary, int noOfProject) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}

	public void calculateSalary() {
		if (noOfProject <= 5) {
			salary = salary;
		} else if (noOfProject > 5 && noOfProject <= 10) {
			salary += 5000;
		} else if (noOfProject > 10 && noOfProject <= 20) {
			salary += 10000;
		} else {
			salary += 20000;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", noOfProject=" + noOfProject + "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Employee name: ");
		String name = sc.nextLine();
		System.out.print("Enter Employee salary: ");
		double salary = Double.parseDouble(sc.nextLine());
		System.out.print("Enter no of project done:");
		int noOfProject = Integer.parseInt(sc.nextLine());

		Employee emp = new Employee(id, name, salary, noOfProject);
		emp.calculateSalary();
		System.out.println(emp);
	}
}
