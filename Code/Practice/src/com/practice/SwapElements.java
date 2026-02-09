package com.practice;

public class SwapElements {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		System.out.println("before swapping:: "+num1+" : "+num2);
//		using 3rd var
//		int temp=num1;
//		num1=num2;
//		num2=temp;
		
//		without 3rd var;
		num1 =num1+num2;
		num2 =num1-num2;
		num1 = num1-num2;
		
//		num1 = num1*num2;
//		num2 = num1/num2;
//		num1 = num1/num2;
		System.out.println("after swapping:: "+num1+" : "+num2);
	
	}

}
