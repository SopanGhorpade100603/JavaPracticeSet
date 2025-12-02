package com.nt.array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the "+(i+1)+" index value: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array element: ");
		System.out.println(Arrays.toString(arr));
	}
}
