package com.nt.array;

public class FindMissingNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5 };
		int arrLenght = arr.length + 1; //add 1 becoz 1 no is missing
		int actualSum = arrLenght * (arrLenght + 1) / 2;
		int totalSum = 0;
		for (int ele : arr) {
			totalSum += ele;
		}
		int missingNumber = actualSum - totalSum;
		System.out.println(missingNumber);
	}

}
