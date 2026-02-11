package com.nt.array;

/* Given an integer array arr of size N, find the length of the longest
 subarray whose sum is exactly K.
 input N = 7  
	arr = [10, 5, 2, 7, 1, 9]  
	K = 15
output: 4 */
public class FindLengthOfLongestSubarray {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 2, 7, 1, 9 };
		int k = 15;
		int res = findLongestLength(arr, k);
		System.out.println(res);
	}

	public static int findLongestLength(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == k) {
					int len = j - i + 1;
					count = Math.max(count, len);
				}
			}
		}

		return count;
	}

}
