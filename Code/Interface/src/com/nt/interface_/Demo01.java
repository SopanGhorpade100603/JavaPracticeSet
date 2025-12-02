package com.nt.interface_;

interface Movable {
	public static final int SPPED = 134;

	void move(); // public + abstract
}

class Bike implements Movable{

	@Override
	public void move() {
		System.out.println("bike is moving with max spped: " + SPPED + " km/hr");
	}
}

class Car implements Movable {

	@Override
	public void move() {
		System.out.println("car is moving with max spped: " + SPPED + " km/hr");
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Movable car = new Car();
		car.move();
		
		Movable bike = new Bike();
		bike.move();
	}
}
