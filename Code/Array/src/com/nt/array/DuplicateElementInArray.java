package com.nt.array;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,2,3,3};
		
		System.out.print("duplicate element are: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
