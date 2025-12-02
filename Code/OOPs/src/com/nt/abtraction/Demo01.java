package com.nt.abtraction;

abstract class Shape {
	protected int redius = 5;
	public abstract void draw();
}

class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Square shape diagram");
	}
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle shape diagram");
	}

}

public class Demo01 {
	public static void main(String[] args) {
		Shape square = new Square();
		System.out.println("Redius: "+square.redius);
		square.draw();
		
		square = new Circle();
		System.out.println("Redius: "+square.redius);
		square.draw();
	}

}
