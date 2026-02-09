package com.nt.exception;
/*from jdk 1.7 to remove length of catch block java 
software people provide OR | symbol*/

public class Demo03 {

	public static void main(String[] args) {
		try {
			int res = 10 / 0;
			int arr[] = new int[5];
			System.out.println(arr[10]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
			
			if( e instanceof ArithmeticException)
			System.out.println(e.getMessage());
			else
				System.out.println(e.getMessage());
		}

	}

}
