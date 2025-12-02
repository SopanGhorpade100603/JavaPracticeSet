package com.nt.association.composition;

/* Composition -> strong reference; one object can’t exist without another object.
If we destroy Car object then Engine object will also be destroyed automatically */
class Engine {
	String type;
	String hp;

	public Engine(String type, String hp) {
		super();
		this.type = type;
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", hp=" + hp + "]";
	}

}

class Car {
	private String carName;
	private int modelYear;
	private Engine engine;

	public Car(String carName, int modelYear, String type, String hp) {
		super();
		this.carName = carName;
		this.modelYear = modelYear;
		this.engine = new Engine(type, hp);
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", modelYear=" + modelYear + ", engine=" + engine + "]";
	}

}

public class Demo01 {

	public static void main(String[] args) {
		Car car = new Car("Toyota Fortuner", 2025, "petrol", "2250CC");
		System.out.println(car);
	}

}
