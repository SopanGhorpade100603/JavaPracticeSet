package com.nt.functionalinterface_lambdaexpression;

@FunctionalInterface
interface Printable{
	void print();
}

public class Demo02 {

	public static void main(String[] args) {
		//Using lambda expression
		Printable p =()->{
			System.out.println("printing....");
		};
		p.print();
	}

}
