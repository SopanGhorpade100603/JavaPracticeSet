package com.nt.inheritance;

class TempEmp {
	int id;
	String name;
	double salary;

	public TempEmp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "TempEmp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

class PermEmp extends TempEmp {
	String designation;
	String dept;

	public PermEmp(int id, String name, double salary, String designation, String dept) {
		super(id, name, salary);
		this.designation = designation;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+"PermEmp [designation=" + designation + ", dept=" + dept + "]";
	}

}

public class Demo05 {

	public static void main(String[] args) {
		PermEmp emp = new PermEmp(101, "sopan", 32000, "software developer", "IT");
				System.out.println(emp);
	}

}
