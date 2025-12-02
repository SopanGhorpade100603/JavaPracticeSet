package com.nt.array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAllElemet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the "+(i+1)+" index value: ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(Integer ele : arr) {
			sum +=ele;
		}
		
		System.out.println("array element: "+Arrays.toString(arr));
		
		System.out.println("sum of all element is: "+sum);

	}

}
