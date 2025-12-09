package com.nt.functionalinterface_lambdaexpression;

@FunctionalInterface
interface Vehicle {
	public void run();
}

public class Demo03 {

	public static void main(String[] args) {
		Vehicle bike = () -> {
			System.out.println("bike is running");
		};
		bike.run();

		Vehicle car = () -> System.out.println("car is rummomg");
		car.run();
	}

}
