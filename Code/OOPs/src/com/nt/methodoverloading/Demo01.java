package com.nt.methodoverloading;

class Addition {
	public int add(int x, int y) {
		return x + y;
	}

	public double add(double x, double y) {
		return x + y;
	}

}

public class Demo01 {

	public static void main(String[] args) {
		Addition addition = new Addition();
		int result = addition.add(10, 10);
		double res = addition.add(10.5, 10);
		System.out.println(result);
		System.out.println(res);
	}

}
