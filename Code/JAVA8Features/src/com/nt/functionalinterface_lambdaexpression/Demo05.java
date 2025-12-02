package com.nt.functionalinterface_lambdaexpression;

@FunctionalInterface
interface Predictable{
	public boolean predict(int age);
}

public class Demo05 {

	public static void main(String[] args) {
		Predictable p = (age)->age>=18;
		System.out.println("person is eligible for vote?: "+p.predict(22));

	}

}
