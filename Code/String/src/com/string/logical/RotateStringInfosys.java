package com.string.logical;

//You are given a string S and an integer N.
//If the sum of digits of N is EVEN, rotate the string RIGHT by 1 position
//If the sum of digits of N is ODD, rotate the string LEFT by 2 positions

public class RotateStringInfosys {
	public static String rotate(String str,int num) {
		int temp = num;
		int sum=0;
		while(temp!=0) {
			sum+=temp%10;
			temp/=10;
		}
		
		if(sum %2==0) {
			num =1;	//right
			int len=str.length();
			int k = num%len;
			return str.substring(len-k)+str.substring(0,len-k);
		}else {
			num=2;	//left
			int len=str.length();
			int k = num%len;
			return str.substring(k)+str.substring(0,k);
		}

	}
	
public static void main(String[] args) {
		String str="infosys";
		int num=123;
		String res = rotate(str, num);
		System.out.println(res);
	}
}

