package com.nt.innerclass;

abstract class Vehicle{
	public abstract void run();
}

public class Demo02 {

	public static void main(String[] args) {
		Vehicle car = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("car is running");
			}
		};
		
		car.run();
		
		Vehicle bike = new Vehicle() {
			@Override
			public void run() {
				System.out.println("bike is running");
			}
		};
		
		bike.run();
	}

}
