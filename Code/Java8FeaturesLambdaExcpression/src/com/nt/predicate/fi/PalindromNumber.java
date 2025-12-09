package com.nt.predicate.fi;

import java.util.Scanner;
import java.util.function.Predicate;

public class PalindromNumber {
	
	public static boolean isPalindrom(int num) {
		Predicate<Integer> palindrom = (n)->{
			int temp = n;
			int rev = 0;
			while(n!=0) {
				int rem = n%10;
				rev = rev*10+rem;
				n /=10;
			}
			return rev == temp;
		};
		return palindrom.test(num);
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number to check palindrom: ");
	int num = sc.nextInt();
	boolean result = isPalindrom(num);
	System.out.println(num+" is palindrom?: "+result);
	}

}
