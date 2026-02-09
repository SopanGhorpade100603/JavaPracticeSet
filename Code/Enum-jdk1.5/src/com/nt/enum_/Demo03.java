package com.nt.enum_;

import java.util.Scanner;
//take enum constant from uesr
enum Month {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, 
	SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class Demo03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Month name");
	String mName = sc.nextLine().toUpperCase();
	Month value = Month.valueOf(Month.class,mName);
	System.out.println(value);
	sc.close();
	}

}
