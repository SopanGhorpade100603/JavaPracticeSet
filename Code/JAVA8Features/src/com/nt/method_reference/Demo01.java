package com.nt.method_reference;

@FunctionalInterface
interface Worker {
	void work();
}

public class Demo01 {
	public static void main(String[] args) {
//		lambda expression
		Worker w1 = ()->System.out.println("worker in working");
		w1.work();
		
//		method reference
		Worker w2 = new Employee() :: work;
		w2.work();
	}
}

class Employee implements Worker{

	@Override
	public void work() {
		System.out.println("employee is working");
	}
	
	public void emp() {
		System.out.println("Employee.emp()");
	}
	
}
