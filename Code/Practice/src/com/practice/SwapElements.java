package com.practice;

public class SwapElements {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println("before swapping: a="+a+" b= "+b);
//		using 3rd variable
//		int temp = a;
//		a=b;
//		b=temp;
		
//		without using 3rd variable
		
		a=a*b;
		b= a/b;
		a=a/b;
		
		System.out.println("after swapping: a="+a+" b= "+b);

	}

}
