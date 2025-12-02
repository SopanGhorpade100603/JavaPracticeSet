package com.nt.loosecoupling;

@FunctionalInterface
interface CalculatorMethod {

	double calculate(double a, double b);

}

class Addition implements CalculatorMethod {

	@Override
	public double calculate(double a, double b) {
		return a + b;
	}

}

class subtraction implements CalculatorMethod {

	@Override
	public double calculate(double a, double b) {
		return a - b;
	}

}

class multiplication implements CalculatorMethod {

	@Override
	public double calculate(double a, double b) {
		return a * b;
	}

}

class division implements CalculatorMethod {

	@Override
	public double calculate(double a, double b) {
		return a / b;
	}

}

class Operation {
	public double operations(CalculatorMethod method) {
		return method.calculate(20, 30);
	}

}

public class Calculator {

	public static void main(String[] args) {

		Operation ops = new Operation();
		double result = ops.operations(new Addition());
//	double result = ops.operations((a,b)->a*b);
		System.out.println(result);
	}

}
