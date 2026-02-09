package com.date_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JODAAPIS {

	public static void main(String[] args) {
//		1.LocalDate API
		LocalDate date = LocalDate.now();
		System.out.println("\u001B[31m date:: "+date);
		
//		2LocalTime API
		LocalTime time = LocalTime.now();// 2-jan-2024   
		System.out.println("\u001b[32m time:: "+time);

//		3.LocalDateTime API
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("\u001b[37m date and time:: "+ldt);
	}

}
