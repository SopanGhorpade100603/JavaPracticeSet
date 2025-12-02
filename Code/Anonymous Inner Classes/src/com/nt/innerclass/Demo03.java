package com.nt.innerclass;

interface Movable {
	public static final int SPPED = 134;

	void move(); 
}


public class Demo03 {
	public static void main(String[] args) {
		Movable car = new Movable() {
			
			@Override
			public void move() {
				System.out.println("car is moving with max speed: "+SPPED +" km/hr");
			}
		};
		
		car.move();
		
		Movable bike = new Movable() {
			
			@Override
			public void move() {
				System.out.println("bike is moving with max speed: "+SPPED +" km/hr");
			}
		};
		
		bike.move();
	}
}
