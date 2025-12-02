package com.nt.constructor;

import java.util.Scanner;

public class Car {
	
	String model;
	int year;
	double price;
	
	public Car(String model, int year, double price) {
		super();
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter car model: ");
		String model = sc.nextLine();
		System.out.print("Enter car years: ");
		int year = Integer.parseInt(sc.nextLine());
		System.out.print("Enter car price: ");
		int price = Integer.parseInt(sc.nextLine());
		
		Car car = new Car(model,year,price);
		System.out.println(car);
	}
	

}
