package com.practice;

import java.util.Arrays;

/*You are given:
arr[] = array of arrival times of trains
dep[] = array of departure times of trains
We need to find the minimum number of platforms so that no train waits.*/

public class CalculateMaximumNumberofPlatformRequired {
	
	public static int findPlatform(int arr[],int dep[]) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int requiredPlatform =1, MaximumPlatform=1;
		int i=1;  // arrival train
		int j=0;  // departure train
		while(i<arr.length && j<dep.length) {
			if(arr[i]<=dep[j]) {
				requiredPlatform++;
				i++;
			}else {
				requiredPlatform--;
				j++;
			}
			MaximumPlatform = Math.max(MaximumPlatform, requiredPlatform);
		}
	
		return MaximumPlatform;
	}

	public static void main(String[] args) {
		int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
		int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
		System.out.println("total platform are requird: "+findPlatform(arr, dep));
	}

}
