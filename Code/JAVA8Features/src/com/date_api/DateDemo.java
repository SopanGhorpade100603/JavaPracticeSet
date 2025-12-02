package com.date_api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		Month month = date.getMonth();
		System.out.println(month.getValue());
		
		LocalTime time = LocalTime.now();// 2-jan-2024   
		System.out.println(time);

		
	}

}
